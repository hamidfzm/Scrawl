// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-14 20:39:29

	 import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class scrawlParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "STRING", "TAG", 
		"THIS", "WS", "'('", "')'", "'.'", "';'", "'='", "'@'", "'['", "']'", 
		"'by'", "'first'", "'foreach'", "'in'", "'last'", "'main'", "'now'", "'parse'", 
		"'print'", "'procedure'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
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
	public static final int ID=4;
	public static final int NUMBER=5;
	public static final int STRING=6;
	public static final int TAG=7;
	public static final int THIS=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "inSt", "procedure", "xPath", "exp", "mainRoutine", "block", 
		"code", "selector", "assSt", "foreachSt", "printSt", "parseSt", "statement"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public scrawlParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public scrawlParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public scrawlParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return scrawlParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/bardia/scrawl/scrawl.g"; }


		int scope=0;
		String thisDoc;
		HashMap symbolTable = new HashMap();



	// $ANTLR start "code"
	// /home/bardia/scrawl/scrawl.g:14:1: code : mainRoutine ( procedure )* ;
	public final void code() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "code");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:14:6: ( mainRoutine ( procedure )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:14:7: mainRoutine ( procedure )*
			{
			dbg.location(14,7);

					System.out.println("package main");
					System.out.println("import \"fmt\"");
					System.out.println("import \"github.com/PuerkitoBio/goquery\"");
				dbg.location(19,3);
			pushFollow(FOLLOW_mainRoutine_in_code25);
			mainRoutine();
			state._fsp--;
			dbg.location(19,15);
			// /home/bardia/scrawl/scrawl.g:19:15: ( procedure )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==27) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:19:15: procedure
					{
					dbg.location(19,15);
					pushFollow(FOLLOW_procedure_in_code27);
					procedure();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(19, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "code");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "code"



	// $ANTLR start "procedure"
	// /home/bardia/scrawl/scrawl.g:21:1: procedure : 'procedure' ID block ;
	public final void procedure() throws RecognitionException {
		Token ID1=null;

		try { dbg.enterRule(getGrammarFileName(), "procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:22:2: ( 'procedure' ID block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:22:4: 'procedure' ID block
			{
			dbg.location(22,4);
			match(input,27,FOLLOW_27_in_procedure37); dbg.location(22,16);
			ID1=(Token)match(input,ID,FOLLOW_ID_in_procedure39); dbg.location(23,3);

						scope += 1;
						System.out.print("\nfunc "+(ID1!=null?ID1.getText():null)+"(s *goquery.Selection)");
						thisDoc="s";
					dbg.location(28,4);
			pushFollow(FOLLOW_block_in_procedure48);
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
		dbg.location(28, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "procedure"



	// $ANTLR start "mainRoutine"
	// /home/bardia/scrawl/scrawl.g:30:1: mainRoutine : 'main' block ;
	public final void mainRoutine() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mainRoutine");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:31:2: ( 'main' block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:31:4: 'main' block
			{
			dbg.location(31,4);
			match(input,23,FOLLOW_23_in_mainRoutine58); dbg.location(31,11);
			System.out.print("func main()");dbg.location(32,4);
			pushFollow(FOLLOW_block_in_mainRoutine65);
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
		dbg.location(32, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mainRoutine");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "block"
	// /home/bardia/scrawl/scrawl.g:34:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:34:7: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:34:9: '{' ( statement )* '}'
			{
			dbg.location(34,9);
			match(input,28,FOLLOW_28_in_block74); dbg.location(34,14);
			System.out.println("{"); dbg.location(35,4);
			// /home/bardia/scrawl/scrawl.g:35:4: ( statement )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||(LA2_0 >= 20 && LA2_0 <= 21)||(LA2_0 >= 25 && LA2_0 <= 26)) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:35:4: statement
					{
					dbg.location(35,4);
					pushFollow(FOLLOW_statement_in_block82);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(36,5);
			match(input,29,FOLLOW_29_in_block90); dbg.location(36,10);
			System.out.print("}");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /home/bardia/scrawl/scrawl.g:38:1: statement : ( inSt | parseSt | assSt | foreachSt | printSt );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:39:2: ( inSt | parseSt | assSt | foreachSt | printSt )
			int alt3=5;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case 21:
				{
				alt3=1;
				}
				break;
			case 25:
				{
				alt3=2;
				}
				break;
			case ID:
				{
				alt3=3;
				}
				break;
			case 20:
				{
				alt3=4;
				}
				break;
			case 26:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:39:4: inSt
					{
					dbg.location(39,4);
					pushFollow(FOLLOW_inSt_in_statement102);
					inSt();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:40:4: parseSt
					{
					dbg.location(40,4);
					pushFollow(FOLLOW_parseSt_in_statement107);
					parseSt();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:41:4: assSt
					{
					dbg.location(41,4);
					pushFollow(FOLLOW_assSt_in_statement112);
					assSt();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/bardia/scrawl/scrawl.g:42:4: foreachSt
					{
					dbg.location(42,4);
					pushFollow(FOLLOW_foreachSt_in_statement117);
					foreachSt();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/bardia/scrawl/scrawl.g:43:4: printSt
					{
					dbg.location(43,4);
					pushFollow(FOLLOW_printSt_in_statement122);
					printSt();
					state._fsp--;

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
		dbg.location(43, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "inSt"
	// /home/bardia/scrawl/scrawl.g:45:1: inSt : 'in' ( STRING ) block ;
	public final void inSt() throws RecognitionException {
		Token STRING2=null;

		try { dbg.enterRule(getGrammarFileName(), "inSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:45:6: ( 'in' ( STRING ) block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:45:8: 'in' ( STRING ) block
			{
			dbg.location(45,8);
			match(input,21,FOLLOW_21_in_inSt131); dbg.location(45,13);
			// /home/bardia/scrawl/scrawl.g:45:13: ( STRING )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:45:14: STRING
			{
			dbg.location(45,14);
			STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_inSt134); 
			}
			dbg.location(45,22);

							scope += 1;
							System.out.println("resp"+scope+", err"+scope+" := goquery.NewDocument("+(STRING2!=null?STRING2.getText():null)+")");
							System.out.print("if err"+scope+" == nil");
							thisDoc = "resp"+scope ;
						dbg.location(51,3);
			pushFollow(FOLLOW_block_in_inSt141);
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
		dbg.location(51, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inSt"



	// $ANTLR start "assSt"
	// /home/bardia/scrawl/scrawl.g:53:1: assSt : ID '=' exp ';' ;
	public final void assSt() throws RecognitionException {
		Token ID3=null;
		ParserRuleReturnScope exp4 =null;

		try { dbg.enterRule(getGrammarFileName(), "assSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:53:7: ( ID '=' exp ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:53:9: ID '=' exp ';'
			{
			dbg.location(53,9);
			ID3=(Token)match(input,ID,FOLLOW_ID_in_assSt149); dbg.location(53,12);
			match(input,14,FOLLOW_14_in_assSt151); dbg.location(53,16);
			pushFollow(FOLLOW_exp_in_assSt153);
			exp4=exp();
			state._fsp--;
			dbg.location(53,20);
			match(input,13,FOLLOW_13_in_assSt155); dbg.location(54,3);

						String temp = (ID3!=null?ID3.getText():null) ;
						for(int i = 0;i<(exp4!=null?((scrawlParser.exp_return)exp4).ignore:0);i++)
							temp += ", _ ";
						System.out.println(temp+ ":="+(exp4!=null?((scrawlParser.exp_return)exp4).value:null));
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assSt"



	// $ANTLR start "foreachSt"
	// /home/bardia/scrawl/scrawl.g:61:1: foreachSt : 'foreach' selector block ;
	public final void foreachSt() throws RecognitionException {
		String selector5 =null;

		try { dbg.enterRule(getGrammarFileName(), "foreachSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:62:2: ( 'foreach' selector block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:62:4: 'foreach' selector block
			{
			dbg.location(62,4);
			match(input,20,FOLLOW_20_in_foreachSt168); dbg.location(62,14);
			pushFollow(FOLLOW_selector_in_foreachSt170);
			selector5=selector();
			state._fsp--;
			dbg.location(63,3);

						scope+=1;
						System.out.print(selector5+".Each(func(i int, resp"+scope+" *goquery.Selection) ");
					dbg.location(67,3);
			pushFollow(FOLLOW_block_in_foreachSt179);
			block();
			state._fsp--;
			dbg.location(67,9);
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
		dbg.location(67, 45);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "foreachSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "foreachSt"



	// $ANTLR start "parseSt"
	// /home/bardia/scrawl/scrawl.g:69:1: parseSt : ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' | 'parse' 'now' exp 'by' ID ';' );
	public final void parseSt() throws RecognitionException {
		Token ID6=null;
		ParserRuleReturnScope exp7 =null;

		try { dbg.enterRule(getGrammarFileName(), "parseSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:69:9: ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' | 'parse' 'now' exp 'by' ID ';' )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==25) ) {
				switch ( input.LA(2) ) {
				case 19:
					{
					alt4=1;
					}
					break;
				case 22:
					{
					alt4=2;
					}
					break;
				case 24:
					{
					alt4=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:69:11: 'parse' 'first' exp 'by' ID ';'
					{
					dbg.location(69,11);
					match(input,25,FOLLOW_25_in_parseSt190); dbg.location(69,19);
					match(input,19,FOLLOW_19_in_parseSt192); dbg.location(69,27);
					pushFollow(FOLLOW_exp_in_parseSt194);
					exp7=exp();
					state._fsp--;
					dbg.location(69,31);
					match(input,18,FOLLOW_18_in_parseSt196); dbg.location(69,36);
					ID6=(Token)match(input,ID,FOLLOW_ID_in_parseSt198); dbg.location(69,39);
					match(input,13,FOLLOW_13_in_parseSt200); dbg.location(70,4);
					 System.out.println((ID6!=null?ID6.getText():null)+"("+(exp7!=null?((scrawlParser.exp_return)exp7).value:null)+")");
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:71:4: 'parse' 'last' exp 'by' ID ';'
					{
					dbg.location(71,4);
					match(input,25,FOLLOW_25_in_parseSt211); dbg.location(71,12);
					match(input,22,FOLLOW_22_in_parseSt213); dbg.location(71,19);
					pushFollow(FOLLOW_exp_in_parseSt215);
					exp();
					state._fsp--;
					dbg.location(71,23);
					match(input,18,FOLLOW_18_in_parseSt217); dbg.location(71,28);
					match(input,ID,FOLLOW_ID_in_parseSt219); dbg.location(71,31);
					match(input,13,FOLLOW_13_in_parseSt221); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:72:4: 'parse' 'now' exp 'by' ID ';'
					{
					dbg.location(72,4);
					match(input,25,FOLLOW_25_in_parseSt226); dbg.location(72,12);
					match(input,24,FOLLOW_24_in_parseSt228); dbg.location(72,18);
					pushFollow(FOLLOW_exp_in_parseSt230);
					exp();
					state._fsp--;
					dbg.location(72,22);
					match(input,18,FOLLOW_18_in_parseSt232); dbg.location(72,27);
					match(input,ID,FOLLOW_ID_in_parseSt234); dbg.location(72,30);
					match(input,13,FOLLOW_13_in_parseSt236); 
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
		dbg.location(72, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parseSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parseSt"



	// $ANTLR start "printSt"
	// /home/bardia/scrawl/scrawl.g:74:1: printSt : 'print' exp ';' ;
	public final void printSt() throws RecognitionException {
		ParserRuleReturnScope exp8 =null;

		try { dbg.enterRule(getGrammarFileName(), "printSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:74:9: ( 'print' exp ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:74:11: 'print' exp ';'
			{
			dbg.location(74,11);
			match(input,26,FOLLOW_26_in_printSt245); dbg.location(74,19);
			pushFollow(FOLLOW_exp_in_printSt247);
			exp8=exp();
			state._fsp--;
			dbg.location(74,23);
			match(input,13,FOLLOW_13_in_printSt249); dbg.location(75,4);
			 System.out.println("fmt.Println("+(exp8!=null?((scrawlParser.exp_return)exp8).value:null)+")");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 57);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printSt"


	public static class exp_return extends ParserRuleReturnScope {
		public String value;
		public int ignore;
	};


	// $ANTLR start "exp"
	// /home/bardia/scrawl/scrawl.g:77:1: exp returns [String value, int ignore] : ( ID | STRING | selector '@' ID | THIS );
	public final scrawlParser.exp_return exp() throws RecognitionException {
		scrawlParser.exp_return retval = new scrawlParser.exp_return();
		retval.start = input.LT(1);

		Token ID9=null;
		Token STRING10=null;
		Token ID12=null;
		String selector11 =null;

		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:77:41: ( ID | STRING | selector '@' ID | THIS )
			int alt5=4;
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			switch ( input.LA(1) ) {
			case ID:
				{
				alt5=1;
				}
				break;
			case STRING:
				{
				alt5=2;
				}
				break;
			case 10:
				{
				alt5=3;
				}
				break;
			case THIS:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:77:43: ID
					{
					dbg.location(77,43);
					ID9=(Token)match(input,ID,FOLLOW_ID_in_exp268); dbg.location(77,46);
					retval.value = (ID9!=null?ID9.getText():null);
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:78:4: STRING
					{
					dbg.location(78,4);
					STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_exp275); dbg.location(78,11);
					retval.value = (STRING10!=null?STRING10.getText():null); retval.ignore =0;
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:79:4: selector '@' ID
					{
					dbg.location(79,4);
					pushFollow(FOLLOW_selector_in_exp282);
					selector11=selector();
					state._fsp--;
					dbg.location(79,12);
					match(input,15,FOLLOW_15_in_exp283); dbg.location(79,15);
					ID12=(Token)match(input,ID,FOLLOW_ID_in_exp284); dbg.location(79,17);
					retval.value =selector11+".First().Attr(\""+(ID12!=null?ID12.getText():null)+"\")";retval.ignore =1;
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/bardia/scrawl/scrawl.g:80:4: THIS
					{
					dbg.location(80,4);
					match(input,THIS,FOLLOW_THIS_in_exp290); dbg.location(80,9);
					retval.value ="resp"+scope;retval.ignore =0;
					}
					break;

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
		dbg.location(80, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exp"



	// $ANTLR start "selector"
	// /home/bardia/scrawl/scrawl.g:82:1: selector returns [String value] : '(' STRING ')' ;
	public final String selector() throws RecognitionException {
		String value = null;


		Token STRING13=null;

		try { dbg.enterRule(getGrammarFileName(), "selector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:82:32: ( '(' STRING ')' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:83:3: '(' STRING ')'
			{
			dbg.location(83,3);
			match(input,10,FOLLOW_10_in_selector306); dbg.location(83,7);
			STRING13=(Token)match(input,STRING,FOLLOW_STRING_in_selector308); dbg.location(83,14);
			match(input,11,FOLLOW_11_in_selector310); dbg.location(83,18);
			value =thisDoc+".Find("+(STRING13!=null?STRING13.getText():null)+")";
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 60);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "selector"



	// $ANTLR start "xPath"
	// /home/bardia/scrawl/scrawl.g:85:1: xPath : TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* ;
	public final void xPath() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "xPath");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:85:7: ( TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:85:9: TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )*
			{
			dbg.location(85,9);
			match(input,TAG,FOLLOW_TAG_in_xPath322); dbg.location(85,12);
			// /home/bardia/scrawl/scrawl.g:85:12: ( '[' NUMBER ']' )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==16) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:85:13: '[' NUMBER ']'
					{
					dbg.location(85,13);
					match(input,16,FOLLOW_16_in_xPath324); dbg.location(85,16);
					match(input,NUMBER,FOLLOW_NUMBER_in_xPath325); dbg.location(85,22);
					match(input,17,FOLLOW_17_in_xPath326); 
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(85,27);
			// /home/bardia/scrawl/scrawl.g:85:27: ( '.' TAG ( '[' NUMBER ']' )? )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==12) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:85:28: '.' TAG ( '[' NUMBER ']' )?
					{
					dbg.location(85,28);
					match(input,12,FOLLOW_12_in_xPath330); dbg.location(85,31);
					match(input,TAG,FOLLOW_TAG_in_xPath331); dbg.location(85,34);
					// /home/bardia/scrawl/scrawl.g:85:34: ( '[' NUMBER ']' )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==16) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/bardia/scrawl/scrawl.g:85:35: '[' NUMBER ']'
							{
							dbg.location(85,35);
							match(input,16,FOLLOW_16_in_xPath333); dbg.location(85,38);
							match(input,NUMBER,FOLLOW_NUMBER_in_xPath334); dbg.location(85,44);
							match(input,17,FOLLOW_17_in_xPath335); 
							}
							break;

					}
					} finally {dbg.exitSubRule(7);}

					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(85, 50);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "xPath");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "xPath"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_code25 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_procedure_in_code27 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_procedure37 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_procedure39 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_block_in_procedure48 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_mainRoutine58 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_block_in_mainRoutine65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_block74 = new BitSet(new long[]{0x0000000026300010L});
	public static final BitSet FOLLOW_statement_in_block82 = new BitSet(new long[]{0x0000000026300010L});
	public static final BitSet FOLLOW_29_in_block90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSt_in_statement102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parseSt_in_statement107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assSt_in_statement112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachSt_in_statement117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printSt_in_statement122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_inSt131 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STRING_in_inSt134 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_block_in_inSt141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assSt149 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_assSt151 = new BitSet(new long[]{0x0000000000000550L});
	public static final BitSet FOLLOW_exp_in_assSt153 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_assSt155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_foreachSt168 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_selector_in_foreachSt170 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_block_in_foreachSt179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_parseSt190 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_parseSt192 = new BitSet(new long[]{0x0000000000000550L});
	public static final BitSet FOLLOW_exp_in_parseSt194 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_parseSt196 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt198 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_parseSt200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_parseSt211 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_parseSt213 = new BitSet(new long[]{0x0000000000000550L});
	public static final BitSet FOLLOW_exp_in_parseSt215 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_parseSt217 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt219 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_parseSt221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_parseSt226 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_parseSt228 = new BitSet(new long[]{0x0000000000000550L});
	public static final BitSet FOLLOW_exp_in_parseSt230 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_parseSt232 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt234 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_parseSt236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_printSt245 = new BitSet(new long[]{0x0000000000000550L});
	public static final BitSet FOLLOW_exp_in_printSt247 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_printSt249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_exp275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_exp282 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_exp283 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_exp284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_THIS_in_exp290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_selector306 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STRING_in_selector308 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_selector310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_in_xPath322 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_16_in_xPath324 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath325 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_xPath326 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_xPath330 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_TAG_in_xPath331 = new BitSet(new long[]{0x0000000000011002L});
	public static final BitSet FOLLOW_16_in_xPath333 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath334 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_xPath335 = new BitSet(new long[]{0x0000000000001002L});
}
