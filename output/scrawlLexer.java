// $ANTLR 3.5.1 /home/bardia/scrawl/scrawl.g 2016-01-04 17:22:52

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
	public static final int PATH=4;

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
			// /home/bardia/scrawl/scrawl.g:2:6: ( 'in' )
			// /home/bardia/scrawl/scrawl.g:2:8: 'in'
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
			// /home/bardia/scrawl/scrawl.g:4:6: ( '{' )
			// /home/bardia/scrawl/scrawl.g:4:8: '{'
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
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:5:6: ( '}' )
			// /home/bardia/scrawl/scrawl.g:5:8: '}'
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
	// $ANTLR end "T__8"

	// $ANTLR start "PATH"
	public final void mPATH() throws RecognitionException {
		try {
			int _type = PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/bardia/scrawl/scrawl.g:22:6: ( '\"' ( . )* '\"' )
			// /home/bardia/scrawl/scrawl.g:22:9: '\"' ( . )* '\"'
			{
			match('\"'); 
			// /home/bardia/scrawl/scrawl.g:22:13: ( . )*
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
					// /home/bardia/scrawl/scrawl.g:22:13: .
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
	// $ANTLR end "PATH"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/bardia/scrawl/scrawl.g:1:8: ( T__5 | T__6 | T__7 | T__8 | PATH )
		int alt2=5;
		switch ( input.LA(1) ) {
		case 'i':
			{
			alt2=1;
			}
			break;
		case 'm':
			{
			alt2=2;
			}
			break;
		case '{':
			{
			alt2=3;
			}
			break;
		case '}':
			{
			alt2=4;
			}
			break;
		case '\"':
			{
			alt2=5;
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
				// /home/bardia/scrawl/scrawl.g:1:30: PATH
				{
				mPATH(); 

				}
				break;

		}
	}



}
