package com.sandbox.beansandbox.moresimplebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleBeanApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("simplebean-context.xml");
        SimpleBean beanA = ctx.getBean("simpleBeanA", SimpleBean.class);
        SimpleBean beanB = ctx.getBean("simpleBeanB", SimpleBean.class);

        System.out.println("Default singleton? " + (beanA == beanB));
    }
}
