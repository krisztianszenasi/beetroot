package com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.visitor.AstVisitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ParameterListNode extends Node {
    private final List<ParameterNode> parameters = new ArrayList<>();

    public void addParameter(ParameterNode parameter) {
        parameters.add(parameter);
    }

    public ParameterNode getParameter(int idx) {
        return parameters.get(idx);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParameterListNode that = (ParameterListNode) o;
        return Objects.equals(parameters, that.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {
        return visitor.visitParameterListNode(this);
    }
}
