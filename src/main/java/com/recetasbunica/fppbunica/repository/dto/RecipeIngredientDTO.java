package com.recetasbunica.fppbunica.repository.dto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipe_ingredient")
public class RecipeIngredientDTO {

    @EmbeddedId
    private RecipeIngredientId id;

    @ManyToOne
    @MapsId("recipeId")
    @JoinColumn(name = "recipe_id")
    private RecipeDTO recipe;

    @ManyToOne
    @MapsId("ingredientId")
    @JoinColumn(name = "ingredient_id")
    private IngredientDTO ingredient;

    @Column
    private String quantity;

}

@Embeddable
@Data
class RecipeIngredientId implements Serializable{
    private String recipeId;
    private String ingredientId;
}