// $ANTLR 3.5.2 org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g 2018-10-21 20:12:26

package org.meri.antlr_step_by_step.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class S006SimpleBooleanParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "LPAREN", "NAME", "NOT", 
		"OR", "RPAREN", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int LPAREN=5;
	public static final int NAME=6;
	public static final int NOT=7;
	public static final int OR=8;
	public static final int RPAREN=9;
	public static final int WS=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public S006SimpleBooleanParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public S006SimpleBooleanParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return S006SimpleBooleanParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g"; }


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
	// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:57:1: expression : andexpression ;
	public final S006SimpleBooleanParser.expression_return expression() throws RecognitionException {
		S006SimpleBooleanParser.expression_return retval = new S006SimpleBooleanParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope andexpression1 =null;


		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:57:12: ( andexpression )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:57:14: andexpression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_andexpression_in_expression172);
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
	// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:59:1: andexpression : orexpression ( AND ^ orexpression )* ;
	public final S006SimpleBooleanParser.andexpression_return andexpression() throws RecognitionException {
		S006SimpleBooleanParser.andexpression_return retval = new S006SimpleBooleanParser.andexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND3=null;
		ParserRuleReturnScope orexpression2 =null;
		ParserRuleReturnScope orexpression4 =null;

		Object AND3_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:59:15: ( orexpression ( AND ^ orexpression )* )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:59:17: orexpression ( AND ^ orexpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_orexpression_in_andexpression180);
			orexpression2=orexpression();
			state._fsp--;

			adaptor.addChild(root_0, orexpression2.getTree());

			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:59:30: ( AND ^ orexpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:59:31: AND ^ orexpression
					{
					AND3=(Token)match(input,AND,FOLLOW_AND_in_andexpression183); 
					AND3_tree = (Object)adaptor.create(AND3);
					root_0 = (Object)adaptor.becomeRoot(AND3_tree, root_0);

					pushFollow(FOLLOW_orexpression_in_andexpression186);
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
	// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:61:1: orexpression : notexpression ( OR ^ notexpression )* ;
	public final S006SimpleBooleanParser.orexpression_return orexpression() throws RecognitionException {
		S006SimpleBooleanParser.orexpression_return retval = new S006SimpleBooleanParser.orexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR6=null;
		ParserRuleReturnScope notexpression5 =null;
		ParserRuleReturnScope notexpression7 =null;

		Object OR6_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:61:14: ( notexpression ( OR ^ notexpression )* )
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:61:16: notexpression ( OR ^ notexpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_notexpression_in_orexpression196);
			notexpression5=notexpression();
			state._fsp--;

			adaptor.addChild(root_0, notexpression5.getTree());

			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:61:30: ( OR ^ notexpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==OR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:61:31: OR ^ notexpression
					{
					OR6=(Token)match(input,OR,FOLLOW_OR_in_orexpression199); 
					OR6_tree = (Object)adaptor.create(OR6);
					root_0 = (Object)adaptor.becomeRoot(OR6_tree, root_0);

					pushFollow(FOLLOW_notexpression_in_orexpression202);
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
	// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:63:1: notexpression : ( NOT ^ atom | atom );
	public final S006SimpleBooleanParser.notexpression_return notexpression() throws RecognitionException {
		S006SimpleBooleanParser.notexpression_return retval = new S006SimpleBooleanParser.notexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT8=null;
		ParserRuleReturnScope atom9 =null;
		ParserRuleReturnScope atom10 =null;

		Object NOT8_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:63:15: ( NOT ^ atom | atom )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==NOT) ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= LPAREN && LA3_0 <= NAME)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:63:17: NOT ^ atom
					{
					root_0 = (Object)adaptor.nil();


					NOT8=(Token)match(input,NOT,FOLLOW_NOT_in_notexpression212); 
					NOT8_tree = (Object)adaptor.create(NOT8);
					root_0 = (Object)adaptor.becomeRoot(NOT8_tree, root_0);

					pushFollow(FOLLOW_atom_in_notexpression215);
					atom9=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom9.getTree());

					}
					break;
				case 2 :
					// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:63:29: atom
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atom_in_notexpression219);
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
	// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:65:1: atom : ( NAME | LPAREN ! andexpression RPAREN !);
	public final S006SimpleBooleanParser.atom_return atom() throws RecognitionException {
		S006SimpleBooleanParser.atom_return retval = new S006SimpleBooleanParser.atom_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NAME11=null;
		Token LPAREN12=null;
		Token RPAREN14=null;
		ParserRuleReturnScope andexpression13 =null;

		Object NAME11_tree=null;
		Object LPAREN12_tree=null;
		Object RPAREN14_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:65:6: ( NAME | LPAREN ! andexpression RPAREN !)
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==NAME) ) {
				alt4=1;
			}
			else if ( (LA4_0==LPAREN) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:65:8: NAME
					{
					root_0 = (Object)adaptor.nil();


					NAME11=(Token)match(input,NAME,FOLLOW_NAME_in_atom227); 
					NAME11_tree = (Object)adaptor.create(NAME11);
					adaptor.addChild(root_0, NAME11_tree);

					}
					break;
				case 2 :
					// org\\meri\\antlr_step_by_step\\parsers\\S006SimpleBoolean.g:65:15: LPAREN ! andexpression RPAREN !
					{
					root_0 = (Object)adaptor.nil();


					LPAREN12=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atom231); 
					pushFollow(FOLLOW_andexpression_in_atom234);
					andexpression13=andexpression();
					state._fsp--;

					adaptor.addChild(root_0, andexpression13.getTree());

					RPAREN14=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atom236); 
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

	// Delegated rules



	public static final BitSet FOLLOW_andexpression_in_expression172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orexpression_in_andexpression180 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_andexpression183 = new BitSet(new long[]{0x00000000000000E0L});
	public static final BitSet FOLLOW_orexpression_in_andexpression186 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_notexpression_in_orexpression196 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_OR_in_orexpression199 = new BitSet(new long[]{0x00000000000000E0L});
	public static final BitSet FOLLOW_notexpression_in_orexpression202 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_NOT_in_notexpression212 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_atom_in_notexpression215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_notexpression219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAME_in_atom227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atom231 = new BitSet(new long[]{0x00000000000000E0L});
	public static final BitSet FOLLOW_andexpression_in_atom234 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_RPAREN_in_atom236 = new BitSet(new long[]{0x0000000000000002L});
}
