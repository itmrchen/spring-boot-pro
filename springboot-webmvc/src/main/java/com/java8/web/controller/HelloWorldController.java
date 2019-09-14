package com.java8.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloWorld {@link Controller}
 *
 * @author itmrchen
 * @date 2019/9/14 13:36
 */
@Controller
@RequestMapping(value = "/view")
public class HelloWorldController {
    @RequestMapping(value = "/index")
    public String index(@RequestParam int value, Model model) {
        return "index";
    }

}
