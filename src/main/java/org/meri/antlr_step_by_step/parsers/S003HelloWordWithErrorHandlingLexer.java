// $ANTLR 3.5.2 org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g 2018-10-21 20:12:26

package org.meri.antlr_step_by_step.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class S003HelloWordWithErrorHandlingLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ENDSYMBOL=4;
	public static final int SALUTATION=5;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public S003HelloWordWithErrorHandlingLexer() {} 
	public S003HelloWordWithErrorHandlingLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public S003HelloWordWithErrorHandlingLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g"; }

	// $ANTLR start "SALUTATION"
	public final void mSALUTATION() throws RecognitionException {
		try {
			int _type = SALUTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:34:11: ( 'Hello word' )
			// org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:34:12: 'Hello word'
			{
			match("Hello word"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SALUTATION"

	// $ANTLR start "ENDSYMBOL"
	public final void mENDSYMBOL() throws RecognitionException {
		try {
			int _type = ENDSYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:35:10: ( '!' )
			// org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:35:11: '!'
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
	// $ANTLR end "ENDSYMBOL"

	@Override
	public void mTokens() throws RecognitionException {
		// org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:1:8: ( SALUTATION | ENDSYMBOL )
		int alt1=2;
		int LA1_0 = input.LA(1);
		if ( (LA1_0=='H') ) {
			alt1=1;
		}
		else if ( (LA1_0=='!') ) {
			alt1=2;
		}

		else {
			NoViableAltException nvae =
				new NoViableAltException("", 1, 0, input);
			throw nvae;
		}

		switch (alt1) {
			case 1 :
				// org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:1:10: SALUTATION
				{
				mSALUTATION(); 

				}
				break;
			case 2 :
				// org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:1:21: ENDSYMBOL
				{
				mENDSYMBOL(); 

				}
				break;

		}
	}



}
