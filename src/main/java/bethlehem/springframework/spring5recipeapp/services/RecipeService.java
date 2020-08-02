package bethlehem.springframework.spring5recipeapp.services;

import bethlehem.springframework.spring5recipeapp.commands.RecipeCommand;
import bethlehem.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

 Set<Recipe> getRecipes();

 Recipe findById(String id);

 RecipeCommand findCommandById(String id);

 RecipeCommand saveRecipeCommand(RecipeCommand command);

 void deleteById(String idToDelete);
}
