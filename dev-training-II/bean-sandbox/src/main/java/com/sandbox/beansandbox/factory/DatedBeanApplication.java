package com.sandbox.beansandbox.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatedBeanApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("factory-context.xml");
        DatedBean bean = ctx.getBean("datedBean",DatedBean.class);
        System.out.println("This dated bean was created: " + bean.getTime());
    }
}
