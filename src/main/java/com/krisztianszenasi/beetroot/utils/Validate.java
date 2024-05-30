package com.krisztianszenasi.beetroot.utils;

public class Validate {

    public static <T> T notNull(T object, String message) throws IllegalStateException {
        if(object == null) {
            throw new IllegalArgumentException(message);
        }
        return object;
    }
}
