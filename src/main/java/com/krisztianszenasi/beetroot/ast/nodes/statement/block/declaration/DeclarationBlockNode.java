package com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration;

import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;

import java.util.Objects;

abstract public class DeclarationBlockNode extends StatementNode {

    private final BlockNode block;

    public DeclarationBlockNode(BlockNode block) {
        this.block = block;
    }

    public BlockNode getBlock() {
        return block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeclarationBlockNode that = (DeclarationBlockNode) o;
        return Objects.equals(block, that.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block);
    }
}
