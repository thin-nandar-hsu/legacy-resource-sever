package com.example.resouuceseverdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }

}

//curl -H "Authorization: bearer 75df6211-688c-47c7-b304-3657198e3176" http://localhost:9090/hello
