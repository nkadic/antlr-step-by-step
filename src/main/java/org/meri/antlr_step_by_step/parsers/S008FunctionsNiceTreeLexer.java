// $ANTLR 3.5.2 org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g 2018-10-20 15:11:55

package org.meri.antlr_step_by_step.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class S008FunctionsNiceTreeLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__15=15;
	public static final int ALL=4;
	public static final int AND=5;
	public static final int ATLEASTONE=6;
	public static final int LPAREN=7;
	public static final int NAME=8;
	public static final int NEITHER=9;
	public static final int NOT=10;
	public static final int NOTALL=11;
	public static final int OR=12;
	public static final int RPAREN=13;
	public static final int WS=14;

	  //override method
	  public void reportError(RecognitionException e) {
	    displayRecognitionError(this.getTokenNames(), e);
	  }
	  


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public S008FunctionsNiceTreeLexer() {} 
	public S008FunctionsNiceTreeLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public S008FunctionsNiceTreeLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g"; }

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:18:7: ( ',' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:18:9: ','
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
	// $ANTLR end "T__15"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:43:8: ( '(' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:43:10: '('
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
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:44:8: ( ')' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:44:10: ')'
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
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:45:5: ( '&&' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:45:7: '&&'
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
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:46:4: ( '||' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:46:6: '||'
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
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:47:5: ( '!' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:47:7: '!'
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

	// $ANTLR start "ALL"
	public final void mALL() throws RecognitionException {
		try {
			int _type = ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:49:5: ( 'all' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:49:7: 'all'
			{
			match("all"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALL"

	// $ANTLR start "ATLEASTONE"
	public final void mATLEASTONE() throws RecognitionException {
		try {
			int _type = ATLEASTONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:50:12: ( 'atleastone' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:50:14: 'atleastone'
			{
			match("atleastone"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ATLEASTONE"

	// $ANTLR start "NEITHER"
	public final void mNEITHER() throws RecognitionException {
		try {
			int _type = NEITHER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:51:9: ( 'neither' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:51:11: 'neither'
			{
			match("neither"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEITHER"

	// $ANTLR start "NOTALL"
	public final void mNOTALL() throws RecognitionException {
		try {
			int _type = NOTALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:52:8: ( 'notall' )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:52:10: 'notall'
			{
			match("notall"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTALL"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:54:6: ( ( 'a' .. 'z' | '0' .. '9' )+ )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:54:8: ( 'a' .. 'z' | '0' .. '9' )+
			{
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:54:8: ( 'a' .. 'z' | '0' .. '9' )+
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
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:
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
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:55:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:55:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:55:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:
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
		// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:8: ( T__15 | LPAREN | RPAREN | AND | OR | NOT | ALL | ATLEASTONE | NEITHER | NOTALL | NAME | WS )
		int alt3=12;
		switch ( input.LA(1) ) {
		case ',':
			{
			alt3=1;
			}
			break;
		case '(':
			{
			alt3=2;
			}
			break;
		case ')':
			{
			alt3=3;
			}
			break;
		case '&':
			{
			alt3=4;
			}
			break;
		case '|':
			{
			alt3=5;
			}
			break;
		case '!':
			{
			alt3=6;
			}
			break;
		case 'a':
			{
			switch ( input.LA(2) ) {
			case 'l':
				{
				int LA3_11 = input.LA(3);
				if ( (LA3_11=='l') ) {
					int LA3_15 = input.LA(4);
					if ( ((LA3_15 >= '0' && LA3_15 <= '9')||(LA3_15 >= 'a' && LA3_15 <= 'z')) ) {
						alt3=11;
					}

					else {
						alt3=7;
					}

				}

				else {
					alt3=11;
				}

				}
				break;
			case 't':
				{
				int LA3_12 = input.LA(3);
				if ( (LA3_12=='l') ) {
					int LA3_16 = input.LA(4);
					if ( (LA3_16=='e') ) {
						int LA3_20 = input.LA(5);
						if ( (LA3_20=='a') ) {
							int LA3_23 = input.LA(6);
							if ( (LA3_23=='s') ) {
								int LA3_26 = input.LA(7);
								if ( (LA3_26=='t') ) {
									int LA3_29 = input.LA(8);
									if ( (LA3_29=='o') ) {
										int LA3_32 = input.LA(9);
										if ( (LA3_32=='n') ) {
											int LA3_34 = input.LA(10);
											if ( (LA3_34=='e') ) {
												int LA3_35 = input.LA(11);
												if ( ((LA3_35 >= '0' && LA3_35 <= '9')||(LA3_35 >= 'a' && LA3_35 <= 'z')) ) {
													alt3=11;
												}

												else {
													alt3=8;
												}

											}

											else {
												alt3=11;
											}

										}

										else {
											alt3=11;
										}

									}

									else {
										alt3=11;
									}

								}

								else {
									alt3=11;
								}

							}

							else {
								alt3=11;
							}

						}

						else {
							alt3=11;
						}

					}

					else {
						alt3=11;
					}

				}

				else {
					alt3=11;
				}

				}
				break;
			default:
				alt3=11;
			}
			}
			break;
		case 'n':
			{
			switch ( input.LA(2) ) {
			case 'e':
				{
				int LA3_13 = input.LA(3);
				if ( (LA3_13=='i') ) {
					int LA3_17 = input.LA(4);
					if ( (LA3_17=='t') ) {
						int LA3_21 = input.LA(5);
						if ( (LA3_21=='h') ) {
							int LA3_24 = input.LA(6);
							if ( (LA3_24=='e') ) {
								int LA3_27 = input.LA(7);
								if ( (LA3_27=='r') ) {
									int LA3_30 = input.LA(8);
									if ( ((LA3_30 >= '0' && LA3_30 <= '9')||(LA3_30 >= 'a' && LA3_30 <= 'z')) ) {
										alt3=11;
									}

									else {
										alt3=9;
									}

								}

								else {
									alt3=11;
								}

							}

							else {
								alt3=11;
							}

						}

						else {
							alt3=11;
						}

					}

					else {
						alt3=11;
					}

				}

				else {
					alt3=11;
				}

				}
				break;
			case 'o':
				{
				int LA3_14 = input.LA(3);
				if ( (LA3_14=='t') ) {
					int LA3_18 = input.LA(4);
					if ( (LA3_18=='a') ) {
						int LA3_22 = input.LA(5);
						if ( (LA3_22=='l') ) {
							int LA3_25 = input.LA(6);
							if ( (LA3_25=='l') ) {
								int LA3_28 = input.LA(7);
								if ( ((LA3_28 >= '0' && LA3_28 <= '9')||(LA3_28 >= 'a' && LA3_28 <= 'z')) ) {
									alt3=11;
								}

								else {
									alt3=10;
								}

							}

							else {
								alt3=11;
							}

						}

						else {
							alt3=11;
						}

					}

					else {
						alt3=11;
					}

				}

				else {
					alt3=11;
				}

				}
				break;
			default:
				alt3=11;
			}
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
			alt3=11;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt3=12;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 3, 0, input);
			throw nvae;
		}
		switch (alt3) {
			case 1 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:10: T__15
				{
				mT__15(); 

				}
				break;
			case 2 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:16: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 3 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:23: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 4 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:30: AND
				{
				mAND(); 

				}
				break;
			case 5 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:34: OR
				{
				mOR(); 

				}
				break;
			case 6 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:37: NOT
				{
				mNOT(); 

				}
				break;
			case 7 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:41: ALL
				{
				mALL(); 

				}
				break;
			case 8 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:45: ATLEASTONE
				{
				mATLEASTONE(); 

				}
				break;
			case 9 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:56: NEITHER
				{
				mNEITHER(); 

				}
				break;
			case 10 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:64: NOTALL
				{
				mNOTALL(); 

				}
				break;
			case 11 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:71: NAME
				{
				mNAME(); 

				}
				break;
			case 12 :
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:1:76: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
