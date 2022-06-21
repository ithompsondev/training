package com.sandbox.beansandbox.simplebean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleBeanApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("simplebean-context.xml");
        SimpleBean beanA = ctx.getBean("simpleBean",SimpleBean.class);
        SimpleBean beanB = ctx.getBean("simpleBean",SimpleBean.class);

        System.out.println("Default singleton? " + (beanA == beanB));
    }
}
