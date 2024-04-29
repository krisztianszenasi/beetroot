package ast.nodes.statement.simple.expression.binary.binary_expression_node;

import ast.nodes.node.helpers.DummyNode;
import ast.nodes.statement.simple.expression.binary.binary_expression_node.helpers.DummyBinary1;
import ast.nodes.statement.simple.expression.binary.binary_expression_node.helpers.DummyBinary2;
import ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.binary.BinaryExpression;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryExpressionTest {
    private static BinaryExpression dummyKind1;
    private static BinaryExpression dummyKind2;

    @BeforeAll
    static void init() {
        dummyKind1 = new DummyBinary1();
        dummyKind2 = new DummyBinary2();
    }

    @Test
    void testEquals_WhenSameClassSameExpressions_ReturnsTrue() {
        BinaryExpression binary = new DummyBinary1();
        binary.setLeft(new ExpressionAlwaysEquals());
        binary.setLeft(new ExpressionAlwaysEquals());

        assertEquals(binary, dummyKind1);
    }

    @Test
    void testEquals_WhenDifferentClassSameExpressions_ReturnsFalse() {
        BinaryExpression binary = new DummyBinary1();
        binary.setLeft(new ExpressionAlwaysEquals());
        binary.setLeft(new ExpressionAlwaysEquals());

        assertNotEquals(binary, dummyKind2);
    }

    @Test
    void testEquals_WhenSameClassDifferentExpressions_ReturnsFalse() {
        BinaryExpression binary = new DummyBinary1();
        binary.setLeft(new ExpressionNeverEquals());
        binary.setLeft(new ExpressionNeverEquals());

        assertNotEquals(binary, dummyKind1);
    }

    @Test
    void testEquals_WhenDifferentClassDifferentExpressions_ReturnsFalse() {
        BinaryExpression binary = new DummyBinary1();
        binary.setLeft(new ExpressionNeverEquals());
        binary.setLeft(new ExpressionNeverEquals());

        assertNotEquals(binary, dummyKind2);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        BinaryExpression binary = new DummyBinary1();
        Node differentNode = new DummyNode();

        assertNotEquals(binary, differentNode);
        assertNotEquals(differentNode, binary);
    }
}