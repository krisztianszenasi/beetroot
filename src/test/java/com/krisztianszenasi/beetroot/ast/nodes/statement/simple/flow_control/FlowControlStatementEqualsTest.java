package com.krisztianszenasi.beetroot.ast.nodes.statement.simple.flow_control;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowControlStatementEqualsTest {

    private static FlowControlStatement continue1;
    private static FlowControlStatement continue2;

    private static FlowControlStatement break1;
    private static FlowControlStatement break2;

    @BeforeAll
    static void init() {
        continue1 = new ContinueFlowControlStatement();
        continue2 = new ContinueFlowControlStatement();
        break1 = new BreakFlowControlStatement();
        break2 = new BreakFlowControlStatement();
    }

    @Test
    void testEquals_WhenSameClass_ReturnsTrue() {
        assertEquals(continue1, continue2);
        assertEquals(break1, break2);
    }

    @Test
    void testEquals_WhenDifferentClass_ReturnsFalse() {
        assertNotEquals(continue1, break1);
    }
}