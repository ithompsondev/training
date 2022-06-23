package com.sandbox.beansandbox.javaconfiginject;

public class BeanB {
    private BeanC beanC;

    public BeanB() {
        System.out.println("New BeanB constructed.");
    }

    public void setBeanC(BeanC beanC) {
        System.out.println("Injecting BeanC...");
        this.beanC = beanC;
    }

    public BeanC getBeanC() {
        return beanC;
    }
}
