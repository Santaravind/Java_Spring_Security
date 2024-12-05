package com.example.SpringSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class HelloController {

    @GetMapping("/")
    public String hello(HttpServletRequest request){
        return "Welcomme  in security"+request.getSession().getId();
    }
}
