package ast.nodes.statement.block.declaration.parameter_node;

import ast.nodes.common.type_node.helpers.TypeAlwaysEquals;
import ast.nodes.common.type_node.helpers.TypeNeverEquals;
import ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.ParameterNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParameterNodeEqualsTest {

    @Test
    void testEquals_WhenNameAndTypeSame_ReturnsTrue() {
        ParameterNode parameter1 = new ParameterNode(
                "name",
                new TypeAlwaysEquals()
        );
        ParameterNode parameter2 = new ParameterNode(
                parameter1.getName(),
                new TypeAlwaysEquals()
        );

        assertEquals(parameter1, parameter2);
        assertEquals(parameter2, parameter1);
    }

    @Test
    void testEquals_WhenNameDiffers_ReturnsFalse() {
        ParameterNode parameter1 = new ParameterNode(
                "name",
                new TypeAlwaysEquals()
        );
        ParameterNode parameter2 = new ParameterNode(
                parameter1.getName() + "difference",
                new TypeAlwaysEquals()
        );

        assertNotEquals(parameter1, parameter2);
        assertNotEquals(parameter2, parameter1);
    }

    @Test
    void testEquals_WhenTypeDiffers_ReturnsFalse() {
        ParameterNode parameter1 = new ParameterNode(
                "name",
                new TypeNeverEquals()
        );
        ParameterNode parameter2 = new ParameterNode(
                parameter1.getName(),
                new TypeNeverEquals()
        );

        assertNotEquals(parameter1, parameter2);
        assertNotEquals(parameter2, parameter1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        ParameterNode parameter = new ParameterNode(
                "name",
                new TypeAlwaysEquals()
        );
        Node differentNode = new DummyNode();

        assertNotEquals(parameter, differentNode);
        assertNotEquals(differentNode, parameter);
    }
}