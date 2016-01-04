// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 17:40:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class scrawlParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "PATH", "TAG", 
		"'('", "')'", "'.'", "';'", "'='", "'['", "']'", "'in'", "'main'", "'{'", 
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
	public static final int ID=4;
	public static final int NUMBER=5;
	public static final int PATH=6;
	public static final int TAG=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "inSt", "mainRoutine", "statement", "xPath", "block", "selector", 
		"exp", "code", "assSt"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
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
	// /home/bardia/scrawl/scrawl.g:10:1: code : mainRoutine ;
	public final void code() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "code");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:10:6: ( mainRoutine )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:10:8: mainRoutine
			{
			dbg.location(10,8);
			pushFollow(FOLLOW_mainRoutine_in_code16);
			mainRoutine();
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
		dbg.location(10, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "code");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "code"



	// $ANTLR start "mainRoutine"
	// /home/bardia/scrawl/scrawl.g:12:1: mainRoutine : 'main' block ;
	public final void mainRoutine() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mainRoutine");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:13:2: ( 'main' block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:13:4: 'main' block
			{
			dbg.location(13,4);
			match(input,16,FOLLOW_16_in_mainRoutine25); dbg.location(13,11);
			pushFollow(FOLLOW_block_in_mainRoutine27);
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
		dbg.location(13, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mainRoutine");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "block"
	// /home/bardia/scrawl/scrawl.g:15:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:15:7: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:15:9: '{' ( statement )* '}'
			{
			dbg.location(15,9);
			match(input,17,FOLLOW_17_in_block36); dbg.location(15,13);
			// /home/bardia/scrawl/scrawl.g:15:13: ( statement )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==15) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:15:13: statement
					{
					dbg.location(15,13);
					pushFollow(FOLLOW_statement_in_block38);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(15,25);
			match(input,18,FOLLOW_18_in_block42); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(15, 27);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /home/bardia/scrawl/scrawl.g:17:1: statement : ( inSt | assSt );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:18:2: ( inSt | assSt )
			int alt2=2;
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==15) ) {
				alt2=1;
			}
			else if ( (LA2_0==ID) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:18:4: inSt
					{
					dbg.location(18,4);
					pushFollow(FOLLOW_inSt_in_statement51);
					inSt();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:19:4: assSt
					{
					dbg.location(19,4);
					pushFollow(FOLLOW_assSt_in_statement56);
					assSt();
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
		dbg.location(19, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "inSt"
	// /home/bardia/scrawl/scrawl.g:21:1: inSt : 'in' ( PATH ) block ;
	public final void inSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "inSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(21, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:21:6: ( 'in' ( PATH ) block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:21:8: 'in' ( PATH ) block
			{
			dbg.location(21,8);
			match(input,15,FOLLOW_15_in_inSt65); dbg.location(21,13);
			// /home/bardia/scrawl/scrawl.g:21:13: ( PATH )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:21:14: PATH
			{
			dbg.location(21,14);
			match(input,PATH,FOLLOW_PATH_in_inSt68); 
			}
			dbg.location(21,20);
			pushFollow(FOLLOW_block_in_inSt71);
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
		dbg.location(21, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inSt"



	// $ANTLR start "assSt"
	// /home/bardia/scrawl/scrawl.g:23:1: assSt : ID '=' exp ';' ;
	public final void assSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(23, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:23:7: ( ID '=' exp ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:23:9: ID '=' exp ';'
			{
			dbg.location(23,9);
			match(input,ID,FOLLOW_ID_in_assSt79); dbg.location(23,12);
			match(input,12,FOLLOW_12_in_assSt81); dbg.location(23,16);
			pushFollow(FOLLOW_exp_in_assSt83);
			exp();
			state._fsp--;
			dbg.location(23,20);
			match(input,11,FOLLOW_11_in_assSt85); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assSt"



	// $ANTLR start "exp"
	// /home/bardia/scrawl/scrawl.g:25:1: exp : ( ID | selector );
	public final void exp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:25:5: ( ID | selector )
			int alt3=2;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==ID) ) {
				alt3=1;
			}
			else if ( (LA3_0==8) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:25:7: ID
					{
					dbg.location(25,7);
					match(input,ID,FOLLOW_ID_in_exp93); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:26:4: selector
					{
					dbg.location(26,4);
					pushFollow(FOLLOW_selector_in_exp98);
					selector();
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
		dbg.location(26, 11);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exp"



	// $ANTLR start "selector"
	// /home/bardia/scrawl/scrawl.g:28:1: selector : '(' xPath ')' ';' ;
	public final void selector() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "selector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:28:10: ( '(' xPath ')' ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:29:3: '(' xPath ')' ';'
			{
			dbg.location(29,3);
			match(input,8,FOLLOW_8_in_selector109); dbg.location(29,7);
			pushFollow(FOLLOW_xPath_in_selector111);
			xPath();
			state._fsp--;
			dbg.location(29,13);
			match(input,9,FOLLOW_9_in_selector113); dbg.location(29,17);
			match(input,11,FOLLOW_11_in_selector115); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 19);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "selector"



	// $ANTLR start "xPath"
	// /home/bardia/scrawl/scrawl.g:31:1: xPath : TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* ;
	public final void xPath() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "xPath");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:31:7: ( TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:31:9: TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )*
			{
			dbg.location(31,9);
			match(input,TAG,FOLLOW_TAG_in_xPath125); dbg.location(31,12);
			// /home/bardia/scrawl/scrawl.g:31:12: ( '[' NUMBER ']' )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==13) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:31:13: '[' NUMBER ']'
					{
					dbg.location(31,13);
					match(input,13,FOLLOW_13_in_xPath127); dbg.location(31,16);
					match(input,NUMBER,FOLLOW_NUMBER_in_xPath128); dbg.location(31,22);
					match(input,14,FOLLOW_14_in_xPath129); 
					}
					break;

			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(31,27);
			// /home/bardia/scrawl/scrawl.g:31:27: ( '.' TAG ( '[' NUMBER ']' )? )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==10) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:31:28: '.' TAG ( '[' NUMBER ']' )?
					{
					dbg.location(31,28);
					match(input,10,FOLLOW_10_in_xPath133); dbg.location(31,31);
					match(input,TAG,FOLLOW_TAG_in_xPath134); dbg.location(31,34);
					// /home/bardia/scrawl/scrawl.g:31:34: ( '[' NUMBER ']' )?
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==13) ) {
						alt5=1;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// /home/bardia/scrawl/scrawl.g:31:35: '[' NUMBER ']'
							{
							dbg.location(31,35);
							match(input,13,FOLLOW_13_in_xPath136); dbg.location(31,38);
							match(input,NUMBER,FOLLOW_NUMBER_in_xPath137); dbg.location(31,44);
							match(input,14,FOLLOW_14_in_xPath138); 
							}
							break;

					}
					} finally {dbg.exitSubRule(5);}

					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(31, 50);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "xPath");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "xPath"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_code16 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_mainRoutine25 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_block_in_mainRoutine27 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_block36 = new BitSet(new long[]{0x0000000000048010L});
	public static final BitSet FOLLOW_statement_in_block38 = new BitSet(new long[]{0x0000000000048010L});
	public static final BitSet FOLLOW_18_in_block42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSt_in_statement51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assSt_in_statement56 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_inSt65 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_PATH_in_inSt68 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_block_in_inSt71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assSt79 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_assSt81 = new BitSet(new long[]{0x0000000000000110L});
	public static final BitSet FOLLOW_exp_in_assSt83 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_assSt85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_exp98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_selector109 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_xPath_in_selector111 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_selector113 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_selector115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_in_xPath125 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_13_in_xPath127 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath128 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_xPath129 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_xPath133 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_TAG_in_xPath134 = new BitSet(new long[]{0x0000000000002402L});
	public static final BitSet FOLLOW_13_in_xPath136 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath137 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_xPath138 = new BitSet(new long[]{0x0000000000000402L});
}
