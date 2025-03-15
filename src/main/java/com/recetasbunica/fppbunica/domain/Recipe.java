package com.recetasbunica.fppbunica.domain;

import lombok.Builder;

import java.util.List;

@Builder(toBuilder = true)
public record Recipe(
        String id,
        String title,
        String estimatedTime,
        String steps,
        String description,
        String categoryId,
        List<Ingredient> ingredientList
) {
}
