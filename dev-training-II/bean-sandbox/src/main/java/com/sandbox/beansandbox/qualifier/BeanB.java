package com.sandbox.beansandbox.qualifier;

public class BeanB {
    private String property;

    public void setProperty(String property) {
        System.out.println("Setting BeanB property: " + property);
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
}
