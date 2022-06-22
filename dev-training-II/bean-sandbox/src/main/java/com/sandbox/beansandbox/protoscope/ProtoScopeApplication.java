package com.sandbox.beansandbox.protoscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoScopeApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("protoscope-context.xml");
        Bean beanA = ctx.getBean("protoBean",Bean.class);
        Bean beanB = ctx.getBean("protoBean",Bean.class);
        System.out.println("Are beanA and beanB the same reference? " + (beanA == beanB));
    }
}
