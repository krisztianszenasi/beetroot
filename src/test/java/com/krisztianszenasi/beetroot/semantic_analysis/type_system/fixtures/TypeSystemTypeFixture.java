package com.krisztianszenasi.beetroot.semantic_analysis.type_system.fixtures;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSCanBeIndexedType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSNamedType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSWrapperType;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.TypeSystem;
import org.junit.jupiter.api.BeforeAll;

public class TypeSystemTypeFixture {
    protected static BSNamedType nonExistentSimpleType;
    protected static BSNamedType errorType;
    protected static BSNamedType anyType;
    protected static BSNamedType noneType;
    protected static BSNamedType decType;
    protected static BSNamedType intType;
    protected static BSNamedType boolType;
    protected static BSCanBeIndexedType strType;
    protected static BSWrapperType nonExistentWrapperType;
    protected static BSCanBeIndexedType listType;
    protected static BSCanBeIndexedType dictType;
    protected static TypeSystem typeSystem;

    @BeforeAll
    static void initTypeSystem() {
        initTypes();
        addTypesToSystem();
    }

    static void initTypes() {
        // simple types
        nonExistentSimpleType = new BSNamedType("non existent", null);
        errorType = new BSNamedType("error", null);
        anyType = new BSNamedType("any", errorType);
        noneType = new BSNamedType("none", anyType);
        decType = new BSNamedType("dec", noneType);
        intType = new BSNamedType("int", decType);
        boolType = new BSNamedType("bool", intType);
        // can be indexed types
        nonExistentWrapperType = new BSWrapperType("non existent", null, null);
        strType = new BSCanBeIndexedType("str", noneType, intType);
        listType = new BSCanBeIndexedType("list", noneType, intType, anyType);
        dictType = new BSCanBeIndexedType("dict", noneType, anyType, anyType);
    }

    static void addTypesToSystem() {
        typeSystem = new TypeSystem();
        // simple types
        typeSystem.add(errorType);
        typeSystem.add(anyType);
        typeSystem.add(decType);
        typeSystem.add(intType);
        typeSystem.add(boolType);
        typeSystem.add(strType);
        // wrapper types
        typeSystem.add(listType);
        typeSystem.add(dictType);
    }
}
