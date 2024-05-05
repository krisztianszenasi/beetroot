package com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.parameter_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers.DummyType;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterNode;

public class ParameterNeverEquals extends ParameterNode {

    public ParameterNeverEquals(String name, TypeNode type) {
        super(name, type);
    }

    public static ParameterNeverEquals getInstance() {
        return new ParameterNeverEquals("never equals", new DummyType());
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
