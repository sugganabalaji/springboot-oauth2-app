package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String ok() {
        return "Ok";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Balaji, You are logged in.";
    }
}
