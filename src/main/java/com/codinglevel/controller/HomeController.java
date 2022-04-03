package com.codinglevel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "welcome";
    }

    // In Memory Authentication
    // JDBC Based Authentication
    // DAO Authentication Provider
}
