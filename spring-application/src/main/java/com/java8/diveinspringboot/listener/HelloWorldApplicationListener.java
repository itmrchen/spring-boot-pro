package com.java8.diveinspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWord {@link ApplicationListener} 监听 {@link ContextRefreshedEvent}
 *
 * @author chenbo
 * @date 2019/9/13 1:35
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Hello World:" + event.getApplicationContext().getId() + ",timestamp:" + event.getTimestamp());
    }
}
