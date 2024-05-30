package com.krisztianszenasi.beetroot.semantic_analysis.builders.bs_declaration_type_builder;

import com.krisztianszenasi.beetroot.ast.nodes.common.type.SimpleTypeNode;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.declaration_type.BSDeclarationTypeBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSNamedType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.TypeSystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSDeclarationTypeBuilderTest  {

    @Test
    void testGetTypeForSimpleTypeNode() {
        SimpleTypeNode simpleTypeNode = new SimpleTypeNode("test");
        BSNamedType simpleType = new BSNamedType(simpleTypeNode.getType(), null);

        TypeSystem typeSystem = new TypeSystem();
        typeSystem.add(simpleType);

        ErrorHandler errorHandler = new ErrorHandler();
        BSDeclarationTypeBuilder builder = new BSDeclarationTypeBuilder(typeSystem, errorHandler);

        BSType result = builder.getTypeForSimpleTypeNode(simpleTypeNode);
        SimpleTypeNode nonExistent = new SimpleTypeNode("asd");
        nonExistent.setPosition(1, 10);
        builder.getTypeFor(nonExistent);

        assertEquals(simpleType, result);
    }
}