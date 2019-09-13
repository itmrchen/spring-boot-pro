package com.java8.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * After HelloWord {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author chenbo
 * @date 2019/9/13 1:35
 */
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>, Ordered {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("After Hello World:" + event.getApplicationContext().getId() + ",timestamp:" + event.getTimestamp());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
