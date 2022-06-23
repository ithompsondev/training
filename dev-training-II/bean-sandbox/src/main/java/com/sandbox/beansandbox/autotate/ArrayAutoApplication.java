package com.sandbox.beansandbox.autotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.ast.BeanReference;

public class ArrayAutoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autotate-context.xml");
        BareBean bean = ctx.getBean("bareBean", BareBean.class);
        System.out.println("Array of simple beans include:");
        for (SimpleBean simpleBean: bean.getSimpleBeans()) {
            System.out.println(simpleBean.getName());
        }
    }
}
