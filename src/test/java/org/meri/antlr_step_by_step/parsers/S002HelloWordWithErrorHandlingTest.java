package org.meri.antlr_step_by_step.parsers;

import static org.junit.Assert.assertEquals;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Test;

public class S002HelloWordWithErrorHandlingTest {


    private CommonTree getCommonTree(String input) throws RecognitionException {
        S002HelloWordWithErrorHandlingParser parser = getParser(input);
        CommonTree ast = null;

        try {
            S002HelloWordWithErrorHandlingParser.expression_return ret = parser.expression();

            ast = (CommonTree) ret.tree;
            //printTree(ast);

            //check AST structure

        } catch (RecognitionException recognitionException) {
            recognitionException.printStackTrace();
            throw recognitionException;
        }
        return ast;
    }

    private S002HelloWordWithErrorHandlingParser getParser(String input) {
        ANTLRStringStream antlrStringStream = new ANTLRStringStream(input);
        S001HelloWordLexer s001HelloWordLexer = new S001HelloWordLexer(antlrStringStream);


        CommonTokenStream tokens = new CommonTokenStream();
        tokens.setTokenSource(s001HelloWordLexer);

        return new S002HelloWordWithErrorHandlingParser(tokens);
    }




    /**
     * Abstract syntax tree generated from "Hello word!" should have an unnamed
     * root node with two children. First child corresponds to salutation token
     * and second child corresponds to end symbol token.
     *
     * Token type constants are defined in generated S002HelloWordWithErrorHandlingParser class.
     */
    @Test
    public void testCorrectExpression() throws RecognitionException {
        //compile the expression

        String input = "Hello word!";
        CommonTree ast = getCommonTree(input);
        //check AST structure
        assertEquals(S002HelloWordWithErrorHandlingParser.SALUTATION, ast.getChild(0).getType());
        assertEquals(S002HelloWordWithErrorHandlingParser.ENDSYMBOL, ast.getChild(1).getType());
    }

    @Test
    public void testSmallError() throws RecognitionException {
        //compile the expression

        String input = "Hello word?";
        CommonTree ast = getCommonTree(input);

        //check AST structure
        assertEquals(S002HelloWordWithErrorHandlingParser.SALUTATION, ast.getChild(0).getType());
        assertEquals(S002HelloWordWithErrorHandlingParser.ENDSYMBOL, ast.getChild(1).getType());
    }

    @Test
    public void testBiggerError() throws RecognitionException {
        //compile the expression

        String input = "Bye!";
        CommonTree ast = getCommonTree(input);

        //check AST structure
        assertEquals(S002HelloWordWithErrorHandlingParser.SALUTATION, ast.getChild(0).getType());
        assertEquals(S002HelloWordWithErrorHandlingParser.ENDSYMBOL, ast.getChild(1).getType());
    }

    @Test(expected= S002HelloWordWithErrorHandlingParser.S002HelloWordError.class)
    public void testCompletelyWrong() throws RecognitionException {
        //compile the expression
        String input = "Incorrect Expression";
        CommonTree ast = getCommonTree(input);

    }

}