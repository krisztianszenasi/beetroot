package ast.nodes.statement.simple.variable_declaration_node.helpers;

import ast.nodes.common.type_node.helpers.DummyType;
import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;

public class VarDecAlwaysEquals extends VariableDeclarationNode {
    public VarDecAlwaysEquals(Mutability mutability, String variableName, TypeNode declarationType) {
        super(mutability, variableName, declarationType);
    }

    public static VarDecAlwaysEquals getInstance() {
        return new VarDecAlwaysEquals(
                Mutability.MUTABLE,
                "always equals",
                new DummyType()
        );
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }
}
