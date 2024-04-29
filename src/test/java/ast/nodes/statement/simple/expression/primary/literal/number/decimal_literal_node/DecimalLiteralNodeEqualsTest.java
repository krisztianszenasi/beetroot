package ast.nodes.statement.simple.expression.primary.literal.number.decimal_literal_node;

import ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.number.DecimalLiteralNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalLiteralNodeEqualsTest {

    @Test
    void testEquals_WhenValuesSame_ReturnsTrue() {
        DecimalLiteralNode decimal1 = new DecimalLiteralNode(1.0);
        DecimalLiteralNode decimal2 = new DecimalLiteralNode(1.0);

        assertEquals(decimal1, decimal2);
        assertEquals(decimal2, decimal1);
    }

    @Test
    void testEquals_WhenValuesDiffer_ReturnsFalse() {
        DecimalLiteralNode decimal1 = new DecimalLiteralNode(1.0);
        DecimalLiteralNode decimal2 = new DecimalLiteralNode(2.0);

        assertNotEquals(decimal1, decimal2);
        assertNotEquals(decimal2, decimal1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        DecimalLiteralNode decimal = new DecimalLiteralNode(1.0);
        Node differentNode = new DummyNode();

        assertNotEquals(decimal, differentNode);
        assertNotEquals(differentNode, decimal);
    }
}