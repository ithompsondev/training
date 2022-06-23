package com.sandbox.beansandbox.jconfautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private BeanC beanC;

    public BeanB() {
        System.out.println("New BeanB constructed.");
    }

    @Autowired
    public void setBeanC(BeanC beanC) {
        System.out.println("Injecting BeanC...");
        this.beanC = beanC;
    }

    public BeanC getBeanC() {
        return beanC;
    }
}
