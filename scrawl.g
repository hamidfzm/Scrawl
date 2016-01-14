grammar scrawl;

@members{
	int blockNum=0;
}

code	:	{
			System.out.println("package main");
			System.out.println("import \"fmt\"");
			System.out.println("import \"net/http\"");
		}
		mainRoutine procedure*;

procedure
	:	'procedure' ID
		{
			System.out.print("func "+$ID.text);
		}
		 block;
	
mainRoutine
	:	'main' {System.out.print("func main()");}
		 block;
	
block	:	'{'	 {System.out.println("{"); blockNum+=1;}
		 statement* 
		  '}'  {System.out.println("}"); blockNum-=1;};

statement
	:	inSt
	|	parseSt
	|	assSt
	|	foreachSt
	|	printSt;
	
inSt	:	'in' (STRING) {
				System.out.println("resp"+blockNum+", err"+blockNum+" := http.Get("+$STRING.text+")");
				System.out.print("if err"+blockNum+" == nil");
			}
		block;

assSt	:	ID '=' exp ';';

foreachSt
	:	'foreach' selector block;
	
parseSt	:	'parse' 'first' exp 'by' ID ';'
	|	'parse' 'last' exp 'by' ID ';'
	|	'parse' 'now' exp 'by' ID ';';
	
printSt	:	'print' exp ';' ;

exp	:	ID
	|	STRING
	|	selector'@'ID;
	
selector	:
		'(' xPath ')';
		
xPath	:	TAG('['NUMBER']')?('.'TAG('['NUMBER']')?)*;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

STRING	:	 '"' .* '"';

ID	:	 ('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

TAG	:	('A'..'Z')+;

NUMBER	:	'1'..'9' '0'..'9'+ ;



