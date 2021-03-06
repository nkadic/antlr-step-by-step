// $ANTLR 3.5.2 org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g 2018-10-20 15:11:55

package org.meri.antlr_step_by_step.parsers;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class S008FunctionsNiceTreeParser extends Parser {
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


	public S008FunctionsNiceTreeParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public S008FunctionsNiceTreeParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return S008FunctionsNiceTreeParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g"; }


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
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:63:1: expression : andexpression ;
	public final S008FunctionsNiceTreeParser.expression_return expression() throws RecognitionException {
		S008FunctionsNiceTreeParser.expression_return retval = new S008FunctionsNiceTreeParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope andexpression1 =null;


		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:63:12: ( andexpression )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:63:14: andexpression
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
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:65:1: andexpression : orexpression ( AND ^ orexpression )* ;
	public final S008FunctionsNiceTreeParser.andexpression_return andexpression() throws RecognitionException {
		S008FunctionsNiceTreeParser.andexpression_return retval = new S008FunctionsNiceTreeParser.andexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND3=null;
		ParserRuleReturnScope orexpression2 =null;
		ParserRuleReturnScope orexpression4 =null;

		Object AND3_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:65:15: ( orexpression ( AND ^ orexpression )* )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:65:17: orexpression ( AND ^ orexpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_orexpression_in_andexpression210);
			orexpression2=orexpression();
			state._fsp--;

			adaptor.addChild(root_0, orexpression2.getTree());

			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:65:30: ( AND ^ orexpression )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==AND) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:65:31: AND ^ orexpression
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
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:67:1: orexpression : notexpression ( OR ^ notexpression )* ;
	public final S008FunctionsNiceTreeParser.orexpression_return orexpression() throws RecognitionException {
		S008FunctionsNiceTreeParser.orexpression_return retval = new S008FunctionsNiceTreeParser.orexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR6=null;
		ParserRuleReturnScope notexpression5 =null;
		ParserRuleReturnScope notexpression7 =null;

		Object OR6_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:67:14: ( notexpression ( OR ^ notexpression )* )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:67:16: notexpression ( OR ^ notexpression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_notexpression_in_orexpression226);
			notexpression5=notexpression();
			state._fsp--;

			adaptor.addChild(root_0, notexpression5.getTree());

			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:67:30: ( OR ^ notexpression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==OR) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:67:31: OR ^ notexpression
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
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:69:1: notexpression : ( NOT ^ atom | atom );
	public final S008FunctionsNiceTreeParser.notexpression_return notexpression() throws RecognitionException {
		S008FunctionsNiceTreeParser.notexpression_return retval = new S008FunctionsNiceTreeParser.notexpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT8=null;
		ParserRuleReturnScope atom9 =null;
		ParserRuleReturnScope atom10 =null;

		Object NOT8_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:69:15: ( NOT ^ atom | atom )
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
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:69:17: NOT ^ atom
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
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:69:29: atom
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
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:71:1: atom : ( function | NAME | LPAREN ! andexpression RPAREN !);
	public final S008FunctionsNiceTreeParser.atom_return atom() throws RecognitionException {
		S008FunctionsNiceTreeParser.atom_return retval = new S008FunctionsNiceTreeParser.atom_return();
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
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:71:6: ( function | NAME | LPAREN ! andexpression RPAREN !)
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
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:71:8: function
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_in_atom257);
					function11=function();
					state._fsp--;

					adaptor.addChild(root_0, function11.getTree());

					}
					break;
				case 2 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:71:19: NAME
					{
					root_0 = (Object)adaptor.nil();


					NAME12=(Token)match(input,NAME,FOLLOW_NAME_in_atom261); 
					NAME12_tree = (Object)adaptor.create(NAME12);
					adaptor.addChild(root_0, NAME12_tree);

					}
					break;
				case 3 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:71:26: LPAREN ! andexpression RPAREN !
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
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:73:1: function : ( allFunction | atleastoneFunction | neitherFunction | notallFunction );
	public final S008FunctionsNiceTreeParser.function_return function() throws RecognitionException {
		S008FunctionsNiceTreeParser.function_return retval = new S008FunctionsNiceTreeParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope allFunction16 =null;
		ParserRuleReturnScope atleastoneFunction17 =null;
		ParserRuleReturnScope neitherFunction18 =null;
		ParserRuleReturnScope notallFunction19 =null;


		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:73:10: ( allFunction | atleastoneFunction | neitherFunction | notallFunction )
			int alt5=4;
			switch ( input.LA(1) ) {
			case ALL:
				{
				alt5=1;
				}
				break;
			case ATLEASTONE:
				{
				alt5=2;
				}
				break;
			case NEITHER:
				{
				alt5=3;
				}
				break;
			case NOTALL:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:73:12: allFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_allFunction_in_function279);
					allFunction16=allFunction();
					state._fsp--;

					adaptor.addChild(root_0, allFunction16.getTree());

					}
					break;
				case 2 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:73:26: atleastoneFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_atleastoneFunction_in_function283);
					atleastoneFunction17=atleastoneFunction();
					state._fsp--;

					adaptor.addChild(root_0, atleastoneFunction17.getTree());

					}
					break;
				case 3 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:73:47: neitherFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_neitherFunction_in_function287);
					neitherFunction18=neitherFunction();
					state._fsp--;

					adaptor.addChild(root_0, neitherFunction18.getTree());

					}
					break;
				case 4 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:73:65: notallFunction
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_notallFunction_in_function291);
					notallFunction19=notallFunction();
					state._fsp--;

					adaptor.addChild(root_0, notallFunction19.getTree());

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
	// $ANTLR end "function"


	public static class allFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allFunction"
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:76:1: allFunction : ALL LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN -> {$a==null || $a.isEmpty()}? $b -> ^( AND $b ( $a)* ) ;
	public final S008FunctionsNiceTreeParser.allFunction_return allFunction() throws RecognitionException {
		S008FunctionsNiceTreeParser.allFunction_return retval = new S008FunctionsNiceTreeParser.allFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ALL20=null;
		Token LPAREN21=null;
		Token char_literal22=null;
		Token RPAREN23=null;
		List<Object> list_a=null;
		ParserRuleReturnScope b =null;
		RuleReturnScope a = null;
		Object ALL20_tree=null;
		Object LPAREN21_tree=null;
		Object char_literal22_tree=null;
		Object RPAREN23_tree=null;
		RewriteRuleTokenStream stream_ALL=new RewriteRuleTokenStream(adaptor,"token ALL");
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_andexpression=new RewriteRuleSubtreeStream(adaptor,"rule andexpression");

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:76:13: ( ALL LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN -> {$a==null || $a.isEmpty()}? $b -> ^( AND $b ( $a)* ) )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:76:15: ALL LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN
			{
			ALL20=(Token)match(input,ALL,FOLLOW_ALL_in_allFunction300);  
			stream_ALL.add(ALL20);

			LPAREN21=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_allFunction302);  
			stream_LPAREN.add(LPAREN21);

			pushFollow(FOLLOW_andexpression_in_allFunction306);
			b=andexpression();
			state._fsp--;

			stream_andexpression.add(b.getTree());
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:76:42: ( ',' a+= andexpression )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==15) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:76:43: ',' a+= andexpression
					{
					char_literal22=(Token)match(input,15,FOLLOW_15_in_allFunction309);  
					stream_15.add(char_literal22);

					pushFollow(FOLLOW_andexpression_in_allFunction313);
					a=andexpression();
					state._fsp--;

					stream_andexpression.add(a.getTree());
					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			RPAREN23=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_allFunction317);  
			stream_RPAREN.add(RPAREN23);

			// AST REWRITE
			// elements: a, b, b
			// token labels: 
			// rule labels: b, retval
			// token list labels: 
			// rule list labels: a
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
			root_0 = (Object)adaptor.nil();
			// 78:3: -> {$a==null || $a.isEmpty()}? $b
			if (list_a==null || list_a.isEmpty()) {
				adaptor.addChild(root_0, stream_b.nextTree());
			}

			else // 80:3: -> ^( AND $b ( $a)* )
			{
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:80:6: ^( AND $b ( $a)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);
				adaptor.addChild(root_1, stream_b.nextTree());
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:80:16: ( $a)*
				while ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "allFunction"


	public static class atleastoneFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "atleastoneFunction"
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:83:1: atleastoneFunction : ATLEASTONE LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN -> {$a==null || $a.isEmpty()}? $b -> ^( OR $b ( $a)* ) ;
	public final S008FunctionsNiceTreeParser.atleastoneFunction_return atleastoneFunction() throws RecognitionException {
		S008FunctionsNiceTreeParser.atleastoneFunction_return retval = new S008FunctionsNiceTreeParser.atleastoneFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ATLEASTONE24=null;
		Token LPAREN25=null;
		Token char_literal26=null;
		Token RPAREN27=null;
		List<Object> list_a=null;
		ParserRuleReturnScope b =null;
		RuleReturnScope a = null;
		Object ATLEASTONE24_tree=null;
		Object LPAREN25_tree=null;
		Object char_literal26_tree=null;
		Object RPAREN27_tree=null;
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_ATLEASTONE=new RewriteRuleTokenStream(adaptor,"token ATLEASTONE");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_andexpression=new RewriteRuleSubtreeStream(adaptor,"rule andexpression");

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:83:20: ( ATLEASTONE LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN -> {$a==null || $a.isEmpty()}? $b -> ^( OR $b ( $a)* ) )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:83:22: ATLEASTONE LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN
			{
			ATLEASTONE24=(Token)match(input,ATLEASTONE,FOLLOW_ATLEASTONE_in_atleastoneFunction357);  
			stream_ATLEASTONE.add(ATLEASTONE24);

			LPAREN25=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atleastoneFunction359);  
			stream_LPAREN.add(LPAREN25);

			pushFollow(FOLLOW_andexpression_in_atleastoneFunction363);
			b=andexpression();
			state._fsp--;

			stream_andexpression.add(b.getTree());
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:83:56: ( ',' a+= andexpression )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==15) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:83:57: ',' a+= andexpression
					{
					char_literal26=(Token)match(input,15,FOLLOW_15_in_atleastoneFunction366);  
					stream_15.add(char_literal26);

					pushFollow(FOLLOW_andexpression_in_atleastoneFunction370);
					a=andexpression();
					state._fsp--;

					stream_andexpression.add(a.getTree());
					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					}
					break;

				default :
					break loop7;
				}
			}

			RPAREN27=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atleastoneFunction374);  
			stream_RPAREN.add(RPAREN27);

			// AST REWRITE
			// elements: b, b, a
			// token labels: 
			// rule labels: b, retval
			// token list labels: 
			// rule list labels: a
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
			root_0 = (Object)adaptor.nil();
			// 85:3: -> {$a==null || $a.isEmpty()}? $b
			if (list_a==null || list_a.isEmpty()) {
				adaptor.addChild(root_0, stream_b.nextTree());
			}

			else // 87:3: -> ^( OR $b ( $a)* )
			{
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:87:6: ^( OR $b ( $a)* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);
				adaptor.addChild(root_1, stream_b.nextTree());
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:87:15: ( $a)*
				while ( stream_a.hasNext() ) {
					adaptor.addChild(root_1, stream_a.nextTree());
				}
				stream_a.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "atleastoneFunction"


	public static class neitherFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "neitherFunction"
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:90:1: neitherFunction : NEITHER LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN -> {$a==null || $a.isEmpty()}? ^( NOT $b) -> ^( AND ^( NOT $b) ( ^( NOT $a) )* ) ;
	public final S008FunctionsNiceTreeParser.neitherFunction_return neitherFunction() throws RecognitionException {
		S008FunctionsNiceTreeParser.neitherFunction_return retval = new S008FunctionsNiceTreeParser.neitherFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEITHER28=null;
		Token LPAREN29=null;
		Token char_literal30=null;
		Token RPAREN31=null;
		List<Object> list_a=null;
		ParserRuleReturnScope b =null;
		RuleReturnScope a = null;
		Object NEITHER28_tree=null;
		Object LPAREN29_tree=null;
		Object char_literal30_tree=null;
		Object RPAREN31_tree=null;
		RewriteRuleTokenStream stream_NEITHER=new RewriteRuleTokenStream(adaptor,"token NEITHER");
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_andexpression=new RewriteRuleSubtreeStream(adaptor,"rule andexpression");

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:90:17: ( NEITHER LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN -> {$a==null || $a.isEmpty()}? ^( NOT $b) -> ^( AND ^( NOT $b) ( ^( NOT $a) )* ) )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:90:19: NEITHER LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN
			{
			NEITHER28=(Token)match(input,NEITHER,FOLLOW_NEITHER_in_neitherFunction414);  
			stream_NEITHER.add(NEITHER28);

			LPAREN29=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_neitherFunction416);  
			stream_LPAREN.add(LPAREN29);

			pushFollow(FOLLOW_andexpression_in_neitherFunction420);
			b=andexpression();
			state._fsp--;

			stream_andexpression.add(b.getTree());
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:90:50: ( ',' a+= andexpression )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==15) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:90:51: ',' a+= andexpression
					{
					char_literal30=(Token)match(input,15,FOLLOW_15_in_neitherFunction423);  
					stream_15.add(char_literal30);

					pushFollow(FOLLOW_andexpression_in_neitherFunction427);
					a=andexpression();
					state._fsp--;

					stream_andexpression.add(a.getTree());
					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					}
					break;

				default :
					break loop8;
				}
			}

			RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_neitherFunction431);  
			stream_RPAREN.add(RPAREN31);

			// AST REWRITE
			// elements: b, b, a
			// token labels: 
			// rule labels: b, retval
			// token list labels: 
			// rule list labels: a
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
			root_0 = (Object)adaptor.nil();
			// 92:3: -> {$a==null || $a.isEmpty()}? ^( NOT $b)
			if (list_a==null || list_a.isEmpty()) {
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:92:34: ^( NOT $b)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_1);
				adaptor.addChild(root_1, stream_b.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 94:3: -> ^( AND ^( NOT $b) ( ^( NOT $a) )* )
			{
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:94:6: ^( AND ^( NOT $b) ( ^( NOT $a) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AND, "AND"), root_1);
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:94:12: ^( NOT $b)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:94:22: ( ^( NOT $a) )*
				while ( stream_a.hasNext() ) {
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:94:22: ^( NOT $a)
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_2);
					adaptor.addChild(root_2, stream_a.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_a.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "neitherFunction"


	public static class notallFunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "notallFunction"
	// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:97:1: notallFunction : NOTALL LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN -> {$a==null || $a.isEmpty()}? ^( NOT $b) -> ^( OR ^( NOT $b) ( ^( NOT $a) )* ) ;
	public final S008FunctionsNiceTreeParser.notallFunction_return notallFunction() throws RecognitionException {
		S008FunctionsNiceTreeParser.notallFunction_return retval = new S008FunctionsNiceTreeParser.notallFunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOTALL32=null;
		Token LPAREN33=null;
		Token char_literal34=null;
		Token RPAREN35=null;
		List<Object> list_a=null;
		ParserRuleReturnScope b =null;
		RuleReturnScope a = null;
		Object NOTALL32_tree=null;
		Object LPAREN33_tree=null;
		Object char_literal34_tree=null;
		Object RPAREN35_tree=null;
		RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
		RewriteRuleTokenStream stream_NOTALL=new RewriteRuleTokenStream(adaptor,"token NOTALL");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_andexpression=new RewriteRuleSubtreeStream(adaptor,"rule andexpression");

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:97:16: ( NOTALL LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN -> {$a==null || $a.isEmpty()}? ^( NOT $b) -> ^( OR ^( NOT $b) ( ^( NOT $a) )* ) )
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:97:18: NOTALL LPAREN b= andexpression ( ',' a+= andexpression )* RPAREN
			{
			NOTALL32=(Token)match(input,NOTALL,FOLLOW_NOTALL_in_notallFunction483);  
			stream_NOTALL.add(NOTALL32);

			LPAREN33=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_notallFunction485);  
			stream_LPAREN.add(LPAREN33);

			pushFollow(FOLLOW_andexpression_in_notallFunction489);
			b=andexpression();
			state._fsp--;

			stream_andexpression.add(b.getTree());
			// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:97:48: ( ',' a+= andexpression )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==15) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:97:49: ',' a+= andexpression
					{
					char_literal34=(Token)match(input,15,FOLLOW_15_in_notallFunction492);  
					stream_15.add(char_literal34);

					pushFollow(FOLLOW_andexpression_in_notallFunction496);
					a=andexpression();
					state._fsp--;

					stream_andexpression.add(a.getTree());
					if (list_a==null) list_a=new ArrayList<Object>();
					list_a.add(a.getTree());
					}
					break;

				default :
					break loop9;
				}
			}

			RPAREN35=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_notallFunction500);  
			stream_RPAREN.add(RPAREN35);

			// AST REWRITE
			// elements: b, b, a
			// token labels: 
			// rule labels: b, retval
			// token list labels: 
			// rule list labels: a
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",list_a);
			root_0 = (Object)adaptor.nil();
			// 99:3: -> {$a==null || $a.isEmpty()}? ^( NOT $b)
			if (list_a==null || list_a.isEmpty()) {
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:99:34: ^( NOT $b)
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_1);
				adaptor.addChild(root_1, stream_b.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}

			else // 101:3: -> ^( OR ^( NOT $b) ( ^( NOT $a) )* )
			{
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:101:6: ^( OR ^( NOT $b) ( ^( NOT $a) )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OR, "OR"), root_1);
				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:101:11: ^( NOT $b)
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_2);
				adaptor.addChild(root_2, stream_b.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:101:21: ( ^( NOT $a) )*
				while ( stream_a.hasNext() ) {
					// org\\meri\\antlr_step_by_step\\parsers\\S008FunctionsNiceTree.g:101:21: ^( NOT $a)
					{
					Object root_2 = (Object)adaptor.nil();
					root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_2);
					adaptor.addChild(root_2, stream_a.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_a.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
	// $ANTLR end "notallFunction"

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
	public static final BitSet FOLLOW_allFunction_in_function279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atleastoneFunction_in_function283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_neitherFunction_in_function287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notallFunction_in_function291 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALL_in_allFunction300 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_LPAREN_in_allFunction302 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_allFunction306 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_15_in_allFunction309 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_allFunction313 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_RPAREN_in_allFunction317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATLEASTONE_in_atleastoneFunction357 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_LPAREN_in_atleastoneFunction359 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_atleastoneFunction363 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_15_in_atleastoneFunction366 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_atleastoneFunction370 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_RPAREN_in_atleastoneFunction374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEITHER_in_neitherFunction414 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_LPAREN_in_neitherFunction416 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_neitherFunction420 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_15_in_neitherFunction423 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_neitherFunction427 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_RPAREN_in_neitherFunction431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOTALL_in_notallFunction483 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_LPAREN_in_notallFunction485 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_notallFunction489 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_15_in_notallFunction492 = new BitSet(new long[]{0x0000000000000FD0L});
	public static final BitSet FOLLOW_andexpression_in_notallFunction496 = new BitSet(new long[]{0x000000000000A000L});
	public static final BitSet FOLLOW_RPAREN_in_notallFunction500 = new BitSet(new long[]{0x0000000000000002L});
}
