package com.java8.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot webmvc引导类
 *
 * @author itmrchen
 * @date 2019/9/15 1:15
 */
@SpringBootApplication(scanBasePackages = "com.java8.web")
public class SpringbootWebMvcBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebMvcBootstrap.class, args);
    }
}
