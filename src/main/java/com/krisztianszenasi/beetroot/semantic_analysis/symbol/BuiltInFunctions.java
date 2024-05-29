package com.krisztianszenasi.beetroot.semantic_analysis.symbol;

import com.krisztianszenasi.beetroot.semantic_analysis.Scope;
import com.krisztianszenasi.beetroot.semantic_analysis.type.names.TypeName;
import com.krisztianszenasi.beetroot.semantic_analysis.type_system.TypeSystem;

public class BuiltInFunctions {
    public static void register(Scope scope, TypeSystem typeSystem) {
        FunctionSymbol print = new FunctionSymbol("print", typeSystem.getType(TypeName.NONE));
        print.addArgType(typeSystem.getType(TypeName.ANY));
        scope.add(print);
    }
}
