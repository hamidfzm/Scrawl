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
	
    public enum Type{
        STRING,
        DOCUMENT,
        ELEMENT,
        INTEGER,
    }
    

    public class Info {
        private String name;
        private int local;
        private Type type;
        private int block;

        public Info(String name, Type type){
            this.name = name;
            this.type = type;
        }

        public Type getType() {
            return type;
        }
    }

    private HashMap<String, Info> id2Info;
    private HashMap<Integer, Info> local2Info;
    private static final int MAX_LOCAL_VAR = 200;

    public void put(String id,Type type){
        Info info;
        for(int i=0;i<MAX_LOCAL_VAR;i++) {
            if(!local2Info.containsKey(i)){
                info = new Info(id,type);
                info.local = i;
                local2Info.put(i,info);
                id2Info.put(id,info);
                break;
            }
        }
    }

    public Info get(String id){
        return id2Info.get(id);
    }

    public int getLocalIndex(String id){
        return id2Info.get(id).local;
    }

}


root  returns [String code]:
    {
        id2Info = new HashMap<>();
        local2Info = new HashMap<>();
    }
    mainRoutine{$code = $mainRoutine.code; } (procedure{$code += $procedure.code;})*  {System.out.print($code);};

procedure returns [String code]:
    'procedure' ID block { $code = ".method private static " + $ID.text + "()V \n"
	                     + ".limit stack 2 \n"
	                     + ".limit locals 2 \n"
    			     + $block.code
	                     + "return \n"
	                     + ".end method \n\n";
    		     }; 

mainRoutine returns [String code]:
    'main' block { $code = ".class public Scrawlout \n"
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
    |assSt{ $code = $assSt.code; }
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

assSt returns[String code]:
	ID '=' exp ';'
		{
			put($ID.text,$exp.type);
			$code = $exp.code
				+ "astore_"+getLocalIndex($ID.text)+"\n";
		};

foreachSt:
    'foreach' selector block;
	
parseSt	:	'parse' 'first' exp 'by' ID ';' 
			{ System.out.println($ID.text+"("+$exp.code+")");}
	|	'parse' 'last' exp 'by' ID ';'
			{ System.out.println($ID.text+"("+$exp.code+")");};

printSt returns [String code]:
    'print' exp ';' 
    {
    	String type = "";
    	switch ($exp.type){
    	    case INTEGER:
    	        type = "I";
    	        break;
    	    case STRING:
    	        type = "Ljava/lang/String;";
    	        break;
    	}
 
        $code = "getstatic java/lang/System/out Ljava/io/PrintStream; \n"
            + $exp.code
            + "invokevirtual  java/io/PrintStream/println(" + type + ")V \n";
    } ;

exp returns [String code, Type type]:
    ID
        {
            $code = "aload_"+ +getLocalIndex($ID.text)+"\n";
            $type = get($ID.text).getType();
        }
    |STRING
        {
            $code = "ldc "+ $STRING.text  + " \n";
            $type = Type.STRING;
        }
    |integer
        {
            if ( -128 < $integer.value && $integer.value < 128){
            	$code = "bipush "+ $integer.value  + " \n";
            } else if ( -32768 < $integer.value && $integer.value < 32767){
            	$code = "sipush "+ $integer.value  + " \n";
            } else {
            	$code = "ldc "+ $integer.value  + " \n";
            }
            
            $type = Type.INTEGER;
        }
    |selector'@'(TEXT{$code="";}
    |ID{$code=$selector.value;});

selector returns[String value]	:
		'(' STRING ')' {$value=thisDoc+".Find("+$STRING.text+")";}
		| THIS {$value=thisDoc;};
		


dictionary returns[String name, String value]
	:	'[' 
			{ $name = "v"+scope; $value = "v"+scope+" := url.Values{}\n";}
			
			{String key;}
			(k1=STRING 
			 ':' v1=STRING {$value+=$name+".Add("+$k1.text+","+$v1.text+")\n";}
			 (',' k2=STRING 
			  ':' v2=STRING{$value+=$name+".Add("+$k2.text+","+$v2.text+")\n";})*)?
		']';

integer returns[Integer value]:
	INTEGER {$value = Integer.valueOf($INTEGER.text);};

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

DIGIT	:	'0'..'9';

INTEGER: DIGIT+; 

COMMENT	: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
   
LINE_COMMENT: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};



