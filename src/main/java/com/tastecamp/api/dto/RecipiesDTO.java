package com.tastecamp.api.dto;

import com.tastecamp.api.models.Level;

public record RecipiesDTO(
    String name, 
    String ingredients, 
    String preparation, 
    int time, 
    Level level
    ) {
        
}
