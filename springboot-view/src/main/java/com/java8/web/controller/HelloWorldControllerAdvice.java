package com.java8.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * {@link HelloWorldController 通知}
 *
 * @author itmrchen
 * @date 2019/9/14 23:05
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

    @ModelAttribute("message")
    public String message() {
        return "Hello World New";
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> onException(Throwable throwable) {
        return ResponseEntity.ok(throwable.getMessage());
    }
}
