package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.indexed_expression_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.IndexedExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers.DummyPrimary;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers.PrimaryAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers.PrimaryNeverEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


class IndexedExpressionNodeEqualsTest {
    private static IndexedExpressionNode dummyNode;

    @BeforeAll
    static void init() {
        dummyNode = new IndexedExpressionNode(new DummyPrimary(), new DummyExpression());
    }

    @Test
    void testEquals_WhenPrimaryAndExpressionSame_ReturnsTrue() {
        IndexedExpressionNode alwaysAlways = new IndexedExpressionNode(
                new PrimaryAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );
        assertEquals(alwaysAlways, dummyNode);
    }

    @Test
    void testEquals_WhenExpressionDiffers_ReturnsFalse() {
        IndexedExpressionNode alwaysNever = new IndexedExpressionNode(
                new PrimaryAlwaysEquals(),
                new ExpressionNeverEquals()
        );
        assertNotEquals(alwaysNever, dummyNode);
    }

    @Test
    void testEquals_WhenPrimaryDiffers_ReturnsFalse() {
        IndexedExpressionNode neverAlways = new IndexedExpressionNode(
                new PrimaryNeverEquals(),
                new ExpressionAlwaysEquals()
        );
        assertNotEquals(neverAlways, dummyNode);
    }

    @Test
    void testEquals_WhenPrimaryAndExpressionDiffer_ReturnsFalse() {
        IndexedExpressionNode neverNever = new IndexedExpressionNode(
                new PrimaryNeverEquals(),
                new ExpressionNeverEquals()
        );
        assertNotEquals(neverNever, dummyNode);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        IndexedExpressionNode indexed = new IndexedExpressionNode(
                new PrimaryAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );
        Node differentNode = new DummyNode();

        assertNotEquals(indexed, differentNode);
    }
}