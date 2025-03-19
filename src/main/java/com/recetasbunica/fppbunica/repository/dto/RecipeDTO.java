package com.recetasbunica.fppbunica.repository.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipe")
public class RecipeDTO {
    @Id
    private String id;
    @Column
    private String title;
    @Column
    private String description;

    @Column
    private String steps;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryDTO category;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe", fetch = FetchType.EAGER)
    List<RecipeIngredientDTO> ingredientList;

}

