package com.sandbox.beansandbox.javaconfiginject;

public class BeanA {
    private BeanB beanB;

    public BeanA(BeanB beanB) {
        System.out.println("New BeanA constructed. Injecting BeanB...");
        this.beanB = beanB;
    }

    public BeanB getBeanB() {
        return beanB;
    }
}
