grammar scrawl;


code	:	mainRoutine procedure*;

procedure
	:	'procedure' ID block;
	
mainRoutine
	:	'main' {System.out.println("int main()");}
		 block;
	
block	:	'{'	 {System.out.println("{");}
		 statement* 
		  '}'  {System.out.println("}");};

statement
	:	inSt
	|	parseSt
	|	assSt
	|	foreachSt
	|	printSt;
	
inSt	:	'in' (STRING) block;

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



