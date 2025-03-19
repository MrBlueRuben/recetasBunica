package com.recetasbunica.fppbunica.controller.response;

import lombok.Builder;

@Builder
public record IngredientResponse(
        String name,
        String quantity
) {
}
