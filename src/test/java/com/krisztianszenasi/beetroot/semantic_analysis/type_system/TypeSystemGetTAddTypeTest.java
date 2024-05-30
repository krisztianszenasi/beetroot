package com.krisztianszenasi.beetroot.semantic_analysis.type_system;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.fixtures.TypeSystemTypeFixture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeSystemGetTAddTypeTest extends TypeSystemTypeFixture {

    @Test
    void testGetSimpleType_WhenTypeExists_ReturnsIt(){
        BSType intResult = typeSystem.getType(intType.getName());
        BSType decResult = typeSystem.getType(decType.getName());
        BSType strResult = typeSystem.getType(strType.getName());

        assertEquals(intResult, intType);
        assertEquals(decResult, decType);
        assertEquals(strResult, strType);
    }

    @Test
    void testGetWrapperType_WhenTypeExists_ReturnsIt() {
        BSType listResult = typeSystem.getType(listType.getName());
        BSType dictResult = typeSystem.getType(dictType.getName());

        assertEquals(listResult, listType);
        assertEquals(dictResult, dictType);
    }

    @Test
    void testGetSimpleType_WhenTypeDoesNotExist_ReturnsNull(){
        BSType nonExistentResult = typeSystem.getType(nonExistentSimpleType.getName());
        assertNull(nonExistentResult);
    }

    @Test
    void testGetWrapperType_WhenTypeDoesNotExist_ReturnsNull() {
        BSType nonExistentResult = typeSystem.getType(nonExistentWrapperType.getName());
        assertNull(nonExistentResult);
    }

    @Test
    void testAdd_WhenSimpleTypeAlreadyAdded_ReturnsFalse() {
        boolean addResult = typeSystem.add(intType);
        assertFalse(addResult);
    }

    @Test
    void testAdd_WhenWrapperTypeAlreadyAdded_ReturnsFalse() {
        boolean addResult = typeSystem.add(listType);
        assertFalse(addResult);
    }
}