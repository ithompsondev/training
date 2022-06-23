package com.sandbox.beansandbox.autowire;

public class ConstructedBean {
    private Bean beanA;
    private ShortBean beanB;

    public ConstructedBean(Bean beanA, ShortBean beanB) {
        System.out.println("Constructed new bean!");
        this.beanA = beanA;
        this.beanB = beanB;
    }

    private String beanHello(Bean bean) {
        return "Hello from " + bean + ", in constructed bean";
    }

    private String beanHello(ShortBean bean) {
        return "Hello from " + bean + ", in constructed bean";
    }

    @Override
    public String toString() {
        String firstHello = this.beanHello(this.beanA);
        String lastHello = this.beanHello(this.beanB);
        return firstHello + "\n" + lastHello;
    }
}
