package com.sandbox.beansandbox.compscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BeanA {
    private BeanNameAccessible bean;

    public BeanNameAccessible getBean() {
        return bean;
    }

    @Autowired
    @Qualifier(value="accessBean")
    public void setBeanInjection(BeanNameAccessible bean) {
        this.bean = bean;
    }
}
