package com.bibliotheque.motosapi.services;

import com.bibliotheque.motosapi.models.Categorie;
import com.bibliotheque.motosapi.repositories.CategorieRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@Service
public class CategorieService{

    @Autowired
    private CategorieRepository categorieRepository;

    public List<Categorie> getAllCategories(){
        List<Categorie> categories= new ArrayList<>();
        categorieRepository.findAll().forEach(categories::add);
        return categories;
    }

    public Categorie getCategorie(String id){
        var optCategorie = categorieRepository.findById(id);
        if(optCategorie.isPresent()){
            return optCategorie.get();
        }else
            return null;
    }

    public void addCategorie(Categorie categorie){
        categorieRepository.save(categorie);
    }

    public void updateCategorie(String id,Categorie categorie){
        if(this.getCategorie(id)!=null){
            categorie.setId(id);
            categorieRepository.save(categorie);
        }
    }

    public void deleteCategorie(String id){
        this.categorieRepository.deleteById(id);
    }

}
