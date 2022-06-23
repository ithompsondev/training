package com.sandbox.beansandbox.annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotateApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("annotate-context.xml");
        Bean bean = ctx.getBean("beanA",Bean.class);
        System.out.println(bean.getProperty());
    }
}
