package com.krisztianszenasi.beetroot.ast.nodes.common;

import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;

public class PreviousBlockWrapper {
    private final PreviousBlockWrapper previous;
    private final BlockNode current;

    public PreviousBlockWrapper(PreviousBlockWrapper previous, BlockNode current) {
        this.previous = previous;
        this.current = current;
    }

    public void addStatement(StatementNode statementNode) {
        current.addStatement(statementNode);
    }

    public PreviousBlockWrapper stepInto(BlockNode block) {
        return new PreviousBlockWrapper(this, block);
    }

    public PreviousBlockWrapper stepOut() {
        return previous;
    }

    public BlockNode getCurrent() {
        return current;
    }
}
