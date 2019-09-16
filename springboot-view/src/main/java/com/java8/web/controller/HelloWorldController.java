package com.java8.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Hello World {@link Controller}
 *
 * @author itmrchen
 * @date 2019/9/15 20:29
 */
@Controller
public class HelloWorldController {
    @RequestMapping(value = "/index")
    public String index(@RequestParam(required = false) int value, Model model) {
        return "index";
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";
    }

    @ModelAttribute("message")
    public String message() {
        return "HelloWorld";
    }

}
