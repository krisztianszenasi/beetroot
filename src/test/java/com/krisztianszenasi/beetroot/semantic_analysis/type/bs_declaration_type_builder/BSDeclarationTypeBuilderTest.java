package com.krisztianszenasi.beetroot.semantic_analysis.type.bs_declaration_type_builder;

import com.krisztianszenasi.beetroot.ast.nodes.common.CompoundTypeNode;
import com.krisztianszenasi.beetroot.ast.nodes.common.PrimitiveTypeNode;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCompoundType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSSimpleType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.type_system.TypeSystemFixture;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSDeclarationTypeBuilderTest extends TypeSystemFixture {

    private static PrimitiveTypeNode childTypeNode;
    private static PrimitiveTypeNode parentTypeNode;
    private static PrimitiveTypeNode otherTypeNode;
    private static PrimitiveTypeNode compoundTypeNode;
    private static BSSimpleType compoundType;
    private static BSDeclarationTypeBuilder typeBuilder;


    @BeforeAll
    static void initTypeNodes() {
        childTypeNode = new PrimitiveTypeNode("child");
        parentTypeNode = new PrimitiveTypeNode("parent");
        otherTypeNode = new PrimitiveTypeNode("otherType");
        compoundTypeNode = new PrimitiveTypeNode("compound");
        typeBuilder = new BSDeclarationTypeBuilder();

        compoundType = new BSSimpleType("compound");
        typeSystem.addType(compoundType);
    }

    @Test
    void testGetTypeForPrimitiveTypeNode_WhenTypeExists_ReturnsIt() {
        BSType childResult = typeBuilder.getTypeForPrimitiveTypeNode(childTypeNode, typeSystem);
        BSType parentResult = typeBuilder.getTypeForPrimitiveTypeNode(parentTypeNode, typeSystem);

        assertEquals(childType, childResult);
        assertEquals(parentType, parentResult);
    }

    @Test
    void testGetTypeForPrimitiveTypeNode_WhenNoTypeExists_ReturnsError() {
        BSType nonExistentResult = typeBuilder.getTypeForPrimitiveTypeNode(otherTypeNode, typeSystem);

        assertEquals(errorType, nonExistentResult);
    }

    @Test
    void testGetTypeForCompoundTypeNode_WhenBothTypeAndInnerTypeExists_ReturnsMatchingOne() {
        CompoundTypeNode compoundChildTypeNode = new CompoundTypeNode(
                compoundTypeNode,
                childTypeNode
        );
        BSCompoundType result = typeBuilder.getTypeForCompoundTypeNode(compoundChildTypeNode, typeSystem);

        assertEquals(
                new BSCompoundType(compoundType, childType),
                result
        );
    }

    @Test
    void testGetTypeForCompoundTypeNode_WhenNoTypeAndInnerTypeExist_ReturnsCompoundWithErrors() {
        CompoundTypeNode otherOtherType = new CompoundTypeNode(
                otherTypeNode,
                otherTypeNode
        );
        BSCompoundType result = typeBuilder.getTypeForCompoundTypeNode(otherOtherType, typeSystem);

        assertEquals(
                new BSCompoundType(errorType, errorType),
                result
        );
    }
}