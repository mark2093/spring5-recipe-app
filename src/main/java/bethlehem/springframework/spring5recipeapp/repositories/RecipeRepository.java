package bethlehem.springframework.spring5recipeapp.repositories;

import bethlehem.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
