package com.tastecamp.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tastecamp.api.models.Recipie;

@Repository
public interface RecipieRepository extends JpaRepository<Recipie, Long>{
    
}
