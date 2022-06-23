package com.sandbox.beansandbox.compscan;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviceBeanB")
@Qualifier(value="accessBean")
public class BeanB implements BeanNameAware, BeanNameAccessible {
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
