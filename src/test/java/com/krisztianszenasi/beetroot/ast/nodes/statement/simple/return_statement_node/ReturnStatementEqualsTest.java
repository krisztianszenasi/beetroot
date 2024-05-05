package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.return_statement_node;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.ReturnStatement;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.ExpressionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Answers;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class ReturnStatementEqualsTest {

    private static ReturnStatement dummyReturn;

    @BeforeAll
    static void init() {
        dummyReturn = new ReturnStatement(mock(ExpressionNode.class, Answers.CALLS_REAL_METHODS));
    }

    @Test
    void testEquals_WhenExpressionSame_ReturnsTrue() {
        ReturnStatement alwaysEquals = new ReturnStatement(new ExpressionAlwaysEquals());
        assertEquals(alwaysEquals, dummyReturn);
    }

    @Test
    void testEquals_WhenExpressionDiffers_ReturnsFalse() {
        ReturnStatement neverEquals = new ReturnStatement(new ExpressionNeverEquals());
        assertNotEquals(neverEquals, dummyReturn);
    }
}