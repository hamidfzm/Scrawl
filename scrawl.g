grammar scrawl;


@members{
	int temp=0;
	int label=0;
	List vals;	
}

code	:	mainRoutine;

mainRoutine
	:	'main' block;
	
block	:	'{' statement*  '}';

statement
	:	inSt
	|	assSt;
	
inSt	:	'in' (PATH) block;

assSt	:	ID '=' exp ';';

exp	:	ID
	|	selector;
	
selector	:
		'(' xPath ')' ';';
		
xPath	:	TAG('['NUMBER']')?('.'TAG('['NUMBER']')?)*;

PATH	:	 '"' .* '"';

ID	:	 ('a'..'z'|'_') ('a'..'z'|'0'..'9'|'_')*;

TAG	:	('A'..'Z')+;

NUMBER	:	'1'..'9' '0'..'9'+ ;

