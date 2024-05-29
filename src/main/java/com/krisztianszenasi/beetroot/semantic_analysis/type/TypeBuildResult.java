package com.krisztianszenasi.beetroot.semantic_analysis.type;

import com.krisztianszenasi.beetroot.semantic_analysis.error.BaseError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TypeBuildResult {
    private BSType type;
    private final List<BaseError> errors;

    public TypeBuildResult() {
        this.type = null;
        this.errors = new ArrayList<>();
    }

    public void setType(BSType type) {
        this.type = type;
    }

    public BSType getType() {
        return type;
    }


    public void addError(BaseError error) {
        errors.add(error);
    }

    public List<BaseError> getErrors() {
        return Collections.unmodifiableList(errors);
    }
}
