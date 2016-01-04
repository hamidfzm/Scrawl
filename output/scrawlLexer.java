// $ANTLR 3.5.1 scrawl__.g 2016-01-04 17:13:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class scrawlLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__4=4;
	public static final int T__5=5;
	public static final int T__6=6;
	public static final int T__7=7;

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
	@Override public String getGrammarFileName() { return "scrawl__.g"; }

	// $ANTLR start "T__4"
	public final void mT__4() throws RecognitionException {
		try {
			int _type = T__4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// scrawl__.g:2:6: ( ';' )
			// scrawl__.g:2:8: ';'
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
	// $ANTLR end "T__4"

	// $ANTLR start "T__5"
	public final void mT__5() throws RecognitionException {
		try {
			int _type = T__5;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// scrawl__.g:3:6: ( 'main' )
			// scrawl__.g:3:8: 'main'
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
	// $ANTLR end "T__5"

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// scrawl__.g:4:6: ( '{' )
			// scrawl__.g:4:8: '{'
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
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// scrawl__.g:5:6: ( '}' )
			// scrawl__.g:5:8: '}'
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
	// $ANTLR end "T__7"

	@Override
	public void mTokens() throws RecognitionException {
		// scrawl__.g:1:8: ( T__4 | T__5 | T__6 | T__7 )
		int alt1=4;
		switch ( input.LA(1) ) {
		case ';':
			{
			alt1=1;
			}
			break;
		case 'm':
			{
			alt1=2;
			}
			break;
		case '{':
			{
			alt1=3;
			}
			break;
		case '}':
			{
			alt1=4;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 1, 0, input);
			throw nvae;
		}
		switch (alt1) {
			case 1 :
				// scrawl__.g:1:10: T__4
				{
				mT__4(); 

				}
				break;
			case 2 :
				// scrawl__.g:1:15: T__5
				{
				mT__5(); 

				}
				break;
			case 3 :
				// scrawl__.g:1:20: T__6
				{
				mT__6(); 

				}
				break;
			case 4 :
				// scrawl__.g:1:25: T__7
				{
				mT__7(); 

				}
				break;

		}
	}



}
