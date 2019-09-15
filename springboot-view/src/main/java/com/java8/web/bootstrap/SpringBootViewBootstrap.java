package com.java8.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 视图引导类
 *
 * @author itmrchen
 * @date 2019/9/15 20:33
 */
@SpringBootApplication(scanBasePackages = "com.java8.web")
public class SpringBootViewBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootViewBootstrap.class, args);
    }
}
