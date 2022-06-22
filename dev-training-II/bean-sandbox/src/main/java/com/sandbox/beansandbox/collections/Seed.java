package com.sandbox.beansandbox.collections;

public class Seed {
    private String name;

    public Seed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
