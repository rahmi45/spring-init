package com.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestingController {

    @GetMapping("/name")
    public String getName(){
        return "I am Rachid !!!";
    }

    @GetMapping("/age")
    public String getAge(){
        return "45";
    }

    @GetMapping("/address")
    public String getAddress(){
        return "Loiret";
    }
}
