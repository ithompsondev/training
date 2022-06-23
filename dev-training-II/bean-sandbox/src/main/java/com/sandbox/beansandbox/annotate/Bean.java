package com.sandbox.beansandbox.annotate;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Bean {
    private String property;

    public Bean() {
        System.out.println("New bean!");
    }

    @Required
    @Value("testProperty")
    public void setProperty(String prop) {
        System.out.println("Setting property: " + prop);
        property = prop;
    }

    public String getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "baby bean";
    }
}
