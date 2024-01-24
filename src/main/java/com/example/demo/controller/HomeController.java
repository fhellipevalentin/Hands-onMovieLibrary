package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String secure() {
        return "index";
    }
}
