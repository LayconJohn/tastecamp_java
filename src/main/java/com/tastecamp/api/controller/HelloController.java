package com.tastecamp.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotation
@RequestMapping
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/api/spring")
    public String helloSpring(){
        return "Hello spring";
    }

}
