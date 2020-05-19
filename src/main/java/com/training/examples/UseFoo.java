package com.training.examples;

import java.util.function.Function;

public class UseFoo {
    public String add(String string, Function<String, String> function) {
        return function.apply(string);
    }
}
