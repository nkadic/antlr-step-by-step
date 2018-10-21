// $ANTLR 3.5.2 org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g 2018-10-21 20:12:26

package org.meri.antlr_step_by_step.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class S006SimpleBooleanLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int LPAREN=5;
	public static final int NAME=6;
	public static final int NOT=7;
	public static final int OR=8;
	public static final int RPAREN=9;
	public static final int WS=10;

	  //override method
	  public void reportError(RecognitionException e) {
	    displayRecognitionError(this.getTokenNames(), e);
	  }
	  


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public S006SimpleBooleanLexer() {} 
	public S006SimpleBooleanLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public S006SimpleBooleanLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g"; }

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:43:8: ( '(' )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:43:10: '('
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
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:44:8: ( ')' )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:44:10: ')'
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
	// $ANTLR end "RPAREN"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:45:5: ( '&&' )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:45:7: '&&'
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
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:46:4: ( '||' )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:46:6: '||'
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
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:47:5: ( '!' )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:47:7: '!'
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

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:48:6: ( ( 'a' .. 'z' | '0' .. '9' )+ )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:48:8: ( 'a' .. 'z' | '0' .. '9' )+
			{
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:48:8: ( 'a' .. 'z' | '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:49:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:49:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:49:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:1:8: ( LPAREN | RPAREN | AND | OR | NOT | NAME | WS )
		int alt3=7;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt3=1;
			}
			break;
		case ')':
			{
			alt3=2;
			}
			break;
		case '&':
			{
			alt3=3;
			}
			break;
		case '|':
			{
			alt3=4;
			}
			break;
		case '!':
			{
			alt3=5;
			}
			break;
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
			alt3=6;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=7;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:1:10: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 2 :
				// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:1:17: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 3 :
				// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:1:24: AND
				{
				mAND(); 

				}
				break;
			case 4 :
				// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:1:28: OR
				{
				mOR(); 

				}
				break;
			case 5 :
				// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:1:31: NOT
				{
				mNOT(); 

				}
				break;
			case 6 :
				// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:1:35: NAME
				{
				mNAME(); 

				}
				break;
			case 7 :
				// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:1:40: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
