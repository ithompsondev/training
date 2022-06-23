package com.sandbox.beansandbox.autotate;

import org.springframework.beans.factory.annotation.Autowired;

public class BareBean {
    private SimpleBean[] simpleBeans;

    public SimpleBean[] getSimpleBeans() {
        return simpleBeans;
    }

    @Autowired
    public void setSimpleBeans(SimpleBean[] simpleBeans) {
        this.simpleBeans = simpleBeans;
    }
}
