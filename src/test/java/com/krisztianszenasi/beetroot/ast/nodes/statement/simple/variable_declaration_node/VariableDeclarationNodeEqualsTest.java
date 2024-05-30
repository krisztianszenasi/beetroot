package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.variable_declaration_node;

import com.krisztianszenasi.beetroot.ast.nodes.common.type.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.type_node.helpers.TypeAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.common.type.type_node.helpers.TypeNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class VariableDeclarationNodeEqualsTest {

    private static VariableDeclarationNode dummyDeclaration;

    @BeforeAll
    static void init() {
        dummyDeclaration = new VariableDeclarationNode(
                Mutability.MUTABLE,
                "dummy",
                mock(TypeNode.class),
                new DummyExpression()
        );
    }

    @Test
    void testEquals_WhenMutVarNameTypeAndAssignSame_ReturnsTrue() {
        VariableDeclarationNode everythingEquals = new VariableDeclarationNode(
                dummyDeclaration.getMutability(),
                dummyDeclaration.getVariableName(),
                new TypeAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );

        assertEquals(everythingEquals, dummyDeclaration);
    }

    @Test
    void testEquals_WhenMutabilityDiffers_ReturnsFalse() {
        VariableDeclarationNode mutabilityDiffers = new VariableDeclarationNode(
                getDifferentMutabilityThan(dummyDeclaration.getMutability()),
                dummyDeclaration.getVariableName(),
                new TypeAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );

        assertNotEquals(mutabilityDiffers, dummyDeclaration);
    }

    @Test
    void testEquals_WhenVarNameDiffers_ReturnsFalse(){
        VariableDeclarationNode varNameDiffers = new VariableDeclarationNode(
                dummyDeclaration.getMutability(),
                dummyDeclaration.getVariableName() + "difference",
                new TypeAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );

        assertNotEquals(varNameDiffers, dummyDeclaration);
    }

    @Test
    void testEquals_WhenTypeDiffers_ReturnsFalse() {
        VariableDeclarationNode typeDiffers = new VariableDeclarationNode(
                dummyDeclaration.getMutability(),
                dummyDeclaration.getVariableName(),
                new TypeNeverEquals(),
                new ExpressionAlwaysEquals()
        );

        assertNotEquals(typeDiffers, dummyDeclaration);
    }

    @Test
    void testEquals_WhenAssignmentDiffers_ReturnsFalse() {
        VariableDeclarationNode assignmentDiffers = new VariableDeclarationNode(
                dummyDeclaration.getMutability(),
                dummyDeclaration.getVariableName(),
                new TypeAlwaysEquals(),
                new ExpressionNeverEquals()
        );

        assertNotEquals(assignmentDiffers, dummyDeclaration);
    }

    private Mutability getDifferentMutabilityThan(Mutability mutability) {
      return Mutability.MUTABLE == mutability ? Mutability.UN_MUTABLE : Mutability.MUTABLE;
    }
}