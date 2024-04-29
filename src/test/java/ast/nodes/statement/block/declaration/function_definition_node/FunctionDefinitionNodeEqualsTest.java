package ast.nodes.statement.block.declaration.function_definition_node;

import ast.nodes.common.type_node.helpers.TypeAlwaysEquals;
import ast.nodes.common.type_node.helpers.TypeNeverEquals;
import ast.nodes.node.helpers.DummyNode;
import ast.nodes.statement.block.declaration.parameter_list_node.helpers.ParamListAlwaysEquals;
import ast.nodes.statement.block.declaration.parameter_list_node.helpers.ParamListNeverEquals;
import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.BlockNode;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.FunctionDefinitionNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionDefinitionNodeEqualsTest {

    @Test
    void testEquals_WhenNameReturnTypeAndParamsSame_ReturnsTrue(){
        FunctionDefinitionNode funcDef1 = new FunctionDefinitionNode(
                "funcName",
                new TypeAlwaysEquals(),
                new ParamListAlwaysEquals(),
                new BlockNode()
        );
        FunctionDefinitionNode funcDef2 = new FunctionDefinitionNode(
                funcDef1.getName(),
                new TypeAlwaysEquals(),
                new ParamListAlwaysEquals(),
                new BlockNode()
        );

        assertEquals(funcDef1, funcDef2);
        assertEquals(funcDef2, funcDef1);
    }

    @Test
    void testEquals_WhenNameDiffers_ReturnsFalse(){
        FunctionDefinitionNode funcDef1 = new FunctionDefinitionNode(
                "funcName",
                new TypeAlwaysEquals(),
                new ParamListAlwaysEquals(),
                new BlockNode()
        );
        FunctionDefinitionNode funcDef2 = new FunctionDefinitionNode(
                funcDef1.getName() + "difference",
                new TypeAlwaysEquals(),
                new ParamListAlwaysEquals(),
                new BlockNode()
        );

        assertNotEquals(funcDef1, funcDef2);
        assertNotEquals(funcDef2, funcDef1);
    }

    @Test
    void testEquals_WhenReturnTypeDiffers_ReturnsFalse(){
        FunctionDefinitionNode funcDef1 = new FunctionDefinitionNode(
                "funcName",
                new TypeNeverEquals(),
                new ParamListAlwaysEquals(),
                new BlockNode()
        );
        FunctionDefinitionNode funcDef2 = new FunctionDefinitionNode(
                funcDef1.getName(),
                new TypeNeverEquals(),
                new ParamListAlwaysEquals(),
                new BlockNode()
        );

        assertNotEquals(funcDef1, funcDef2);
        assertNotEquals(funcDef2, funcDef1);
    }

    @Test
    void testEquals_WhenParamListDiffers_ReturnsFalse(){
        FunctionDefinitionNode funcDef1 = new FunctionDefinitionNode(
                "funcName",
                new TypeAlwaysEquals(),
                new ParamListNeverEquals(),
                new BlockNode()
        );
        FunctionDefinitionNode funcDef2 = new FunctionDefinitionNode(
                funcDef1.getName(),
                new TypeAlwaysEquals(),
                new ParamListNeverEquals(),
                new BlockNode()
        );

        assertNotEquals(funcDef1, funcDef2);
        assertNotEquals(funcDef2, funcDef1);
    }

    @Test
    void testEquals_WhenDifferentNode_ReturnsFalse(){
        FunctionDefinitionNode funcDef = new FunctionDefinitionNode(
                "funcName",
                new TypeAlwaysEquals(),
                new ParamListAlwaysEquals(),
                new BlockNode()
        );
        Node differentNode = new DummyNode();

        assertNotEquals(funcDef, differentNode);
        assertNotEquals(differentNode, funcDef);
    }
}