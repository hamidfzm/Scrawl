grammar scrawl;


@header {
	 import java.util.HashMap;
}

@members{
	int scope=0;
	String thisDoc;
	HashMap symbolTable = new HashMap();
}

root:
    mainRoutine{String code = $mainRoutine.code;} (procedure{code += $procedure.code;})*
    
    { System.out.println(code);} ;

procedure returns [String code]:
    'procedure' ID block;

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
                     + ".end method \n";
                     };

block returns [String code]:
    '{'	 { $code = ""; }
             (statement {$code += $statement.code;})*
    '}';

statement returns [String code]:
    reqSt
    |assSt
    |foreachSt
    |parseSt
    |printSt { $code = $printSt.code; };
	
reqSt	:	GET STRING {
			scope += 1;
			System.out.println("resp"+scope+", err1_"+scope+" := http.Get("+$STRING.text+")");
			System.out.println("doc"+scope+", err2_"+scope+" := goquery.NewDocumentFromResponse(resp"+scope+")");
			System.out.println("_ = doc"+scope+"");
			System.out.print("if err1_"+scope+" == nil && err2_"+scope+" == nil");
			thisDoc = "doc"+scope ;
			} block
		
		| POST STRING dictionary{
			scope += 1;
			System.out.println($dictionary.value);
			System.out.println("resp"+scope+", err1_"+scope+" := http.PostForm("+$STRING.text+","+$dictionary.name+")");
			System.out.println("doc"+scope+", err2_"+scope+" := goquery.NewDocumentFromResponse(resp"+scope+")");
			System.out.println("_ = doc"+scope+"");
			System.out.print("if err1_"+scope+" == nil && err2_"+scope+" == nil");
			thisDoc = "doc"+scope ;
			}block;


assSt :	ID '=' exp ';'
		{
		};

foreachSt
	:	'foreach' selector 
		{
			scope+=1;
			System.out.print($selector.value+".Each(func(i int, "+thisDoc+" *goquery.Selection) ");
		}
		block {System.out.println(")"); scope -=1;};
	
parseSt	:	'parse' 'first' exp 'by' ID ';' 
			{ System.out.println($ID.text+"("+$exp.value+")");}
	|	'parse' 'last' exp 'by' ID ';'
			{ System.out.println($ID.text+"("+$exp.value+")");};
	
printSt returns [String code]:
    'print' exp ';' {$code = "getstatic java/lang/System/out Ljava/io/PrintStream; \n"
                      + "ldc "+ $exp.value  + " \n"
                      + "invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V \n";
                      } ;

exp returns [String value]:
    ID {$value = $ID.text;}|STRING {$value = $STRING.text;}
    |selector'@'(TEXT{$value=$selector.value+".First().Text()";}
    |ID{$value=$selector.value+".First().Attr(\""+$ID.text+"\")";});
	
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



