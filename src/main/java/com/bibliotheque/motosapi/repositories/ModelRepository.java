package com.bibliotheque.motosapi.repositories;

import com.bibliotheque.motosapi.models.Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends CrudRepository<Model, Long> {
    List<Model> findByCategorieId(Long id);
}
