package com.krisztianszenasi.beetroot.semantic_analysis.symbol;

import com.krisztianszenasi.beetroot.ast.nodes.statement.simple.expression.primary.FunctionCallExpressionNode;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeError;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.TypeSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FunctionSymbol {
    private final String name;
    private final BSType returnType;
    private final List<BSType> argumentTypes;

    public FunctionSymbol(String name, BSType returnType) {
        this.name = name;
        this.returnType = returnType;
        this.argumentTypes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public BSType getReturnType() {
        return returnType;
    }

    public void addArgType(BSType argType) {
        argumentTypes.add(argType);
    }

    public void validateArguments(
            List<BSType> argumentTypes,
            ErrorHandler errorHandler,
            FunctionCallExpressionNode node
    ) {
        if(validateArgumentCount(argumentTypes, errorHandler, node)){
            validateArgumentTypes(argumentTypes, errorHandler, node);
        }
    }

    private boolean validateArgumentCount(
            List<BSType> argumentTypes,
            ErrorHandler errorHandler,
            FunctionCallExpressionNode node
    ) {
        if(this.argumentTypes.size() != argumentTypes.size()) {
            errorHandler.add(
                    TypeError.buildFunctionArgumentCountError(
                            name,
                            this.argumentTypes.size(),
                            argumentTypes.size(),
                            node.getLine(),
                            node.getColumn()
                    )
            );
            return false;
        }
        return true;
    }

    private void validateArgumentTypes(
            List<BSType> argumentTypes,
            ErrorHandler errorHandler,
            FunctionCallExpressionNode node
    ) {
        for(int i = 0; i < argumentTypes.size(); i++) {
            BSType actualType = argumentTypes.get(i);
            BSType expectedType = this.argumentTypes.get(i);
            if(!actualType.isCompatibleWith(expectedType)) {
                errorHandler.add(TypeError.buildUnxepectedArguentTypeError(
                        name,
                        i,
                        actualType.toString(),
                        expectedType.toString(),
                        node.getLine(),
                        node.getColumn()
                ));
            }
        }
    }
}
