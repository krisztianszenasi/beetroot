package com.krisztianszenasi.beetroot.semantic_analysis.validators;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeError;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class TypeValidator {

    public static void validateCompatibility(BSType actual, BSType expected, ErrorHandler errorHandler, Node node) {
        if(!actual.isCompatibleWith(expected)) {
            errorHandler.add(TypeError.buildTypeAreIncompatibleError(
                    expected.toString(),
                    actual.toString(),
                    node.getLine(),
                    node.getColumn()
            ));
        }
    }
}
