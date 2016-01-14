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
		System.out.println("import \"fmt\"");
		System.out.println("import \"github.com/PuerkitoBio/goquery\"");
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
	:	inSt
	|	parseSt
	|	assSt
	|	foreachSt
	|	printSt;
	
inSt	:	'in' (STRING) {
				scope += 1;
				System.out.println("resp"+scope+", err"+scope+" := goquery.NewDocument("+$STRING.text+")");
				System.out.print("if err"+scope+" == nil");
				thisDoc = "resp"+scope ;
			}
		block;

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
			System.out.print($selector.value+".Each(func(i int, resp"+scope+" *goquery.Selection) ");
		}
		block {System.out.println(")"); scope -=1;};
	
parseSt	:	'parse' 'first' exp 'by' ID ';' 
			{ System.out.println($ID.text+"("+$exp.value+")");}
	|	'parse' 'last' exp 'by' ID ';'
	|	'parse' 'now' exp 'by' ID ';';
	
printSt	:	'print' exp ';'
			{ System.out.println("fmt.Println("+$exp.value+")");} ;

exp returns [String value, int ignore]		:	ID {$value = $ID.text;}
	|	STRING {$value = $STRING.text; $ignore=0;}
	|	selector'@'ID{$value=$selector.value+".First().Attr(\""+$ID.text+"\")";$ignore=1;}
	|	THIS {$value="resp"+scope;$ignore=0;};
	
selector returns[String value]	:
		'(' STRING ')' {$value=thisDoc+".Find("+$STRING.text+")";};
		
xPath	:	TAG('['NUMBER']')?('.'TAG('['NUMBER']')?)*;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

THIS	:	'this';

STRING	:	 '"' .* '"';

ID	:	 ('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

TAG	:	('A'..'Z')+;

NUMBER	:	'1'..'9' '0'..'9'+ ;



