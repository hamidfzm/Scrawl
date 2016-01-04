grammar scrawl;


@members{
	int temp=0;
	int label=0;
	List vals;	
}

code	:	mainRoutine procedure*;

procedure
	:	'procedure' ID block;
	
mainRoutine
	:	'main' block;
	
block	:	'{' statement*  '}';

statement
	:	inSt
	|	parseSt
	|	assSt
	|	foreachSt;
	
inSt	:	'in' (STRING) block;

assSt	:	ID '=' exp ';';

foreachSt
	:	'foreach' selector block;
	
parseSt	:	'parse' 'first' exp 'by' ID ';'
	|	'parse' 'last' exp 'by' ID ';';

exp	:	ID
	|	STRING
	|	selector'@'ID;
	
selector	:
		'(' xPath ')';
		
xPath	:	TAG('['NUMBER']')?('.'TAG('['NUMBER']')?)*;

STRING	:	 '"' .* '"';

ID	:	 ('a'..'z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

TAG	:	('A'..'Z')+;

NUMBER	:	'1'..'9' '0'..'9'+ ;

