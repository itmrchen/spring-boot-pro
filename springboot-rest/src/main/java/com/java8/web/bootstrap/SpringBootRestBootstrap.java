package com.java8.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot rest 引导类
 *
 * @author itmrchen
 * @date 2019/9/18 0:27
 */
@SpringBootApplication(scanBasePackages = "com.java8.web")
public class SpringBootRestBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestBootstrap.class, args);
    }
}
