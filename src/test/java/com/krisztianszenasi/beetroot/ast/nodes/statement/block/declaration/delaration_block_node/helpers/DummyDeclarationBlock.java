package com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.delaration_block_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.DeclarationBlockNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class DummyDeclarationBlock extends DeclarationBlockNode {
    public DummyDeclarationBlock(BlockNode block) {
        super(block);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return null;
    }
}
