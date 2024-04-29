package com.krisztianszenasi.beetroot.ast.nodes;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;

import java.util.Objects;

public class FileNode extends Node  {
    private final BlockNode block;

    public FileNode(BlockNode block) {
        this.block = block;
    }

    public BlockNode getBlock() {
        return block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileNode fileNode = (FileNode) o;
        return Objects.equals(block, fileNode.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block);
    }
}
