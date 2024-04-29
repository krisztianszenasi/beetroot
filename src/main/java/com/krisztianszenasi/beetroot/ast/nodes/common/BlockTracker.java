package com.krisztianszenasi.beetroot.ast.nodes.common;

import com.krisztianszenasi.beetroot.ast.nodes.statement.StatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;

public class BlockTracker {
    private PreviousBlockWrapper tracker;

    public void addStatement(StatementNode statementNode) {
        tracker.addStatement(statementNode);
    }

    public void stepInto(BlockNode block) {
        if(tracker == null) {
            tracker = new PreviousBlockWrapper(null, block);
        } else {
            tracker = tracker.stepInto(block);
        }
    }

    public BlockNode stepOut() {
        BlockNode blockLeftBehind = tracker.getCurrent();
        tracker = tracker.stepOut();
        return blockLeftBehind;
    }
}
