package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.binary_expression_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.BinaryExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryExpressionTest {
    private static BinaryExpression dummyBinary;
    private static final String operator = "operator";

    @BeforeAll
    static void init() {
        dummyBinary = new BinaryExpression(
                operator,
                new DummyExpression(),
                new DummyExpression()
        );
    }

    @Test
    void testEquals_WhenSameOperatorAndExpressions_ReturnsTrue() {
        BinaryExpression binary = new BinaryExpression(
                operator,
                new ExpressionAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );

        assertEquals(binary, dummyBinary);
    }

    @Test
    void testEquals_WhenDifferentOperator_ReturnsFalse() {
        BinaryExpression binary = new BinaryExpression(
                operator + "difference",
                new ExpressionAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );

        assertNotEquals(binary, dummyBinary);
    }

    @Test
    void testEquals_WhenDifferentLeftExpression_ReturnsFalse() {
        BinaryExpression binary = new BinaryExpression(
                operator,
                new ExpressionNeverEquals(),
                new ExpressionAlwaysEquals()
        );

        assertNotEquals(binary, dummyBinary);
    }

    @Test
    void testEquals_WhenDifferentRightExpression_ReturnsFalse() {
        BinaryExpression binary = new BinaryExpression(
                operator,
                new ExpressionAlwaysEquals(),
                new ExpressionNeverEquals()
        );

        assertNotEquals(binary, dummyBinary);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        Node differentNode = new DummyNode();

        assertNotEquals(dummyBinary, differentNode);
        assertNotEquals(differentNode, dummyBinary);
    }
}