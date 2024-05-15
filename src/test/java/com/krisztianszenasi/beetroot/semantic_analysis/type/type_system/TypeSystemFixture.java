package com.krisztianszenasi.beetroot.semantic_analysis.type.type_system;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSSimpleType;
import com.krisztianszenasi.beetroot.semantic_analysis.type.TypeSystem;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSBinaryOperator;
import com.krisztianszenasi.beetroot.semantic_analysis.type.operator.BSUnaryOperator;
import org.junit.jupiter.api.BeforeAll;

public class TypeSystemFixture {
    protected static BSSimpleType childType;
    protected static BSSimpleType parentType;
    protected static BSSimpleType errorType;
    protected static BSSimpleType otherType;
    protected static BSBinaryOperator childOperatorChildChild;
    protected static BSBinaryOperator parentOperatorParentParent;
    protected static BSUnaryOperator childOperatorChild;
    protected static BSUnaryOperator parentOperatorParent;
    protected static TypeSystem typeSystem;

    @BeforeAll
    static void init() {
        // initialize types
        errorType = new BSSimpleType("error");
        parentType = new BSSimpleType("parent");
        childType = new BSSimpleType("child");
        otherType = new BSSimpleType("otherType");

        parentType.addParent(errorType);
        childType.addParent(parentType);

        typeSystem = new TypeSystem(errorType);
        typeSystem.addType(parentType);
        typeSystem.addType(childType);

        // binary operators
        childOperatorChildChild = new BSBinaryOperator(childType, "operator", childType, childType);
        typeSystem.addBinary(childOperatorChildChild);
        parentOperatorParentParent = new BSBinaryOperator(parentType, "operator", parentType, parentType);
        typeSystem.addBinary(parentOperatorParentParent);

        // unary operators
        childOperatorChild = new BSUnaryOperator(childType, "operator", childType);
        typeSystem.addUnary(childOperatorChild);
        parentOperatorParent = new BSUnaryOperator(parentType, "operator", parentType);
        typeSystem.addUnary(parentOperatorParent);
    }
}
