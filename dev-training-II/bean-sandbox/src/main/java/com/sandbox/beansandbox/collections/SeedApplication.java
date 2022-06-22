package com.sandbox.beansandbox.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SeedApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("collection-context.xml");
        SimpleBean bean = ctx.getBean("simpleBean",SimpleBean.class);
        System.out.println(bean.getSeedList());
    }
}
