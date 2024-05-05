package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class WhileStatementNode extends LogicalBlockNode{
    public WhileStatementNode(ExpressionNode expression, BlockNode trueBlock, BlockNode elseBlock) {
        super(expression, trueBlock);
        this.elseBlock = elseBlock;
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitWhileStatementNode(this);
    }
}
