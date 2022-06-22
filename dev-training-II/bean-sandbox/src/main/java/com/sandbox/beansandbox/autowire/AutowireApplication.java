package com.sandbox.beansandbox.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("auto-context.xml");
        ShortBean shortBean = ctx.getBean("shortBean",ShortBean.class);
    }
}
