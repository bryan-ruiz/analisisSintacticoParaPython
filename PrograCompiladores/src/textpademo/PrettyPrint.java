package textpademo; /**
 * Created by Bryan on 30/3/2017.
 */
import generated.ParserProgra;
import generated.ParserPrograBaseVisitor;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 * Created by oviquez on 8/9/2016.
 */
public class PrettyPrint extends ParserPrograBaseVisitor<Object>{

    private int cont=0;

    //DefaultMutableTreeNode raiz;

    private void printtab(int n)
    {
        for(int num=n; num != 0; num--)
            System.out.print("+++");
        System.out.print(">");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /*@Override public Object visitProgramStatement(ParserProgra.ProgramStatementContext ctx) {
        printtab(cont);
        raiz = new DefaultMutableTreeNode(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.statement(0));
        for (int i=1; i <= ctx. statement().size()-1; i++)
        {
            visit(ctx.statement(i));
        }
        cont--;

        return null;
    }*/
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStatementDefStatement(ParserProgra.StatementDefStatementContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.defStatement());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStatementReturnStatement(ParserProgra.StatementReturnStatementContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.returnStatement());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStatementPrintStatement(ParserProgra.StatementPrintStatementContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.printStatement());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStatementWhileStatement(ParserProgra.StatementWhileStatementContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.whileStatement());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStatementAssignStatement(ParserProgra.StatementAssignStatementContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.assignStatement());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitStatementFunctionCallStatement(ParserProgra.StatementFunctionCallStatementContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.functionCallStatement());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitDefStatementRule(ParserProgra.DefStatementRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.argList());
        visit(ctx.sequence());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitArgListId(ParserProgra.ArgListIdContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName() + " : " + ctx.ID().getSymbol().getText());

        cont++;
        visit(ctx.moreArgs());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitArgListEmpty(ParserProgra.ArgListEmptyContext ctx) {
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitMoreArgsRule(ParserProgra.MoreArgsRuleContext ctx) {

        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        for (int i=0; i <= ctx.ID().size() - 1; i++)
        {
            System.out.println( ", " + ctx.ID(i).toString());
        }
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitIfStatementRule(ParserProgra.IfStatementRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.expression());
        for (int i=0; i <= ctx.sequence().size() - 1; i++)
        {
            visit(ctx.sequence(i));
        }
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitWhileStatementRule(ParserProgra.WhileStatementRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.expression());
        visit(ctx.sequence());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitReturnStatementRule(ParserProgra.ReturnStatementRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.expression());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrintStatementRule(ParserProgra.PrintStatementRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName() + " : " + ctx.PRINT().getSymbol().getText());

        cont++;
        visit(ctx.expression());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitAssignStatementRule(ParserProgra.AssignStatementRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName() + " : " + ctx.ID().getSymbol().getText());

        cont++;
        visit(ctx.expression());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFunctionCallStatementRule(ParserProgra.FunctionCallStatementRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.primitiveExpression());
        visit(ctx.expressionList());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitSequenceRule(ParserProgra.SequenceRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.moreStatement());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitMoreStatementRule(ParserProgra.MoreStatementRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for (int i = 1; i <= ctx.statement().size() - 1; i++)
        {
            visit(ctx.statement(i));
        }
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitExpressionRule(ParserProgra.ExpressionRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());

        cont++;
        visit(ctx.additionExpression());
        visit(ctx.comparison());
        cont--;

        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitComparisonRule(ParserProgra.ComparisonRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;

        for (int i = 0; i <= ctx.additionExpression().size() - 1; i++)
        {
            visit(ctx.additionExpression(i));
        }
        cont--;
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitAdditionExpressionRule(ParserProgra.AdditionExpressionRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.multiplicationExpression());
        visit(ctx.additionFactor());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitAdditionFactorRule(ParserProgra.AdditionFactorRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.multiplicationExpression(0));
        for (int i = 0; i <= ctx.multiplicationExpression().size() - 1; i++)
        {
            visit(ctx.multiplicationExpression(i));
        }
        cont--;
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitMultiplicationExpressionRule(ParserProgra.MultiplicationExpressionRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.elementExpression());
        visit(ctx.multiplicationFactor());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitMultiplicationFactorRule(ParserProgra.MultiplicationFactorRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for (int i = 0; i <= ctx.elementExpression().size() - 1; i++)
        {
            visit(ctx.elementExpression(i));
        }
        cont--;
        return null;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitElementExpressionRule(ParserProgra.ElementExpressionRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.primitiveExpression());
        visit(ctx.elementAccess());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitElementAccessRule(ParserProgra.ElementAccessRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for (int i = 0; i <= ctx.expression().size() - 1; i++)
        {
            visit(ctx.expression(i));
        }
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitFunctionCallExpressionRule(ParserProgra.FunctionCallExpressionRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName() + " : " + ctx.ID().getSymbol().getText());
        cont++;
        visit(ctx.expressionList());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitExpressionListRule(ParserProgra.ExpressionListRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.expression());
        visit(ctx.moreExpressions());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitExpressionListEmpty(ParserProgra.ExpressionListEmptyContext ctx) {
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitMoreExpressionsRule(ParserProgra.MoreExpressionsRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        for (int i = 0; i <= ctx.expression().size() - 1; i++)
        {
            visit(ctx.expression(i));
        }
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrimitiveExpressionInt(ParserProgra.PrimitiveExpressionIntContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName() + " : " + ctx.INT().getSymbol().getText());
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrimitiveExpressionString(ParserProgra.PrimitiveExpressionStringContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName() + " : " + ctx.STR().getSymbol().getText());
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrimitiveExpressionId(ParserProgra.PrimitiveExpressionIdContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName() + " : " + ctx.ID().getSymbol().getText());
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrimitiveExpressionChar(ParserProgra.PrimitiveExpressionCharContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName() + " : " + ctx.CHAR().getSymbol().getText());
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrimitiveExpressionParenthesis(ParserProgra.PrimitiveExpressionParenthesisContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.expression());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrimitiveExpressionList(ParserProgra.PrimitiveExpressionListContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.listExpression());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrimitiveExpressionLen(ParserProgra.PrimitiveExpressionLenContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.expression());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitPrimitiveExpressionFunction(ParserProgra.PrimitiveExpressionFunctionContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.functionCallExpression());
        cont--;
        return null;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Object visitListExpressionRule(ParserProgra.ListExpressionRuleContext ctx) {
        printtab(cont);
        System.out.println(ctx.getClass().getSimpleName());
        cont++;
        visit(ctx.expressionList());
        cont--;
        return null;
    }
}