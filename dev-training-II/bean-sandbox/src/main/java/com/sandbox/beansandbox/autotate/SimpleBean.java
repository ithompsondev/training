package com.sandbox.beansandbox.autotate;

public class SimpleBean {
    private String name;

    public SimpleBean() {
        System.out.println("A simple bean has been created!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
