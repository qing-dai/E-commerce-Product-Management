package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")

    public String greet(){
        System.out.println("I am here");
        return "Hello World!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Let's go have fun!";
    }
}
