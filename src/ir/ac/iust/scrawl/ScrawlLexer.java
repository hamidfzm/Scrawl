// $ANTLR 3.5.1 /home/bardia/scrawl/Scrawl.g 2016-01-22 21:49:34

	package ir.ac.iust.scrawl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ScrawlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int AND=4;
	public static final int COMMENT=5;
	public static final int DELETE=6;
	public static final int DIGIT=7;
	public static final int DIV=8;
	public static final int EQL=9;
	public static final int ESC=10;
	public static final int EXP=11;
	public static final int FLOAT=12;
	public static final int GET=13;
	public static final int GRQ=14;
	public static final int GRT=15;
	public static final int ID=16;
	public static final int INTEGER=17;
	public static final int LBR=18;
	public static final int LINE_COMMENT=19;
	public static final int LSQ=20;
	public static final int LSS=21;
	public static final int MLP=22;
	public static final int MNS=23;
	public static final int NEQ=24;
	public static final int NOT=25;
	public static final int OR=26;
	public static final int PLS=27;
	public static final int POST=28;
	public static final int PUT=29;
	public static final int PWR=30;
	public static final int RBR=31;
	public static final int SS=32;
	public static final int STRING=33;
	public static final int TEXT=34;
	public static final int THIS=35;
	public static final int WS=36;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ScrawlLexer() {} 
	public ScrawlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ScrawlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/bardia/scrawl/Scrawl.g"; }

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:6:7: ( ';' )
			// /home/bardia/scrawl/Scrawl.g:6:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:7:7: ( '=' )
			// /home/bardia/scrawl/Scrawl.g:7:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:8:7: ( '@' )
			// /home/bardia/scrawl/Scrawl.g:8:9: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:9:7: ( '[' )
			// /home/bardia/scrawl/Scrawl.g:9:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:10:7: ( ']' )
			// /home/bardia/scrawl/Scrawl.g:10:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:11:7: ( 'by' )
			// /home/bardia/scrawl/Scrawl.g:11:9: 'by'
			{
			match("by"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:12:7: ( 'first' )
			// /home/bardia/scrawl/Scrawl.g:12:9: 'first'
			{
			match("first"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:13:7: ( 'foreach' )
			// /home/bardia/scrawl/Scrawl.g:13:9: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:14:7: ( 'last' )
			// /home/bardia/scrawl/Scrawl.g:14:9: 'last'
			{
			match("last"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:15:7: ( 'main' )
			// /home/bardia/scrawl/Scrawl.g:15:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:16:7: ( 'parse' )
			// /home/bardia/scrawl/Scrawl.g:16:9: 'parse'
			{
			match("parse"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:17:7: ( 'print' )
			// /home/bardia/scrawl/Scrawl.g:17:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:18:7: ( 'procedure' )
			// /home/bardia/scrawl/Scrawl.g:18:9: 'procedure'
			{
			match("procedure"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:19:7: ( '{' )
			// /home/bardia/scrawl/Scrawl.g:19:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:20:7: ( '}' )
			// /home/bardia/scrawl/Scrawl.g:20:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:333:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/bardia/scrawl/Scrawl.g:333:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:340:6: ( 'get' )
			// /home/bardia/scrawl/Scrawl.g:340:8: 'get'
			{
			match("get"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GET"

	// $ANTLR start "POST"
	public final void mPOST() throws RecognitionException {
		try {
			int _type = POST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:341:6: ( 'post' )
			// /home/bardia/scrawl/Scrawl.g:341:8: 'post'
			{
			match("post"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POST"

	// $ANTLR start "PUT"
	public final void mPUT() throws RecognitionException {
		try {
			int _type = PUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:342:6: ( 'put' )
			// /home/bardia/scrawl/Scrawl.g:342:8: 'put'
			{
			match("put"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUT"

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:343:8: ( 'delete' )
			// /home/bardia/scrawl/Scrawl.g:343:10: 'delete'
			{
			match("delete"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DELETE"

	// $ANTLR start "TEXT"
	public final void mTEXT() throws RecognitionException {
		try {
			int _type = TEXT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:344:6: ( 'text' )
			// /home/bardia/scrawl/Scrawl.g:344:8: 'text'
			{
			match("text"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXT"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:346:6: ( 'this' )
			// /home/bardia/scrawl/Scrawl.g:346:8: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:348:8: ( '\"' ( ESC |~ ( '\\\\' | '\"' ) )* '\"' )
			// /home/bardia/scrawl/Scrawl.g:348:10: '\"' ( ESC |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /home/bardia/scrawl/Scrawl.g:348:14: ( ESC |~ ( '\\\\' | '\"' ) )*
			loop1:
			while (true) {
				int alt1=3;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\\') ) {
					alt1=1;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '[')||(LA1_0 >= ']' && LA1_0 <= '\uFFFF')) ) {
					alt1=2;
				}

				switch (alt1) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:348:15: ESC
					{
					mESC(); 

					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:348:21: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ESC"
	public final void mESC() throws RecognitionException {
		try {
			int _type = ESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:349:15: ( '\\\\' ( 'n' | 'r' ) )
			// /home/bardia/scrawl/Scrawl.g:349:17: '\\\\' ( 'n' | 'r' )
			{
			match('\\'); 
			if ( input.LA(1)=='n'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:351:4: ( SS ( SS | '0' .. '9' )* )
			// /home/bardia/scrawl/Scrawl.g:351:6: SS ( SS | '0' .. '9' )*
			{
			mSS(); 

			// /home/bardia/scrawl/Scrawl.g:351:9: ( SS | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "SS"
	public final void mSS() throws RecognitionException {
		try {
			// /home/bardia/scrawl/Scrawl.g:352:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// /home/bardia/scrawl/Scrawl.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SS"

	// $ANTLR start "LBR"
	public final void mLBR() throws RecognitionException {
		try {
			int _type = LBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:354:5: ( '(' )
			// /home/bardia/scrawl/Scrawl.g:354:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBR"

	// $ANTLR start "RBR"
	public final void mRBR() throws RecognitionException {
		try {
			int _type = RBR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:355:5: ( ')' )
			// /home/bardia/scrawl/Scrawl.g:355:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBR"

	// $ANTLR start "PLS"
	public final void mPLS() throws RecognitionException {
		try {
			int _type = PLS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:356:5: ( '+' )
			// /home/bardia/scrawl/Scrawl.g:356:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLS"

	// $ANTLR start "MNS"
	public final void mMNS() throws RecognitionException {
		try {
			int _type = MNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:357:5: ( '-' )
			// /home/bardia/scrawl/Scrawl.g:357:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MNS"

	// $ANTLR start "MLP"
	public final void mMLP() throws RecognitionException {
		try {
			int _type = MLP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:358:5: ( '*' )
			// /home/bardia/scrawl/Scrawl.g:358:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MLP"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:359:5: ( '/' )
			// /home/bardia/scrawl/Scrawl.g:359:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "PWR"
	public final void mPWR() throws RecognitionException {
		try {
			int _type = PWR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:360:5: ( '^' )
			// /home/bardia/scrawl/Scrawl.g:360:8: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PWR"

	// $ANTLR start "LSS"
	public final void mLSS() throws RecognitionException {
		try {
			int _type = LSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:362:5: ( '<' )
			// /home/bardia/scrawl/Scrawl.g:362:8: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSS"

	// $ANTLR start "LSQ"
	public final void mLSQ() throws RecognitionException {
		try {
			int _type = LSQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:363:5: ( '<=' )
			// /home/bardia/scrawl/Scrawl.g:363:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQ"

	// $ANTLR start "GRT"
	public final void mGRT() throws RecognitionException {
		try {
			int _type = GRT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:364:5: ( '>' )
			// /home/bardia/scrawl/Scrawl.g:364:8: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GRT"

	// $ANTLR start "GRQ"
	public final void mGRQ() throws RecognitionException {
		try {
			int _type = GRQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:365:5: ( '>=' )
			// /home/bardia/scrawl/Scrawl.g:365:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GRQ"

	// $ANTLR start "EQL"
	public final void mEQL() throws RecognitionException {
		try {
			int _type = EQL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:366:5: ( '==' )
			// /home/bardia/scrawl/Scrawl.g:366:8: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQL"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:367:5: ( '!=' )
			// /home/bardia/scrawl/Scrawl.g:367:8: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:368:5: ( '&&' )
			// /home/bardia/scrawl/Scrawl.g:368:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:369:5: ( '||' )
			// /home/bardia/scrawl/Scrawl.g:369:8: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:370:5: ( '!' )
			// /home/bardia/scrawl/Scrawl.g:370:8: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			int _type = DIGIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:372:7: ( '0' .. '9' )
			// /home/bardia/scrawl/Scrawl.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "INTEGER"
	public final void mINTEGER() throws RecognitionException {
		try {
			int _type = INTEGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:374:8: ( ( DIGIT )+ )
			// /home/bardia/scrawl/Scrawl.g:374:10: ( DIGIT )+
			{
			// /home/bardia/scrawl/Scrawl.g:374:10: ( DIGIT )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTEGER"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:376:7: ( INTEGER '.' ( INTEGER )* ( EXP )? | '.' INTEGER ( EXP )? | INTEGER EXP )
			int alt7=3;
			alt7 = dfa7.predict(input);
			switch (alt7) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:376:9: INTEGER '.' ( INTEGER )* ( EXP )?
					{
					mINTEGER(); 

					match('.'); 
					// /home/bardia/scrawl/Scrawl.g:376:21: ( INTEGER )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /home/bardia/scrawl/Scrawl.g:376:21: INTEGER
							{
							mINTEGER(); 

							}
							break;

						default :
							break loop4;
						}
					}

					// /home/bardia/scrawl/Scrawl.g:376:30: ( EXP )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /home/bardia/scrawl/Scrawl.g:376:30: EXP
							{
							mEXP(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /home/bardia/scrawl/Scrawl.g:376:37: '.' INTEGER ( EXP )?
					{
					match('.'); 
					mINTEGER(); 

					// /home/bardia/scrawl/Scrawl.g:376:49: ( EXP )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='E'||LA6_0=='e') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /home/bardia/scrawl/Scrawl.g:376:49: EXP
							{
							mEXP(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /home/bardia/scrawl/Scrawl.g:376:56: INTEGER EXP
					{
					mINTEGER(); 

					mEXP(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "EXP"
	public final void mEXP() throws RecognitionException {
		try {
			// /home/bardia/scrawl/Scrawl.g:377:14: ( ( 'e' | 'E' ) ( PLS | MNS )? INTEGER )
			// /home/bardia/scrawl/Scrawl.g:377:16: ( 'e' | 'E' ) ( PLS | MNS )? INTEGER
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bardia/scrawl/Scrawl.g:377:26: ( PLS | MNS )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='+'||LA8_0=='-') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mINTEGER(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXP"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:379:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// /home/bardia/scrawl/Scrawl.g:379:11: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// /home/bardia/scrawl/Scrawl.g:379:16: ( options {greedy=false; } : . )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='*') ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1=='/') ) {
						alt9=2;
					}
					else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
						alt9=1;
					}

				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:379:44: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop9;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:381:13: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// /home/bardia/scrawl/Scrawl.g:381:15: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// /home/bardia/scrawl/Scrawl.g:381:20: (~ ( '\\n' | '\\r' ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			// /home/bardia/scrawl/Scrawl.g:381:34: ( '\\r' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\r') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /home/bardia/scrawl/Scrawl.g:381:34: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/bardia/scrawl/Scrawl.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | WS | GET | POST | PUT | DELETE | TEXT | THIS | STRING | ESC | ID | LBR | RBR | PLS | MNS | MLP | DIV | PWR | LSS | LSQ | GRT | GRQ | EQL | NEQ | AND | OR | NOT | DIGIT | INTEGER | FLOAT | COMMENT | LINE_COMMENT )
		int alt12=46;
		alt12 = dfa12.predict(input);
		switch (alt12) {
			case 1 :
				// /home/bardia/scrawl/Scrawl.g:1:10: T__37
				{
				mT__37(); 

				}
				break;
			case 2 :
				// /home/bardia/scrawl/Scrawl.g:1:16: T__38
				{
				mT__38(); 

				}
				break;
			case 3 :
				// /home/bardia/scrawl/Scrawl.g:1:22: T__39
				{
				mT__39(); 

				}
				break;
			case 4 :
				// /home/bardia/scrawl/Scrawl.g:1:28: T__40
				{
				mT__40(); 

				}
				break;
			case 5 :
				// /home/bardia/scrawl/Scrawl.g:1:34: T__41
				{
				mT__41(); 

				}
				break;
			case 6 :
				// /home/bardia/scrawl/Scrawl.g:1:40: T__42
				{
				mT__42(); 

				}
				break;
			case 7 :
				// /home/bardia/scrawl/Scrawl.g:1:46: T__43
				{
				mT__43(); 

				}
				break;
			case 8 :
				// /home/bardia/scrawl/Scrawl.g:1:52: T__44
				{
				mT__44(); 

				}
				break;
			case 9 :
				// /home/bardia/scrawl/Scrawl.g:1:58: T__45
				{
				mT__45(); 

				}
				break;
			case 10 :
				// /home/bardia/scrawl/Scrawl.g:1:64: T__46
				{
				mT__46(); 

				}
				break;
			case 11 :
				// /home/bardia/scrawl/Scrawl.g:1:70: T__47
				{
				mT__47(); 

				}
				break;
			case 12 :
				// /home/bardia/scrawl/Scrawl.g:1:76: T__48
				{
				mT__48(); 

				}
				break;
			case 13 :
				// /home/bardia/scrawl/Scrawl.g:1:82: T__49
				{
				mT__49(); 

				}
				break;
			case 14 :
				// /home/bardia/scrawl/Scrawl.g:1:88: T__50
				{
				mT__50(); 

				}
				break;
			case 15 :
				// /home/bardia/scrawl/Scrawl.g:1:94: T__51
				{
				mT__51(); 

				}
				break;
			case 16 :
				// /home/bardia/scrawl/Scrawl.g:1:100: WS
				{
				mWS(); 

				}
				break;
			case 17 :
				// /home/bardia/scrawl/Scrawl.g:1:103: GET
				{
				mGET(); 

				}
				break;
			case 18 :
				// /home/bardia/scrawl/Scrawl.g:1:107: POST
				{
				mPOST(); 

				}
				break;
			case 19 :
				// /home/bardia/scrawl/Scrawl.g:1:112: PUT
				{
				mPUT(); 

				}
				break;
			case 20 :
				// /home/bardia/scrawl/Scrawl.g:1:116: DELETE
				{
				mDELETE(); 

				}
				break;
			case 21 :
				// /home/bardia/scrawl/Scrawl.g:1:123: TEXT
				{
				mTEXT(); 

				}
				break;
			case 22 :
				// /home/bardia/scrawl/Scrawl.g:1:128: THIS
				{
				mTHIS(); 

				}
				break;
			case 23 :
				// /home/bardia/scrawl/Scrawl.g:1:133: STRING
				{
				mSTRING(); 

				}
				break;
			case 24 :
				// /home/bardia/scrawl/Scrawl.g:1:140: ESC
				{
				mESC(); 

				}
				break;
			case 25 :
				// /home/bardia/scrawl/Scrawl.g:1:144: ID
				{
				mID(); 

				}
				break;
			case 26 :
				// /home/bardia/scrawl/Scrawl.g:1:147: LBR
				{
				mLBR(); 

				}
				break;
			case 27 :
				// /home/bardia/scrawl/Scrawl.g:1:151: RBR
				{
				mRBR(); 

				}
				break;
			case 28 :
				// /home/bardia/scrawl/Scrawl.g:1:155: PLS
				{
				mPLS(); 

				}
				break;
			case 29 :
				// /home/bardia/scrawl/Scrawl.g:1:159: MNS
				{
				mMNS(); 

				}
				break;
			case 30 :
				// /home/bardia/scrawl/Scrawl.g:1:163: MLP
				{
				mMLP(); 

				}
				break;
			case 31 :
				// /home/bardia/scrawl/Scrawl.g:1:167: DIV
				{
				mDIV(); 

				}
				break;
			case 32 :
				// /home/bardia/scrawl/Scrawl.g:1:171: PWR
				{
				mPWR(); 

				}
				break;
			case 33 :
				// /home/bardia/scrawl/Scrawl.g:1:175: LSS
				{
				mLSS(); 

				}
				break;
			case 34 :
				// /home/bardia/scrawl/Scrawl.g:1:179: LSQ
				{
				mLSQ(); 

				}
				break;
			case 35 :
				// /home/bardia/scrawl/Scrawl.g:1:183: GRT
				{
				mGRT(); 

				}
				break;
			case 36 :
				// /home/bardia/scrawl/Scrawl.g:1:187: GRQ
				{
				mGRQ(); 

				}
				break;
			case 37 :
				// /home/bardia/scrawl/Scrawl.g:1:191: EQL
				{
				mEQL(); 

				}
				break;
			case 38 :
				// /home/bardia/scrawl/Scrawl.g:1:195: NEQ
				{
				mNEQ(); 

				}
				break;
			case 39 :
				// /home/bardia/scrawl/Scrawl.g:1:199: AND
				{
				mAND(); 

				}
				break;
			case 40 :
				// /home/bardia/scrawl/Scrawl.g:1:203: OR
				{
				mOR(); 

				}
				break;
			case 41 :
				// /home/bardia/scrawl/Scrawl.g:1:206: NOT
				{
				mNOT(); 

				}
				break;
			case 42 :
				// /home/bardia/scrawl/Scrawl.g:1:210: DIGIT
				{
				mDIGIT(); 

				}
				break;
			case 43 :
				// /home/bardia/scrawl/Scrawl.g:1:216: INTEGER
				{
				mINTEGER(); 

				}
				break;
			case 44 :
				// /home/bardia/scrawl/Scrawl.g:1:224: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 45 :
				// /home/bardia/scrawl/Scrawl.g:1:230: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 46 :
				// /home/bardia/scrawl/Scrawl.g:1:238: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA12 dfa12 = new DFA12(this);
	static final String DFA7_eotS =
		"\5\uffff";
	static final String DFA7_eofS =
		"\5\uffff";
	static final String DFA7_minS =
		"\2\56\3\uffff";
	static final String DFA7_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA7_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA7_specialS =
		"\5\uffff}>";
	static final String[] DFA7_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "376:1: FLOAT : ( INTEGER '.' ( INTEGER )* ( EXP )? | '.' INTEGER ( EXP )? | INTEGER EXP );";
		}
	}

	static final String DFA12_eotS =
		"\2\uffff\1\43\3\uffff\5\23\3\uffff\3\23\10\uffff\1\63\1\uffff\1\65\1\67"+
		"\1\71\2\uffff\1\72\3\uffff\1\74\14\23\12\uffff\1\112\1\uffff\10\23\1\123"+
		"\1\124\3\23\1\uffff\2\23\1\132\1\133\3\23\1\137\2\uffff\1\23\1\141\1\142"+
		"\1\143\1\23\2\uffff\1\145\1\146\1\23\1\uffff\1\23\3\uffff\1\23\2\uffff"+
		"\1\23\1\153\1\154\1\23\2\uffff\1\23\1\157\1\uffff";
	static final String DFA12_eofS =
		"\160\uffff";
	static final String DFA12_minS =
		"\1\11\1\uffff\1\75\3\uffff\1\171\1\151\3\141\3\uffff\3\145\10\uffff\1"+
		"\52\1\uffff\3\75\2\uffff\1\56\3\uffff\1\60\2\162\1\163\1\151\1\162\1\151"+
		"\1\163\2\164\1\154\1\170\1\151\12\uffff\1\56\1\uffff\1\163\1\145\1\164"+
		"\1\156\1\163\1\156\1\143\1\164\2\60\1\145\1\164\1\163\1\uffff\1\164\1"+
		"\141\2\60\1\145\1\164\1\145\1\60\2\uffff\1\164\3\60\1\143\2\uffff\2\60"+
		"\1\144\1\uffff\1\145\3\uffff\1\150\2\uffff\1\165\2\60\1\162\2\uffff\1"+
		"\145\1\60\1\uffff";
	static final String DFA12_maxS =
		"\1\175\1\uffff\1\75\3\uffff\1\171\1\157\2\141\1\165\3\uffff\2\145\1\150"+
		"\10\uffff\1\57\1\uffff\3\75\2\uffff\1\145\3\uffff\1\172\2\162\1\163\1"+
		"\151\1\162\1\157\1\163\2\164\1\154\1\170\1\151\12\uffff\1\145\1\uffff"+
		"\1\163\1\145\1\164\1\156\1\163\1\156\1\143\1\164\2\172\1\145\1\164\1\163"+
		"\1\uffff\1\164\1\141\2\172\1\145\1\164\1\145\1\172\2\uffff\1\164\3\172"+
		"\1\143\2\uffff\2\172\1\144\1\uffff\1\145\3\uffff\1\150\2\uffff\1\165\2"+
		"\172\1\162\2\uffff\1\145\1\172\1\uffff";
	static final String DFA12_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\4\1\5\5\uffff\1\16\1\17\1\20\3\uffff\1\27\1"+
		"\30\1\31\1\32\1\33\1\34\1\35\1\36\1\uffff\1\40\3\uffff\1\47\1\50\1\uffff"+
		"\1\54\1\45\1\2\15\uffff\1\55\1\56\1\37\1\42\1\41\1\44\1\43\1\46\1\51\1"+
		"\52\1\uffff\1\6\15\uffff\1\53\10\uffff\1\23\1\21\5\uffff\1\11\1\12\3\uffff"+
		"\1\22\1\uffff\1\25\1\26\1\7\1\uffff\1\13\1\14\4\uffff\1\24\1\10\2\uffff"+
		"\1\15";
	static final String DFA12_specialS =
		"\160\uffff}>";
	static final String[] DFA12_transitionS = {
			"\2\15\2\uffff\1\15\22\uffff\1\15\1\35\1\21\3\uffff\1\36\1\uffff\1\24"+
			"\1\25\1\30\1\26\1\uffff\1\27\1\41\1\31\12\40\1\uffff\1\1\1\33\1\2\1\34"+
			"\1\uffff\1\3\32\23\1\4\1\22\1\5\1\32\1\23\1\uffff\1\23\1\6\1\23\1\17"+
			"\1\23\1\7\1\16\4\23\1\10\1\11\2\23\1\12\3\23\1\20\6\23\1\13\1\37\1\14",
			"",
			"\1\42",
			"",
			"",
			"",
			"\1\44",
			"\1\45\5\uffff\1\46",
			"\1\47",
			"\1\50",
			"\1\51\15\uffff\1\53\2\uffff\1\52\2\uffff\1\54",
			"",
			"",
			"",
			"\1\55",
			"\1\56",
			"\1\57\2\uffff\1\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\61\4\uffff\1\62",
			"",
			"\1\64",
			"\1\66",
			"\1\70",
			"",
			"",
			"\1\41\1\uffff\12\73\13\uffff\1\41\37\uffff\1\41",
			"",
			"",
			"",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102\5\uffff\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41\1\uffff\12\73\13\uffff\1\41\37\uffff\1\41",
			"",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\125",
			"\1\126",
			"\1\127",
			"",
			"\1\130",
			"\1\131",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\134",
			"\1\135",
			"\1\136",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"",
			"\1\140",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\144",
			"",
			"",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\147",
			"",
			"\1\150",
			"",
			"",
			"",
			"\1\151",
			"",
			"",
			"\1\152",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\155",
			"",
			"",
			"\1\156",
			"\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			""
	};

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | WS | GET | POST | PUT | DELETE | TEXT | THIS | STRING | ESC | ID | LBR | RBR | PLS | MNS | MLP | DIV | PWR | LSS | LSQ | GRT | GRQ | EQL | NEQ | AND | OR | NOT | DIGIT | INTEGER | FLOAT | COMMENT | LINE_COMMENT );";
		}
	}

}
