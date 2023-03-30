package com.tastecamp.api.models;

import com.tastecamp.api.dto.RecipiesDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Recipie {

    public Recipie() {}

    public Recipie(RecipiesDTO req) {
            this.name = req.name();
            this.ingredients = req.ingredients();
            this. preparation = req.preparation();
            this.time = req.time();
            this.level = req.level();
        }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 250, nullable = false)
    private String ingredients;
    
    @Column(length = 50, nullable = false)
    private String preparation;
    
    @Column(nullable = false)
    private int time;
    
    @Column(nullable = false)   
    private Level level;

}
