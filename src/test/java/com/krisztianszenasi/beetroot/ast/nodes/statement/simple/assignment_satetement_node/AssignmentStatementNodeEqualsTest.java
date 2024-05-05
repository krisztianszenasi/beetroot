package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.assignment_satetement_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.AssignmentStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.PrimaryExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers.PrimaryAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.primary_node.helpers.PrimaryNeverEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;


class AssignmentStatementNodeEqualsTest {

    private static AssignmentStatementNode dummyAssignment;

    @BeforeAll
    static void init() {
        dummyAssignment = new AssignmentStatementNode(
                mock(PrimaryExpressionNode.class, Answers.CALLS_REAL_METHODS),
                mock(ExpressionNode.class, Answers.CALLS_REAL_METHODS)
        );
    }

    @Test
    void testEquals_WhenPrimaryAndExpressionSame_ReturnsTrue() {
        AssignmentStatementNode alwaysAlways = new AssignmentStatementNode(
                new PrimaryAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );

        assertEquals(alwaysAlways, dummyAssignment);
    }

    @Test
    void testEquals_WhenExpressionDiffers_ReturnsFalse() {
        AssignmentStatementNode alwaysNever = new AssignmentStatementNode(
                new PrimaryAlwaysEquals(),
                new ExpressionNeverEquals()
        );

        assertNotEquals(alwaysNever, dummyAssignment);
    }

    @Test
    void testEquals_WhenPrimaryDiffers_ReturnsFalse() {
        AssignmentStatementNode neverAlways = new AssignmentStatementNode(
                new PrimaryNeverEquals(),
                new ExpressionAlwaysEquals()
        );

        assertNotEquals(neverAlways, dummyAssignment);
    }

    @Test
    void testEquals_WhenPrimaryAndExpressionDiffer_ReturnsFalse() {
        AssignmentStatementNode neverNever = new AssignmentStatementNode(
                new PrimaryNeverEquals(),
                new ExpressionNeverEquals()
        );

        assertNotEquals(neverNever, dummyAssignment);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        AssignmentStatementNode alwaysAlways = new AssignmentStatementNode(
                new PrimaryAlwaysEquals(),
                new ExpressionAlwaysEquals()
        );
        Node differentNode = new DummyNode();

        assertNotEquals(alwaysAlways, differentNode);
    }
}