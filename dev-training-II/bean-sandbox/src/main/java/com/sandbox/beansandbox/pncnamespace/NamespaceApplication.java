package com.sandbox.beansandbox.pncnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NamespaceApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("namespace-context.xml");
        Bean beanA = ctx.getBean("beanA",Bean.class);
        System.out.println("Retrieved bean: " + beanA + " from the application context");
    }
}
