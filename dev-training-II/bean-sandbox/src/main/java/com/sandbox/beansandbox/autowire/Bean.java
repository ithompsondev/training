package com.sandbox.beansandbox.autowire;

public class Bean {
    public Bean() {
        System.out.println("\tNew bean!");
    }

    @Override
    public String toString() {
        return "baby bean";
    }
}
