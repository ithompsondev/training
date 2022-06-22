package com.sandbox.beansandbox.setterinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("setterinject-context.xml");
        Bean bean = ctx.getBean("setterBean",Bean.class);
    }
}
