package com.sandbox.beansandbox.jconfautowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private String property;

    @Autowired
    public void setProperty(@Value("BeanC Property Component")String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
}
