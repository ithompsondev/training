package com.sandbox.beansandbox.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("qual-context.xml");
        BeanA beanA = ctx.getBean("beanA",BeanA.class);
        System.out.println(beanA.getBeanB().getProperty());
    }
}
