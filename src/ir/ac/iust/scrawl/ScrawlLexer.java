// $ANTLR 3.5.1 /home/bardia/scrawl/Scrawl.g 2016-01-18 21:25:08

	package ir.ac.iust.scrawl;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ScrawlLexer extends Lexer {
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

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:6:7: ( '(' )
			// /home/bardia/scrawl/Scrawl.g:6:9: '('
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:7:7: ( ')' )
			// /home/bardia/scrawl/Scrawl.g:7:9: ')'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:8:7: ( ',' )
			// /home/bardia/scrawl/Scrawl.g:8:9: ','
			{
			match(','); 
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
			// /home/bardia/scrawl/Scrawl.g:9:7: ( '.' )
			// /home/bardia/scrawl/Scrawl.g:9:9: '.'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:10:7: ( ':' )
			// /home/bardia/scrawl/Scrawl.g:10:9: ':'
			{
			match(':'); 
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
			// /home/bardia/scrawl/Scrawl.g:11:7: ( ';' )
			// /home/bardia/scrawl/Scrawl.g:11:9: ';'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:12:7: ( '=' )
			// /home/bardia/scrawl/Scrawl.g:12:9: '='
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:13:7: ( '@' )
			// /home/bardia/scrawl/Scrawl.g:13:9: '@'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:14:7: ( '[' )
			// /home/bardia/scrawl/Scrawl.g:14:9: '['
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:15:7: ( ']' )
			// /home/bardia/scrawl/Scrawl.g:15:9: ']'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:16:7: ( 'by' )
			// /home/bardia/scrawl/Scrawl.g:16:9: 'by'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:17:7: ( 'first' )
			// /home/bardia/scrawl/Scrawl.g:17:9: 'first'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:18:7: ( 'foreach' )
			// /home/bardia/scrawl/Scrawl.g:18:9: 'foreach'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:19:7: ( 'last' )
			// /home/bardia/scrawl/Scrawl.g:19:9: 'last'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:20:7: ( 'main' )
			// /home/bardia/scrawl/Scrawl.g:20:9: 'main'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:21:7: ( 'parse' )
			// /home/bardia/scrawl/Scrawl.g:21:9: 'parse'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:22:7: ( 'print' )
			// /home/bardia/scrawl/Scrawl.g:22:9: 'print'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:23:7: ( 'procedure' )
			// /home/bardia/scrawl/Scrawl.g:23:9: 'procedure'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:24:7: ( '{' )
			// /home/bardia/scrawl/Scrawl.g:24:9: '{'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:25:7: ( '}' )
			// /home/bardia/scrawl/Scrawl.g:25:9: '}'
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
	// $ANTLR end "T__34"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:122:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/bardia/scrawl/Scrawl.g:122:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// /home/bardia/scrawl/Scrawl.g:129:5: ( 'get' )
			// /home/bardia/scrawl/Scrawl.g:129:7: 'get'
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
			// /home/bardia/scrawl/Scrawl.g:130:6: ( 'post' )
			// /home/bardia/scrawl/Scrawl.g:130:8: 'post'
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
			// /home/bardia/scrawl/Scrawl.g:131:5: ( 'put' )
			// /home/bardia/scrawl/Scrawl.g:131:7: 'put'
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
			// /home/bardia/scrawl/Scrawl.g:132:8: ( 'delete' )
			// /home/bardia/scrawl/Scrawl.g:132:10: 'delete'
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
			// /home/bardia/scrawl/Scrawl.g:133:6: ( 'text' )
			// /home/bardia/scrawl/Scrawl.g:133:8: 'text'
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
			// /home/bardia/scrawl/Scrawl.g:135:6: ( 'this' )
			// /home/bardia/scrawl/Scrawl.g:135:8: 'this'
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
			// /home/bardia/scrawl/Scrawl.g:137:8: ( '\"' ( . )* '\"' )
			// /home/bardia/scrawl/Scrawl.g:137:11: '\"' ( . )* '\"'
			{
			match('\"'); 
			// /home/bardia/scrawl/Scrawl.g:137:15: ( . )*
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
					// /home/bardia/scrawl/Scrawl.g:137:15: .
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
			// /home/bardia/scrawl/Scrawl.g:139:4: ( ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/bardia/scrawl/Scrawl.g:139:7: ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bardia/scrawl/Scrawl.g:139:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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

	// $ANTLR start "TAG"
	public final void mTAG() throws RecognitionException {
		try {
			int _type = TAG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/Scrawl.g:141:5: ( ( 'A' .. 'Z' )+ )
			// /home/bardia/scrawl/Scrawl.g:141:7: ( 'A' .. 'Z' )+
			{
			// /home/bardia/scrawl/Scrawl.g:141:7: ( 'A' .. 'Z' )+
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
					// /home/bardia/scrawl/Scrawl.g:
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
			// /home/bardia/scrawl/Scrawl.g:143:8: ( '1' .. '9' ( '0' .. '9' )+ )
			// /home/bardia/scrawl/Scrawl.g:143:10: '1' .. '9' ( '0' .. '9' )+
			{
			matchRange('1','9'); 
			// /home/bardia/scrawl/Scrawl.g:143:19: ( '0' .. '9' )+
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
		// /home/bardia/scrawl/Scrawl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | WS | GET | POST | PUT | DELETE | TEXT | THIS | STRING | ID | TAG | NUMBER )
		int alt5=31;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /home/bardia/scrawl/Scrawl.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// /home/bardia/scrawl/Scrawl.g:1:16: T__16
				{
				mT__16(); 

				}
				break;
			case 3 :
				// /home/bardia/scrawl/Scrawl.g:1:22: T__17
				{
				mT__17(); 

				}
				break;
			case 4 :
				// /home/bardia/scrawl/Scrawl.g:1:28: T__18
				{
				mT__18(); 

				}
				break;
			case 5 :
				// /home/bardia/scrawl/Scrawl.g:1:34: T__19
				{
				mT__19(); 

				}
				break;
			case 6 :
				// /home/bardia/scrawl/Scrawl.g:1:40: T__20
				{
				mT__20(); 

				}
				break;
			case 7 :
				// /home/bardia/scrawl/Scrawl.g:1:46: T__21
				{
				mT__21(); 

				}
				break;
			case 8 :
				// /home/bardia/scrawl/Scrawl.g:1:52: T__22
				{
				mT__22(); 

				}
				break;
			case 9 :
				// /home/bardia/scrawl/Scrawl.g:1:58: T__23
				{
				mT__23(); 

				}
				break;
			case 10 :
				// /home/bardia/scrawl/Scrawl.g:1:64: T__24
				{
				mT__24(); 

				}
				break;
			case 11 :
				// /home/bardia/scrawl/Scrawl.g:1:70: T__25
				{
				mT__25(); 

				}
				break;
			case 12 :
				// /home/bardia/scrawl/Scrawl.g:1:76: T__26
				{
				mT__26(); 

				}
				break;
			case 13 :
				// /home/bardia/scrawl/Scrawl.g:1:82: T__27
				{
				mT__27(); 

				}
				break;
			case 14 :
				// /home/bardia/scrawl/Scrawl.g:1:88: T__28
				{
				mT__28(); 

				}
				break;
			case 15 :
				// /home/bardia/scrawl/Scrawl.g:1:94: T__29
				{
				mT__29(); 

				}
				break;
			case 16 :
				// /home/bardia/scrawl/Scrawl.g:1:100: T__30
				{
				mT__30(); 

				}
				break;
			case 17 :
				// /home/bardia/scrawl/Scrawl.g:1:106: T__31
				{
				mT__31(); 

				}
				break;
			case 18 :
				// /home/bardia/scrawl/Scrawl.g:1:112: T__32
				{
				mT__32(); 

				}
				break;
			case 19 :
				// /home/bardia/scrawl/Scrawl.g:1:118: T__33
				{
				mT__33(); 

				}
				break;
			case 20 :
				// /home/bardia/scrawl/Scrawl.g:1:124: T__34
				{
				mT__34(); 

				}
				break;
			case 21 :
				// /home/bardia/scrawl/Scrawl.g:1:130: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// /home/bardia/scrawl/Scrawl.g:1:133: GET
				{
				mGET(); 

				}
				break;
			case 23 :
				// /home/bardia/scrawl/Scrawl.g:1:137: POST
				{
				mPOST(); 

				}
				break;
			case 24 :
				// /home/bardia/scrawl/Scrawl.g:1:142: PUT
				{
				mPUT(); 

				}
				break;
			case 25 :
				// /home/bardia/scrawl/Scrawl.g:1:146: DELETE
				{
				mDELETE(); 

				}
				break;
			case 26 :
				// /home/bardia/scrawl/Scrawl.g:1:153: TEXT
				{
				mTEXT(); 

				}
				break;
			case 27 :
				// /home/bardia/scrawl/Scrawl.g:1:158: THIS
				{
				mTHIS(); 

				}
				break;
			case 28 :
				// /home/bardia/scrawl/Scrawl.g:1:163: STRING
				{
				mSTRING(); 

				}
				break;
			case 29 :
				// /home/bardia/scrawl/Scrawl.g:1:170: ID
				{
				mID(); 

				}
				break;
			case 30 :
				// /home/bardia/scrawl/Scrawl.g:1:173: TAG
				{
				mTAG(); 

				}
				break;
			case 31 :
				// /home/bardia/scrawl/Scrawl.g:1:177: NUMBER
				{
				mNUMBER(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\13\uffff\5\27\3\uffff\3\27\4\uffff\1\47\14\27\1\uffff\10\27\1\75\1\76"+
		"\5\27\1\104\1\105\3\27\1\111\2\uffff\1\27\1\113\1\114\1\115\1\27\2\uffff"+
		"\1\117\1\120\1\27\1\uffff\1\27\3\uffff\1\27\2\uffff\1\27\1\125\1\126\1"+
		"\27\2\uffff\1\27\1\131\1\uffff";
	static final String DFA5_eofS =
		"\132\uffff";
	static final String DFA5_minS =
		"\1\11\12\uffff\1\171\1\151\3\141\3\uffff\3\145\4\uffff\1\60\2\162\1\163"+
		"\1\151\1\162\1\151\1\163\2\164\1\154\1\170\1\151\1\uffff\1\163\1\145\1"+
		"\164\1\156\1\163\1\156\1\143\1\164\2\60\1\145\1\164\1\163\1\164\1\141"+
		"\2\60\1\145\1\164\1\145\1\60\2\uffff\1\164\3\60\1\143\2\uffff\2\60\1\144"+
		"\1\uffff\1\145\3\uffff\1\150\2\uffff\1\165\2\60\1\162\2\uffff\1\145\1"+
		"\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\12\uffff\1\171\1\157\2\141\1\165\3\uffff\2\145\1\150\4\uffff\1"+
		"\172\2\162\1\163\1\151\1\162\1\157\1\163\2\164\1\154\1\170\1\151\1\uffff"+
		"\1\163\1\145\1\164\1\156\1\163\1\156\1\143\1\164\2\172\1\145\1\164\1\163"+
		"\1\164\1\141\2\172\1\145\1\164\1\145\1\172\2\uffff\1\164\3\172\1\143\2"+
		"\uffff\2\172\1\144\1\uffff\1\145\3\uffff\1\150\2\uffff\1\165\2\172\1\162"+
		"\2\uffff\1\145\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\5\uffff\1\23\1\24"+
		"\1\25\3\uffff\1\34\1\35\1\36\1\37\15\uffff\1\13\25\uffff\1\30\1\26\5\uffff"+
		"\1\16\1\17\3\uffff\1\27\1\uffff\1\32\1\33\1\14\1\uffff\1\20\1\21\4\uffff"+
		"\1\31\1\15\2\uffff\1\22";
	static final String DFA5_specialS =
		"\132\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\22\2\uffff\1\22\22\uffff\1\22\1\uffff\1\26\5\uffff\1\1\1\2\2\uffff"+
			"\1\3\1\uffff\1\4\2\uffff\11\31\1\5\1\6\1\uffff\1\7\2\uffff\1\10\32\30"+
			"\1\11\1\uffff\1\12\1\uffff\1\27\1\uffff\1\27\1\13\1\27\1\24\1\27\1\14"+
			"\1\23\4\27\1\15\1\16\2\27\1\17\3\27\1\25\6\27\1\20\1\uffff\1\21",
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
			"\1\32",
			"\1\33\5\uffff\1\34",
			"\1\35",
			"\1\36",
			"\1\37\15\uffff\1\41\2\uffff\1\40\2\uffff\1\42",
			"",
			"",
			"",
			"\1\43",
			"\1\44",
			"\1\45\2\uffff\1\46",
			"",
			"",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55\5\uffff\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\106",
			"\1\107",
			"\1\110",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"",
			"",
			"\1\112",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\116",
			"",
			"",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\121",
			"",
			"\1\122",
			"",
			"",
			"",
			"\1\123",
			"",
			"",
			"\1\124",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
			"\1\127",
			"",
			"",
			"\1\130",
			"\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
			return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | WS | GET | POST | PUT | DELETE | TEXT | THIS | STRING | ID | TAG | NUMBER );";
		}
	}

}
