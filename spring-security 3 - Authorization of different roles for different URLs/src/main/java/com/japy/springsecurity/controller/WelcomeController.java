package com.japy.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcomeForAll() {
        return "Welcome Geek!";
    }

    @GetMapping("/user")
    public String welcomeForUserAndAdminRole() {
        return "Welcome User/Admin!";
    }

    @GetMapping("/admin")
    public String welcomeForAdmin() {
        return "Welcome Admin!";
    }
}
