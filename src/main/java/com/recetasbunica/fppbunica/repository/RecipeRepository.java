package com.recetasbunica.fppbunica.repository;

import com.recetasbunica.fppbunica.domain.Recipe;

public interface RecipeRepository {
    Recipe getRecipeById(String id);
}
