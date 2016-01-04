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
	:	';';