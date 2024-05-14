package com.krisztianszenasi.beetroot.semnatic_analysis;

import com.krisztianszenasi.beetroot.semnatic_analysis.symbol.VariableSymbol;

import java.util.HashMap;

public class Scope {
    private final Scope previous;
    private final HashMap<String, VariableSymbol> variables = new HashMap<>();

    public Scope() { this.previous = null; }
    public Scope(Scope previous) { this.previous = previous; }

    public Scope getPrevious() {
        return previous;
    }

    public void add(VariableSymbol variableSymbol) {
        variables.put(variableSymbol.getName(), variableSymbol);
    }

    public VariableSymbol findVariable(String name) {
        if(variables.containsKey(name)) {
            return variables.get(name);
        } else if(previous != null) {
            return previous.findVariable(name);
        }
        return null;
    }
}
