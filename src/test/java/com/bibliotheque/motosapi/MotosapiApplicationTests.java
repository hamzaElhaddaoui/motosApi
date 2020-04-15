package com.bibliotheque.motosapi;

import com.bibliotheque.motosapi.models.Categorie;
import com.bibliotheque.motosapi.services.CategorieService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MotosapiApplicationTests {
    @Autowired
    CategorieService categorieService;
    @Test
    void CategorieServiceTests() {
//        Categorie categorie = new Categorie(Long.valueOf(1),"RoadSter");
//        Categorie categorie1 = new Categorie(Long.valueOf(2), "Trail");
//        categorieService.addCategorie(categorie);
//        Assertions.assertTrue(categorieService.getCategorie(categorie.getId()).equals(categorie));
//        Assertions.assertFalse(categorieService.getAllCategories().get(0).equals(categorie1));
//        categorieService.addCategorie(categorie1);
//        Assertions.assertTrue(categorieService.getCategorie(categorie1.getId()).equals(categorie1));
//        try {
//            Categorie categorie2 = (Categorie)categorie.clone();
//            categorie2.setNom("Racer");
//            categorieService.updateCategorie(categorie.getId(),categorie2);
//            Assertions.assertEquals(categorieService.getCategorie(categorie.getId()),categorie2);
//            Assertions.assertNotEquals(categorieService.getCategorie(categorie.getId()),categorie);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
//        categorieService.deleteCategorie(categorie1.getId());
//        Assertions.assertNotEquals(categorie1,categorieService.getCategorie(categorie1.getId()));
    }


}
