package com.recetasbunica.fppbunica.service;

import com.recetasbunica.fppbunica.controller.response.RecipeResponse;

public interface RecipeService {
    RecipeResponse getRecipeById(String id);
}
