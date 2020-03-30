package com.bibliotheque.motosapi.repositories;

import com.bibliotheque.motosapi.models.Marque;
import org.springframework.data.repository.CrudRepository;

public interface MarqueRepository extends CrudRepository<Marque, Long> {
}
