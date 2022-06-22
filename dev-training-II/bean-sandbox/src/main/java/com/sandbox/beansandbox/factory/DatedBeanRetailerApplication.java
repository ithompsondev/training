package com.sandbox.beansandbox.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DatedBeanRetailerApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("factory-context.xml");
        DatedBeanRetailer retailer = ctx.getBean("datedBeanRetailer",DatedBeanRetailer.class);
        DatedBean datedBean = ctx.getBean("datedBean",DatedBean.class);
        // retailer.displayInventory();
        System.out.println("New been in stock now. Available from " + datedBean.getTime());
    }
}
