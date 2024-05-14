package com.krisztianszenasi.beetroot.semnatic_analysis.symbol;

import com.krisztianszenasi.beetroot.semnatic_analysis.type.BSType;

public class VariableSymbol {
    private final String name;
    private final BSType type;
    private final boolean mutable;

    public VariableSymbol(String name, BSType type, boolean mutable) {
        this.name = name;
        this.type = type;
        this.mutable = mutable;
    }

    public String getName() {
        return name;
    }

    public BSType getType() {
        return type;
    }
    public boolean canBeChanged() {
        return mutable;
    }
}
