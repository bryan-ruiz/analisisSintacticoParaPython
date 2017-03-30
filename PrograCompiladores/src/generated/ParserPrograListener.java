// Generated from C:/Users/Stwart/IdeaProjects/PrograCompiladores\ParserProgra.g4 by ANTLR 4.6
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserProgra}.
 */
public interface ParserPrograListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserProgra#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserProgra.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserProgra.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ParserProgra.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ParserProgra.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#defStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefStatement(ParserProgra.DefStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#defStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefStatement(ParserProgra.DefStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(ParserProgra.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(ParserProgra.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#moreArgs}.
	 * @param ctx the parse tree
	 */
	void enterMoreArgs(ParserProgra.MoreArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#moreArgs}.
	 * @param ctx the parse tree
	 */
	void exitMoreArgs(ParserProgra.MoreArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ParserProgra.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ParserProgra.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ParserProgra.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ParserProgra.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(ParserProgra.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(ParserProgra.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(ParserProgra.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(ParserProgra.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(ParserProgra.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(ParserProgra.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(ParserProgra.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(ParserProgra.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(ParserProgra.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(ParserProgra.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#moreStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoreStatement(ParserProgra.MoreStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#moreStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoreStatement(ParserProgra.MoreStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParserProgra.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParserProgra.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ParserProgra.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ParserProgra.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(ParserProgra.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(ParserProgra.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#additionFactor}.
	 * @param ctx the parse tree
	 */
	void enterAdditionFactor(ParserProgra.AdditionFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#additionFactor}.
	 * @param ctx the parse tree
	 */
	void exitAdditionFactor(ParserProgra.AdditionFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpression(ParserProgra.MultiplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#multiplicationExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpression(ParserProgra.MultiplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#multiplicationFactor}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationFactor(ParserProgra.MultiplicationFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#multiplicationFactor}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationFactor(ParserProgra.MultiplicationFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#elementExpression}.
	 * @param ctx the parse tree
	 */
	void enterElementExpression(ParserProgra.ElementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#elementExpression}.
	 * @param ctx the parse tree
	 */
	void exitElementExpression(ParserProgra.ElementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#elementAccess}.
	 * @param ctx the parse tree
	 */
	void enterElementAccess(ParserProgra.ElementAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#elementAccess}.
	 * @param ctx the parse tree
	 */
	void exitElementAccess(ParserProgra.ElementAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(ParserProgra.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#functionCallExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(ParserProgra.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ParserProgra.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ParserProgra.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void enterMoreExpressions(ParserProgra.MoreExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#moreExpressions}.
	 * @param ctx the parse tree
	 */
	void exitMoreExpressions(ParserProgra.MoreExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExpression(ParserProgra.PrimitiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExpression(ParserProgra.PrimitiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProgra#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(ParserProgra.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProgra#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(ParserProgra.ListExpressionContext ctx);
}