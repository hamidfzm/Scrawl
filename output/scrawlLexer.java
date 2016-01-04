// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 22:20:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class scrawlLexer extends Lexer {
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

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:2:6: ( '(' )
			// /home/bardia/scrawl/scrawl.g:2:8: '('
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
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
	// $ANTLR end "T__28"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:46:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /home/bardia/scrawl/scrawl.g:46:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:53:8: ( '\"' ( . )* '\"' )
			// /home/bardia/scrawl/scrawl.g:53:11: '\"' ( . )* '\"'
			{
			match('\"'); 
			// /home/bardia/scrawl/scrawl.g:53:15: ( . )*
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
					// /home/bardia/scrawl/scrawl.g:53:15: .
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
			// /home/bardia/scrawl/scrawl.g:55:4: ( ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/bardia/scrawl/scrawl.g:55:7: ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bardia/scrawl/scrawl.g:55:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				switch ( input.LA(1) ) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case '_':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt2=1;
					}
					break;
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
			// /home/bardia/scrawl/scrawl.g:57:5: ( ( 'A' .. 'Z' )+ )
			// /home/bardia/scrawl/scrawl.g:57:7: ( 'A' .. 'Z' )+
			{
			// /home/bardia/scrawl/scrawl.g:57:7: ( 'A' .. 'Z' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				switch ( input.LA(1) ) {
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
					{
					alt3=1;
					}
					break;
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
			// /home/bardia/scrawl/scrawl.g:59:8: ( '1' .. '9' ( '0' .. '9' )+ )
			// /home/bardia/scrawl/scrawl.g:59:10: '1' .. '9' ( '0' .. '9' )+
			{
			matchRange('1','9'); 
			// /home/bardia/scrawl/scrawl.g:59:19: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				switch ( input.LA(1) ) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					{
					alt4=1;
					}
					break;
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
		// /home/bardia/scrawl/scrawl.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | WS | STRING | ID | TAG | NUMBER )
		int alt5=25;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt5=1;
			}
			break;
		case ')':
			{
			alt5=2;
			}
			break;
		case '.':
			{
			alt5=3;
			}
			break;
		case ';':
			{
			alt5=4;
			}
			break;
		case '=':
			{
			alt5=5;
			}
			break;
		case '@':
			{
			alt5=6;
			}
			break;
		case '[':
			{
			alt5=7;
			}
			break;
		case ']':
			{
			alt5=8;
			}
			break;
		case 'b':
			{
			switch ( input.LA(2) ) {
			case 'y':
				{
				switch ( input.LA(3) ) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case '_':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt5=23;
					}
					break;
				default:
					alt5=9;
				}
				}
				break;
			default:
				alt5=23;
			}
			}
			break;
		case 'f':
			{
			switch ( input.LA(2) ) {
			case 'i':
				{
				switch ( input.LA(3) ) {
				case 'r':
					{
					switch ( input.LA(4) ) {
					case 's':
						{
						switch ( input.LA(5) ) {
						case 't':
							{
							switch ( input.LA(6) ) {
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
							case 'G':
							case 'H':
							case 'I':
							case 'J':
							case 'K':
							case 'L':
							case 'M':
							case 'N':
							case 'O':
							case 'P':
							case 'Q':
							case 'R':
							case 'S':
							case 'T':
							case 'U':
							case 'V':
							case 'W':
							case 'X':
							case 'Y':
							case 'Z':
							case '_':
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
							case 'g':
							case 'h':
							case 'i':
							case 'j':
							case 'k':
							case 'l':
							case 'm':
							case 'n':
							case 'o':
							case 'p':
							case 'q':
							case 'r':
							case 's':
							case 't':
							case 'u':
							case 'v':
							case 'w':
							case 'x':
							case 'y':
							case 'z':
								{
								alt5=23;
								}
								break;
							default:
								alt5=10;
							}
							}
							break;
						default:
							alt5=23;
						}
						}
						break;
					default:
						alt5=23;
					}
					}
					break;
				default:
					alt5=23;
				}
				}
				break;
			case 'o':
				{
				switch ( input.LA(3) ) {
				case 'r':
					{
					switch ( input.LA(4) ) {
					case 'e':
						{
						switch ( input.LA(5) ) {
						case 'a':
							{
							switch ( input.LA(6) ) {
							case 'c':
								{
								switch ( input.LA(7) ) {
								case 'h':
									{
									switch ( input.LA(8) ) {
									case '0':
									case '1':
									case '2':
									case '3':
									case '4':
									case '5':
									case '6':
									case '7':
									case '8':
									case '9':
									case 'A':
									case 'B':
									case 'C':
									case 'D':
									case 'E':
									case 'F':
									case 'G':
									case 'H':
									case 'I':
									case 'J':
									case 'K':
									case 'L':
									case 'M':
									case 'N':
									case 'O':
									case 'P':
									case 'Q':
									case 'R':
									case 'S':
									case 'T':
									case 'U':
									case 'V':
									case 'W':
									case 'X':
									case 'Y':
									case 'Z':
									case '_':
									case 'a':
									case 'b':
									case 'c':
									case 'd':
									case 'e':
									case 'f':
									case 'g':
									case 'h':
									case 'i':
									case 'j':
									case 'k':
									case 'l':
									case 'm':
									case 'n':
									case 'o':
									case 'p':
									case 'q':
									case 'r':
									case 's':
									case 't':
									case 'u':
									case 'v':
									case 'w':
									case 'x':
									case 'y':
									case 'z':
										{
										alt5=23;
										}
										break;
									default:
										alt5=11;
									}
									}
									break;
								default:
									alt5=23;
								}
								}
								break;
							default:
								alt5=23;
							}
							}
							break;
						default:
							alt5=23;
						}
						}
						break;
					default:
						alt5=23;
					}
					}
					break;
				default:
					alt5=23;
				}
				}
				break;
			default:
				alt5=23;
			}
			}
			break;
		case 'i':
			{
			switch ( input.LA(2) ) {
			case 'n':
				{
				switch ( input.LA(3) ) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
				case 'A':
				case 'B':
				case 'C':
				case 'D':
				case 'E':
				case 'F':
				case 'G':
				case 'H':
				case 'I':
				case 'J':
				case 'K':
				case 'L':
				case 'M':
				case 'N':
				case 'O':
				case 'P':
				case 'Q':
				case 'R':
				case 'S':
				case 'T':
				case 'U':
				case 'V':
				case 'W':
				case 'X':
				case 'Y':
				case 'Z':
				case '_':
				case 'a':
				case 'b':
				case 'c':
				case 'd':
				case 'e':
				case 'f':
				case 'g':
				case 'h':
				case 'i':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'o':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'u':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					{
					alt5=23;
					}
					break;
				default:
					alt5=12;
				}
				}
				break;
			default:
				alt5=23;
			}
			}
			break;
		case 'l':
			{
			switch ( input.LA(2) ) {
			case 'a':
				{
				switch ( input.LA(3) ) {
				case 's':
					{
					switch ( input.LA(4) ) {
					case 't':
						{
						switch ( input.LA(5) ) {
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
						case 'G':
						case 'H':
						case 'I':
						case 'J':
						case 'K':
						case 'L':
						case 'M':
						case 'N':
						case 'O':
						case 'P':
						case 'Q':
						case 'R':
						case 'S':
						case 'T':
						case 'U':
						case 'V':
						case 'W':
						case 'X':
						case 'Y':
						case 'Z':
						case '_':
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
						case 'g':
						case 'h':
						case 'i':
						case 'j':
						case 'k':
						case 'l':
						case 'm':
						case 'n':
						case 'o':
						case 'p':
						case 'q':
						case 'r':
						case 's':
						case 't':
						case 'u':
						case 'v':
						case 'w':
						case 'x':
						case 'y':
						case 'z':
							{
							alt5=23;
							}
							break;
						default:
							alt5=13;
						}
						}
						break;
					default:
						alt5=23;
					}
					}
					break;
				default:
					alt5=23;
				}
				}
				break;
			default:
				alt5=23;
			}
			}
			break;
		case 'm':
			{
			switch ( input.LA(2) ) {
			case 'a':
				{
				switch ( input.LA(3) ) {
				case 'i':
					{
					switch ( input.LA(4) ) {
					case 'n':
						{
						switch ( input.LA(5) ) {
						case '0':
						case '1':
						case '2':
						case '3':
						case '4':
						case '5':
						case '6':
						case '7':
						case '8':
						case '9':
						case 'A':
						case 'B':
						case 'C':
						case 'D':
						case 'E':
						case 'F':
						case 'G':
						case 'H':
						case 'I':
						case 'J':
						case 'K':
						case 'L':
						case 'M':
						case 'N':
						case 'O':
						case 'P':
						case 'Q':
						case 'R':
						case 'S':
						case 'T':
						case 'U':
						case 'V':
						case 'W':
						case 'X':
						case 'Y':
						case 'Z':
						case '_':
						case 'a':
						case 'b':
						case 'c':
						case 'd':
						case 'e':
						case 'f':
						case 'g':
						case 'h':
						case 'i':
						case 'j':
						case 'k':
						case 'l':
						case 'm':
						case 'n':
						case 'o':
						case 'p':
						case 'q':
						case 'r':
						case 's':
						case 't':
						case 'u':
						case 'v':
						case 'w':
						case 'x':
						case 'y':
						case 'z':
							{
							alt5=23;
							}
							break;
						default:
							alt5=14;
						}
						}
						break;
					default:
						alt5=23;
					}
					}
					break;
				default:
					alt5=23;
				}
				}
				break;
			default:
				alt5=23;
			}
			}
			break;
		case 'n':
			{
			switch ( input.LA(2) ) {
			case 'o':
				{
				switch ( input.LA(3) ) {
				case 'w':
					{
					switch ( input.LA(4) ) {
					case '0':
					case '1':
					case '2':
					case '3':
					case '4':
					case '5':
					case '6':
					case '7':
					case '8':
					case '9':
					case 'A':
					case 'B':
					case 'C':
					case 'D':
					case 'E':
					case 'F':
					case 'G':
					case 'H':
					case 'I':
					case 'J':
					case 'K':
					case 'L':
					case 'M':
					case 'N':
					case 'O':
					case 'P':
					case 'Q':
					case 'R':
					case 'S':
					case 'T':
					case 'U':
					case 'V':
					case 'W':
					case 'X':
					case 'Y':
					case 'Z':
					case '_':
					case 'a':
					case 'b':
					case 'c':
					case 'd':
					case 'e':
					case 'f':
					case 'g':
					case 'h':
					case 'i':
					case 'j':
					case 'k':
					case 'l':
					case 'm':
					case 'n':
					case 'o':
					case 'p':
					case 'q':
					case 'r':
					case 's':
					case 't':
					case 'u':
					case 'v':
					case 'w':
					case 'x':
					case 'y':
					case 'z':
						{
						alt5=23;
						}
						break;
					default:
						alt5=15;
					}
					}
					break;
				default:
					alt5=23;
				}
				}
				break;
			default:
				alt5=23;
			}
			}
			break;
		case 'p':
			{
			switch ( input.LA(2) ) {
			case 'a':
				{
				switch ( input.LA(3) ) {
				case 'r':
					{
					switch ( input.LA(4) ) {
					case 's':
						{
						switch ( input.LA(5) ) {
						case 'e':
							{
							switch ( input.LA(6) ) {
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
							case 'G':
							case 'H':
							case 'I':
							case 'J':
							case 'K':
							case 'L':
							case 'M':
							case 'N':
							case 'O':
							case 'P':
							case 'Q':
							case 'R':
							case 'S':
							case 'T':
							case 'U':
							case 'V':
							case 'W':
							case 'X':
							case 'Y':
							case 'Z':
							case '_':
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
							case 'g':
							case 'h':
							case 'i':
							case 'j':
							case 'k':
							case 'l':
							case 'm':
							case 'n':
							case 'o':
							case 'p':
							case 'q':
							case 'r':
							case 's':
							case 't':
							case 'u':
							case 'v':
							case 'w':
							case 'x':
							case 'y':
							case 'z':
								{
								alt5=23;
								}
								break;
							default:
								alt5=16;
							}
							}
							break;
						default:
							alt5=23;
						}
						}
						break;
					default:
						alt5=23;
					}
					}
					break;
				default:
					alt5=23;
				}
				}
				break;
			case 'r':
				{
				switch ( input.LA(3) ) {
				case 'i':
					{
					switch ( input.LA(4) ) {
					case 'n':
						{
						switch ( input.LA(5) ) {
						case 't':
							{
							switch ( input.LA(6) ) {
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
							case 'G':
							case 'H':
							case 'I':
							case 'J':
							case 'K':
							case 'L':
							case 'M':
							case 'N':
							case 'O':
							case 'P':
							case 'Q':
							case 'R':
							case 'S':
							case 'T':
							case 'U':
							case 'V':
							case 'W':
							case 'X':
							case 'Y':
							case 'Z':
							case '_':
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
							case 'g':
							case 'h':
							case 'i':
							case 'j':
							case 'k':
							case 'l':
							case 'm':
							case 'n':
							case 'o':
							case 'p':
							case 'q':
							case 'r':
							case 's':
							case 't':
							case 'u':
							case 'v':
							case 'w':
							case 'x':
							case 'y':
							case 'z':
								{
								alt5=23;
								}
								break;
							default:
								alt5=17;
							}
							}
							break;
						default:
							alt5=23;
						}
						}
						break;
					default:
						alt5=23;
					}
					}
					break;
				case 'o':
					{
					switch ( input.LA(4) ) {
					case 'c':
						{
						switch ( input.LA(5) ) {
						case 'e':
							{
							switch ( input.LA(6) ) {
							case 'd':
								{
								switch ( input.LA(7) ) {
								case 'u':
									{
									switch ( input.LA(8) ) {
									case 'r':
										{
										switch ( input.LA(9) ) {
										case 'e':
											{
											switch ( input.LA(10) ) {
											case '0':
											case '1':
											case '2':
											case '3':
											case '4':
											case '5':
											case '6':
											case '7':
											case '8':
											case '9':
											case 'A':
											case 'B':
											case 'C':
											case 'D':
											case 'E':
											case 'F':
											case 'G':
											case 'H':
											case 'I':
											case 'J':
											case 'K':
											case 'L':
											case 'M':
											case 'N':
											case 'O':
											case 'P':
											case 'Q':
											case 'R':
											case 'S':
											case 'T':
											case 'U':
											case 'V':
											case 'W':
											case 'X':
											case 'Y':
											case 'Z':
											case '_':
											case 'a':
											case 'b':
											case 'c':
											case 'd':
											case 'e':
											case 'f':
											case 'g':
											case 'h':
											case 'i':
											case 'j':
											case 'k':
											case 'l':
											case 'm':
											case 'n':
											case 'o':
											case 'p':
											case 'q':
											case 'r':
											case 's':
											case 't':
											case 'u':
											case 'v':
											case 'w':
											case 'x':
											case 'y':
											case 'z':
												{
												alt5=23;
												}
												break;
											default:
												alt5=18;
											}
											}
											break;
										default:
											alt5=23;
										}
										}
										break;
									default:
										alt5=23;
									}
									}
									break;
								default:
									alt5=23;
								}
								}
								break;
							default:
								alt5=23;
							}
							}
							break;
						default:
							alt5=23;
						}
						}
						break;
					default:
						alt5=23;
					}
					}
					break;
				default:
					alt5=23;
				}
				}
				break;
			default:
				alt5=23;
			}
			}
			break;
		case '{':
			{
			alt5=19;
			}
			break;
		case '}':
			{
			alt5=20;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt5=21;
			}
			break;
		case '\"':
			{
			alt5=22;
			}
			break;
		case '_':
		case 'a':
		case 'c':
		case 'd':
		case 'e':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'o':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt5=23;
			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
			{
			alt5=24;
			}
			break;
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt5=25;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// /home/bardia/scrawl/scrawl.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// /home/bardia/scrawl/scrawl.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// /home/bardia/scrawl/scrawl.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// /home/bardia/scrawl/scrawl.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// /home/bardia/scrawl/scrawl.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// /home/bardia/scrawl/scrawl.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// /home/bardia/scrawl/scrawl.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// /home/bardia/scrawl/scrawl.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// /home/bardia/scrawl/scrawl.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// /home/bardia/scrawl/scrawl.g:1:63: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// /home/bardia/scrawl/scrawl.g:1:69: T__19
				{
				mT__19(); 

				}
				break;
			case 12 :
				// /home/bardia/scrawl/scrawl.g:1:75: T__20
				{
				mT__20(); 

				}
				break;
			case 13 :
				// /home/bardia/scrawl/scrawl.g:1:81: T__21
				{
				mT__21(); 

				}
				break;
			case 14 :
				// /home/bardia/scrawl/scrawl.g:1:87: T__22
				{
				mT__22(); 

				}
				break;
			case 15 :
				// /home/bardia/scrawl/scrawl.g:1:93: T__23
				{
				mT__23(); 

				}
				break;
			case 16 :
				// /home/bardia/scrawl/scrawl.g:1:99: T__24
				{
				mT__24(); 

				}
				break;
			case 17 :
				// /home/bardia/scrawl/scrawl.g:1:105: T__25
				{
				mT__25(); 

				}
				break;
			case 18 :
				// /home/bardia/scrawl/scrawl.g:1:111: T__26
				{
				mT__26(); 

				}
				break;
			case 19 :
				// /home/bardia/scrawl/scrawl.g:1:117: T__27
				{
				mT__27(); 

				}
				break;
			case 20 :
				// /home/bardia/scrawl/scrawl.g:1:123: T__28
				{
				mT__28(); 

				}
				break;
			case 21 :
				// /home/bardia/scrawl/scrawl.g:1:129: WS
				{
				mWS(); 

				}
				break;
			case 22 :
				// /home/bardia/scrawl/scrawl.g:1:132: STRING
				{
				mSTRING(); 

				}
				break;
			case 23 :
				// /home/bardia/scrawl/scrawl.g:1:139: ID
				{
				mID(); 

				}
				break;
			case 24 :
				// /home/bardia/scrawl/scrawl.g:1:142: TAG
				{
				mTAG(); 

				}
				break;
			case 25 :
				// /home/bardia/scrawl/scrawl.g:1:146: NUMBER
				{
				mNUMBER(); 

				}
				break;

		}
	}



}
