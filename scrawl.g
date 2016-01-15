grammar scrawl;


@header {
	 import java.util.HashMap;
}

@members{
	int scope=0;
	String thisDoc;
	HashMap symbolTable = new HashMap();
}

code	:{
		System.out.println("package main");
		System.out.println("import  _ \"fmt\"");
		System.out.println("import  _ \"net/url\"");
		System.out.println("import  _ \"net/http\"");
		System.out.println("import _ \"github.com/PuerkitoBio/goquery\"");
	}
		mainRoutine procedure*;

procedure
	:	'procedure' ID
		{
			scope += 1;
			System.out.print("\nfunc "+$ID.text+"(s *goquery.Selection)");
			thisDoc="s";
		}
		 block;
	
mainRoutine
	:	'main' {System.out.print("func main()");}
		 block;
	
block	:	'{'	 {System.out.println("{"); }
		 statement* 
		  '}'  {System.out.print("}");};

statement
	:	reqSt
		|assSt
		|foreachSt
		|parseSt
		|printSt;
	
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
			String temp = $ID.text ;
			for(int i = 0;i<$exp.ignore;i++)
				temp += ", _ ";
			System.out.println(temp+ ":="+$exp.value);
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
	
printSt	:	'print' exp ';'
			{ System.out.println("fmt.Println("+$exp.value+")");} ;

exp returns [String value, int ignore]		:	ID {$value = $ID.text;}
	|	STRING {$value = $STRING.text; $ignore=0;}
	|	selector'@'(TEXT{$value=$selector.value+".First().Text()";$ignore=0;}
			|ID{$value=$selector.value+".First().Attr(\""+$ID.text+"\")";$ignore=1;});
	
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



