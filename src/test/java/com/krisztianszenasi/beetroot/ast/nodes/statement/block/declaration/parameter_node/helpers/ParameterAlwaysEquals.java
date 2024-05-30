package com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.parameter_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.type.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.type_node.helpers.DummyType;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterNode;

public class ParameterAlwaysEquals extends ParameterNode {

    public ParameterAlwaysEquals(String name, TypeNode type) {
        super(name, type);
    }

    public static ParameterAlwaysEquals getInstance() {
        return new ParameterAlwaysEquals("always equals", new DummyType());
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }
}
