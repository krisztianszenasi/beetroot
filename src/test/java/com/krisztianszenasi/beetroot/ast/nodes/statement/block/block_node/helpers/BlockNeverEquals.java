package com.krisztianszenasi.beetroot.ast.nodes.statement.block.block_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;

public class BlockNeverEquals extends BlockNode {
    @Override
    public boolean equals(Object o) {
        return false;
    }
}
