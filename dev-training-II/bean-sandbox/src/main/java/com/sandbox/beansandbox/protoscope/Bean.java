package com.sandbox.beansandbox.protoscope;

public class Bean {
    private static int counter = 0;

    public Bean() {
        System.out.println("Hello from Bean-" + (++counter));
    }
}
