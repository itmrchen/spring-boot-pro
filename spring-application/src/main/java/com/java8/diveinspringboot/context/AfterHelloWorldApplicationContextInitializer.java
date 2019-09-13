package com.java8.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author chenbo
 * @date 2019/9/13 1:19
 */
public class AfterHelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C configurableApplicationContext) {
        System.out.println("After configurableApplicationContext id:" + configurableApplicationContext.getId());
    }
}
