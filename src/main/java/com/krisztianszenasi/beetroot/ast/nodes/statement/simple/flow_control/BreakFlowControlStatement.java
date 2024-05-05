package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control;

import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

public class BreakFlowControlStatement extends FlowControlStatement{
    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitBreakFlowControlStatement(this);
    }
}
