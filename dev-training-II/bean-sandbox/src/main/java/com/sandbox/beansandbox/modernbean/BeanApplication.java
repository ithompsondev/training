package com.sandbox.beansandbox.modernbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("modernbean-context.xml");
        Bean bean = ctx.getBean("modernBeanFullName",Bean.class);
    }
}
