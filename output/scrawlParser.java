// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-14 16:56:13

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
		"WS", "'('", "')'", "'.'", "';'", "'='", "'@'", "'['", "']'", "'by'", 
		"'first'", "'foreach'", "'in'", "'last'", "'main'", "'now'", "'parse'", 
		"'print'", "'procedure'", "'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
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
	public static final int ID=4;
	public static final int NUMBER=5;
	public static final int STRING=6;
	public static final int TAG=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "block", "xPath", "assSt", "parseSt", "exp", "statement", 
		"procedure", "foreachSt", "mainRoutine", "code", "selector", "printSt", 
		"inSt"
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


		int blockNum=0;



	// $ANTLR start "code"
	// /home/bardia/scrawl/scrawl.g:7:1: code : mainRoutine ( procedure )* ;
	public final void code() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "code");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:7:6: ( mainRoutine ( procedure )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:7:8: mainRoutine ( procedure )*
			{
			dbg.location(7,8);

						System.out.println("package main");
						System.out.println("import \"fmt\"");
						System.out.println("import \"net/http\"");
					dbg.location(12,3);
			pushFollow(FOLLOW_mainRoutine_in_code19);
			mainRoutine();
			state._fsp--;
			dbg.location(12,15);
			// /home/bardia/scrawl/scrawl.g:12:15: ( procedure )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==26) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:12:15: procedure
					{
					dbg.location(12,15);
					pushFollow(FOLLOW_procedure_in_code21);
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
		dbg.location(12, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "code");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "code"



	// $ANTLR start "procedure"
	// /home/bardia/scrawl/scrawl.g:14:1: procedure : 'procedure' ID block ;
	public final void procedure() throws RecognitionException {
		Token ID1=null;

		try { dbg.enterRule(getGrammarFileName(), "procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:15:2: ( 'procedure' ID block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:15:4: 'procedure' ID block
			{
			dbg.location(15,4);
			match(input,26,FOLLOW_26_in_procedure31); dbg.location(15,16);
			ID1=(Token)match(input,ID,FOLLOW_ID_in_procedure33); dbg.location(16,3);

						System.out.print("func "+(ID1!=null?ID1.getText():null));
					dbg.location(19,4);
			pushFollow(FOLLOW_block_in_procedure42);
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
		dbg.location(19, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "procedure"



	// $ANTLR start "mainRoutine"
	// /home/bardia/scrawl/scrawl.g:21:1: mainRoutine : 'main' block ;
	public final void mainRoutine() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mainRoutine");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:22:2: ( 'main' block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:22:4: 'main' block
			{
			dbg.location(22,4);
			match(input,22,FOLLOW_22_in_mainRoutine52); dbg.location(22,11);
			System.out.print("func main()");dbg.location(23,4);
			pushFollow(FOLLOW_block_in_mainRoutine59);
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
		dbg.location(23, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mainRoutine");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "block"
	// /home/bardia/scrawl/scrawl.g:25:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:25:7: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:25:9: '{' ( statement )* '}'
			{
			dbg.location(25,9);
			match(input,27,FOLLOW_27_in_block68); dbg.location(25,14);
			System.out.println("{"); blockNum+=1;dbg.location(26,4);
			// /home/bardia/scrawl/scrawl.g:26:4: ( statement )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||(LA2_0 >= 19 && LA2_0 <= 20)||(LA2_0 >= 24 && LA2_0 <= 25)) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:26:4: statement
					{
					dbg.location(26,4);
					pushFollow(FOLLOW_statement_in_block76);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(27,5);
			match(input,28,FOLLOW_28_in_block84); dbg.location(27,10);
			System.out.println("}"); blockNum-=1;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 48);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /home/bardia/scrawl/scrawl.g:29:1: statement : ( inSt | parseSt | assSt | foreachSt | printSt );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:30:2: ( inSt | parseSt | assSt | foreachSt | printSt )
			int alt3=5;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case 20:
				{
				alt3=1;
				}
				break;
			case 24:
				{
				alt3=2;
				}
				break;
			case ID:
				{
				alt3=3;
				}
				break;
			case 19:
				{
				alt3=4;
				}
				break;
			case 25:
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

					// /home/bardia/scrawl/scrawl.g:30:4: inSt
					{
					dbg.location(30,4);
					pushFollow(FOLLOW_inSt_in_statement96);
					inSt();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:31:4: parseSt
					{
					dbg.location(31,4);
					pushFollow(FOLLOW_parseSt_in_statement101);
					parseSt();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:32:4: assSt
					{
					dbg.location(32,4);
					pushFollow(FOLLOW_assSt_in_statement106);
					assSt();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/bardia/scrawl/scrawl.g:33:4: foreachSt
					{
					dbg.location(33,4);
					pushFollow(FOLLOW_foreachSt_in_statement111);
					foreachSt();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/bardia/scrawl/scrawl.g:34:4: printSt
					{
					dbg.location(34,4);
					pushFollow(FOLLOW_printSt_in_statement116);
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
		dbg.location(34, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "inSt"
	// /home/bardia/scrawl/scrawl.g:36:1: inSt : 'in' ( STRING ) block ;
	public final void inSt() throws RecognitionException {
		Token STRING2=null;

		try { dbg.enterRule(getGrammarFileName(), "inSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:36:6: ( 'in' ( STRING ) block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:36:8: 'in' ( STRING ) block
			{
			dbg.location(36,8);
			match(input,20,FOLLOW_20_in_inSt125); dbg.location(36,13);
			// /home/bardia/scrawl/scrawl.g:36:13: ( STRING )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:36:14: STRING
			{
			dbg.location(36,14);
			STRING2=(Token)match(input,STRING,FOLLOW_STRING_in_inSt128); 
			}
			dbg.location(36,22);

							System.out.println("resp"+blockNum+", err"+blockNum+" := http.Get("+(STRING2!=null?STRING2.getText():null)+")");
							System.out.print("if err"+blockNum+" == nil");
						dbg.location(40,3);
			pushFollow(FOLLOW_block_in_inSt135);
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
		dbg.location(40, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inSt"



	// $ANTLR start "assSt"
	// /home/bardia/scrawl/scrawl.g:42:1: assSt : ID '=' exp ';' ;
	public final void assSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:42:7: ( ID '=' exp ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:42:9: ID '=' exp ';'
			{
			dbg.location(42,9);
			match(input,ID,FOLLOW_ID_in_assSt143); dbg.location(42,12);
			match(input,13,FOLLOW_13_in_assSt145); dbg.location(42,16);
			pushFollow(FOLLOW_exp_in_assSt147);
			exp();
			state._fsp--;
			dbg.location(42,20);
			match(input,12,FOLLOW_12_in_assSt149); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assSt"



	// $ANTLR start "foreachSt"
	// /home/bardia/scrawl/scrawl.g:44:1: foreachSt : 'foreach' selector block ;
	public final void foreachSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "foreachSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:45:2: ( 'foreach' selector block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:45:4: 'foreach' selector block
			{
			dbg.location(45,4);
			match(input,19,FOLLOW_19_in_foreachSt158); dbg.location(45,14);
			pushFollow(FOLLOW_selector_in_foreachSt160);
			selector();
			state._fsp--;
			dbg.location(45,23);
			pushFollow(FOLLOW_block_in_foreachSt162);
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
		dbg.location(45, 27);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "foreachSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "foreachSt"



	// $ANTLR start "parseSt"
	// /home/bardia/scrawl/scrawl.g:47:1: parseSt : ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' | 'parse' 'now' exp 'by' ID ';' );
	public final void parseSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parseSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:47:9: ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' | 'parse' 'now' exp 'by' ID ';' )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==24) ) {
				switch ( input.LA(2) ) {
				case 18:
					{
					alt4=1;
					}
					break;
				case 21:
					{
					alt4=2;
					}
					break;
				case 23:
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

					// /home/bardia/scrawl/scrawl.g:47:11: 'parse' 'first' exp 'by' ID ';'
					{
					dbg.location(47,11);
					match(input,24,FOLLOW_24_in_parseSt171); dbg.location(47,19);
					match(input,18,FOLLOW_18_in_parseSt173); dbg.location(47,27);
					pushFollow(FOLLOW_exp_in_parseSt175);
					exp();
					state._fsp--;
					dbg.location(47,31);
					match(input,17,FOLLOW_17_in_parseSt177); dbg.location(47,36);
					match(input,ID,FOLLOW_ID_in_parseSt179); dbg.location(47,39);
					match(input,12,FOLLOW_12_in_parseSt181); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:48:4: 'parse' 'last' exp 'by' ID ';'
					{
					dbg.location(48,4);
					match(input,24,FOLLOW_24_in_parseSt186); dbg.location(48,12);
					match(input,21,FOLLOW_21_in_parseSt188); dbg.location(48,19);
					pushFollow(FOLLOW_exp_in_parseSt190);
					exp();
					state._fsp--;
					dbg.location(48,23);
					match(input,17,FOLLOW_17_in_parseSt192); dbg.location(48,28);
					match(input,ID,FOLLOW_ID_in_parseSt194); dbg.location(48,31);
					match(input,12,FOLLOW_12_in_parseSt196); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:49:4: 'parse' 'now' exp 'by' ID ';'
					{
					dbg.location(49,4);
					match(input,24,FOLLOW_24_in_parseSt201); dbg.location(49,12);
					match(input,23,FOLLOW_23_in_parseSt203); dbg.location(49,18);
					pushFollow(FOLLOW_exp_in_parseSt205);
					exp();
					state._fsp--;
					dbg.location(49,22);
					match(input,17,FOLLOW_17_in_parseSt207); dbg.location(49,27);
					match(input,ID,FOLLOW_ID_in_parseSt209); dbg.location(49,30);
					match(input,12,FOLLOW_12_in_parseSt211); 
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
		dbg.location(49, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parseSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parseSt"



	// $ANTLR start "printSt"
	// /home/bardia/scrawl/scrawl.g:51:1: printSt : 'print' exp ';' ;
	public final void printSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:51:9: ( 'print' exp ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:51:11: 'print' exp ';'
			{
			dbg.location(51,11);
			match(input,25,FOLLOW_25_in_printSt220); dbg.location(51,19);
			pushFollow(FOLLOW_exp_in_printSt222);
			exp();
			state._fsp--;
			dbg.location(51,23);
			match(input,12,FOLLOW_12_in_printSt224); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printSt"



	// $ANTLR start "exp"
	// /home/bardia/scrawl/scrawl.g:53:1: exp : ( ID | STRING | selector '@' ID );
	public final void exp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:53:5: ( ID | STRING | selector '@' ID )
			int alt5=3;
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
			case 9:
				{
				alt5=3;
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

					// /home/bardia/scrawl/scrawl.g:53:7: ID
					{
					dbg.location(53,7);
					match(input,ID,FOLLOW_ID_in_exp233); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:54:4: STRING
					{
					dbg.location(54,4);
					match(input,STRING,FOLLOW_STRING_in_exp238); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:55:4: selector '@' ID
					{
					dbg.location(55,4);
					pushFollow(FOLLOW_selector_in_exp243);
					selector();
					state._fsp--;
					dbg.location(55,12);
					match(input,14,FOLLOW_14_in_exp244); dbg.location(55,15);
					match(input,ID,FOLLOW_ID_in_exp245); 
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
		dbg.location(55, 16);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exp"



	// $ANTLR start "selector"
	// /home/bardia/scrawl/scrawl.g:57:1: selector : '(' xPath ')' ;
	public final void selector() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "selector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:57:10: ( '(' xPath ')' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:58:3: '(' xPath ')'
			{
			dbg.location(58,3);
			match(input,9,FOLLOW_9_in_selector256); dbg.location(58,7);
			pushFollow(FOLLOW_xPath_in_selector258);
			xPath();
			state._fsp--;
			dbg.location(58,13);
			match(input,10,FOLLOW_10_in_selector260); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "selector"



	// $ANTLR start "xPath"
	// /home/bardia/scrawl/scrawl.g:60:1: xPath : TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* ;
	public final void xPath() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "xPath");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:60:7: ( TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:60:9: TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )*
			{
			dbg.location(60,9);
			match(input,TAG,FOLLOW_TAG_in_xPath270); dbg.location(60,12);
			// /home/bardia/scrawl/scrawl.g:60:12: ( '[' NUMBER ']' )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==15) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:60:13: '[' NUMBER ']'
					{
					dbg.location(60,13);
					match(input,15,FOLLOW_15_in_xPath272); dbg.location(60,16);
					match(input,NUMBER,FOLLOW_NUMBER_in_xPath273); dbg.location(60,22);
					match(input,16,FOLLOW_16_in_xPath274); 
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(60,27);
			// /home/bardia/scrawl/scrawl.g:60:27: ( '.' TAG ( '[' NUMBER ']' )? )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==11) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:60:28: '.' TAG ( '[' NUMBER ']' )?
					{
					dbg.location(60,28);
					match(input,11,FOLLOW_11_in_xPath278); dbg.location(60,31);
					match(input,TAG,FOLLOW_TAG_in_xPath279); dbg.location(60,34);
					// /home/bardia/scrawl/scrawl.g:60:34: ( '[' NUMBER ']' )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==15) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/bardia/scrawl/scrawl.g:60:35: '[' NUMBER ']'
							{
							dbg.location(60,35);
							match(input,15,FOLLOW_15_in_xPath281); dbg.location(60,38);
							match(input,NUMBER,FOLLOW_NUMBER_in_xPath282); dbg.location(60,44);
							match(input,16,FOLLOW_16_in_xPath283); 
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
		dbg.location(60, 50);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "xPath");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "xPath"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_code19 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_procedure_in_code21 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_procedure31 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_procedure33 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_block_in_procedure42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_mainRoutine52 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_block_in_mainRoutine59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_block68 = new BitSet(new long[]{0x0000000013180010L});
	public static final BitSet FOLLOW_statement_in_block76 = new BitSet(new long[]{0x0000000013180010L});
	public static final BitSet FOLLOW_28_in_block84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSt_in_statement96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parseSt_in_statement101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assSt_in_statement106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachSt_in_statement111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printSt_in_statement116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_inSt125 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STRING_in_inSt128 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_block_in_inSt135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assSt143 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_assSt145 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_assSt147 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_assSt149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_foreachSt158 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_selector_in_foreachSt160 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_block_in_foreachSt162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_parseSt171 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_parseSt173 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_parseSt175 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_parseSt177 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt179 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_parseSt181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_parseSt186 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_parseSt188 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_parseSt190 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_parseSt192 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt194 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_parseSt196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_parseSt201 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_parseSt203 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_parseSt205 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_parseSt207 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt209 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_parseSt211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_printSt220 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_printSt222 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_printSt224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_exp238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_exp243 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_exp244 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_exp245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_selector256 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_xPath_in_selector258 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_selector260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_in_xPath270 = new BitSet(new long[]{0x0000000000008802L});
	public static final BitSet FOLLOW_15_in_xPath272 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath273 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_xPath274 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_xPath278 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_TAG_in_xPath279 = new BitSet(new long[]{0x0000000000008802L});
	public static final BitSet FOLLOW_15_in_xPath281 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath282 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_xPath283 = new BitSet(new long[]{0x0000000000000802L});
}
