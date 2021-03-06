// $ANTLR 3.5.2 org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g 2018-10-20 15:11:54

package org.meri.antlr_step_by_step.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class S007BooleanWithFunctionsParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL", "AND", "ATLEASTONE", "LPAREN", 
		"NAME", "NEITHER", "NOT", "NOTALL", "OR", "RPAREN", "WS", "','"
	};
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

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public S007BooleanWithFunctionsParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public S007BooleanWithFunctionsParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return S007BooleanWithFunctionsParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g"; }


	  //override method
	  public void reportError(RecognitionException e) {
	    displayRecognitionError(this.getTokenNames(), e);
	  }
	  


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:63:1: expression : andexpression ;
	public final S007BooleanWithFunctionsParser.expression_return expression() throws RecognitionException {
		S007BooleanWithFunctionsParser.expression_return retval = new S007BooleanWithFunctionsParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope andexpression1 =null;


		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:63:12: ( andexpression )
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:63:14: andexpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andexpression_in_expression202);
			andexpression1=andexpression();
			state._fsp--;

			adaptor.addChild(root_0, andexpression1.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class andexpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "andexpression"
	// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:65:1: andexpression : orexpression ( AND ^ orexpression )* ;
	public final S007BooleanWithFunctionsParser.andexpression_return andexpression() throws RecognitionException {
		S007BooleanWithFunctionsParser.andexpression_return retval = new S007BooleanWithFunctionsParser.andexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND3=null;
		ParserRuleReturnScope orexpression2 =null;
		ParserRuleReturnScope orexpression4 =null;

		Object AND3_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:65:15: ( orexpression ( AND ^ orexpression )* )
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:65:17: orexpression ( AND ^ orexpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_orexpression_in_andexpression210);
			orexpression2=orexpression();
			state._fsp--;

			adaptor.addChild(root_0, orexpression2.getTree());

			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:65:30: ( AND ^ orexpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:65:31: AND ^ orexpression
					{
					AND3=(Token)match(input,AND,FOLLOW_AND_in_andexpression213); 
					AND3_tree = (Object)adaptor.create(AND3);
					root_0 = (Object)adaptor.becomeRoot(AND3_tree, root_0);

					pushFollow(FOLLOW_orexpression_in_andexpression216);
					orexpression4=orexpression();
					state._fsp--;

					adaptor.addChild(root_0, orexpression4.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "andexpression"


	public static class orexpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orexpression"
	// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:67:1: orexpression : notexpression ( OR ^ notexpression )* ;
	public final S007BooleanWithFunctionsParser.orexpression_return orexpression() throws RecognitionException {
		S007BooleanWithFunctionsParser.orexpression_return retval = new S007BooleanWithFunctionsParser.orexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR6=null;
		ParserRuleReturnScope notexpression5 =null;
		ParserRuleReturnScope notexpression7 =null;

		Object OR6_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:67:14: ( notexpression ( OR ^ notexpression )* )
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:67:16: notexpression ( OR ^ notexpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_notexpression_in_orexpression226);
			notexpression5=notexpression();
			state._fsp--;

			adaptor.addChild(root_0, notexpression5.getTree());

			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:67:30: ( OR ^ notexpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==OR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:67:31: OR ^ notexpression
					{
					OR6=(Token)match(input,OR,FOLLOW_OR_in_orexpression229); 
					OR6_tree = (Object)adaptor.create(OR6);
					root_0 = (Object)adaptor.becomeRoot(OR6_tree, root_0);

					pushFollow(FOLLOW_notexpression_in_orexpression232);
					notexpression7=notexpression();
					state._fsp--;

					adaptor.addChild(root_0, notexpression7.getTree());

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orexpression"


	public static class notexpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "notexpression"
	// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:69:1: notexpression : ( NOT ^ atom | atom );
	public final S007BooleanWithFunctionsParser.notexpression_return notexpression() throws RecognitionException {
		S007BooleanWithFunctionsParser.notexpression_return retval = new S007BooleanWithFunctionsParser.notexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT8=null;
		ParserRuleReturnScope atom9 =null;
		ParserRuleReturnScope atom10 =null;

		Object NOT8_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:69:15: ( NOT ^ atom | atom )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==NOT) ) {
				alt3=1;
			}
			else if ( (LA3_0==ALL||(LA3_0 >= ATLEASTONE && LA3_0 <= NEITHER)||LA3_0==NOTALL) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:69:17: NOT ^ atom
					{
					root_0 = (Object)adaptor.nil();


					NOT8=(Token)match(input,NOT,FOLLOW_NOT_in_notexpression242); 
					NOT8_tree = (Object)adaptor.create(NOT8);
					root_0 = (Object)adaptor.becomeRoot(NOT8_tree, root_0);

					pushFollow(FOLLOW_atom_in_notexpression245);
					atom9=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom9.getTree());

					}
					break;
				case 2 :
					// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:69:29: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_notexpression249);
					atom10=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom10.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notexpression"


	public static class atom_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:71:1: atom : ( function | NAME | LPAREN ! andexpression RPAREN !);
	public final S007BooleanWithFunctionsParser.atom_return atom() throws RecognitionException {
		S007BooleanWithFunctionsParser.atom_return retval = new S007BooleanWithFunctionsParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME12=null;
		Token LPAREN13=null;
		Token RPAREN15=null;
		ParserRuleReturnScope function11 =null;
		ParserRuleReturnScope andexpression14 =null;

		Object NAME12_tree=null;
		Object LPAREN13_tree=null;
		Object RPAREN15_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:71:6: ( function | NAME | LPAREN ! andexpression RPAREN !)
			int alt4=3;
			switch ( input.LA(1) ) {
			case ALL:
			case ATLEASTONE:
			case NEITHER:
			case NOTALL:
				{
				alt4=1;
				}
				break;
			case NAME:
				{
				alt4=2;
				}
				break;
			case LPAREN:
				{
				alt4=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:71:8: function
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_in_atom257);
					function11=function();
					state._fsp--;

					adaptor.addChild(root_0, function11.getTree());

					}
					break;
				case 2 :
					// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:71:19: NAME
					{
					root_0 = (Object)adaptor.nil();


					NAME12=(Token)match(input,NAME,FOLLOW_NAME_in_atom261); 
					NAME12_tree = (Object)adaptor.create(NAME12);
					adaptor.addChild(root_0, NAME12_tree);

					}
					break;
				case 3 :
					// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:71:26: LPAREN ! andexpression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN13=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom265); 
					pushFollow(FOLLOW_andexpression_in_atom268);
					andexpression14=andexpression();
					state._fsp--;

					adaptor.addChild(root_0, andexpression14.getTree());

					RPAREN15=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom270); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:73:1: function : functionname ^ arguments ;
	public final S007BooleanWithFunctionsParser.function_return function() throws RecognitionException {
		S007BooleanWithFunctionsParser.function_return retval = new S007BooleanWithFunctionsParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope functionname16 =null;
		ParserRuleReturnScope arguments17 =null;


		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:73:10: ( functionname ^ arguments )
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:73:12: functionname ^ arguments
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_functionname_in_function279);
			functionname16=functionname();
			state._fsp--;

			root_0 = (Object)adaptor.becomeRoot(functionname16.getTree(), root_0);
			pushFollow(FOLLOW_arguments_in_function282);
			arguments17=arguments();
			state._fsp--;

			adaptor.addChild(root_0, arguments17.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class functionname_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionname"
	// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:74:1: functionname : ( ALL | ATLEASTONE | NEITHER | NOTALL );
	public final S007BooleanWithFunctionsParser.functionname_return functionname() throws RecognitionException {
		S007BooleanWithFunctionsParser.functionname_return retval = new S007BooleanWithFunctionsParser.functionname_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set18=null;

		Object set18_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:74:14: ( ALL | ATLEASTONE | NEITHER | NOTALL )
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:
			{
			root_0 = (Object)adaptor.nil();


			set18=input.LT(1);
			if ( input.LA(1)==ALL||input.LA(1)==ATLEASTONE||input.LA(1)==NEITHER||input.LA(1)==NOTALL ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set18));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionname"


	public static class arguments_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:75:1: arguments : LPAREN ! andexpression ( ',' ! andexpression )* RPAREN !;
	public final S007BooleanWithFunctionsParser.arguments_return arguments() throws RecognitionException {
		S007BooleanWithFunctionsParser.arguments_return retval = new S007BooleanWithFunctionsParser.arguments_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN19=null;
		Token char_literal21=null;
		Token RPAREN23=null;
		ParserRuleReturnScope andexpression20 =null;
		ParserRuleReturnScope andexpression22 =null;

		Object LPAREN19_tree=null;
		Object char_literal21_tree=null;
		Object RPAREN23_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:75:11: ( LPAREN ! andexpression ( ',' ! andexpression )* RPAREN !)
			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:75:13: LPAREN ! andexpression ( ',' ! andexpression )* RPAREN !
			{
			root_0 = (Object)adaptor.nil();


			LPAREN19=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments309); 
			pushFollow(FOLLOW_andexpression_in_arguments312);
			andexpression20=andexpression();
			state._fsp--;

			adaptor.addChild(root_0, andexpression20.getTree());

			// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:75:35: ( ',' ! andexpression )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==15) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S007BooleanWithFunctions.g:75:36: ',' ! andexpression
					{
					char_literal21=(Token)match(input,15,FOLLOW_15_in_arguments315); 
					pushFollow(FOLLOW_andexpression_in_arguments318);
					andexpression22=andexpression();
					state._fsp--;

					adaptor.addChild(root_0, andexpression22.getTree());

					}
					break;

				default :
					break loop5;
				}
			}

			RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments322); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arguments"

	// Delegated rules



	public static final BitSet FOLLOW_andexpression_in_expression202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orexpression_in_andexpression210 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_andexpression213 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_orexpression_in_andexpression216 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_notexpression_in_orexpression226 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_OR_in_orexpression229 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_notexpression_in_orexpression232 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_NOT_in_notexpression242 = new BitSet(new long[]{0x0000000000000BD0L});
	public static final BitSet FOLLOW_atom_in_notexpression245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_notexpression249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_atom257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atom261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom265 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_atom268 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RPAREN_in_atom270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionname_in_function279 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_arguments_in_function282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_arguments309 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_arguments312 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_15_in_arguments315 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_arguments318 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_RPAREN_in_arguments322 = new BitSet(new long[]{0x0000000000000002L});
}
