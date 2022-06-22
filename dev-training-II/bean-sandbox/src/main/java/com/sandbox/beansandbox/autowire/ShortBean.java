package com.sandbox.beansandbox.autowire;

public class ShortBean {
    private Bean bean;

    public ShortBean() {
        System.out.println("New short bean!");
    }

    public void setBeanA(Bean bean) {
        System.out.println("Applying bean to short bean");
        this.bean = bean;
    }
}
