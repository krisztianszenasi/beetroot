package com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.logical_block_node;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.node.helpers.DummyNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.block_node.helpers.BlockAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.block_node.helpers.BlockNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.LogicalBlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.logical_block_node.helpers.LogicalBlockNode1;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.logical_block_node.helpers.LogicalBlockNode2;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionNeverEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicalBlockNodeTest {

    @Test
    void testEquals_WhenClassExpressionTrueBlockAndElseBlockSame_ReturnsTrue() {
        LogicalBlockNode logicalBlock1 = new LogicalBlockNode1(
                new ExpressionAlwaysEquals(),
                new BlockAlwaysEquals()
        );
        logicalBlock1.setElseBlock(new BlockAlwaysEquals());

        LogicalBlockNode logicalBlock2 = new LogicalBlockNode1(
                new ExpressionAlwaysEquals(),
                new BlockAlwaysEquals()
        );
        logicalBlock2.setElseBlock(new BlockAlwaysEquals());

        assertEquals(logicalBlock1, logicalBlock2);
        assertEquals(logicalBlock2, logicalBlock1);
    }

    @Test
    void testEquals_WhenClassDiffers_ReturnsFalse() {
        LogicalBlockNode logicalBlock1 = new LogicalBlockNode1(
                new ExpressionAlwaysEquals(),
                new BlockAlwaysEquals()
        );
        logicalBlock1.setElseBlock(new BlockAlwaysEquals());

        LogicalBlockNode logicalBlock2 = new LogicalBlockNode2(
                new ExpressionAlwaysEquals(),
                new BlockAlwaysEquals()
        );
        logicalBlock2.setElseBlock(new BlockAlwaysEquals());

        assertNotEquals(logicalBlock1, logicalBlock2);
        assertNotEquals(logicalBlock2, logicalBlock1);
    }

    @Test
    void testEquals_WhenExpressionDiffers_ReturnsFalse() {
        LogicalBlockNode logicalBlock1 = new LogicalBlockNode1(
                new ExpressionNeverEquals(),
                new BlockAlwaysEquals()
        );
        logicalBlock1.setElseBlock(new BlockAlwaysEquals());

        LogicalBlockNode logicalBlock2 = new LogicalBlockNode1(
                new ExpressionNeverEquals(),
                new BlockAlwaysEquals()
        );
        logicalBlock2.setElseBlock(new BlockAlwaysEquals());

        assertNotEquals(logicalBlock1, logicalBlock2);
        assertNotEquals(logicalBlock2, logicalBlock1);
    }

    @Test
    void testEquals_WhenTrueBlockDiffers_ReturnsFalse() {
        LogicalBlockNode logicalBlock1 = new LogicalBlockNode1(
                new ExpressionAlwaysEquals(),
                new BlockNeverEquals()
        );
        logicalBlock1.setElseBlock(new BlockAlwaysEquals());

        LogicalBlockNode logicalBlock2 = new LogicalBlockNode1(
                new ExpressionAlwaysEquals(),
                new BlockNeverEquals()
        );
        logicalBlock1.setElseBlock(new BlockAlwaysEquals());

        assertNotEquals(logicalBlock1, logicalBlock2);
        assertNotEquals(logicalBlock2, logicalBlock1);
    }

    @Test
    void testEquals_WhenElseBlockDiffers_ReturnsFalse() {
        LogicalBlockNode logicalBlock1 = new LogicalBlockNode1(
                new ExpressionAlwaysEquals(),
                new BlockAlwaysEquals()
        );
        logicalBlock1.setElseBlock(new BlockNeverEquals());

        LogicalBlockNode logicalBlock2 = new LogicalBlockNode1(
                new ExpressionAlwaysEquals(),
                new BlockAlwaysEquals()
        );
        logicalBlock1.setElseBlock(new BlockNeverEquals());

        assertNotEquals(logicalBlock1, logicalBlock2);
        assertNotEquals(logicalBlock2, logicalBlock1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnFalse() {
        LogicalBlockNode logicalBlock = new LogicalBlockNode1(
                new ExpressionAlwaysEquals(),
                new BlockNeverEquals()
        );
        Node differentNode = new DummyNode();

        assertNotEquals(logicalBlock, differentNode);
        assertNotEquals(differentNode, logicalBlock);
    }
}