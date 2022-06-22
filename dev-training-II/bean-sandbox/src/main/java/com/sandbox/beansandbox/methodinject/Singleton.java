package com.sandbox.beansandbox.methodinject;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singleton implements ApplicationContextAware {
    private Prototype prototype;
    private ApplicationContext ctx;

    public Prototype createPrototype() {
        return ctx.getBean("protoBean",Prototype.class);
    }

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
