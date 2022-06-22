package com.sandbox.beansandbox.modernbean;

public class ShortBean {
    public ShortBean(LongBean longBean) {
        System.out.println("Hello, from a ShortBean object! Executing LongBean...");
        longBean.exec();
    }
}
