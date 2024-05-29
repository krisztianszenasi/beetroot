package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.variable_declaration_node.helpers;

import com.krisztianszenasi.beetroot.ast.nodes.common.type.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.type_node.helpers.DummyType;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;

public class VarDecAlwaysEquals extends VariableDeclarationNode {


    public VarDecAlwaysEquals(Mutability mutability, String variableName, TypeNode declarationType, ExpressionNode initialValue) {
        super(mutability, variableName, declarationType, initialValue);
    }

    public static VarDecAlwaysEquals getInstance() {
        return new VarDecAlwaysEquals(
                Mutability.MUTABLE,
                "always equals",
                new DummyType(),
                new DummyExpression()
        );
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }
}
