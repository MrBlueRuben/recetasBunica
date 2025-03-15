package com.recetasbunica.fppbunica.domain;

import lombok.Builder;

@Builder(toBuilder = true)
public record Ingredient(
        String name,
        String quantity
) {
}
