package com.java8.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Hello World {@link Controller}
 *
 * @author itmrchen
 * @date 2019/9/15 20:29
 */
@Controller
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";
    }

    @ModelAttribute("message")
    public String message() {
        return "HelloWorld";
    }

}
