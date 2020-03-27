package com.bibliotheque.motosapi.controllers;

import com.bibliotheque.motosapi.models.Categorie;
import com.bibliotheque.motosapi.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @GetMapping("/categories")
    public List<Categorie> getCategories(){
        return categorieService.getAllCategories();
    }

    @GetMapping("/categories/{id}")
    public Categorie getCategorie(@PathVariable Long id){
        return categorieService.getCategorie(id);
    }

    @PostMapping("/categories")
    public void addCategorie(@RequestBody Categorie categorie){
        this.categorieService.addCategorie(categorie);
    }

    @PutMapping("/categories/{id}")
    public void updateCategorie(@PathVariable Long id, @RequestBody Categorie categorie){
        this.categorieService.updateCategorie(id,categorie);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategorie(@PathVariable Long id){
        this.categorieService.deleteCategorie(id);
    }
}
