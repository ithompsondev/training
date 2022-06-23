package com.sandbox.beansandbox.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("resource-context.xml");
        BeanA bean = ctx.getBean("beanA",BeanA.class);
        System.out.println(bean.getBean().getBeanName());
    }
}
