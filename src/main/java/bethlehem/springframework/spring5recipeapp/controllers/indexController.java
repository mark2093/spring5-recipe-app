package bethlehem.springframework.spring5recipeapp.controllers;

import bethlehem.springframework.spring5recipeapp.domain.Category;
import bethlehem.springframework.spring5recipeapp.domain.UnitOfMeasure;
import bethlehem.springframework.spring5recipeapp.repositories.CategoryRepository;
import bethlehem.springframework.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class indexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public indexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id Is....: " + categoryOptional.get().getId());
        System.out.println("Unit Id Is...: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}

