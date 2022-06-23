package com.sandbox.beansandbox.compscan;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Repository;

@Repository
public class BeanC implements BeanNameAware, BeanNameAccessible {
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
