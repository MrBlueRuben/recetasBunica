package com.recetasbunica.fppbunica.controller.response;


import lombok.Builder;

import java.util.List;

@Builder
public record RecipeResponse(
        String id,
        String title,
        String steps,
        String description,
        String category,
        List<IngredientResponse> ingredientList
) {
}
