package com.recetasbunica.fppbunica.service.mapper;

import com.recetasbunica.fppbunica.controller.response.RecipeResponse;
import com.recetasbunica.fppbunica.domain.Ingredient;
import com.recetasbunica.fppbunica.domain.Recipe;
import com.recetasbunica.fppbunica.repository.dto.RecipeDTO;
import com.recetasbunica.fppbunica.repository.dto.RecipeIngredientDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    RecipeResponse map(Recipe recipe);

    @Mapping(target = "category", source = "category.name")
    @Mapping(target = "ingredientList", source = "ingredientList", qualifiedByName = "mapIngredientList")
    Recipe map(RecipeDTO recipeDTO);

    @Named("mapIngredientList")
    default List<Ingredient> mapIngredientList(List<RecipeIngredientDTO> recipeIngredientDTOList){
        return recipeIngredientDTOList.stream()
                .map(riDTO -> Ingredient.builder()
                        .name(riDTO.getIngredient().getName())
                        .quantity(riDTO.getQuantity())
                        .build())
                .toList();
    }
}
