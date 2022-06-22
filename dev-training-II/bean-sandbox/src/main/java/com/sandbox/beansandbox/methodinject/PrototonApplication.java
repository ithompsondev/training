package com.sandbox.beansandbox.methodinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototonApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("prototon-context.xml");
        Singleton singleBean = ctx.getBean("singleBean",Singleton.class);
        Prototype protoBeanA = singleBean.createPrototype();
        Prototype protoBeanB = singleBean.createPrototype();

        System.out.println("Does protoBeanA and protoBeanB refer to the same instance? " + (protoBeanA == protoBeanB));
    }
}
