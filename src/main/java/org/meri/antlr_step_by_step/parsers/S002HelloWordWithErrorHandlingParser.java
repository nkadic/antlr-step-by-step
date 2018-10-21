// $ANTLR 3.5.2 org\\meri\\antlr_step_by_step\\parsers\\S002HelloWordWithErrorHandling.g 2018-10-20 15:11:54

package org.meri.antlr_step_by_step.parsers;

//add imports 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class S002HelloWordWithErrorHandlingParser extends Parser {

	public static class S002HelloWordError extends RecognitionException{

		public S002HelloWordError() {
		}
	}
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ENDSYMBOL", "SALUTATION"
	};
	public static final int EOF=-1;
	public static final int ENDSYMBOL=4;
	public static final int SALUTATION=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public S002HelloWordWithErrorHandlingParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public S002HelloWordWithErrorHandlingParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return S002HelloWordWithErrorHandlingParser.tokenNames; }
	@Override public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S002HelloWordWithErrorHandling.g"; }


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// org\\meri\\antlr_step_by_step\\parsers\\S002HelloWordWithErrorHandling.g:32:1: expression : SALUTATION ENDSYMBOL ;
	public final S002HelloWordWithErrorHandlingParser.expression_return expression() throws RecognitionException {
		S002HelloWordWithErrorHandlingParser.expression_return retval = new S002HelloWordWithErrorHandlingParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SALUTATION1=null;
		Token ENDSYMBOL2=null;

		Object SALUTATION1_tree=null;
		Object ENDSYMBOL2_tree=null;

		try {
			// org\\meri\\antlr_step_by_step\\parsers\\S002HelloWordWithErrorHandling.g:32:12: ( SALUTATION ENDSYMBOL )
			// org\\meri\\antlr_step_by_step\\parsers\\S002HelloWordWithErrorHandling.g:32:14: SALUTATION ENDSYMBOL
			{
			root_0 = (Object)adaptor.nil();


			SALUTATION1=(Token)match(input,SALUTATION,FOLLOW_SALUTATION_in_expression79); 
			SALUTATION1_tree = (Object)adaptor.create(SALUTATION1);
			adaptor.addChild(root_0, SALUTATION1_tree);

			ENDSYMBOL2=(Token)match(input,ENDSYMBOL,FOLLOW_ENDSYMBOL_in_expression81); 
			ENDSYMBOL2_tree = (Object)adaptor.create(ENDSYMBOL2);
			adaptor.addChild(root_0, ENDSYMBOL2_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException e) {
			throw new S002HelloWordError();

				//Custom handling of an exception. Any java code is allowed.

		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"

	// Delegated rules



	public static final BitSet FOLLOW_SALUTATION_in_expression79 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ENDSYMBOL_in_expression81 = new BitSet(new long[]{0x0000000000000002L});
}
