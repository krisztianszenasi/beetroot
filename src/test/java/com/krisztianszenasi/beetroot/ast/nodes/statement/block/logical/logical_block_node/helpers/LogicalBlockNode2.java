package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.logical_block_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.LogicalBlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;

public class LogicalBlockNode2 extends LogicalBlockNode {
    public LogicalBlockNode2(ExpressionNode expression, BlockNode trueBlock) {
        super(expression, trueBlock);
    }
}
