package com.krisztianszenasi.beetroot.semantic_analysis.validators;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.ReturnStatement;
import com.krisztianszenasi.beetroot.semantic_analysis.builders.FunctionBuilder;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class FunctionValidator {
    public static void validateReturnType(
            BSType returnType,
            FunctionBuilder currentFunctionBuild,
            ErrorHandler errorHandler,
            ReturnStatement returnNode
    ) {
        if(!currentFunctionBuild.isValidReturnType(returnType)) {
            errorHandler.addIncompatibleReturnType(
                    currentFunctionBuild.getFunctionName(),
                    currentFunctionBuild.getReturnType().toString(),
                    returnType.toString(),
                    returnNode
            );
        }
    }
}
