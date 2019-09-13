package com.java8.diveinspringboot.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @author chenbo
 * @date 2019/9/13 1:13
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {
    @Override
    public void initialize(C configurableApplicationContext) {
        System.out.println("configurableApplicationContext id:" + configurableApplicationContext.getId());
    }
}
