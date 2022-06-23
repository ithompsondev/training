package com.sandbox.beansandbox.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanA {
    private BeanB beanB;

    @Autowired
    @Qualifier("beanAInject")
    public void setBeanB(BeanB beanB) {
        System.out.println("Injecting a BeanB into this BeanA");
        this.beanB = beanB;
    }

    public BeanB getBeanB() {
        return beanB;
    }
}
