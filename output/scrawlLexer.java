// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 14:43:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class scrawlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int ID=4;

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

	// $ANTLR start "T__5"
	public final void mT__5() throws RecognitionException {
		try {
			int _type = T__5;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:2:6: ( ';' )
			// /home/bardia/scrawl/scrawl.g:2:8: ';'
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
	// $ANTLR end "T__5"

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:3:6: ( 'main' )
			// /home/bardia/scrawl/scrawl.g:3:8: 'main'
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
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:4:6: ( 'procedure' )
			// /home/bardia/scrawl/scrawl.g:4:8: 'procedure'
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
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:5:6: ( '{' )
			// /home/bardia/scrawl/scrawl.g:5:8: '{'
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
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:6:6: ( '}' )
			// /home/bardia/scrawl/scrawl.g:6:8: '}'
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
	// $ANTLR end "T__9"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:21:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /home/bardia/scrawl/scrawl.g:21:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/bardia/scrawl/scrawl.g:21:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
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
					break loop1;
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

	@Override
	public void mTokens() throws RecognitionException {
		// /home/bardia/scrawl/scrawl.g:1:8: ( T__5 | T__6 | T__7 | T__8 | T__9 | ID )
		int alt2=6;
		switch ( input.LA(1) ) {
		case ';':
			{
			alt2=1;
			}
			break;
		case 'm':
			{
			int LA2_2 = input.LA(2);
			if ( (LA2_2=='a') ) {
				int LA2_7 = input.LA(3);
				if ( (LA2_7=='i') ) {
					int LA2_9 = input.LA(4);
					if ( (LA2_9=='n') ) {
						int LA2_11 = input.LA(5);
						if ( ((LA2_11 >= '0' && LA2_11 <= '9')||(LA2_11 >= 'A' && LA2_11 <= 'Z')||LA2_11=='_'||(LA2_11 >= 'a' && LA2_11 <= 'z')) ) {
							alt2=6;
						}

						else {
							alt2=2;
						}

					}

					else {
						alt2=6;
					}

				}

				else {
					alt2=6;
				}

			}

			else {
				alt2=6;
			}

			}
			break;
		case 'p':
			{
			int LA2_3 = input.LA(2);
			if ( (LA2_3=='r') ) {
				int LA2_8 = input.LA(3);
				if ( (LA2_8=='o') ) {
					int LA2_10 = input.LA(4);
					if ( (LA2_10=='c') ) {
						int LA2_12 = input.LA(5);
						if ( (LA2_12=='e') ) {
							int LA2_14 = input.LA(6);
							if ( (LA2_14=='d') ) {
								int LA2_15 = input.LA(7);
								if ( (LA2_15=='u') ) {
									int LA2_16 = input.LA(8);
									if ( (LA2_16=='r') ) {
										int LA2_17 = input.LA(9);
										if ( (LA2_17=='e') ) {
											int LA2_18 = input.LA(10);
											if ( ((LA2_18 >= '0' && LA2_18 <= '9')||(LA2_18 >= 'A' && LA2_18 <= 'Z')||LA2_18=='_'||(LA2_18 >= 'a' && LA2_18 <= 'z')) ) {
												alt2=6;
											}

											else {
												alt2=3;
											}

										}

										else {
											alt2=6;
										}

									}

									else {
										alt2=6;
									}

								}

								else {
									alt2=6;
								}

							}

							else {
								alt2=6;
							}

						}

						else {
							alt2=6;
						}

					}

					else {
						alt2=6;
					}

				}

				else {
					alt2=6;
				}

			}

			else {
				alt2=6;
			}

			}
			break;
		case '{':
			{
			alt2=4;
			}
			break;
		case '}':
			{
			alt2=5;
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
			alt2=6;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 2, 0, input);
			throw nvae;
		}
		switch (alt2) {
			case 1 :
				// /home/bardia/scrawl/scrawl.g:1:10: T__5
				{
				mT__5(); 

				}
				break;
			case 2 :
				// /home/bardia/scrawl/scrawl.g:1:15: T__6
				{
				mT__6(); 

				}
				break;
			case 3 :
				// /home/bardia/scrawl/scrawl.g:1:20: T__7
				{
				mT__7(); 

				}
				break;
			case 4 :
				// /home/bardia/scrawl/scrawl.g:1:25: T__8
				{
				mT__8(); 

				}
				break;
			case 5 :
				// /home/bardia/scrawl/scrawl.g:1:30: T__9
				{
				mT__9(); 

				}
				break;
			case 6 :
				// /home/bardia/scrawl/scrawl.g:1:35: ID
				{
				mID(); 

				}
				break;

		}
	}



}
