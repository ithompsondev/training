package com.sandbox.beansandbox.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructAutoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("auto-context.xml");
        ConstructedBean bean = ctx.getBean("constructedBean",ConstructedBean.class);
        System.out.println(bean);
    }
}
