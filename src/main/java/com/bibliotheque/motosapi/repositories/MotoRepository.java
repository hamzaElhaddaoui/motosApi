package com.bibliotheque.motosapi.repositories;

import com.bibliotheque.motosapi.models.Moto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Long> {
}
