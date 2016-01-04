// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 18:02:48

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class scrawlLexer extends Lexer {
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

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:3:6: ( ')' )
			// /home/bardia/scrawl/scrawl.g:3:8: ')'
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:16:7: ( 'parse' )
			// /home/bardia/scrawl/scrawl.g:16:9: 'parse'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:17:7: ( 'procedure' )
			// /home/bardia/scrawl/scrawl.g:17:9: 'procedure'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:18:7: ( '{' )
			// /home/bardia/scrawl/scrawl.g:18:9: '{'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:19:7: ( '}' )
			// /home/bardia/scrawl/scrawl.g:19:9: '}'
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
	// $ANTLR end "T__25"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:45:8: ( '\"' ( . )* '\"' )
			// /home/bardia/scrawl/scrawl.g:45:11: '\"' ( . )* '\"'
			{
			match('\"'); 
			// /home/bardia/scrawl/scrawl.g:45:15: ( . )*
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
					// /home/bardia/scrawl/scrawl.g:45:15: .
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
			// /home/bardia/scrawl/scrawl.g:47:4: ( ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/bardia/scrawl/scrawl.g:47:7: ( 'a' .. 'z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bardia/scrawl/scrawl.g:47:22: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
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
			// /home/bardia/scrawl/scrawl.g:49:5: ( ( 'A' .. 'Z' )+ )
			// /home/bardia/scrawl/scrawl.g:49:7: ( 'A' .. 'Z' )+
			{
			// /home/bardia/scrawl/scrawl.g:49:7: ( 'A' .. 'Z' )+
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
			// /home/bardia/scrawl/scrawl.g:51:8: ( '1' .. '9' ( '0' .. '9' )+ )
			// /home/bardia/scrawl/scrawl.g:51:10: '1' .. '9' ( '0' .. '9' )+
			{
			matchRange('1','9'); 
			// /home/bardia/scrawl/scrawl.g:51:19: ( '0' .. '9' )+
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
		// /home/bardia/scrawl/scrawl.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | STRING | ID | TAG | NUMBER )
		int alt5=22;
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
			int LA5_9 = input.LA(2);
			if ( (LA5_9=='y') ) {
				int LA5_21 = input.LA(3);
				if ( ((LA5_21 >= '0' && LA5_21 <= '9')||(LA5_21 >= 'A' && LA5_21 <= 'Z')||LA5_21=='_'||(LA5_21 >= 'a' && LA5_21 <= 'z')) ) {
					alt5=20;
				}

				else {
					alt5=9;
				}

			}

			else {
				alt5=20;
			}

			}
			break;
		case 'f':
			{
			switch ( input.LA(2) ) {
			case 'i':
				{
				int LA5_22 = input.LA(3);
				if ( (LA5_22=='r') ) {
					int LA5_30 = input.LA(4);
					if ( (LA5_30=='s') ) {
						int LA5_37 = input.LA(5);
						if ( (LA5_37=='t') ) {
							int LA5_43 = input.LA(6);
							if ( ((LA5_43 >= '0' && LA5_43 <= '9')||(LA5_43 >= 'A' && LA5_43 <= 'Z')||LA5_43=='_'||(LA5_43 >= 'a' && LA5_43 <= 'z')) ) {
								alt5=20;
							}

							else {
								alt5=10;
							}

						}

						else {
							alt5=20;
						}

					}

					else {
						alt5=20;
					}

				}

				else {
					alt5=20;
				}

				}
				break;
			case 'o':
				{
				int LA5_23 = input.LA(3);
				if ( (LA5_23=='r') ) {
					int LA5_31 = input.LA(4);
					if ( (LA5_31=='e') ) {
						int LA5_38 = input.LA(5);
						if ( (LA5_38=='a') ) {
							int LA5_44 = input.LA(6);
							if ( (LA5_44=='c') ) {
								int LA5_50 = input.LA(7);
								if ( (LA5_50=='h') ) {
									int LA5_53 = input.LA(8);
									if ( ((LA5_53 >= '0' && LA5_53 <= '9')||(LA5_53 >= 'A' && LA5_53 <= 'Z')||LA5_53=='_'||(LA5_53 >= 'a' && LA5_53 <= 'z')) ) {
										alt5=20;
									}

									else {
										alt5=11;
									}

								}

								else {
									alt5=20;
								}

							}

							else {
								alt5=20;
							}

						}

						else {
							alt5=20;
						}

					}

					else {
						alt5=20;
					}

				}

				else {
					alt5=20;
				}

				}
				break;
			default:
				alt5=20;
			}
			}
			break;
		case 'i':
			{
			int LA5_11 = input.LA(2);
			if ( (LA5_11=='n') ) {
				int LA5_24 = input.LA(3);
				if ( ((LA5_24 >= '0' && LA5_24 <= '9')||(LA5_24 >= 'A' && LA5_24 <= 'Z')||LA5_24=='_'||(LA5_24 >= 'a' && LA5_24 <= 'z')) ) {
					alt5=20;
				}

				else {
					alt5=12;
				}

			}

			else {
				alt5=20;
			}

			}
			break;
		case 'l':
			{
			int LA5_12 = input.LA(2);
			if ( (LA5_12=='a') ) {
				int LA5_25 = input.LA(3);
				if ( (LA5_25=='s') ) {
					int LA5_33 = input.LA(4);
					if ( (LA5_33=='t') ) {
						int LA5_39 = input.LA(5);
						if ( ((LA5_39 >= '0' && LA5_39 <= '9')||(LA5_39 >= 'A' && LA5_39 <= 'Z')||LA5_39=='_'||(LA5_39 >= 'a' && LA5_39 <= 'z')) ) {
							alt5=20;
						}

						else {
							alt5=13;
						}

					}

					else {
						alt5=20;
					}

				}

				else {
					alt5=20;
				}

			}

			else {
				alt5=20;
			}

			}
			break;
		case 'm':
			{
			int LA5_13 = input.LA(2);
			if ( (LA5_13=='a') ) {
				int LA5_26 = input.LA(3);
				if ( (LA5_26=='i') ) {
					int LA5_34 = input.LA(4);
					if ( (LA5_34=='n') ) {
						int LA5_40 = input.LA(5);
						if ( ((LA5_40 >= '0' && LA5_40 <= '9')||(LA5_40 >= 'A' && LA5_40 <= 'Z')||LA5_40=='_'||(LA5_40 >= 'a' && LA5_40 <= 'z')) ) {
							alt5=20;
						}

						else {
							alt5=14;
						}

					}

					else {
						alt5=20;
					}

				}

				else {
					alt5=20;
				}

			}

			else {
				alt5=20;
			}

			}
			break;
		case 'p':
			{
			switch ( input.LA(2) ) {
			case 'a':
				{
				int LA5_27 = input.LA(3);
				if ( (LA5_27=='r') ) {
					int LA5_35 = input.LA(4);
					if ( (LA5_35=='s') ) {
						int LA5_41 = input.LA(5);
						if ( (LA5_41=='e') ) {
							int LA5_47 = input.LA(6);
							if ( ((LA5_47 >= '0' && LA5_47 <= '9')||(LA5_47 >= 'A' && LA5_47 <= 'Z')||LA5_47=='_'||(LA5_47 >= 'a' && LA5_47 <= 'z')) ) {
								alt5=20;
							}

							else {
								alt5=15;
							}

						}

						else {
							alt5=20;
						}

					}

					else {
						alt5=20;
					}

				}

				else {
					alt5=20;
				}

				}
				break;
			case 'r':
				{
				int LA5_28 = input.LA(3);
				if ( (LA5_28=='o') ) {
					int LA5_36 = input.LA(4);
					if ( (LA5_36=='c') ) {
						int LA5_42 = input.LA(5);
						if ( (LA5_42=='e') ) {
							int LA5_48 = input.LA(6);
							if ( (LA5_48=='d') ) {
								int LA5_52 = input.LA(7);
								if ( (LA5_52=='u') ) {
									int LA5_54 = input.LA(8);
									if ( (LA5_54=='r') ) {
										int LA5_56 = input.LA(9);
										if ( (LA5_56=='e') ) {
											int LA5_57 = input.LA(10);
											if ( ((LA5_57 >= '0' && LA5_57 <= '9')||(LA5_57 >= 'A' && LA5_57 <= 'Z')||LA5_57=='_'||(LA5_57 >= 'a' && LA5_57 <= 'z')) ) {
												alt5=20;
											}

											else {
												alt5=16;
											}

										}

										else {
											alt5=20;
										}

									}

									else {
										alt5=20;
									}

								}

								else {
									alt5=20;
								}

							}

							else {
								alt5=20;
							}

						}

						else {
							alt5=20;
						}

					}

					else {
						alt5=20;
					}

				}

				else {
					alt5=20;
				}

				}
				break;
			default:
				alt5=20;
			}
			}
			break;
		case '{':
			{
			alt5=17;
			}
			break;
		case '}':
			{
			alt5=18;
			}
			break;
		case '\"':
			{
			alt5=19;
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
		case 'n':
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
			alt5=20;
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
			alt5=21;
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
			alt5=22;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 5, 0, input);
			throw nvae;
		}
		switch (alt5) {
			case 1 :
				// /home/bardia/scrawl/scrawl.g:1:10: T__8
				{
				mT__8(); 

				}
				break;
			case 2 :
				// /home/bardia/scrawl/scrawl.g:1:15: T__9
				{
				mT__9(); 

				}
				break;
			case 3 :
				// /home/bardia/scrawl/scrawl.g:1:20: T__10
				{
				mT__10(); 

				}
				break;
			case 4 :
				// /home/bardia/scrawl/scrawl.g:1:26: T__11
				{
				mT__11(); 

				}
				break;
			case 5 :
				// /home/bardia/scrawl/scrawl.g:1:32: T__12
				{
				mT__12(); 

				}
				break;
			case 6 :
				// /home/bardia/scrawl/scrawl.g:1:38: T__13
				{
				mT__13(); 

				}
				break;
			case 7 :
				// /home/bardia/scrawl/scrawl.g:1:44: T__14
				{
				mT__14(); 

				}
				break;
			case 8 :
				// /home/bardia/scrawl/scrawl.g:1:50: T__15
				{
				mT__15(); 

				}
				break;
			case 9 :
				// /home/bardia/scrawl/scrawl.g:1:56: T__16
				{
				mT__16(); 

				}
				break;
			case 10 :
				// /home/bardia/scrawl/scrawl.g:1:62: T__17
				{
				mT__17(); 

				}
				break;
			case 11 :
				// /home/bardia/scrawl/scrawl.g:1:68: T__18
				{
				mT__18(); 

				}
				break;
			case 12 :
				// /home/bardia/scrawl/scrawl.g:1:74: T__19
				{
				mT__19(); 

				}
				break;
			case 13 :
				// /home/bardia/scrawl/scrawl.g:1:80: T__20
				{
				mT__20(); 

				}
				break;
			case 14 :
				// /home/bardia/scrawl/scrawl.g:1:86: T__21
				{
				mT__21(); 

				}
				break;
			case 15 :
				// /home/bardia/scrawl/scrawl.g:1:92: T__22
				{
				mT__22(); 

				}
				break;
			case 16 :
				// /home/bardia/scrawl/scrawl.g:1:98: T__23
				{
				mT__23(); 

				}
				break;
			case 17 :
				// /home/bardia/scrawl/scrawl.g:1:104: T__24
				{
				mT__24(); 

				}
				break;
			case 18 :
				// /home/bardia/scrawl/scrawl.g:1:110: T__25
				{
				mT__25(); 

				}
				break;
			case 19 :
				// /home/bardia/scrawl/scrawl.g:1:116: STRING
				{
				mSTRING(); 

				}
				break;
			case 20 :
				// /home/bardia/scrawl/scrawl.g:1:123: ID
				{
				mID(); 

				}
				break;
			case 21 :
				// /home/bardia/scrawl/scrawl.g:1:126: TAG
				{
				mTAG(); 

				}
				break;
			case 22 :
				// /home/bardia/scrawl/scrawl.g:1:130: NUMBER
				{
				mNUMBER(); 

				}
				break;

		}
	}



}
