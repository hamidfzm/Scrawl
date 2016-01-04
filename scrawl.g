grammar scrawl;


@members{
	int temp=0;
	int label=0;
	List vals;	
}

code	:	mainRoutine, ( procedure)+;

mainRoutine
	:	'main','{',(statement)+'}';
	
procedure
	:	'procedure' , ID,'{' (statement)+'}';
	
statement
	:	;
	
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

	
