// Generated from C:/Users/Bryan/Desktop/PrograCompiladores/PrograCompiladores\ParserProgra.g4 by ANTLR 4.6
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserProgra}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserPrograVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programStatement}
	 * labeled alternative in {@link ParserProgra#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStatement(ParserProgra.ProgramStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefStatement}
	 * labeled alternative in {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefStatement(ParserProgra.StatementDefStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementIfStatement}
	 * labeled alternative in {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIfStatement(ParserProgra.StatementIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementReturnStatement}
	 * labeled alternative in {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturnStatement(ParserProgra.StatementReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementPrintStatement}
	 * labeled alternative in {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrintStatement(ParserProgra.StatementPrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementWhileStatement}
	 * labeled alternative in {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhileStatement(ParserProgra.StatementWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementAssignStatement}
	 * labeled alternative in {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignStatement(ParserProgra.StatementAssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementFunctionCallStatement}
	 * labeled alternative in {@link ParserProgra#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementFunctionCallStatement(ParserProgra.StatementFunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defStatementRule}
	 * labeled alternative in {@link ParserProgra#defStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefStatementRule(ParserProgra.DefStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argListId}
	 * labeled alternative in {@link ParserProgra#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgListId(ParserProgra.ArgListIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argListEmpty}
	 * labeled alternative in {@link ParserProgra#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgListEmpty(ParserProgra.ArgListEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreArgsRule}
	 * labeled alternative in {@link ParserProgra#moreArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreArgsRule(ParserProgra.MoreArgsRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementRule}
	 * labeled alternative in {@link ParserProgra#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementRule(ParserProgra.IfStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementRule}
	 * labeled alternative in {@link ParserProgra#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementRule(ParserProgra.WhileStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementRule}
	 * labeled alternative in {@link ParserProgra#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementRule(ParserProgra.ReturnStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatementRule}
	 * labeled alternative in {@link ParserProgra#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementRule(ParserProgra.PrintStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatementRule}
	 * labeled alternative in {@link ParserProgra#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatementRule(ParserProgra.AssignStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStatementRule}
	 * labeled alternative in {@link ParserProgra#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatementRule(ParserProgra.FunctionCallStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sequenceRule}
	 * labeled alternative in {@link ParserProgra#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceRule(ParserProgra.SequenceRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreStatementRule}
	 * labeled alternative in {@link ParserProgra#moreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreStatementRule(ParserProgra.MoreStatementRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionRule}
	 * labeled alternative in {@link ParserProgra#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRule(ParserProgra.ExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonRule}
	 * labeled alternative in {@link ParserProgra#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonRule(ParserProgra.ComparisonRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExpressionRule}
	 * labeled alternative in {@link ParserProgra#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpressionRule(ParserProgra.AdditionExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionFactorRule}
	 * labeled alternative in {@link ParserProgra#additionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionFactorRule(ParserProgra.AdditionFactorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpressionRule}
	 * labeled alternative in {@link ParserProgra#multiplicationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpressionRule(ParserProgra.MultiplicationExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationFactorRule}
	 * labeled alternative in {@link ParserProgra#multiplicationFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationFactorRule(ParserProgra.MultiplicationFactorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementExpressionRule}
	 * labeled alternative in {@link ParserProgra#elementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementExpressionRule(ParserProgra.ElementExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elementAccessRule}
	 * labeled alternative in {@link ParserProgra#elementAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementAccessRule(ParserProgra.ElementAccessRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpressionRule}
	 * labeled alternative in {@link ParserProgra#functionCallExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpressionRule(ParserProgra.FunctionCallExpressionRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionListRule}
	 * labeled alternative in {@link ParserProgra#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionListRule(ParserProgra.ExpressionListRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionListEmpty}
	 * labeled alternative in {@link ParserProgra#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionListEmpty(ParserProgra.ExpressionListEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moreExpressionsRule}
	 * labeled alternative in {@link ParserProgra#moreExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreExpressionsRule(ParserProgra.MoreExpressionsRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionInt}
	 * labeled alternative in {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionInt(ParserProgra.PrimitiveExpressionIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionString}
	 * labeled alternative in {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionString(ParserProgra.PrimitiveExpressionStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionId}
	 * labeled alternative in {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionId(ParserProgra.PrimitiveExpressionIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionChar}
	 * labeled alternative in {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionChar(ParserProgra.PrimitiveExpressionCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionParenthesis}
	 * labeled alternative in {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionParenthesis(ParserProgra.PrimitiveExpressionParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionList}
	 * labeled alternative in {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionList(ParserProgra.PrimitiveExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionLen}
	 * labeled alternative in {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionLen(ParserProgra.PrimitiveExpressionLenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpressionFunction}
	 * labeled alternative in {@link ParserProgra#primitiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpressionFunction(ParserProgra.PrimitiveExpressionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExpressionRule}
	 * labeled alternative in {@link ParserProgra#listExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpressionRule(ParserProgra.ListExpressionRuleContext ctx);
}