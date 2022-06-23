package com.sandbox.beansandbox.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }
}
