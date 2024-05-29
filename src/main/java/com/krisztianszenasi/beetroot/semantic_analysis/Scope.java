package com.krisztianszenasi.beetroot.semantic_analysis;

import com.krisztianszenasi.beetroot.semantic_analysis.symbol.FunctionSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.symbol.VariableSymbol;
import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

import java.util.HashMap;
import java.util.Objects;

public class Scope {
    private final Scope previous;
    private final HashMap<String, VariableSymbol> variables = new HashMap<>();
    private final HashMap<String, FunctionSymbol> functions = new HashMap<>();

    public Scope() { this.previous = null; }
    public Scope(Scope previous) { this.previous = previous; }

    public Scope getPrevious() {
        return previous;
    }

    public void add(VariableSymbol variableSymbol) {
        variables.put(variableSymbol.getName(), variableSymbol);
    }
    public void add(FunctionSymbol functionSymbol) { functions.put(functionSymbol.getName(), functionSymbol); }

    public VariableSymbol findVariable(String name) {
        if(variables.containsKey(name)) {
            return variables.get(name);
        } else if(previous != null) {
            return previous.findVariable(name);
        }
        return null;
    }

    public FunctionSymbol findFunction(String name) {
        if(functions.containsKey(name)) {
            return functions.get(name);
        } else if(previous != null) {
            return previous.findFunction(name);
        }
        return null;
    }

    public BSType getTypeForVariable(String name) {
        VariableSymbol variableFound = findVariable(name);
        if(variableFound != null) {
            return variableFound.getType();
        }
        return null;
    }
}
