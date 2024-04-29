package ast.nodes.statement.simple.variable_declaration_node;

import ast.nodes.common.type_node.helpers.TypeAlwaysEquals;
import ast.nodes.common.type_node.helpers.TypeNeverEquals;
import ast.nodes.statement.simple.assignment_satetement_node.helpers.AssignmentAlwaysEquals;
import ast.nodes.statement.simple.assignment_satetement_node.helpers.AssignmentNeverEquals;
import ast.nodes.statement.simple.assignment_satetement_node.helpers.DummyAssignment;
import com.krisztianszenasi.beetroot.ast.nodes.common.TypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.enums.Mutability;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
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
                mock(TypeNode.class)
        );
        dummyDeclaration.setInitialAssignment(DummyAssignment.getInstance());
    }

    @Test
    void testEquals_WhenMutVarNameTypeAndAssignSame_ReturnsTrue() {
        VariableDeclarationNode everythingEquals = new VariableDeclarationNode(
                dummyDeclaration.getMutability(),
                dummyDeclaration.getVariableName(),
                new TypeAlwaysEquals()
        );
        everythingEquals.setInitialAssignment(AssignmentAlwaysEquals.getInstance());

        assertEquals(everythingEquals, dummyDeclaration);
    }

    @Test
    void testEquals_WhenMutabilityDiffers_ReturnsFalse() {
        VariableDeclarationNode mutabilityDiffers = new VariableDeclarationNode(
                getDifferentMutabilityThan(dummyDeclaration.getMutability()),
                dummyDeclaration.getVariableName(),
                new TypeAlwaysEquals()
        );
        mutabilityDiffers.setInitialAssignment(AssignmentAlwaysEquals.getInstance());

        assertNotEquals(mutabilityDiffers, dummyDeclaration);
    }

    @Test
    void testEquals_WhenVarNameDiffers_ReturnsFalse(){
        VariableDeclarationNode varNameDiffers = new VariableDeclarationNode(
                dummyDeclaration.getMutability(),
                dummyDeclaration.getVariableName() + "difference",
                new TypeAlwaysEquals()
        );
        varNameDiffers.setInitialAssignment(AssignmentAlwaysEquals.getInstance());

        assertNotEquals(varNameDiffers, dummyDeclaration);
    }

    @Test
    void testEquals_WhenTypeDiffers_ReturnsFalse() {
        VariableDeclarationNode typeDiffers = new VariableDeclarationNode(
                dummyDeclaration.getMutability(),
                dummyDeclaration.getVariableName(),
                new TypeNeverEquals()
        );
        typeDiffers.setInitialAssignment(AssignmentAlwaysEquals.getInstance());

        assertNotEquals(typeDiffers, dummyDeclaration);
    }

    @Test
    void testEquals_WhenAssignmentDiffers_ReturnsFalse() {
        VariableDeclarationNode assignmentDiffers = new VariableDeclarationNode(
                dummyDeclaration.getMutability(),
                dummyDeclaration.getVariableName(),
                new TypeAlwaysEquals()
        );
        assignmentDiffers.setInitialAssignment(AssignmentNeverEquals.getInstance());

        assertNotEquals(assignmentDiffers, dummyDeclaration);
    }

    private Mutability getDifferentMutabilityThan(Mutability mutability) {
      return Mutability.MUTABLE == mutability ? Mutability.UN_MUTABLE : Mutability.MUTABLE;
    }
}