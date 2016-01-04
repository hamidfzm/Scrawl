grammar scrawl;


@members{
	int temp=0;
	int label=0;
	List vals;	
}

code	:	mainRoutine ( procedure)+;

mainRoutine
	:	'main' block;
		
procedure
	:	'procedure'  ID block;
	
statement
	:	inSt
	|	foreachSt
	|	callSt;
	
inSt	:	'in' (PATH|URL) block;

foreachSt
	:	'foreach' ID 'match' '(' XPATH ')' block;
	
callSt	:	
		'parse' CALL_TYPE identifier 'by' ID;
	
block	:	statement
	|	'{' (statement)* '}';
	
identifier
	:	ID( '.' ID)*;
	
PATH	:	'/'? (('a'..'z'|'A'..'Z'|'0'..'9')+ '/')*;
URL	:	'http''s'?'://' ('a'..'z'|'A'..'Z'|'0'..'9')+ ('.' ('a'..'z'|'A'..'Z'|'0'..'9')+)+ ;
	
ID 
	:	 ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

XPATH	:	.* ;

CALL_TYPE
	:	'first'|'last'|'now';


	
