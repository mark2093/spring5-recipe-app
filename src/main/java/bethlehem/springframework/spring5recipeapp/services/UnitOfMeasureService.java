package bethlehem.springframework.spring5recipeapp.services;

import bethlehem.springframework.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;


public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}