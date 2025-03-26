package com.recetasbunica.fppbunica.controller.response;

import lombok.Builder;

@Builder
public record ErrorResponse(
        String code,
        String description
) {
}