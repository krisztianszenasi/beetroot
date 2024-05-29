package com.krisztianszenasi.beetroot.semantic_analysis.builders;

import com.krisztianszenasi.beetroot.semantic_analysis.symbol.FunctionSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class FunctionBuilder {
    private final FunctionBuilder previous;
    private final FunctionSymbol function;

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
}
