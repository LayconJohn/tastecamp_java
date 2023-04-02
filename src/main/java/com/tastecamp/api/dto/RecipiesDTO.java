package com.tastecamp.api.dto;

import com.tastecamp.api.models.Level;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RecipiesDTO(

    @NotBlank
    String name,
    
    @NotBlank
    String ingredients,
    
    @NotNull
    String preparation,
    
    @NotNull
    int time,
    
    @NotBlank
    Level level
    ) {
        
}
