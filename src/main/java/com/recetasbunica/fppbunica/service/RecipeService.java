package com.recetasbunica.fppbunica.service;

import com.recetasbunica.fppbunica.controller.response.RecipeResponse;

import java.util.List;

public interface RecipeService {
    RecipeResponse getRecipeById(String id);
    List<RecipeResponse> getAllRecipes();
}
