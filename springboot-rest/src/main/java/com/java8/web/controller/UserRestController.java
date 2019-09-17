package com.java8.web.controller;

import com.java8.web.po.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itmrchen
 * @date 2019/9/18 1:02
 */
@RestController
public class UserRestController {

    @PostMapping("/echo/user")
    public User user(@RequestBody User user) {
        return user;
    }
}
