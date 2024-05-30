package com.krisztianszenasi.beetroot.semantic_analysis.builders;

import com.krisztianszenasi.beetroot.ast.nodes.Node;
import com.krisztianszenasi.beetroot.ast.nodes.statement.block.declaration.FunctionDefinitionNode;
import com.krisztianszenasi.beetroot.semantic_analysis.error.ErrorHandler;
import com.krisztianszenasi.beetroot.semantic_analysis.error.TypeError;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.FunctionSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class FunctionBuilder {
    private final FunctionBuilder previous;
    private final FunctionSymbol function;
    private boolean foundReturnStatement = false;

    public FunctionBuilder(FunctionBuilder previous, FunctionSymbol function) {
        this.previous = previous;
        this.function = function;
    }

    public void addArgType(BSType argType){
        function.addArgType(argType);
    }

    public boolean isValidReturnType(BSType returnType) {
        return returnType.isCompatibleWith(function.getReturnType());
    }

    public FunctionBuilder getPrevious() {
         return previous;
    }

    public String getFunctionName() {
        return function.getName();
    }

    public BSType getReturnType() {
        return function.getReturnType();
    }

    public void setFoundReturnStatement() {
        foundReturnStatement = true;
    }

    public void checkForMissingReturn(FunctionDefinitionNode node, ErrorHandler errorHandler) {
        if(!foundReturnStatement && node.getReturnType() != null) {
            errorHandler.add(new TypeError(
                    node.getLine(),
                    node.getColumn(),
                    String.format("Function '%s' does not have a return statement", node.getName())
            ));
        }
    }
}
