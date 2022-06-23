package com.sandbox.beansandbox.autotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutotateApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autotate-context.xml");
        ShortBean bean = ctx.getBean("shortBean",ShortBean.class);
        LongBean longBean = ctx.getBean("longBean",LongBean.class);
    }
}
