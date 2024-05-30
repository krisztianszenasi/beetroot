package com.krisztianszenasi.beetroot.semantic_analysis.symbol;

import com.krisztianszenasi.beetroot.semantic_analysis.type.BSType;

public class VariableSymbol {
    private final String name;
    private final BSType type;
    private final boolean mutable;
    private final boolean hasValue;

    public VariableSymbol(String name, BSType type, boolean mutable, boolean hasValue) {
        this.name = name;
        this.type = type;
        this.mutable = mutable;
        this.hasValue = hasValue;
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
    public boolean hasValue() {
        return hasValue;
    }
}
