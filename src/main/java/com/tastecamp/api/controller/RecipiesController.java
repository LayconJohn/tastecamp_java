package com.tastecamp.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.RecipiesDTO;
import com.tastecamp.api.models.Recipie;
import com.tastecamp.api.repository.RecipieRepository;

@RestController
@RequestMapping("/api/person")
public class RecipiesController {

    @Autowired
    private RecipieRepository repository; 

    @GetMapping
    public List<Recipie> getAll() {
        return repository.findAll();
    }
    
    @PostMapping
    public void create(@RequestBody RecipiesDTO req) {
        repository.save(new Recipie(req));
    }
}
