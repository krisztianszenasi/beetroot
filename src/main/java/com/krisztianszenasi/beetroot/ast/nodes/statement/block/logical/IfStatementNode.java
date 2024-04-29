package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;

public class IfStatementNode extends LogicalBlockNode {
    public IfStatementNode(ExpressionNode expression, BlockNode trueBlock) {
        super(expression, trueBlock);
    }
}
