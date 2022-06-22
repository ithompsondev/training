package com.sandbox.beansandbox.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("collection-context.xml");
        Bean bean = ctx.getBean("collectionBean",Bean.class);
        System.out.println("Displaying Bean Collections");
        System.out.println(bean.getList());
        System.out.println(bean.getMap());
        System.out.println(bean.getSet());
        System.out.println(bean.getProperties());
    }
}
