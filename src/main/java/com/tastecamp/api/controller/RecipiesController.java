package com.tastecamp.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.RecipiesDTO;
import com.tastecamp.api.models.Recipie;
import com.tastecamp.api.repository.RecipieRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/person")
public class RecipiesController {

    @Autowired
    private RecipieRepository repository; 

    @GetMapping
    public List<Recipie> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Recipie> getById(@PathVariable Long id) {
        return repository.findById(id);
    }
    
    @PostMapping
    public void create(@RequestBody @Valid RecipiesDTO req) {
        repository.save(new Recipie(req));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody @Valid RecipiesDTO req) {
        repository.findById(id).map(item -> {
            item.setName(req.name());
            item.setIngredients(req.ingredients());
            item.setPreparation(req.preparation());
            item.setTime(req.time());
            item.setLevel(req.level());
            return repository.save(item);
        });
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
