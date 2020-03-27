package com.bibliotheque.motosapi.repositories;


import com.bibliotheque.motosapi.models.Categorie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie,Long> {
}
