package com.java8.springbootpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.java8.springbootpro.web.servlet")
public class SpringBootProApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProApplication.class, args);
    }

}
