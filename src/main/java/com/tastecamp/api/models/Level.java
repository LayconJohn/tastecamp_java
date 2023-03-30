package com.tastecamp.api.models;

public enum Level {
    INICIANTE("iniciante"),
    MEDIANO("mediano"),
    MASTERCHEF("Masterchef");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
