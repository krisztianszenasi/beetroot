package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.variable_declaration_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.common.type_node.helpers.DummyType;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;

public class VarDecNeverEquals extends VariableDeclarationNode {
    public VarDecNeverEquals(Mutability mutability, String variableName, TypeNode declarationType) {
        super(mutability, variableName, declarationType);
    }

    public static VarDecNeverEquals getInstance() {
        return new VarDecNeverEquals(
                Mutability.MUTABLE,
                "never equals",
                new DummyType()
        );
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
