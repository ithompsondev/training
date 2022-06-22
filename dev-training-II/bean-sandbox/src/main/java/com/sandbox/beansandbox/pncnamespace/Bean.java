package com.sandbox.beansandbox.pncnamespace;

public abstract class Bean {
    protected String name;
    protected int length;
    protected Bean dependencyBean;

    public void setName(String name) {
        System.out.println("This is a " + name + " bean");
        this.name = name;
    }

    public void setLength(int length) {
        System.out.println("This bean is " + length + " mm long");
        this.length = length;
    }

    public void setDependencyBean(Bean other) {
        System.out.println("This bean is dependent on " + other + " bean to grow");
        this.dependencyBean = other;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
