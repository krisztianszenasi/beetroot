package ast.nodes.statement.block.logical.for_statement_node;

import ast.nodes.statement.block.block_node.helpers.BlockAlwaysEquals;
import ast.nodes.statement.block.block_node.helpers.BlockNeverEquals;
import ast.nodes.statement.simple.expression.expression_node.helpers.DummyExpression;
import ast.nodes.statement.simple.expression.expression_node.helpers.ExpressionAlwaysEquals;
import ast.nodes.statement.simple.variable_declaration_node.helpers.VarDecAlwaysEquals;
import ast.nodes.statement.simple.variable_declaration_node.helpers.VarDecNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.FunctionDefinitionNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.logical.ForStatementNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.VariableDeclarationNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForStatementNodeTest {

    @Test
    void testEquals_WhenVarDecSame_ReturnsTrue() {
        ForStatementNode forBlock1 = buildWith(VarDecAlwaysEquals.getInstance());
        ForStatementNode forBlock2 = buildWith(VarDecAlwaysEquals.getInstance());

        assertEquals(forBlock1, forBlock2);
        assertEquals(forBlock2, forBlock1);
    }

    @Test
    void testEquals_WhenVarDecDiffers_ReturnsFalse() {
        ForStatementNode forBlock1 = buildWith(VarDecNeverEquals.getInstance());
        ForStatementNode forBlock2 = buildWith(VarDecNeverEquals.getInstance());

        assertNotEquals(forBlock1, forBlock2);
        assertNotEquals(forBlock2, forBlock1);
    }

    private ForStatementNode buildWith(VariableDeclarationNode varDec) {
        return new ForStatementNode(
            new ExpressionAlwaysEquals(),
            new BlockAlwaysEquals(),
            new BlockAlwaysEquals(),
            varDec
        );
    }
}