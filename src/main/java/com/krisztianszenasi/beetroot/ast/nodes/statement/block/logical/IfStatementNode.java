package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class IfStatementNode extends LogicalBlockNode {
    public IfStatementNode(ExpressionNode expression, BlockNode trueBlock) {
        super(expression, trueBlock);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitIfStatementNode(this);
    }
}
