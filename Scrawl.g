grammar Scrawl;


@parser::header {
	package ir.ac.iust.scrawler.parser;
	 import java.util.HashMap;
}

@lexer::header {
	package ir.ac.iust.scrawler.parser;
}

@members{
	int scope=0;
	String thisDoc;
	HashMap symbolTable = new HashMap();
}

root  returns [String code]:
    mainRoutine{$code = $mainRoutine.code;} (procedure{$code += $procedure.code;})* ;

procedure returns [String code]:
    'procedure' ID block { $code = ".method private static " + $ID.text + "()V \n"
	                     + ".limit stack 2 \n"
	                     + ".limit locals 2 \n"
    			     + $block.code
	                     + "return \n"
	                     + ".end method \n\n";
    		     };

mainRoutine returns [String code]:
    'main' block { $code = ".class public Scrawl.j \n"
                     + ".super java/lang/Object \n"

                     + ".method public <init>()V \n"
                     + "aload_0 \n"
                     + "invokenonvirtual java/lang/Object/<init>()V \n"
                     + "return \n"
                     + ".end method \n"

                     + ".method public static main([Ljava/lang/String;)V \n"
                     + ".limit stack 2 \n"
                     + ".limit locals 2 \n"
                     + $block.code
                     + "return \n"
                     + ".end method \n\n";
                     };

block returns [String code]:
    '{'	 { $code = ""; }
             (statement {$code += $statement.code;})*
    '}';

statement returns [String code]:
    reqSt { $code = $reqSt.code; }
    |assSt
    |foreachSt
    |parseSt
    |printSt { $code = $printSt.code; };
	
reqSt returns [String code] :
	getReqSt { $code = $getReqSt.code; }
	|postReqSt { $code = $postReqSt.code; };

getReqSt returns [String code]:
	GET exp block{		
			$code = $exp.code
				+ "invokestatic ir/ac/iust/scrawl/Helper/Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document; \n"
				+ "astore_1 \n"
				+ $block.code;
		};

postReqSt returns [String code]:
	POST STRING {
		}
		block;

assSt :	ID '=' exp ';'
		{
		};

foreachSt:
    'foreach' selector block;
	
parseSt	:	'parse' 'first' exp 'by' ID ';' 
			{ System.out.println($ID.text+"("+$exp.code+")");}
	|	'parse' 'last' exp 'by' ID ';'
			{ System.out.println($ID.text+"("+$exp.code+")");};

printSt returns [String code]:
    'print' exp ';' {$code = "getstatic java/lang/System/out Ljava/io/PrintStream; \n"
                      + $exp.code
                      + "invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V \n";
                      } ;

exp returns [String code]:
    ID {$code = $ID.text;}|STRING {$code = "ldc "+ $STRING.text  + " \n";}
    |selector'@'(TEXT{$code=$selector.value+".First().Text()";}
    |ID{$code=$selector.value+".First().Attr(\""+$ID.text+"\")";});

selector returns[String value]	:
		'(' STRING ')' {$value=thisDoc+".Find("+$STRING.text+")";}
		| THIS {$value=thisDoc;};
		
		
xPath	:	TAG('['NUMBER']')?('.'TAG('['NUMBER']')?)*;


dictionary returns[String name, String value]
	:	'[' 
			{ $name = "v"+scope; $value = "v"+scope+" := url.Values{}\n";}
			
			{String key;}
			(k1=STRING 
			 ':' v1=STRING {$value+=$name+".Add("+$k1.text+","+$v1.text+")\n";}
			 (',' k2=STRING 
			  ':' v2=STRING{$value+=$name+".Add("+$k2.text+","+$v2.text+")\n";})*)?
		']';

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

GET	:	'get';
POST	:	'post';
PUT	:	'put';
DELETE	:	'delete';
TEXT	:	'text';

THIS	:	'this';

STRING	:	 '"' .* '"';

ID	:	 ('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

TAG	:	('A'..'Z')+;

NUMBER	:	'1'..'9' '0'..'9'+ ;



