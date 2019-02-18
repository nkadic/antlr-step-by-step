// $ANTLR 3.5.2 org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g 2018-10-20 15:11:55

package org.meri.antlr_step_by_step.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class S004HelloWordWithErrorHandlingLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ENDSYMBOL=4;
	public static final int SALUTATION=5;

	  //add new field
	  private List<RecognitionException> errors = new ArrayList<RecognitionException>();
	  
	  //add new method
	  public List<RecognitionException> getAllErrors() {
	    return new ArrayList<RecognitionException>(errors);
	  }

	  //add new method
	  public boolean hasErrors() {
	    return !errors.isEmpty();
	  }
	  
	  //override method
	  public void reportError(RecognitionException e) {
	    errors.add(e);
		displayRecognitionError(this.getTokenNames(), e);
	  }
	  


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public S004HelloWordWithErrorHandlingLexer() {} 
	public S004HelloWordWithErrorHandlingLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public S004HelloWordWithErrorHandlingLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g"; }

	// $ANTLR start "SALUTATION"
	public final void mSALUTATION() throws RecognitionException {
		try {
			int _type = SALUTATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g:71:11: ( 'Hello word' )
			// org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g:71:12: 'Hello word'
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
			// org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g:72:10: ( '!' )
			// org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g:72:11: '!'
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
		// org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g:1:8: ( SALUTATION | ENDSYMBOL )
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
				// org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g:1:10: SALUTATION
				{
				mSALUTATION(); 

				}
				break;
			case 2 :
				// org\\meri\\antlr_step_by_step\\parsers\\S004HelloWordWithErrorHandling.g:1:21: ENDSYMBOL
				{
				mENDSYMBOL(); 

				}
				break;

		}
	}



}
