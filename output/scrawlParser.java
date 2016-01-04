// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 14:43:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class scrawlParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "';'", "'main'", "'procedure'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int ID=4;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "procedure", "code", "statement", "mainRoutine"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false
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
	// /home/bardia/scrawl/scrawl.g:10:1: code : mainRoutine ( procedure )+ ;
	public final void code() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "code");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(10, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:10:6: ( mainRoutine ( procedure )+ )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:10:8: mainRoutine ( procedure )+
			{
			dbg.location(10,8);
			pushFollow(FOLLOW_mainRoutine_in_code16);
			mainRoutine();
			state._fsp--;
			dbg.location(10,20);
			// /home/bardia/scrawl/scrawl.g:10:20: ( procedure )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==7) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:10:22: procedure
					{
					dbg.location(10,22);
					pushFollow(FOLLOW_procedure_in_code20);
					procedure();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
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
		dbg.location(10, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "code");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "code"



	// $ANTLR start "mainRoutine"
	// /home/bardia/scrawl/scrawl.g:12:1: mainRoutine : 'main' '{' ( statement )+ '}' ;
	public final void mainRoutine() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mainRoutine");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:13:2: ( 'main' '{' ( statement )+ '}' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:13:4: 'main' '{' ( statement )+ '}'
			{
			dbg.location(13,4);
			match(input,6,FOLLOW_6_in_mainRoutine31); dbg.location(13,11);
			match(input,8,FOLLOW_8_in_mainRoutine33); dbg.location(13,15);
			// /home/bardia/scrawl/scrawl.g:13:15: ( statement )+
			int cnt2=0;
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==5) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:13:16: statement
					{
					dbg.location(13,16);
					pushFollow(FOLLOW_statement_in_mainRoutine36);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt2++;
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(13,28);
			match(input,9,FOLLOW_9_in_mainRoutine40); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(13, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mainRoutine");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "procedure"
	// /home/bardia/scrawl/scrawl.g:15:1: procedure : 'procedure' ID '{' ( statement )+ '}' ;
	public final void procedure() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:16:2: ( 'procedure' ID '{' ( statement )+ '}' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:16:4: 'procedure' ID '{' ( statement )+ '}'
			{
			dbg.location(16,4);
			match(input,7,FOLLOW_7_in_procedure50); dbg.location(16,17);
			match(input,ID,FOLLOW_ID_in_procedure53); dbg.location(16,20);
			match(input,8,FOLLOW_8_in_procedure55); dbg.location(16,24);
			// /home/bardia/scrawl/scrawl.g:16:24: ( statement )+
			int cnt3=0;
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==5) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:16:25: statement
					{
					dbg.location(16,25);
					pushFollow(FOLLOW_statement_in_procedure58);
					statement();
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt3++;
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(16,37);
			match(input,9,FOLLOW_9_in_procedure62); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "procedure"



	// $ANTLR start "statement"
	// /home/bardia/scrawl/scrawl.g:18:1: statement : ';' ;
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:19:2: ( ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:19:3: ';'
			{
			dbg.location(19,3);
			match(input,5,FOLLOW_5_in_statement71); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(19, 6);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_code16 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_procedure_in_code20 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_6_in_mainRoutine31 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_mainRoutine33 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_statement_in_mainRoutine36 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_9_in_mainRoutine40 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_procedure50 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_procedure53 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_procedure55 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_statement_in_procedure58 = new BitSet(new long[]{0x0000000000000220L});
	public static final BitSet FOLLOW_9_in_procedure62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_5_in_statement71 = new BitSet(new long[]{0x0000000000000002L});
}
