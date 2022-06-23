package com.sandbox.beansandbox.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class BeanA {
    private BeanNameAccessible bean;

    public BeanNameAccessible getBean() {
        return bean;
    }

    //@Autowired
    @Resource
    @Qualifier(value="accessBean")
    public void setBeanInjection(BeanNameAccessible bean) {
        this.bean = bean;
    }
}
