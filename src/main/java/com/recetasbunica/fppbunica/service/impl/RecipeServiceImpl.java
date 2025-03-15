package com.recetasbunica.fppbunica.service.impl;

import com.recetasbunica.fppbunica.domain.Recipe;
import com.recetasbunica.fppbunica.repository.RecipeRepository;
import com.recetasbunica.fppbunica.service.RecipeService;
import org.springframework.stereotype.Service;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Recipe getRecipeById(final String id) {
        return recipeRepository.getRecipeById(id);
    }
}