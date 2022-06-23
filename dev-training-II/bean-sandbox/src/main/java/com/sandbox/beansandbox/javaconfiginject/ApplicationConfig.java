package com.sandbox.beansandbox.javaconfiginject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    /*
        <bean id="beanA" class="com.sandbox.beansandbox.javaconfiginject.BeanA">
	        <constructor-arg ref="beanB"/>
        </bean>
     */
    @Bean
    public BeanA beanA() {
        return new BeanA(beanB());
    }

    /*
        <bean id="beanB" class="com.sandbox.beansandbox.javaconfiginject.BeanB">
	        <property name="beanC" ref="beanC"/>
        </bean>
     */
    @Bean
    public BeanB beanB() {
        BeanB beanB = new BeanB();
        beanB.setBeanC(beanC());

        return beanB;
    }

    /*
        <bean id="beanC" class="com.sandbox.beansandbox.javaconfiginject.BeanC">
	        <property name="property" value="BeanC Property"/>
        </bean>
     */
    @Bean
    public BeanC beanC() {
        BeanC beanC = new BeanC();
        beanC.setProperty("BeanC Property");

        return beanC;
    }
}
