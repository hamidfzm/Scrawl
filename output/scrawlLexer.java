// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-14 20:39:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class scrawlLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public scrawlLexer() {} 
	public scrawlLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public scrawlLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/bardia/scrawl/scrawl.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:2:7: ( '(' )
			// /home/bardia/scrawl/scrawl.g:2:9: '('
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:3:7: ( ')' )
			// /home/bardia/scrawl/scrawl.g:3:9: ')'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:4:7: ( '.' )
			// /home/bardia/scrawl/scrawl.g:4:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:5:7: ( ';' )
			// /home/bardia/scrawl/scrawl.g:5:9: ';'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:6:7: ( '=' )
			// /home/bardia/scrawl/scrawl.g:6:9: '='
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:7:7: ( '@' )
			// /home/bardia/scrawl/scrawl.g:7:9: '@'
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:8:7: ( '[' )
			// /home/bardia/scrawl/scrawl.g:8:9: '['
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:9:7: ( ']' )
			// /home/bardia/scrawl/scrawl.g:9:9: ']'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:10:7: ( 'by' )
			// /home/bardia/scrawl/scrawl.g:10:9: 'by'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:11:7: ( 'first' )
			// /home/bardia/scrawl/scrawl.g:11:9: 'first'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:12:7: ( 'foreach' )
			// /home/bardia/scrawl/scrawl.g:12:9: 'foreach'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:13:7: ( 'in' )
			// /home/bardia/scrawl/scrawl.g:13:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:14:7: ( 'last' )
			// /home/bardia/scrawl/scrawl.g:14:9: 'last'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:15:7: ( 'main' )
			// /home/bardia/scrawl/scrawl.g:15:9: 'main'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:16:7: ( 'now' )
			// /home/bardia/scrawl/scrawl.g:16:9: 'now'
			{
			match("now"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:17:7: ( 'parse' )
			// /home/bardia/scrawl/scrawl.g:17:9: 'parse'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:18:7: ( 'print' )
			// /home/bardia/scrawl/scrawl.g:18:9: 'print'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:19:7: ( 'procedure' )
			// /home/bardia/scrawl/scrawl.g:19:9: 'procedure'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:20:7: ( '{' )
			// /home/bardia/scrawl/scrawl.g:20:9: '{'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:21:7: ( '}' )
			// /home/bardia/scrawl/scrawl.g:21:9: '}'
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
	// $ANTLR end "T__29"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:87:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/bardia/scrawl/scrawl.g:87:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:94:6: ( 'this' )
			// /home/bardia/scrawl/scrawl.g:94:8: 'this'
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
			// /home/bardia/scrawl/scrawl.g:96:8: ( '\"' ( . )* '\"' )
			// /home/bardia/scrawl/scrawl.g:96:11: '\"' ( . )* '\"'
			{
			match('\"'); 
			// /home/bardia/scrawl/scrawl.g:96:15: ( . )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\"') ) {
					alt1=2;
				}
				else if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/bardia/scrawl/scrawl.g:96:15: .
					{
					matchAny(); 
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

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:98:4: ( ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/bardia/scrawl/scrawl.g:98:7: ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bardia/scrawl/scrawl.g:98:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/bardia/scrawl/scrawl.g:
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

	// $ANTLR start "TAG"
	public final void mTAG() throws RecognitionException {
		try {
			int _type = TAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:100:5: ( ( 'A' .. 'Z' )+ )
			// /home/bardia/scrawl/scrawl.g:100:7: ( 'A' .. 'Z' )+
			{
			// /home/bardia/scrawl/scrawl.g:100:7: ( 'A' .. 'Z' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'A' && LA3_0 <= 'Z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/bardia/scrawl/scrawl.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
	// $ANTLR end "TAG"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:102:8: ( '1' .. '9' ( '0' .. '9' )+ )
			// /home/bardia/scrawl/scrawl.g:102:10: '1' .. '9' ( '0' .. '9' )+
			{
			matchRange('1','9'); 
			// /home/bardia/scrawl/scrawl.g:102:19: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/bardia/scrawl/scrawl.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/bardia/scrawl/scrawl.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | WS | THIS | STRING | ID | TAG | NUMBER )
		int alt5=26;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /home/bardia/scrawl/scrawl.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// /home/bardia/scrawl/scrawl.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// /home/bardia/scrawl/scrawl.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// /home/bardia/scrawl/scrawl.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// /home/bardia/scrawl/scrawl.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// /home/bardia/scrawl/scrawl.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// /home/bardia/scrawl/scrawl.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// /home/bardia/scrawl/scrawl.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// /home/bardia/scrawl/scrawl.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// /home/bardia/scrawl/scrawl.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// /home/bardia/scrawl/scrawl.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// /home/bardia/scrawl/scrawl.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// /home/bardia/scrawl/scrawl.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// /home/bardia/scrawl/scrawl.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// /home/bardia/scrawl/scrawl.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// /home/bardia/scrawl/scrawl.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// /home/bardia/scrawl/scrawl.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// /home/bardia/scrawl/scrawl.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// /home/bardia/scrawl/scrawl.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// /home/bardia/scrawl/scrawl.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// /home/bardia/scrawl/scrawl.g:1:130: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// /home/bardia/scrawl/scrawl.g:1:133: THIS
				{
				mTHIS(); 

				}
				break;
			case 23 :
				// /home/bardia/scrawl/scrawl.g:1:138: STRING
				{
				mSTRING(); 

				}
				break;
			case 24 :
				// /home/bardia/scrawl/scrawl.g:1:145: ID
				{
				mID(); 

				}
				break;
			case 25 :
				// /home/bardia/scrawl/scrawl.g:1:148: TAG
				{
				mTAG(); 

				}
				break;
			case 26 :
				// /home/bardia/scrawl/scrawl.g:1:152: NUMBER
				{
				mNUMBER(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\11\uffff\7\25\3\uffff\1\25\4\uffff\1\42\2\25\1\45\6\25\1\uffff\2\25\1"+
		"\uffff\2\25\1\61\6\25\1\70\1\71\1\uffff\3\25\1\75\1\76\1\25\2\uffff\1"+
		"\100\1\101\1\25\2\uffff\1\25\2\uffff\1\25\1\105\1\25\1\uffff\1\25\1\110"+
		"\1\uffff";
	static final String DFA5_eofS =
		"\111\uffff";
	static final String DFA5_minS =
		"\1\11\10\uffff\1\171\1\151\1\156\2\141\1\157\1\141\3\uffff\1\150\4\uffff"+
		"\1\60\2\162\1\60\1\163\1\151\1\167\1\162\2\151\1\uffff\1\163\1\145\1\uffff"+
		"\1\164\1\156\1\60\1\163\1\156\1\143\1\163\1\164\1\141\2\60\1\uffff\1\145"+
		"\1\164\1\145\2\60\1\143\2\uffff\2\60\1\144\2\uffff\1\150\2\uffff\1\165"+
		"\1\60\1\162\1\uffff\1\145\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\10\uffff\1\171\1\157\1\156\2\141\1\157\1\162\3\uffff\1\150\4\uffff"+
		"\1\172\2\162\1\172\1\163\1\151\1\167\1\162\1\157\1\151\1\uffff\1\163\1"+
		"\145\1\uffff\1\164\1\156\1\172\1\163\1\156\1\143\1\163\1\164\1\141\2\172"+
		"\1\uffff\1\145\1\164\1\145\2\172\1\143\2\uffff\2\172\1\144\2\uffff\1\150"+
		"\2\uffff\1\165\1\172\1\162\1\uffff\1\145\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\7\uffff\1\23\1\24\1\25\1\uffff"+
		"\1\27\1\30\1\31\1\32\12\uffff\1\11\2\uffff\1\14\13\uffff\1\17\6\uffff"+
		"\1\15\1\16\3\uffff\1\26\1\12\1\uffff\1\20\1\21\3\uffff\1\13\2\uffff\1"+
		"\22";
	static final String DFA5_specialS =
		"\111\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\1\uffff\1\24\5\uffff\1\1\1\2\4\uffff"+
			"\1\3\2\uffff\11\27\1\uffff\1\4\1\uffff\1\5\2\uffff\1\6\32\26\1\7\1\uffff"+
			"\1\10\1\uffff\1\25\1\uffff\1\25\1\11\3\25\1\12\2\25\1\13\2\25\1\14\1"+
			"\15\1\16\1\25\1\17\3\25\1\23\6\25\1\20\1\uffff\1\21",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\30",
			"\1\31\5\uffff\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37\20\uffff\1\40",
			"",
			"",
			"",
			"\1\41",
			"",
			"",
			"",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\43",
			"\1\44",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52\5\uffff\1\53",
			"\1\54",
			"",
			"\1\55",
			"\1\56",
			"",
			"\1\57",
			"\1\60",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"",
			"\1\72",
			"\1\73",
			"\1\74",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\77",
			"",
			"",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\102",
			"",
			"",
			"\1\103",
			"",
			"",
			"\1\104",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			"\1\106",
			"",
			"\1\107",
			"\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | WS | THIS | STRING | ID | TAG | NUMBER );";
		}
	}

}
