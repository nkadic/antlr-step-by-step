package org.meri.antlr_step_by_step.parsers;

import static org.junit.Assert.assertEquals;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Test;

public class S001HelloWordExperimentsTest {
	
	@Test
	public void testSmallError() {
		//compile the expression
		String input = "Hello word?";
		CommonTree ast = getCommonTree(input);

		assertEquals(S001HelloWordParser.SALUTATION, ast.getChild(0).getType());
		assertEquals(S001HelloWordParser.ENDSYMBOL, ast.getChild(1).getType());

	}

	private CommonTree getCommonTree(String input) {
		S001HelloWordParser parser = getParser(input);
		CommonTree ast = null;

		try {
			S001HelloWordParser.expression_return ret = parser.expression();

			ast = (CommonTree) ret.tree;
			//printTree(ast);

			//check AST structure

		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		return ast;
	}

	private S001HelloWordParser getParser(String input) {
		ANTLRStringStream antlrStringStream = new ANTLRStringStream(input);
		S001HelloWordLexer s001HelloWordLexer = new S001HelloWordLexer(antlrStringStream);


		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(s001HelloWordLexer);

		return new S001HelloWordParser(tokens);
	}

	@Test
	public void testBiggerError() {
		//compile the expression


		String input = "Bye!";
		CommonTree ast = getCommonTree(input);


		//check AST structure
		assertEquals(S001HelloWordParser.SALUTATION, ast.getChild(0).getType());
		assertEquals(S001HelloWordParser.ENDSYMBOL, ast.getChild(1).getType());
	}

	@Test
	public void testCompletelyWrong() {
		//compile the expression

		String input = "Incorrect Expression";
		CommonTree ast = getCommonTree(input);


		//check AST structure
		assertEquals(0, ast.getChildCount());
	}


}
