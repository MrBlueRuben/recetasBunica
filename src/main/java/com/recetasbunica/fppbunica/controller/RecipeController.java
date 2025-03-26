    package com.recetasbunica.fppbunica.controller;

    import com.recetasbunica.fppbunica.controller.response.RecipeResponse;
    import com.recetasbunica.fppbunica.domain.Recipe;
    import com.recetasbunica.fppbunica.service.RecipeService;
    import org.apache.coyote.Response;
    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestParam;
    import org.springframework.web.bind.annotation.RestController;

    import java.util.List;

    @RestController
    public class RecipeController {
        private final RecipeService recipeService;

        public RecipeController(RecipeService recipeService) {
            this.recipeService = recipeService;
        }

        @GetMapping("/recipe/{id}")
        RecipeResponse getRecipe(@PathVariable("id") String id){
            return recipeService.getRecipeById(id);
        }

        @GetMapping("/recipe")
        List<RecipeResponse> getAllRecipes(){
            return recipeService.getAllRecipes();
        }
    }
