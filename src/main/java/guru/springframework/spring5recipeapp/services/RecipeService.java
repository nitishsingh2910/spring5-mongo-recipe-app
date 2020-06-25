package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.RecipeCommand;
import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(String id);

    RecipeCommand findCommandById(String id);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);

    void deleteById(String id);
}
