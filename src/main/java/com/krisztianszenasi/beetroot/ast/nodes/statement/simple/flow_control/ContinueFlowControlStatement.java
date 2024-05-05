package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class ContinueFlowControlStatement extends FlowControlStatement{
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitContinueFlowControlStatement(this);
    }
}
