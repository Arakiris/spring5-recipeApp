package com.springframework.spring5recipeapp.controllers;

import com.springframework.spring5recipeapp.domain.Category;
import com.springframework.spring5recipeapp.domain.UnitOfMeasure;
import com.springframework.spring5recipeapp.repository.CategoryRepository;
import com.springframework.spring5recipeapp.repository.UnitOfMeasureRepository;
import com.springframework.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
