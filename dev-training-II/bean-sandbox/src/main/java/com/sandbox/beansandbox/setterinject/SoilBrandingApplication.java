package com.sandbox.beansandbox.setterinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SoilBrandingApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("setterinject-context.xml");
        Bean bean = ctx.getBean("soiledBean",Bean.class);
    }
}
