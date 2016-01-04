// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 18:02:48

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
		"'('", "')'", "'.'", "';'", "'='", "'@'", "'['", "']'", "'by'", "'first'", 
		"'foreach'", "'in'", "'last'", "'main'", "'parse'", "'procedure'", "'{'", 
		"'}'"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
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
	public static final int ID=4;
	public static final int NUMBER=5;
	public static final int STRING=6;
	public static final int TAG=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "mainRoutine", "procedure", "assSt", "foreachSt", "code", 
		"exp", "inSt", "selector", "statement", "block", "xPath", "parseSt"
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


		int temp=0;
		int label=0;
		List vals;	



	// $ANTLR start "code"
	// /home/bardia/scrawl/scrawl.g:10:1: code : mainRoutine ( procedure )* ;
	public final void code() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "code");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:10:6: ( mainRoutine ( procedure )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:10:8: mainRoutine ( procedure )*
			{
			dbg.location(10,8);
			pushFollow(FOLLOW_mainRoutine_in_code16);
			mainRoutine();
			state._fsp--;
			dbg.location(10,20);
			// /home/bardia/scrawl/scrawl.g:10:20: ( procedure )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==23) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:10:20: procedure
					{
					dbg.location(10,20);
					pushFollow(FOLLOW_procedure_in_code18);
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
		dbg.location(10, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "code");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "code"



	// $ANTLR start "procedure"
	// /home/bardia/scrawl/scrawl.g:12:1: procedure : 'procedure' ID block ;
	public final void procedure() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:13:2: ( 'procedure' ID block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:13:4: 'procedure' ID block
			{
			dbg.location(13,4);
			match(input,23,FOLLOW_23_in_procedure28); dbg.location(13,16);
			match(input,ID,FOLLOW_ID_in_procedure30); dbg.location(13,19);
			pushFollow(FOLLOW_block_in_procedure32);
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
		dbg.location(13, 23);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "procedure"



	// $ANTLR start "mainRoutine"
	// /home/bardia/scrawl/scrawl.g:15:1: mainRoutine : 'main' block ;
	public final void mainRoutine() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mainRoutine");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:16:2: ( 'main' block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:16:4: 'main' block
			{
			dbg.location(16,4);
			match(input,21,FOLLOW_21_in_mainRoutine42); dbg.location(16,11);
			pushFollow(FOLLOW_block_in_mainRoutine44);
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
		dbg.location(16, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mainRoutine");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "block"
	// /home/bardia/scrawl/scrawl.g:18:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:18:7: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:18:9: '{' ( statement )* '}'
			{
			dbg.location(18,9);
			match(input,24,FOLLOW_24_in_block53); dbg.location(18,13);
			// /home/bardia/scrawl/scrawl.g:18:13: ( statement )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==ID||(LA2_0 >= 18 && LA2_0 <= 19)||LA2_0==22) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:18:13: statement
					{
					dbg.location(18,13);
					pushFollow(FOLLOW_statement_in_block55);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(18,25);
			match(input,25,FOLLOW_25_in_block59); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(18, 27);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /home/bardia/scrawl/scrawl.g:20:1: statement : ( inSt | parseSt | assSt | foreachSt );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:21:2: ( inSt | parseSt | assSt | foreachSt )
			int alt3=4;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			switch ( input.LA(1) ) {
			case 19:
				{
				alt3=1;
				}
				break;
			case 22:
				{
				alt3=2;
				}
				break;
			case ID:
				{
				alt3=3;
				}
				break;
			case 18:
				{
				alt3=4;
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

					// /home/bardia/scrawl/scrawl.g:21:4: inSt
					{
					dbg.location(21,4);
					pushFollow(FOLLOW_inSt_in_statement68);
					inSt();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:22:4: parseSt
					{
					dbg.location(22,4);
					pushFollow(FOLLOW_parseSt_in_statement73);
					parseSt();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:23:4: assSt
					{
					dbg.location(23,4);
					pushFollow(FOLLOW_assSt_in_statement78);
					assSt();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/bardia/scrawl/scrawl.g:24:4: foreachSt
					{
					dbg.location(24,4);
					pushFollow(FOLLOW_foreachSt_in_statement83);
					foreachSt();
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
		dbg.location(24, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "inSt"
	// /home/bardia/scrawl/scrawl.g:26:1: inSt : 'in' ( STRING ) block ;
	public final void inSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "inSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:26:6: ( 'in' ( STRING ) block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:26:8: 'in' ( STRING ) block
			{
			dbg.location(26,8);
			match(input,19,FOLLOW_19_in_inSt92); dbg.location(26,13);
			// /home/bardia/scrawl/scrawl.g:26:13: ( STRING )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:26:14: STRING
			{
			dbg.location(26,14);
			match(input,STRING,FOLLOW_STRING_in_inSt95); 
			}
			dbg.location(26,22);
			pushFollow(FOLLOW_block_in_inSt98);
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
		dbg.location(26, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inSt"



	// $ANTLR start "assSt"
	// /home/bardia/scrawl/scrawl.g:28:1: assSt : ID '=' exp ';' ;
	public final void assSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:28:7: ( ID '=' exp ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:28:9: ID '=' exp ';'
			{
			dbg.location(28,9);
			match(input,ID,FOLLOW_ID_in_assSt106); dbg.location(28,12);
			match(input,12,FOLLOW_12_in_assSt108); dbg.location(28,16);
			pushFollow(FOLLOW_exp_in_assSt110);
			exp();
			state._fsp--;
			dbg.location(28,20);
			match(input,11,FOLLOW_11_in_assSt112); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(28, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assSt"



	// $ANTLR start "foreachSt"
	// /home/bardia/scrawl/scrawl.g:30:1: foreachSt : 'foreach' selector block ;
	public final void foreachSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "foreachSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:31:2: ( 'foreach' selector block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:31:4: 'foreach' selector block
			{
			dbg.location(31,4);
			match(input,18,FOLLOW_18_in_foreachSt121); dbg.location(31,14);
			pushFollow(FOLLOW_selector_in_foreachSt123);
			selector();
			state._fsp--;
			dbg.location(31,23);
			pushFollow(FOLLOW_block_in_foreachSt125);
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
		dbg.location(31, 27);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "foreachSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "foreachSt"



	// $ANTLR start "parseSt"
	// /home/bardia/scrawl/scrawl.g:33:1: parseSt : ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' );
	public final void parseSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parseSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(33, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:33:9: ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' )
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==22) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==17) ) {
					alt4=1;
				}
				else if ( (LA4_1==20) ) {
					alt4=2;
				}

				else {
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

					// /home/bardia/scrawl/scrawl.g:33:11: 'parse' 'first' exp 'by' ID ';'
					{
					dbg.location(33,11);
					match(input,22,FOLLOW_22_in_parseSt134); dbg.location(33,19);
					match(input,17,FOLLOW_17_in_parseSt136); dbg.location(33,27);
					pushFollow(FOLLOW_exp_in_parseSt138);
					exp();
					state._fsp--;
					dbg.location(33,31);
					match(input,16,FOLLOW_16_in_parseSt140); dbg.location(33,36);
					match(input,ID,FOLLOW_ID_in_parseSt142); dbg.location(33,39);
					match(input,11,FOLLOW_11_in_parseSt144); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:34:4: 'parse' 'last' exp 'by' ID ';'
					{
					dbg.location(34,4);
					match(input,22,FOLLOW_22_in_parseSt149); dbg.location(34,12);
					match(input,20,FOLLOW_20_in_parseSt151); dbg.location(34,19);
					pushFollow(FOLLOW_exp_in_parseSt153);
					exp();
					state._fsp--;
					dbg.location(34,23);
					match(input,16,FOLLOW_16_in_parseSt155); dbg.location(34,28);
					match(input,ID,FOLLOW_ID_in_parseSt157); dbg.location(34,31);
					match(input,11,FOLLOW_11_in_parseSt159); 
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
		dbg.location(34, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parseSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parseSt"



	// $ANTLR start "exp"
	// /home/bardia/scrawl/scrawl.g:36:1: exp : ( ID | STRING | selector '@' ID );
	public final void exp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(36, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:36:5: ( ID | STRING | selector '@' ID )
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
			case 8:
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

					// /home/bardia/scrawl/scrawl.g:36:7: ID
					{
					dbg.location(36,7);
					match(input,ID,FOLLOW_ID_in_exp167); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:37:4: STRING
					{
					dbg.location(37,4);
					match(input,STRING,FOLLOW_STRING_in_exp172); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:38:4: selector '@' ID
					{
					dbg.location(38,4);
					pushFollow(FOLLOW_selector_in_exp177);
					selector();
					state._fsp--;
					dbg.location(38,12);
					match(input,13,FOLLOW_13_in_exp178); dbg.location(38,15);
					match(input,ID,FOLLOW_ID_in_exp179); 
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
		dbg.location(38, 16);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exp"



	// $ANTLR start "selector"
	// /home/bardia/scrawl/scrawl.g:40:1: selector : '(' xPath ')' ;
	public final void selector() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "selector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:40:10: ( '(' xPath ')' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:41:3: '(' xPath ')'
			{
			dbg.location(41,3);
			match(input,8,FOLLOW_8_in_selector190); dbg.location(41,7);
			pushFollow(FOLLOW_xPath_in_selector192);
			xPath();
			state._fsp--;
			dbg.location(41,13);
			match(input,9,FOLLOW_9_in_selector194); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "selector"



	// $ANTLR start "xPath"
	// /home/bardia/scrawl/scrawl.g:43:1: xPath : TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* ;
	public final void xPath() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "xPath");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:43:7: ( TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:43:9: TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )*
			{
			dbg.location(43,9);
			match(input,TAG,FOLLOW_TAG_in_xPath204); dbg.location(43,12);
			// /home/bardia/scrawl/scrawl.g:43:12: ( '[' NUMBER ']' )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==14) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:43:13: '[' NUMBER ']'
					{
					dbg.location(43,13);
					match(input,14,FOLLOW_14_in_xPath206); dbg.location(43,16);
					match(input,NUMBER,FOLLOW_NUMBER_in_xPath207); dbg.location(43,22);
					match(input,15,FOLLOW_15_in_xPath208); 
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(43,27);
			// /home/bardia/scrawl/scrawl.g:43:27: ( '.' TAG ( '[' NUMBER ']' )? )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==10) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:43:28: '.' TAG ( '[' NUMBER ']' )?
					{
					dbg.location(43,28);
					match(input,10,FOLLOW_10_in_xPath212); dbg.location(43,31);
					match(input,TAG,FOLLOW_TAG_in_xPath213); dbg.location(43,34);
					// /home/bardia/scrawl/scrawl.g:43:34: ( '[' NUMBER ']' )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==14) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/bardia/scrawl/scrawl.g:43:35: '[' NUMBER ']'
							{
							dbg.location(43,35);
							match(input,14,FOLLOW_14_in_xPath215); dbg.location(43,38);
							match(input,NUMBER,FOLLOW_NUMBER_in_xPath216); dbg.location(43,44);
							match(input,15,FOLLOW_15_in_xPath217); 
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
		dbg.location(43, 50);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "xPath");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "xPath"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_code16 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_procedure_in_code18 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_procedure28 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_procedure30 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_block_in_procedure32 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_mainRoutine42 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_block_in_mainRoutine44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_block53 = new BitSet(new long[]{0x00000000024C0010L});
	public static final BitSet FOLLOW_statement_in_block55 = new BitSet(new long[]{0x00000000024C0010L});
	public static final BitSet FOLLOW_25_in_block59 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSt_in_statement68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parseSt_in_statement73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assSt_in_statement78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachSt_in_statement83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_inSt92 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STRING_in_inSt95 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_block_in_inSt98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assSt106 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_assSt108 = new BitSet(new long[]{0x0000000000000150L});
	public static final BitSet FOLLOW_exp_in_assSt110 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_assSt112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_foreachSt121 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_selector_in_foreachSt123 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_block_in_foreachSt125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_parseSt134 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_parseSt136 = new BitSet(new long[]{0x0000000000000150L});
	public static final BitSet FOLLOW_exp_in_parseSt138 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_parseSt140 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt142 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_parseSt144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_parseSt149 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_parseSt151 = new BitSet(new long[]{0x0000000000000150L});
	public static final BitSet FOLLOW_exp_in_parseSt153 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_parseSt155 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt157 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_parseSt159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_exp172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_exp177 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_exp178 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_exp179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_selector190 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_xPath_in_selector192 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_selector194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_in_xPath204 = new BitSet(new long[]{0x0000000000004402L});
	public static final BitSet FOLLOW_14_in_xPath206 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath207 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_xPath208 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_xPath212 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_TAG_in_xPath213 = new BitSet(new long[]{0x0000000000004402L});
	public static final BitSet FOLLOW_14_in_xPath215 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath216 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_xPath217 = new BitSet(new long[]{0x0000000000000402L});
}
