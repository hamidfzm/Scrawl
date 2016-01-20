// $ANTLR 3.5.1 /home/bardia/scrawl/Scrawl.g 2016-01-19 20:32:42

	package ir.ac.iust.scrawl;
	 import org.antlr.runtime.*;

import java.util.HashMap;

@SuppressWarnings("all")
public class ScrawlParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DELETE", "GET", "ID", "NUMBER", 
		"POST", "PUT", "STRING", "TAG", "TEXT", "THIS", "WS", "'('", "')'", "','", 
		"'.'", "':'", "';'", "'='", "'@'", "'['", "']'", "'by'", "'first'", "'foreach'", 
		"'last'", "'main'", "'parse'", "'print'", "'procedure'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int DELETE=4;
	public static final int GET=5;
	public static final int ID=6;
	public static final int NUMBER=7;
	public static final int POST=8;
	public static final int PUT=9;
	public static final int STRING=10;
	public static final int TAG=11;
	public static final int TEXT=12;
	public static final int THIS=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ScrawlParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ScrawlParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ScrawlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/bardia/scrawl/Scrawl.g"; }


		int scope=0;
		String thisDoc;
		HashMap symbolTable = new HashMap();



	// $ANTLR start "root"
	// /home/bardia/scrawl/Scrawl.g:19:1: root returns [String code] : mainRoutine ( procedure )* ;
	public final String root() throws RecognitionException {
		String code = null;


		String mainRoutine1 =null;
		String procedure2 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:19:28: ( mainRoutine ( procedure )* )
			// /home/bardia/scrawl/Scrawl.g:20:5: mainRoutine ( procedure )*
			{
			pushFollow(FOLLOW_mainRoutine_in_root42);
			mainRoutine1=mainRoutine();
			state._fsp--;

			code = mainRoutine1;
			// /home/bardia/scrawl/Scrawl.g:20:45: ( procedure )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==32) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:20:46: procedure
					{
					pushFollow(FOLLOW_procedure_in_root46);
					procedure2=procedure();
					state._fsp--;

					code += procedure2;
					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "root"



	// $ANTLR start "procedure"
	// /home/bardia/scrawl/Scrawl.g:22:1: procedure returns [String code] : 'procedure' ID block ;
	public final String procedure() throws RecognitionException {
		String code = null;


		try {
			// /home/bardia/scrawl/Scrawl.g:22:32: ( 'procedure' ID block )
			// /home/bardia/scrawl/Scrawl.g:23:5: 'procedure' ID block
			{
			match(input,32,FOLLOW_32_in_procedure65); 
			match(input,ID,FOLLOW_ID_in_procedure67); 
			pushFollow(FOLLOW_block_in_procedure69);
			block();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "procedure"



	// $ANTLR start "mainRoutine"
	// /home/bardia/scrawl/Scrawl.g:25:1: mainRoutine returns [String code] : 'main' block ;
	public final String mainRoutine() throws RecognitionException {
		String code = null;


		String block3 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:25:34: ( 'main' block )
			// /home/bardia/scrawl/Scrawl.g:26:5: 'main' block
			{
			match(input,29,FOLLOW_29_in_mainRoutine84); 
			pushFollow(FOLLOW_block_in_mainRoutine86);
			block3=block();
			state._fsp--;

			 code = ".class public Scrawlout \n"
			                     + ".super java/lang/Object \n"

			                     + ".method public <init>()V \n"
			                     + "aload_0 \n"
			                     + "invokenonvirtual java/lang/Object/<init>()V \n"
			                     + "return \n"
			                     + ".end method \n"

			                     + ".method public static main([Ljava/lang/String;)V \n"
			                     + ".limit stack 2 \n"
			                     + ".limit locals 2 \n"
			                     + block3
			                     + "return \n"
			                     + ".end method \n";
			                     
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "block"
	// /home/bardia/scrawl/Scrawl.g:43:1: block returns [String code] : '{' ( statement )* '}' ;
	public final String block() throws RecognitionException {
		String code = null;


		String statement4 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:43:28: ( '{' ( statement )* '}' )
			// /home/bardia/scrawl/Scrawl.g:44:5: '{' ( statement )* '}'
			{
			match(input,33,FOLLOW_33_in_block103); 
			 code = ""; 
			// /home/bardia/scrawl/Scrawl.g:45:14: ( statement )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= GET && LA2_0 <= ID)||LA2_0==POST||LA2_0==27||(LA2_0 >= 30 && LA2_0 <= 31)) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:45:15: statement
					{
					pushFollow(FOLLOW_statement_in_block122);
					statement4=statement();
					state._fsp--;

					code += statement4;
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,34,FOLLOW_34_in_block132); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /home/bardia/scrawl/Scrawl.g:48:1: statement returns [String code] : ( reqSt | assSt | foreachSt | parseSt | printSt );
	public final String statement() throws RecognitionException {
		String code = null;


		String reqSt5 =null;
		String printSt6 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:48:32: ( reqSt | assSt | foreachSt | parseSt | printSt )
			int alt3=5;
			switch ( input.LA(1) ) {
			case GET:
			case POST:
				{
				alt3=1;
				}
				break;
			case ID:
				{
				alt3=2;
				}
				break;
			case 27:
				{
				alt3=3;
				}
				break;
			case 30:
				{
				alt3=4;
				}
				break;
			case 31:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:49:5: reqSt
					{
					pushFollow(FOLLOW_reqSt_in_statement147);
					reqSt5=reqSt();
					state._fsp--;

					 code = reqSt5; 
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:50:6: assSt
					{
					pushFollow(FOLLOW_assSt_in_statement156);
					assSt();
					state._fsp--;

					}
					break;
				case 3 :
					// /home/bardia/scrawl/Scrawl.g:51:6: foreachSt
					{
					pushFollow(FOLLOW_foreachSt_in_statement163);
					foreachSt();
					state._fsp--;

					}
					break;
				case 4 :
					// /home/bardia/scrawl/Scrawl.g:52:6: parseSt
					{
					pushFollow(FOLLOW_parseSt_in_statement170);
					parseSt();
					state._fsp--;

					}
					break;
				case 5 :
					// /home/bardia/scrawl/Scrawl.g:53:6: printSt
					{
					pushFollow(FOLLOW_printSt_in_statement177);
					printSt6=printSt();
					state._fsp--;

					 code = printSt6; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "statement"



	// $ANTLR start "reqSt"
	// /home/bardia/scrawl/Scrawl.g:55:1: reqSt returns [String code] : ( getReqSt | postReqSt );
	public final String reqSt() throws RecognitionException {
		String code = null;


		String getReqSt7 =null;
		String postReqSt8 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:55:29: ( getReqSt | postReqSt )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==GET) ) {
				alt4=1;
			}
			else if ( (LA4_0==POST) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:56:2: getReqSt
					{
					pushFollow(FOLLOW_getReqSt_in_reqSt193);
					getReqSt7=getReqSt();
					state._fsp--;

					 code = getReqSt7; 
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:57:3: postReqSt
					{
					pushFollow(FOLLOW_postReqSt_in_reqSt199);
					postReqSt8=postReqSt();
					state._fsp--;

					 code = postReqSt8; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "reqSt"



	// $ANTLR start "getReqSt"
	// /home/bardia/scrawl/Scrawl.g:59:1: getReqSt returns [String code] : GET STRING block ;
	public final String getReqSt() throws RecognitionException {
		String code = null;


		Token STRING9=null;
		String block10 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:59:31: ( GET STRING block )
			// /home/bardia/scrawl/Scrawl.g:60:2: GET STRING block
			{
			match(input,GET,FOLLOW_GET_in_getReqSt213); 
			STRING9=(Token)match(input,STRING,FOLLOW_STRING_in_getReqSt215); 
			pushFollow(FOLLOW_block_in_getReqSt217);
			block10=block();
			state._fsp--;

					
						code =
							"ldc" + (STRING9!=null?STRING9.getText():null) + "\n"
							+ "invokestatic ir/ac/iust/scrawl/scrawlib/Helper.Get(Ljava/lang/String;)Lorg/jsoup/nodes/Document \n"
							+ "astore_1 \n"
							+ block10;
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "getReqSt"



	// $ANTLR start "postReqSt"
	// /home/bardia/scrawl/Scrawl.g:68:1: postReqSt returns [String code] : POST STRING block ;
	public final String postReqSt() throws RecognitionException {
		String code = null;


		try {
			// /home/bardia/scrawl/Scrawl.g:68:32: ( POST STRING block )
			// /home/bardia/scrawl/Scrawl.g:69:2: POST STRING block
			{
			match(input,POST,FOLLOW_POST_in_postReqSt230); 
			match(input,STRING,FOLLOW_STRING_in_postReqSt232); 

					
			pushFollow(FOLLOW_block_in_postReqSt238);
			block();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "postReqSt"



	// $ANTLR start "assSt"
	// /home/bardia/scrawl/Scrawl.g:73:1: assSt : ID '=' exp ';' ;
	public final void assSt() throws RecognitionException {
		try {
			// /home/bardia/scrawl/Scrawl.g:73:7: ( ID '=' exp ';' )
			// /home/bardia/scrawl/Scrawl.g:73:9: ID '=' exp ';'
			{
			match(input,ID,FOLLOW_ID_in_assSt246); 
			match(input,21,FOLLOW_21_in_assSt248); 
			pushFollow(FOLLOW_exp_in_assSt250);
			exp();
			state._fsp--;

			match(input,20,FOLLOW_20_in_assSt252); 

					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assSt"



	// $ANTLR start "foreachSt"
	// /home/bardia/scrawl/Scrawl.g:77:1: foreachSt : 'foreach' selector block ;
	public final void foreachSt() throws RecognitionException {
		String selector11 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:78:2: ( 'foreach' selector block )
			// /home/bardia/scrawl/Scrawl.g:78:4: 'foreach' selector block
			{
			match(input,27,FOLLOW_27_in_foreachSt265); 
			pushFollow(FOLLOW_selector_in_foreachSt267);
			selector11=selector();
			state._fsp--;


						scope+=1;
						System.out.print(selector11+".Each(func(i int, "+thisDoc+" *goquery.Selection) ");
					
			pushFollow(FOLLOW_block_in_foreachSt276);
			block();
			state._fsp--;

			System.out.println(")"); scope -=1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "foreachSt"



	// $ANTLR start "parseSt"
	// /home/bardia/scrawl/Scrawl.g:85:1: parseSt : ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' );
	public final void parseSt() throws RecognitionException {
		Token ID12=null;
		Token ID14=null;
		String exp13 =null;
		String exp15 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:85:9: ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==30) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==26) ) {
					alt5=1;
				}
				else if ( (LA5_1==28) ) {
					alt5=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:85:11: 'parse' 'first' exp 'by' ID ';'
					{
					match(input,30,FOLLOW_30_in_parseSt287); 
					match(input,26,FOLLOW_26_in_parseSt289); 
					pushFollow(FOLLOW_exp_in_parseSt291);
					exp13=exp();
					state._fsp--;

					match(input,25,FOLLOW_25_in_parseSt293); 
					ID12=(Token)match(input,ID,FOLLOW_ID_in_parseSt295); 
					match(input,20,FOLLOW_20_in_parseSt297); 
					 System.out.println((ID12!=null?ID12.getText():null)+"("+exp13+")");
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:87:4: 'parse' 'last' exp 'by' ID ';'
					{
					match(input,30,FOLLOW_30_in_parseSt308); 
					match(input,28,FOLLOW_28_in_parseSt310); 
					pushFollow(FOLLOW_exp_in_parseSt312);
					exp15=exp();
					state._fsp--;

					match(input,25,FOLLOW_25_in_parseSt314); 
					ID14=(Token)match(input,ID,FOLLOW_ID_in_parseSt316); 
					match(input,20,FOLLOW_20_in_parseSt318); 
					 System.out.println((ID14!=null?ID14.getText():null)+"("+exp15+")");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parseSt"



	// $ANTLR start "printSt"
	// /home/bardia/scrawl/Scrawl.g:90:1: printSt returns [String code] : 'print' exp ';' ;
	public final String printSt() throws RecognitionException {
		String code = null;


		String exp16 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:90:30: ( 'print' exp ';' )
			// /home/bardia/scrawl/Scrawl.g:91:5: 'print' exp ';'
			{
			match(input,31,FOLLOW_31_in_printSt339); 
			pushFollow(FOLLOW_exp_in_printSt341);
			exp16=exp();
			state._fsp--;

			match(input,20,FOLLOW_20_in_printSt343); 
			code = "getstatic java/lang/System/out Ljava/io/PrintStream; \n"
			                      + "ldc "+ exp16  + " \n"
			                      + "invokevirtual  java/io/PrintStream/println(Ljava/lang/String;)V \n";
			                      
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return code;
	}
	// $ANTLR end "printSt"



	// $ANTLR start "exp"
	// /home/bardia/scrawl/Scrawl.g:96:1: exp returns [String value] : ( ID | STRING | selector '@' ( TEXT | ID ) );
	public final String exp() throws RecognitionException {
		String value = null;


		Token ID17=null;
		Token STRING18=null;
		Token ID20=null;
		String selector19 =null;

		try {
			// /home/bardia/scrawl/Scrawl.g:96:27: ( ID | STRING | selector '@' ( TEXT | ID ) )
			int alt7=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt7=1;
				}
				break;
			case STRING:
				{
				alt7=2;
				}
				break;
			case THIS:
			case 15:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:97:5: ID
					{
					ID17=(Token)match(input,ID,FOLLOW_ID_in_exp361); 
					value = (ID17!=null?ID17.getText():null);
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:97:29: STRING
					{
					STRING18=(Token)match(input,STRING,FOLLOW_STRING_in_exp365); 
					value = (STRING18!=null?STRING18.getText():null);
					}
					break;
				case 3 :
					// /home/bardia/scrawl/Scrawl.g:98:6: selector '@' ( TEXT | ID )
					{
					pushFollow(FOLLOW_selector_in_exp374);
					selector19=selector();
					state._fsp--;

					match(input,22,FOLLOW_22_in_exp375); 
					// /home/bardia/scrawl/Scrawl.g:98:17: ( TEXT | ID )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==TEXT) ) {
						alt6=1;
					}
					else if ( (LA6_0==ID) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// /home/bardia/scrawl/Scrawl.g:98:18: TEXT
							{
							match(input,TEXT,FOLLOW_TEXT_in_exp377); 
							value =selector19+".First().Text()";
							}
							break;
						case 2 :
							// /home/bardia/scrawl/Scrawl.g:99:6: ID
							{
							ID20=(Token)match(input,ID,FOLLOW_ID_in_exp385); 
							value =selector19+".First().Attr(\""+(ID20!=null?ID20.getText():null)+"\")";
							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "exp"



	// $ANTLR start "selector"
	// /home/bardia/scrawl/Scrawl.g:101:1: selector returns [String value] : ( '(' STRING ')' | THIS );
	public final String selector() throws RecognitionException {
		String value = null;


		Token STRING21=null;

		try {
			// /home/bardia/scrawl/Scrawl.g:101:32: ( '(' STRING ')' | THIS )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==15) ) {
				alt8=1;
			}
			else if ( (LA8_0==THIS) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:102:3: '(' STRING ')'
					{
					match(input,15,FOLLOW_15_in_selector401); 
					STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_selector403); 
					match(input,16,FOLLOW_16_in_selector405); 
					value =thisDoc+".Find("+(STRING21!=null?STRING21.getText():null)+")";
					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:103:5: THIS
					{
					match(input,THIS,FOLLOW_THIS_in_selector413); 
					value =thisDoc;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "selector"



	// $ANTLR start "xPath"
	// /home/bardia/scrawl/Scrawl.g:106:1: xPath : TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* ;
	public final void xPath() throws RecognitionException {
		try {
			// /home/bardia/scrawl/Scrawl.g:106:7: ( TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* )
			// /home/bardia/scrawl/Scrawl.g:106:9: TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )*
			{
			match(input,TAG,FOLLOW_TAG_in_xPath428); 
			// /home/bardia/scrawl/Scrawl.g:106:12: ( '[' NUMBER ']' )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==23) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:106:13: '[' NUMBER ']'
					{
					match(input,23,FOLLOW_23_in_xPath430); 
					match(input,NUMBER,FOLLOW_NUMBER_in_xPath431); 
					match(input,24,FOLLOW_24_in_xPath432); 
					}
					break;

			}

			// /home/bardia/scrawl/Scrawl.g:106:27: ( '.' TAG ( '[' NUMBER ']' )? )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==18) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:106:28: '.' TAG ( '[' NUMBER ']' )?
					{
					match(input,18,FOLLOW_18_in_xPath436); 
					match(input,TAG,FOLLOW_TAG_in_xPath437); 
					// /home/bardia/scrawl/Scrawl.g:106:34: ( '[' NUMBER ']' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==23) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /home/bardia/scrawl/Scrawl.g:106:35: '[' NUMBER ']'
							{
							match(input,23,FOLLOW_23_in_xPath439); 
							match(input,NUMBER,FOLLOW_NUMBER_in_xPath440); 
							match(input,24,FOLLOW_24_in_xPath441); 
							}
							break;

					}

					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "xPath"


	public static class dictionary_return extends ParserRuleReturnScope {
		public String name;
		public String value;
	};


	// $ANTLR start "dictionary"
	// /home/bardia/scrawl/Scrawl.g:109:1: dictionary returns [String name, String value] : '[' (k1= STRING ':' v1= STRING ( ',' k2= STRING ':' v2= STRING )* )? ']' ;
	public final ScrawlParser.dictionary_return dictionary() throws RecognitionException {
		ScrawlParser.dictionary_return retval = new ScrawlParser.dictionary_return();
		retval.start = input.LT(1);

		Token k1=null;
		Token v1=null;
		Token k2=null;
		Token v2=null;

		try {
			// /home/bardia/scrawl/Scrawl.g:110:2: ( '[' (k1= STRING ':' v1= STRING ( ',' k2= STRING ':' v2= STRING )* )? ']' )
			// /home/bardia/scrawl/Scrawl.g:110:4: '[' (k1= STRING ':' v1= STRING ( ',' k2= STRING ':' v2= STRING )* )? ']'
			{
			match(input,23,FOLLOW_23_in_dictionary458); 
			 retval.name = "v"+scope; retval.value = "v"+scope+" := url.Values{}\n";
			String key;
			// /home/bardia/scrawl/Scrawl.g:114:4: (k1= STRING ':' v1= STRING ( ',' k2= STRING ':' v2= STRING )* )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==STRING) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:114:5: k1= STRING ':' v1= STRING ( ',' k2= STRING ':' v2= STRING )*
					{
					k1=(Token)match(input,STRING,FOLLOW_STRING_in_dictionary481); 
					match(input,19,FOLLOW_19_in_dictionary488); 
					v1=(Token)match(input,STRING,FOLLOW_STRING_in_dictionary492); 
					retval.value+=retval.name+".Add("+(k1!=null?k1.getText():null)+","+(v1!=null?v1.getText():null)+")\n";
					// /home/bardia/scrawl/Scrawl.g:116:5: ( ',' k2= STRING ':' v2= STRING )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==17) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /home/bardia/scrawl/Scrawl.g:116:6: ',' k2= STRING ':' v2= STRING
							{
							match(input,17,FOLLOW_17_in_dictionary501); 
							k2=(Token)match(input,STRING,FOLLOW_STRING_in_dictionary505); 
							match(input,19,FOLLOW_19_in_dictionary513); 
							v2=(Token)match(input,STRING,FOLLOW_STRING_in_dictionary517); 
							retval.value+=retval.name+".Add("+(k2!=null?k2.getText():null)+","+(v2!=null?v2.getText():null)+")\n";
							}
							break;

						default :
							break loop12;
						}
					}

					}
					break;

			}

			match(input,24,FOLLOW_24_in_dictionary526); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dictionary"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_root42 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_procedure_in_root46 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_procedure65 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_procedure67 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_block_in_procedure69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_mainRoutine84 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_block_in_mainRoutine86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_block103 = new BitSet(new long[]{0x00000004C8000160L});
	public static final BitSet FOLLOW_statement_in_block122 = new BitSet(new long[]{0x00000004C8000160L});
	public static final BitSet FOLLOW_34_in_block132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reqSt_in_statement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assSt_in_statement156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachSt_in_statement163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parseSt_in_statement170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printSt_in_statement177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getReqSt_in_reqSt193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postReqSt_in_reqSt199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_getReqSt213 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_getReqSt215 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_block_in_getReqSt217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_in_postReqSt230 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_postReqSt232 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_block_in_postReqSt238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assSt246 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_assSt248 = new BitSet(new long[]{0x000000000000A440L});
	public static final BitSet FOLLOW_exp_in_assSt250 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_assSt252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_foreachSt265 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_selector_in_foreachSt267 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_block_in_foreachSt276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_parseSt287 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_parseSt289 = new BitSet(new long[]{0x000000000000A440L});
	public static final BitSet FOLLOW_exp_in_parseSt291 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_parseSt293 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_parseSt295 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_parseSt297 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_parseSt308 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_parseSt310 = new BitSet(new long[]{0x000000000000A440L});
	public static final BitSet FOLLOW_exp_in_parseSt312 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_parseSt314 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_parseSt316 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_parseSt318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_printSt339 = new BitSet(new long[]{0x000000000000A440L});
	public static final BitSet FOLLOW_exp_in_printSt341 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_printSt343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_exp365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_exp374 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_exp375 = new BitSet(new long[]{0x0000000000001040L});
	public static final BitSet FOLLOW_TEXT_in_exp377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_selector401 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_selector403 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_selector405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_selector413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_in_xPath428 = new BitSet(new long[]{0x0000000000840002L});
	public static final BitSet FOLLOW_23_in_xPath430 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NUMBER_in_xPath431 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_xPath432 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_18_in_xPath436 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TAG_in_xPath437 = new BitSet(new long[]{0x0000000000840002L});
	public static final BitSet FOLLOW_23_in_xPath439 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NUMBER_in_xPath440 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_xPath441 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_23_in_dictionary458 = new BitSet(new long[]{0x0000000001000400L});
	public static final BitSet FOLLOW_STRING_in_dictionary481 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_dictionary488 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_dictionary492 = new BitSet(new long[]{0x0000000001020000L});
	public static final BitSet FOLLOW_17_in_dictionary501 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_dictionary505 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_dictionary513 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_STRING_in_dictionary517 = new BitSet(new long[]{0x0000000001020000L});
	public static final BitSet FOLLOW_24_in_dictionary526 = new BitSet(new long[]{0x0000000000000002L});
}
