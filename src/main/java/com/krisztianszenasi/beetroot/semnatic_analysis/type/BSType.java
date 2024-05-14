package com.krisztianszenasi.beetroot.semnatic_analysis.type;

import java.util.HashSet;

abstract public class BSType {
    public abstract boolean isCompatibleWith(BSType type);
}
