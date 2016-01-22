grammar Scrawl;


@parser::header {
	package ir.ac.iust.scrawler.parser;
	import java.util.HashMap;
	import java.util.Stack;
}

@lexer::header {
	package ir.ac.iust.scrawler.parser;
}

@members{
	Stack<Integer> block = new Stack<>();
	String thisDoc;

	// ****************
public enum Type{
        STRING,
        DOCUMENT,
        ELEMENT,
        ELEMENTS,
        INTEGER,
        FLOAT,
        BOOLEAN,
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

        public int getLocal(){return local;}
    }

    private HashMap<String, Info> id2Info;
    private HashMap<Integer, Info> local2Info;
    private static final int MAX_LOCAL_VAR = 200;
    private int max_local = 0;

    public int put(String id,Type type){
        Info info;
        for(int i=0;i<MAX_LOCAL_VAR;i++) {
            if(max_local < i+1)
                max_local = i+1;
            if(!local2Info.containsKey(i)){
                info = new Info(id,type);
                info.local = i;
                local2Info.put(i,info);
                id2Info.put(id,info);
                return i;
            }
        }
        return -1;
    }

    public Info get(String id){
        return id2Info.get(id);
    }

    public void remove(String id){
        if(id2Info.containsKey(id))
            id2Info.remove(id);
    }

    public int getLocalIndex(String id){
        return id2Info.get(id).local;
    }


    public void __debug__printKeys(){
        for(String s: id2Info.keySet())
            System.out.println(s);
    }
    //*********

    String whatIsThis(){
    	return "doc"+block.size()+"_"+block.elementAt(block.size()-2);
    }

    String whatIsThis1(){
    	return "doc"+(block.size()+1)+"_"+block.peek();
    }

    int lableCount = 0;

    String newLable(){
    	lableCount++;
    	return "Lable"+lableCount;
    }
    int tempCount = 0;

    String newTemp(){
    	tempCount++;
    	return "T"+tempCount;
    }

}


root  returns [String code]:
    {
        id2Info = new HashMap<>();
        local2Info = new HashMap<>();
        block.push(0);
    }
    mainRoutine{$code = $mainRoutine.code; } (procedure{$code += $procedure.code;})*  {System.out.print($code);};

procedure returns [String code]:
    'procedure' ID block { $code = ".method private static " + $ID.text + "()V \n"
	                     + ".limit stack 2 \n"
	                     + ".limit locals "+max_local+" \n"
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
                     + $block.code
                      + ".limit stack 2 \n"
                     + ".limit locals "+max_local+" \n"
                     + "return \n"
                     + ".end method \n\n";
                     };

block returns [String code]:
    '{'	{
    		$code = "";
    		block.push(0);
    	}
             (statement {$code += $statement.code;})*
    '}' { remove(whatIsThis()); block.pop();};

statement returns [String code]:
    reqSt { $code = $reqSt.code; }
    |assSt{ $code = $assSt.code; }
    |foreachSt { $code = $foreachSt.code; }
    |parseSt
    |printSt { $code = $printSt.code; };
	
reqSt returns [String code] :
	getReqSt { $code = $getReqSt.code; }
	|postReqSt { $code = $postReqSt.code; };

getReqSt returns [String code]:
	GET exp 
		{
			int t = block.pop()+1;
			block.push(t);
			put(whatIsThis1(),$exp.type);
			$code = $exp.code
				+ "invokestatic ir/ac/iust/scrawl/scrawlib/Helper/Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document; \n"
				+ "astore_"+getLocalIndex(whatIsThis1())+" \n";
		}
	block{$code += $block.code;};

postReqSt returns [String code]:
	POST STRING {
		}
		block;

assSt returns[String code]:
	ID '=' exp ';'
	{
		put($ID.text,$exp.type);
		$code = $exp.code;
		
		switch($exp.type){
    	    case INTEGER:
    	        $code += "istore_"+getLocalIndex($ID.text)+"\n";
    	        break;
    	    default:
    	        $code += "astore_"+getLocalIndex($ID.text)+"\n";
    	        break;
		}
	};

foreachSt returns[String code]:
    'foreach' exp
    	{
			int t = block.pop()+1;
			block.push(t);
			String temp = newTemp();
			put(whatIsThis1(),Type.ELEMENT);
			put(temp,Type.ELEMENTS);
    		String startLable = newLable();
    		String endLable = newLable();
    		$code = $exp.code
    			+ "invokevirtual org/jsoup/select/Elements/iterator()Ljava/util/Iterator; \n"
    			+ "astore_"+getLocalIndex(temp)+"\n"
    			+ startLable+":\n"
    			+ "aload_"+getLocalIndex(temp)+"\n"
    			+ "invokeinterface java/util/Iterator/hasNext()Z 1\n"
    			+ "ifeq "+endLable+"\n"
    			+ "aload_"+getLocalIndex(temp)+"\n"
                + "invokeinterface java/util/Iterator/next()Ljava/lang/Object; 1\n"
                + "checkcast org/jsoup/nodes/Element\n"
                + "astore_"+getLocalIndex(whatIsThis1())+"\n";
		}
     block
     	{
     		$code += $block.code
     			+ "goto "+startLable+"\n"
     			+ endLable+":\n";
     	};
	
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
            Info info = get($ID.text);
            $type = info.getType();
            
            switch($type){
    	    case INTEGER:
    	        $code = "iload_"+info.getLocal()+"\n";
    	        break;
    	    default:
    	        $code = "aload_"+info.getLocal()+"\n";
    	        break;
            }
        }
    |STRING
        {
            $code = "ldc "+ $STRING.text  + " \n";
            $type = Type.STRING;
        }
    |THIS
    	{
    		$code="aload_"+getLocalIndex(whatIsThis())+"\n";
    		$type=Type.DOCUMENT;
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
    |selector{$code = $selector.code; $type = Type.ELEMENTS;}
    	( index
    		{
    			$code += "iconst_"+Integer.valueOf($index.value) +"\n"
    				+ "invokevirtual org/jsoup/select/Elements/get(I)Ljava/lang/Object;\n";
    			$type = Type.ELEMENT;
    		}
    	('@'TEXT
    		{
    			$code += "checkcast org/jsoup/nodes/Element \n"
				+ "invokevirtual org/jsoup/nodes/Element/text()Ljava/lang/String; \n";
    			$type = Type.STRING;
    		}
    	)?)?;
    		
index returns[String value]:
	'[' INTEGER ']' {$value = $INTEGER.text;} ;
selector returns[String code]	:
		'(' STRING ')'
			{
				$code = "aload_"+getLocalIndex(whatIsThis())+"\n"
					+ "ldc " + $STRING.text + "\n"
					+ "invokevirtual org/jsoup/nodes/Document/select(Ljava/lang/String;)Lorg/jsoup/select/Elements; \n"
			};
		

//dictionary returns[String name, String value]:;

integer returns[Integer value]:
	INTEGER {$value = Integer.valueOf($INTEGER.text);};

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

GET		:	'get';
POST	:	'post';
PUT		:	'put';
DELETE	:	'delete';
TEXT	:	'text';

THIS	:	'this';

STRING : '"' (ESC | ~('\\'|'"'))* '"';
protected ESC : '\\' ('n' | 'r');

ID : SS (SS | '0'..'9')* ;
fragment SS : 'a'..'z' | 'A'..'Z' | '_' ;

LBR :  '(' ;
RBR :  ')' ;
PLS :  '+' ;
MNS :  '-' ;
MLP :  '*' ;
DIV :  '/' ;
PWR :  '^' ;

LSS :  '<'  ;
LSQ :  '<=' ;
GRT :  '>'  ;
GRQ :  '>=' ;
EQL :  '==' ;
NEQ :  '!=' ;
AND :  '&&' ;
OR  :  '||' ;
NOT :  '!'  ;

DIGIT	:	'0'..'9';

INTEGER: DIGIT+; 

FLOAT : INTEGER '.' INTEGER* EXP? | '.' INTEGER EXP? | INTEGER EXP;
fragment EXP : ('e'|'E') (PLS | MNS)? INTEGER;

COMMENT	: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
   
LINE_COMMENT: '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};



