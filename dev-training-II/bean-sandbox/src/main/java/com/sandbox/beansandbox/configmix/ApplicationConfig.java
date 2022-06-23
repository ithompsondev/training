package com.sandbox.beansandbox.configmix;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.sandbox.beansandbox.configmix")
@ImportResource("mix-context.xml")
public class ApplicationConfig {}
