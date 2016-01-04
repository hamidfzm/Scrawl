// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 17:22:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class scrawlParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "PATH", "'in'", "'main'", "'{'", 
		"'}'"
	};
	public static final int EOF=-1;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int PATH=4;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "mainRoutine", "code", "inSt", "statement", "block"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false
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
			match(input,6,FOLLOW_6_in_mainRoutine25); dbg.location(13,11);
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
			match(input,7,FOLLOW_7_in_block36); dbg.location(15,13);
			// /home/bardia/scrawl/scrawl.g:15:13: ( statement )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==5) ) {
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
			match(input,8,FOLLOW_8_in_block42); 
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
	// /home/bardia/scrawl/scrawl.g:17:1: statement : inSt ;
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:18:2: ( inSt )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:18:4: inSt
			{
			dbg.location(18,4);
			pushFollow(FOLLOW_inSt_in_statement51);
			inSt();
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
		dbg.location(18, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "inSt"
	// /home/bardia/scrawl/scrawl.g:20:1: inSt : 'in' ( PATH ) block ;
	public final void inSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "inSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(20, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:20:6: ( 'in' ( PATH ) block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:20:8: 'in' ( PATH ) block
			{
			dbg.location(20,8);
			match(input,5,FOLLOW_5_in_inSt60); dbg.location(20,13);
			// /home/bardia/scrawl/scrawl.g:20:13: ( PATH )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:20:14: PATH
			{
			dbg.location(20,14);
			match(input,PATH,FOLLOW_PATH_in_inSt63); 
			}
			dbg.location(20,20);
			pushFollow(FOLLOW_block_in_inSt66);
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
		dbg.location(20, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inSt"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_code16 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_6_in_mainRoutine25 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_in_mainRoutine27 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_block36 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_statement_in_block38 = new BitSet(new long[]{0x0000000000000120L});
	public static final BitSet FOLLOW_8_in_block42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSt_in_statement51 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_5_in_inSt60 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_PATH_in_inSt63 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_block_in_inSt66 = new BitSet(new long[]{0x0000000000000002L});
}
