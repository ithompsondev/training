package com.sandbox.beansandbox.factory;

import java.time.LocalTime;

public class DatedBeanFactory {
    private LocalTime createdAt;

    private DatedBeanFactory() {
        this.createdAt = LocalTime.now();
        System.out.println("The bean factory has been instantiated at " + this.createdAt.toString());
    }

    public DatedBean getDatedBeanInstance(LocalTime beanTime) {
        return new DatedBean(beanTime);
    }
}
