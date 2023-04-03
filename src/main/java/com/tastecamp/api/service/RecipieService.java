package com.tastecamp.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tastecamp.api.dto.RecipiesDTO;
import com.tastecamp.api.models.Recipie;
import com.tastecamp.api.repository.RecipieRepository;

@Service
public class RecipieService {
    @Autowired
    private RecipieRepository repository; 

    public List<Recipie> getAll() {
        return repository.findAll();
    }

    public Optional<Recipie> getById(Long id) {
        return repository.findById(id);
    }

    public void create (Recipie data) {
        repository.save(data);
    }

    public void updateById(Long id, RecipiesDTO data) {
        repository.findById(id).map(item -> {
            item.setName(data.name());
            item.setIngredients(data.ingredients());
            item.setPreparation(data.preparation());
            item.setTime(data.time());
            item.setLevel(data.level());
            return repository.save(item);
        });
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
