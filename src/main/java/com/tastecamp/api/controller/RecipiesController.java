package com.tastecamp.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.RecipiesDTO;
import com.tastecamp.api.models.Recipie;
import com.tastecamp.api.service.RecipieService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/person")
public class RecipiesController {

    @Autowired
    private RecipieService service; 

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping
    public List<Recipie> getAll() {
        return service.getAll();
    }
    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/{id}")
    public Optional<Recipie> getById(@PathVariable Long id) {
        return service.getById(id);
    }
    
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping
    public void create(@RequestBody @Valid RecipiesDTO req) {
        service.create(new Recipie(req));
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody @Valid RecipiesDTO req) {
        service.updateById(id, req);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}
