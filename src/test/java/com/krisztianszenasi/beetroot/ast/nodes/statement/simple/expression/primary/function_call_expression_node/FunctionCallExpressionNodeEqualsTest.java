package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.function_call_expression_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.FunctionCallExpressionNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class FunctionCallExpressionNodeEqualsTest {

    private static final int numberOfArguments = 3;
    private static FunctionCallExpressionNode dummyFunctionCall;

    @BeforeAll
    static void init() {
        dummyFunctionCall = new FunctionCallExpressionNode("functionName");
        for(int i = 0; i < numberOfArguments; i++) {
            dummyFunctionCall.addArgument(new DummyExpression());
        }
    }

    @Test
    void testEquals_WhenFuncNameAndArgsSame_ReturnsTrue() {
        FunctionCallExpressionNode everythingMatches = new FunctionCallExpressionNode(
                dummyFunctionCall.getFunctionName()
        );
        addAlwaysEqualsArguments(everythingMatches);

        assertEquals(everythingMatches, dummyFunctionCall);
    }

    @Test
    void testEquals_WhenFuncNameDiffers_ReturnsFalse() {
        FunctionCallExpressionNode funcNameDiffers = new FunctionCallExpressionNode(
                dummyFunctionCall.getFunctionName() + "difference"
        );
        addAlwaysEqualsArguments(funcNameDiffers);

        assertNotEquals(funcNameDiffers, dummyFunctionCall);
    }

    @Test
    void testEquals_WhenArgsDiffer_ReturnsFalse() {
        FunctionCallExpressionNode argumentsDiffer = new FunctionCallExpressionNode(
                dummyFunctionCall.getFunctionName()
        );
        addNeverEqualsArguments(argumentsDiffer);

        assertNotEquals(argumentsDiffer, dummyFunctionCall);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse() {
        FunctionCallExpressionNode functionCall = new FunctionCallExpressionNode(
                dummyFunctionCall.getFunctionName()
        );
        addAlwaysEqualsArguments(functionCall);
        Node differentNode = new DummyNode();

        assertNotEquals(functionCall, differentNode);
    }

    private void addAlwaysEqualsArguments(FunctionCallExpressionNode functionCall) {
        for(int i = 0; i < numberOfArguments; i++) {
            functionCall.addArgument(new ExpressionAlwaysEquals());
        }
    }

    private void addNeverEqualsArguments(FunctionCallExpressionNode functionCall) {
        for(int i = 0; i < numberOfArguments; i++) {
            functionCall.addArgument(new ExpressionNeverEquals());
        }
    }
}