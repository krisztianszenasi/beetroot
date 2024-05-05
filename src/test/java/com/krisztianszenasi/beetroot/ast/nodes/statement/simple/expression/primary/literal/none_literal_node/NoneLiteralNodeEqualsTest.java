package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.none_literal_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.literal.NoneLiteralNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class NoneLiteralNodeEqualsTest {

    @Test
    void testEquals_WhenBothAreNone_ReturnTrue() {
        NoneLiteralNode none1 = new NoneLiteralNode();
        NoneLiteralNode none2 = new NoneLiteralNode();

        assertEquals(none1, none2);
        assertEquals(none2, none1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        NoneLiteralNode none = new NoneLiteralNode();
        Node differentNode = new DummyNode();

        assertNotEquals(none, differentNode);
        assertNotEquals(differentNode, none);
    }
}