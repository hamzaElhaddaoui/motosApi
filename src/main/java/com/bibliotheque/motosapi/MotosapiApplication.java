package com.bibliotheque.motosapi;

import com.bibliotheque.motosapi.models.Categorie;
import com.bibliotheque.motosapi.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MotosapiApplication {
//    @Autowired
//    private static CategorieService categorieService;
    public static void main(String[] args) {
        SpringApplication.run(MotosapiApplication.class, args);
//        categorieService.addCategorie(new Categorie("1","Racer"));
//        categorieService.addCategorie(new Categorie("2","Trail"));
    }

}
