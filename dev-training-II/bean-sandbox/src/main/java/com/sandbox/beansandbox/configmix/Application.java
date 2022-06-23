package com.sandbox.beansandbox.configmix;

import com.sandbox.beansandbox.jconfautowire.ApplicationConfig;
import com.sandbox.beansandbox.jconfautowire.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        com.sandbox.beansandbox.jconfautowire.BeanA bean = ctx.getBean("beanA", BeanA.class);
        System.out.println(bean.getBeanB().getBeanC().getProperty());
    }
}
