package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.logical_block_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.LogicalBlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class LogicalBlockNode2 extends LogicalBlockNode {
    public LogicalBlockNode2(ExpressionNode expression, BlockNode trueBlock) {
        super(expression, trueBlock);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
