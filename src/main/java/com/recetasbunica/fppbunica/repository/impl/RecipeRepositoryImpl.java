package com.recetasbunica.fppbunica.repository.impl;

import com.recetasbunica.fppbunica.domain.Ingredient;
import com.recetasbunica.fppbunica.domain.Recipe;
import com.recetasbunica.fppbunica.repository.RecipeRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RecipeRepositoryImpl implements RecipeRepository {

    @Override
    public Recipe getRecipeById(final String id) {
        Ingredient tomato = Ingredient.builder()
                .name("Tomato")
                .quantity("2")
                .build();
        Ingredient wheat = Ingredient.builder()
                .name("Wheat")
                .quantity("100gr")
                .build();
        return Recipe.builder()
                .id("xx")
                .steps("1.Amasar")
                .title("Pizza")
                .description("best pizza")
                .categoryId("Italian")
                .estimatedTime("2h")
                .ingredientList(List.of(tomato, wheat))
                .build();
    }
}
