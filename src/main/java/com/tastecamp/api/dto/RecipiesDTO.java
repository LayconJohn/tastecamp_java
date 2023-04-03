package com.tastecamp.api.dto;

import com.tastecamp.api.models.Level;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record RecipiesDTO(

    @NotBlank
    @Size(min = 3, max = 30)
    String name,
    
    @NotBlank
    String ingredients,
    
    @NotNull
    String preparation,
    
    @NotNull
    @Positive
    int time,
    
    @NotBlank
    Level level
    ) {
        
}
