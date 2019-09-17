package com.java8.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld {@link RestController}
 *
 * @author irmrchen
 * @date 2019/9/18 0:30
 */
@RestController
public class HelloWorldRestController {
    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(required = false) String message) {
        return "Hello World" + message;
    }
}
