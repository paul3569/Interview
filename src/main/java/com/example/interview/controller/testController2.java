package com.example.interview.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController2 {

    @GetMapping("/test2")
    public String test(){
        return "modify test";
    }

}
