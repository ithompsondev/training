package com.sandbox.beansandbox.autotate;

import org.springframework.beans.factory.annotation.Autowired;

public class LongBean {
    private ShortBean starter;

    @Autowired
    public LongBean(ShortBean starter) {
        System.out.println("Long bean created from starter short bean!");
        this.starter = starter;
    }


}
