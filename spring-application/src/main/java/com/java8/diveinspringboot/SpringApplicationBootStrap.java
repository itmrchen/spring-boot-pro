package com.java8.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@link SpringApplication}引导类
 *
 * @author itmrchen
 * @date 2019/9/12 0:42
 */
//第二种写法 注释掉下面
//@SpringBootApplication
public class SpringApplicationBootStrap {
    public static void main(String[] args) {
        //SpringApplication.run(SpringApplicationBootStrap.class, args);
        SpringApplication.run(ApplicationConfiguration.class, args);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration {
    }

}
