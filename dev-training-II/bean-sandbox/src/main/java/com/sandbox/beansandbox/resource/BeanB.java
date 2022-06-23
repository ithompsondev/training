package com.sandbox.beansandbox.resource;

import org.springframework.beans.factory.BeanNameAware;

public class BeanB implements BeanNameAware,BeanNameAccessible {
    private String name;

    @Override
    public String getBeanName() {
        return name;
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }
}
