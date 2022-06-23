package com.sandbox.beansandbox.autotate;

import org.springframework.beans.factory.annotation.Autowired;

public class ShortBean {
    private Bean bean;

    public ShortBean() {
        System.out.println("New short bean!");
    }

    @Autowired
    public void setBean(Bean bean) {
        System.out.println("Applying bean to short bean");
        this.bean = bean;
    }

    @Override
    public String toString() {
        return "short bean hello...";
    }
}
