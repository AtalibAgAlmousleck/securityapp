package com.codinglevel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping(value = "/welcome")
    public String welcome() {
        return "Welcome to Spring Security";
    }

    @GetMapping(value = "/no")
    public String sayHi() {
        return "This is no Secured controller";
    }
}
