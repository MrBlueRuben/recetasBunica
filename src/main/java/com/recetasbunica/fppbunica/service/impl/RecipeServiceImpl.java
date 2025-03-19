package com.recetasbunica.fppbunica.service.impl;

import com.recetasbunica.fppbunica.controller.response.RecipeResponse;
import com.recetasbunica.fppbunica.domain.Recipe;
import com.recetasbunica.fppbunica.repository.RecipeRepository;
import com.recetasbunica.fppbunica.repository.dto.RecipeDTO;
import com.recetasbunica.fppbunica.service.RecipeService;
import com.recetasbunica.fppbunica.service.mapper.RecipeMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;
    public RecipeServiceImpl(RecipeRepository recipeRepository, RecipeMapper recipeMapper) {
        this.recipeRepository = recipeRepository;
        this.recipeMapper = recipeMapper;
    }

    @Override
    public RecipeResponse getRecipeById(final String id) {
        final Optional<RecipeDTO> recipeDTO =
                recipeRepository.findById(id);

        if(recipeDTO.isPresent()){
            final Recipe recipe = recipeMapper.map(recipeDTO.get());
            return recipeMapper.map(recipe);
        } else {
            throw new IllegalArgumentException("Recipe with id " + id + " does not exit");
        }

    }
}