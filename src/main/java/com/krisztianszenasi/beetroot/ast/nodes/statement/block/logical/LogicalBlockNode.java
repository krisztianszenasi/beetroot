package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical;

import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;

import java.util.Objects;

abstract public class LogicalBlockNode extends StatementNode {

    protected final ExpressionNode expression;
    protected final BlockNode trueBlock;
    protected BlockNode elseBlock;

    public LogicalBlockNode(ExpressionNode expression, BlockNode trueBlock) {
        this.expression = expression;
        this.trueBlock = trueBlock;
    }

    public ExpressionNode getExpression() {
        return expression;
    }

    public BlockNode getTrueBlock() {
        return trueBlock;
    }

    public void setElseBlock(BlockNode elseBlock) {
        this.elseBlock = elseBlock;
    }

    public BlockNode getElseBlock() {
        return elseBlock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogicalBlockNode that = (LogicalBlockNode) o;
        return Objects.equals(expression, that.expression) && Objects.equals(trueBlock, that.trueBlock) && Objects.equals(elseBlock, that.elseBlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression, trueBlock, elseBlock);
    }
}
