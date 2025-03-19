package com.recetasbunica.fppbunica.repository;

import com.recetasbunica.fppbunica.repository.dto.RecipeIngredientDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredientDTO, String> {
}
