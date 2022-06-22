package com.sandbox.beansandbox.methodinject;

public class Prototype {
    private static int counter = 0;

    public Prototype() {
        System.out.println("Protobean-" + (++counter) + " created!");
    }
}
