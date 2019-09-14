package com.java8.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HelloWorld {@link Controller}
 *
 * @author itmrchen
 * @date 2019/9/14 13:36
 */
@Controller
public class HelloWorldController {
    @RequestMapping("")
    public String index() {
        return "index";
    }

    public static void main(String[] args) {

    }
}
