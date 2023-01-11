package com.example.wire;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // /hello-world -> endpoint
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Welcome to the World of WarCraft";
    }
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Welcome to the World of WarCraft");
    }

}
