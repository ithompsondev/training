package com.sandbox.beansandbox.jconfautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private BeanB beanB;

    @Autowired
    public BeanA(BeanB beanB) {
        System.out.println("New BeanA constructed. Injecting BeanB...");
        this.beanB = beanB;
    }

    public BeanB getBeanB() {
        return beanB;
    }
}
