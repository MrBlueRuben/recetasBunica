package com.recetasbunica.fppbunica.repository;

import com.recetasbunica.fppbunica.repository.dto.RecipeDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<RecipeDTO, String> {

}
