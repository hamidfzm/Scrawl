// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 22:20:47

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
		"invalidRule", "xPath", "block", "selector", "exp", "procedure", "parseSt", 
		"printSt", "mainRoutine", "code", "inSt", "foreachSt", "statement", "assSt"
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



	// $ANTLR start "code"
	// /home/bardia/scrawl/scrawl.g:4:1: code : mainRoutine ( procedure )* ;
	public final void code() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "code");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(4, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:4:6: ( mainRoutine ( procedure )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:4:8: mainRoutine ( procedure )*
			{
			dbg.location(4,8);
			pushFollow(FOLLOW_mainRoutine_in_code11);
			mainRoutine();
			state._fsp--;
			dbg.location(4,20);
			// /home/bardia/scrawl/scrawl.g:4:20: ( procedure )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				switch ( input.LA(1) ) {
				case 26:
					{
					alt1=1;
					}
					break;
				}
				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:4:20: procedure
					{
					dbg.location(4,20);
					pushFollow(FOLLOW_procedure_in_code13);
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
		dbg.location(4, 29);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "code");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "code"



	// $ANTLR start "procedure"
	// /home/bardia/scrawl/scrawl.g:6:1: procedure : 'procedure' ID block ;
	public final void procedure() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "procedure");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:7:2: ( 'procedure' ID block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:7:4: 'procedure' ID block
			{
			dbg.location(7,4);
			match(input,26,FOLLOW_26_in_procedure23); dbg.location(7,16);
			match(input,ID,FOLLOW_ID_in_procedure25); dbg.location(7,19);
			pushFollow(FOLLOW_block_in_procedure27);
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
		dbg.location(7, 23);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "procedure");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "procedure"



	// $ANTLR start "mainRoutine"
	// /home/bardia/scrawl/scrawl.g:9:1: mainRoutine : 'main' block ;
	public final void mainRoutine() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mainRoutine");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:10:2: ( 'main' block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:10:4: 'main' block
			{
			dbg.location(10,4);
			match(input,22,FOLLOW_22_in_mainRoutine37); dbg.location(10,11);
			System.out.println("int main()");dbg.location(11,4);
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
		dbg.location(11, 8);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mainRoutine");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mainRoutine"



	// $ANTLR start "block"
	// /home/bardia/scrawl/scrawl.g:13:1: block : '{' ( statement )* '}' ;
	public final void block() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:13:7: ( '{' ( statement )* '}' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:13:9: '{' ( statement )* '}'
			{
			dbg.location(13,9);
			match(input,27,FOLLOW_27_in_block53); dbg.location(13,14);
			System.out.println("{");dbg.location(14,4);
			// /home/bardia/scrawl/scrawl.g:14:4: ( statement )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				switch ( input.LA(1) ) {
				case ID:
				case 19:
				case 20:
				case 24:
				case 25:
					{
					alt2=1;
					}
					break;
				}
				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:14:4: statement
					{
					dbg.location(14,4);
					pushFollow(FOLLOW_statement_in_block61);
					statement();
					state._fsp--;

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(15,5);
			match(input,28,FOLLOW_28_in_block69); dbg.location(15,10);
			System.out.println("}");
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(15, 35);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "block"



	// $ANTLR start "statement"
	// /home/bardia/scrawl/scrawl.g:17:1: statement : ( inSt | parseSt | assSt | foreachSt | printSt );
	public final void statement() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "statement");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:18:2: ( inSt | parseSt | assSt | foreachSt | printSt )
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

					// /home/bardia/scrawl/scrawl.g:18:4: inSt
					{
					dbg.location(18,4);
					pushFollow(FOLLOW_inSt_in_statement81);
					inSt();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:19:4: parseSt
					{
					dbg.location(19,4);
					pushFollow(FOLLOW_parseSt_in_statement86);
					parseSt();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:20:4: assSt
					{
					dbg.location(20,4);
					pushFollow(FOLLOW_assSt_in_statement91);
					assSt();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/bardia/scrawl/scrawl.g:21:4: foreachSt
					{
					dbg.location(21,4);
					pushFollow(FOLLOW_foreachSt_in_statement96);
					foreachSt();
					state._fsp--;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/bardia/scrawl/scrawl.g:22:4: printSt
					{
					dbg.location(22,4);
					pushFollow(FOLLOW_printSt_in_statement101);
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
		dbg.location(22, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "statement");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "statement"



	// $ANTLR start "inSt"
	// /home/bardia/scrawl/scrawl.g:24:1: inSt : 'in' ( STRING ) block ;
	public final void inSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "inSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(24, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:24:6: ( 'in' ( STRING ) block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:24:8: 'in' ( STRING ) block
			{
			dbg.location(24,8);
			match(input,20,FOLLOW_20_in_inSt110); dbg.location(24,13);
			// /home/bardia/scrawl/scrawl.g:24:13: ( STRING )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:24:14: STRING
			{
			dbg.location(24,14);
			match(input,STRING,FOLLOW_STRING_in_inSt113); 
			}
			dbg.location(24,22);
			pushFollow(FOLLOW_block_in_inSt116);
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
		dbg.location(24, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inSt"



	// $ANTLR start "assSt"
	// /home/bardia/scrawl/scrawl.g:26:1: assSt : ID '=' exp ';' ;
	public final void assSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "assSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:26:7: ( ID '=' exp ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:26:9: ID '=' exp ';'
			{
			dbg.location(26,9);
			match(input,ID,FOLLOW_ID_in_assSt124); dbg.location(26,12);
			match(input,13,FOLLOW_13_in_assSt126); dbg.location(26,16);
			pushFollow(FOLLOW_exp_in_assSt128);
			exp();
			state._fsp--;
			dbg.location(26,20);
			match(input,12,FOLLOW_12_in_assSt130); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(26, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "assSt"



	// $ANTLR start "foreachSt"
	// /home/bardia/scrawl/scrawl.g:28:1: foreachSt : 'foreach' selector block ;
	public final void foreachSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "foreachSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:29:2: ( 'foreach' selector block )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:29:4: 'foreach' selector block
			{
			dbg.location(29,4);
			match(input,19,FOLLOW_19_in_foreachSt139); dbg.location(29,14);
			pushFollow(FOLLOW_selector_in_foreachSt141);
			selector();
			state._fsp--;
			dbg.location(29,23);
			pushFollow(FOLLOW_block_in_foreachSt143);
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
		dbg.location(29, 27);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "foreachSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "foreachSt"



	// $ANTLR start "parseSt"
	// /home/bardia/scrawl/scrawl.g:31:1: parseSt : ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' | 'parse' 'now' exp 'by' ID ';' );
	public final void parseSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "parseSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:31:9: ( 'parse' 'first' exp 'by' ID ';' | 'parse' 'last' exp 'by' ID ';' | 'parse' 'now' exp 'by' ID ';' )
			int alt4=3;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			switch ( input.LA(1) ) {
			case 24:
				{
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
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:31:11: 'parse' 'first' exp 'by' ID ';'
					{
					dbg.location(31,11);
					match(input,24,FOLLOW_24_in_parseSt152); dbg.location(31,19);
					match(input,18,FOLLOW_18_in_parseSt154); dbg.location(31,27);
					pushFollow(FOLLOW_exp_in_parseSt156);
					exp();
					state._fsp--;
					dbg.location(31,31);
					match(input,17,FOLLOW_17_in_parseSt158); dbg.location(31,36);
					match(input,ID,FOLLOW_ID_in_parseSt160); dbg.location(31,39);
					match(input,12,FOLLOW_12_in_parseSt162); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:32:4: 'parse' 'last' exp 'by' ID ';'
					{
					dbg.location(32,4);
					match(input,24,FOLLOW_24_in_parseSt167); dbg.location(32,12);
					match(input,21,FOLLOW_21_in_parseSt169); dbg.location(32,19);
					pushFollow(FOLLOW_exp_in_parseSt171);
					exp();
					state._fsp--;
					dbg.location(32,23);
					match(input,17,FOLLOW_17_in_parseSt173); dbg.location(32,28);
					match(input,ID,FOLLOW_ID_in_parseSt175); dbg.location(32,31);
					match(input,12,FOLLOW_12_in_parseSt177); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:33:4: 'parse' 'now' exp 'by' ID ';'
					{
					dbg.location(33,4);
					match(input,24,FOLLOW_24_in_parseSt182); dbg.location(33,12);
					match(input,23,FOLLOW_23_in_parseSt184); dbg.location(33,18);
					pushFollow(FOLLOW_exp_in_parseSt186);
					exp();
					state._fsp--;
					dbg.location(33,22);
					match(input,17,FOLLOW_17_in_parseSt188); dbg.location(33,27);
					match(input,ID,FOLLOW_ID_in_parseSt190); dbg.location(33,30);
					match(input,12,FOLLOW_12_in_parseSt192); 
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
		dbg.location(33, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "parseSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "parseSt"



	// $ANTLR start "printSt"
	// /home/bardia/scrawl/scrawl.g:35:1: printSt : 'print' exp ';' ;
	public final void printSt() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "printSt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:35:9: ( 'print' exp ';' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:35:11: 'print' exp ';'
			{
			dbg.location(35,11);
			match(input,25,FOLLOW_25_in_printSt201); dbg.location(35,19);
			pushFollow(FOLLOW_exp_in_printSt203);
			exp();
			state._fsp--;
			dbg.location(35,23);
			match(input,12,FOLLOW_12_in_printSt205); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "printSt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "printSt"



	// $ANTLR start "exp"
	// /home/bardia/scrawl/scrawl.g:37:1: exp : ( ID | STRING | selector '@' ID );
	public final void exp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:37:5: ( ID | STRING | selector '@' ID )
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

					// /home/bardia/scrawl/scrawl.g:37:7: ID
					{
					dbg.location(37,7);
					match(input,ID,FOLLOW_ID_in_exp214); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/bardia/scrawl/scrawl.g:38:4: STRING
					{
					dbg.location(38,4);
					match(input,STRING,FOLLOW_STRING_in_exp219); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/bardia/scrawl/scrawl.g:39:4: selector '@' ID
					{
					dbg.location(39,4);
					pushFollow(FOLLOW_selector_in_exp224);
					selector();
					state._fsp--;
					dbg.location(39,12);
					match(input,14,FOLLOW_14_in_exp225); dbg.location(39,15);
					match(input,ID,FOLLOW_ID_in_exp226); 
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
		dbg.location(39, 16);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exp"



	// $ANTLR start "selector"
	// /home/bardia/scrawl/scrawl.g:41:1: selector : '(' xPath ')' ;
	public final void selector() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "selector");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:41:10: ( '(' xPath ')' )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:42:3: '(' xPath ')'
			{
			dbg.location(42,3);
			match(input,9,FOLLOW_9_in_selector237); dbg.location(42,7);
			pushFollow(FOLLOW_xPath_in_selector239);
			xPath();
			state._fsp--;
			dbg.location(42,13);
			match(input,10,FOLLOW_10_in_selector241); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(42, 15);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "selector");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "selector"



	// $ANTLR start "xPath"
	// /home/bardia/scrawl/scrawl.g:44:1: xPath : TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* ;
	public final void xPath() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "xPath");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(44, 0);

		try {
			// /home/bardia/scrawl/scrawl.g:44:7: ( TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )* )
			dbg.enterAlt(1);

			// /home/bardia/scrawl/scrawl.g:44:9: TAG ( '[' NUMBER ']' )? ( '.' TAG ( '[' NUMBER ']' )? )*
			{
			dbg.location(44,9);
			match(input,TAG,FOLLOW_TAG_in_xPath251); dbg.location(44,12);
			// /home/bardia/scrawl/scrawl.g:44:12: ( '[' NUMBER ']' )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			switch ( input.LA(1) ) {
				case 15:
					{
					alt6=1;
					}
					break;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:44:13: '[' NUMBER ']'
					{
					dbg.location(44,13);
					match(input,15,FOLLOW_15_in_xPath253); dbg.location(44,16);
					match(input,NUMBER,FOLLOW_NUMBER_in_xPath254); dbg.location(44,22);
					match(input,16,FOLLOW_16_in_xPath255); 
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(44,27);
			// /home/bardia/scrawl/scrawl.g:44:27: ( '.' TAG ( '[' NUMBER ']' )? )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				switch ( input.LA(1) ) {
				case 11:
					{
					alt8=1;
					}
					break;
				}
				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/bardia/scrawl/scrawl.g:44:28: '.' TAG ( '[' NUMBER ']' )?
					{
					dbg.location(44,28);
					match(input,11,FOLLOW_11_in_xPath259); dbg.location(44,31);
					match(input,TAG,FOLLOW_TAG_in_xPath260); dbg.location(44,34);
					// /home/bardia/scrawl/scrawl.g:44:34: ( '[' NUMBER ']' )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					switch ( input.LA(1) ) {
						case 15:
							{
							alt7=1;
							}
							break;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/bardia/scrawl/scrawl.g:44:35: '[' NUMBER ']'
							{
							dbg.location(44,35);
							match(input,15,FOLLOW_15_in_xPath262); dbg.location(44,38);
							match(input,NUMBER,FOLLOW_NUMBER_in_xPath263); dbg.location(44,44);
							match(input,16,FOLLOW_16_in_xPath264); 
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
		dbg.location(44, 50);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "xPath");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "xPath"

	// Delegated rules



	public static final BitSet FOLLOW_mainRoutine_in_code11 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_procedure_in_code13 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_procedure23 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_procedure25 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_block_in_procedure27 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_mainRoutine37 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_block_in_mainRoutine44 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_block53 = new BitSet(new long[]{0x0000000013180010L});
	public static final BitSet FOLLOW_statement_in_block61 = new BitSet(new long[]{0x0000000013180010L});
	public static final BitSet FOLLOW_28_in_block69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inSt_in_statement81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parseSt_in_statement86 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assSt_in_statement91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachSt_in_statement96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printSt_in_statement101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_inSt110 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_STRING_in_inSt113 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_block_in_inSt116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assSt124 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_assSt126 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_assSt128 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_assSt130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_foreachSt139 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_selector_in_foreachSt141 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_block_in_foreachSt143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_parseSt152 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_parseSt154 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_parseSt156 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_parseSt158 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt160 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_parseSt162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_parseSt167 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_parseSt169 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_parseSt171 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_parseSt173 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt175 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_parseSt177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_parseSt182 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_parseSt184 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_parseSt186 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_parseSt188 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_parseSt190 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_parseSt192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_printSt201 = new BitSet(new long[]{0x0000000000000250L});
	public static final BitSet FOLLOW_exp_in_printSt203 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_printSt205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_exp214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_exp219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selector_in_exp224 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_exp225 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_exp226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_selector237 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_xPath_in_selector239 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_selector241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TAG_in_xPath251 = new BitSet(new long[]{0x0000000000008802L});
	public static final BitSet FOLLOW_15_in_xPath253 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath254 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_xPath255 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_xPath259 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_TAG_in_xPath260 = new BitSet(new long[]{0x0000000000008802L});
	public static final BitSet FOLLOW_15_in_xPath262 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUMBER_in_xPath263 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_xPath264 = new BitSet(new long[]{0x0000000000000802L});
}
