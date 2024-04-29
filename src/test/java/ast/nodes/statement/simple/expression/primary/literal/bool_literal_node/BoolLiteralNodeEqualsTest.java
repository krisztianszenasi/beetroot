package ast.nodes.statement.simple.expression.primary.literal.bool_literal_node;

import ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.BoolLiteralNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoolLiteralNodeEqualsTest {

    @Test
    void testEquals_WhenBothValueTrue_ReturnsTrue() {
        BoolLiteralNode trueBool1 = new BoolLiteralNode(true);
        BoolLiteralNode trueBool2 = new BoolLiteralNode(true);

        assertEquals(trueBool1, trueBool2);
        assertEquals(trueBool2, trueBool1);
    }

    @Test
    void testEquals_WhenBothValueFalse_ReturnsTrue() {
        BoolLiteralNode falseBool1 = new BoolLiteralNode(false);
        BoolLiteralNode falseBool2 = new BoolLiteralNode(false);

        assertEquals(falseBool1, falseBool2);
        assertEquals(falseBool2, falseBool1);
    }

    @Test
    void testEquals_WhenTrueAndFalseValue_ReturnsFalse() {
        BoolLiteralNode trueBool = new BoolLiteralNode(true);
        BoolLiteralNode falseBool = new BoolLiteralNode(false);

        assertNotEquals(trueBool, falseBool);
        assertNotEquals(falseBool, trueBool);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        BoolLiteralNode trueBool = new BoolLiteralNode(true);
        BoolLiteralNode falseBool = new BoolLiteralNode(false);
        Node differentNode = new DummyNode();

        assertNotEquals(trueBool, differentNode);
        assertNotEquals(falseBool, differentNode);
    }
}