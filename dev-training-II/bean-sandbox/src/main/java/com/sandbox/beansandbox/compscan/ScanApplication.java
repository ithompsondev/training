package com.sandbox.beansandbox.compscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScanApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("compscan-context.xml");
        BeanA bean = ctx.getBean("beanA", BeanA.class);
        System.out.println(bean.getBean().getBeanName());
    }
}
