package com.tastecamp.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.RecipiesDTO;

@RestController
@RequestMapping("/api/person")
public class RecipiesController {

    @GetMapping
    public String getAll() {
        return "Personagens retornados";
    }
    
    @PostMapping
    public void create(@RequestBody RecipiesDTO req) {
        System.out.println(req);
    }
}
