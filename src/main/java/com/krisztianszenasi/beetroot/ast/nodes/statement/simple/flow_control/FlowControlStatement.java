package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.SimpleStatementNode;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

abstract public class FlowControlStatement extends SimpleStatementNode {

    @Override
    public boolean equals(Object obj) {
        return getClass() == obj.getClass();
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        super.accept(visitor);
        return visitor.visitFlowControlStatement(this);
    }
}
