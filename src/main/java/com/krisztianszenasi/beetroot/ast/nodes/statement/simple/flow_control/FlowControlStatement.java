package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.SimpleStatementNode;

abstract public class FlowControlStatement extends SimpleStatementNode {

    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }
}
