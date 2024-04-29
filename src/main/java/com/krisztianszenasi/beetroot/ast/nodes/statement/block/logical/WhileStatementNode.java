package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;

public class WhileStatementNode extends LogicalBlockNode{
    public WhileStatementNode(ExpressionNode expression, BlockNode trueBlock, BlockNode elseBlock) {
        super(expression, trueBlock);
        this.elseBlock = elseBlock;
    }
}
