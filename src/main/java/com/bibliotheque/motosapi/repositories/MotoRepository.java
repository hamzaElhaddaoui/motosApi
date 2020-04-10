package com.bibliotheque.motosapi.repositories;

import com.bibliotheque.motosapi.models.Moto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Long> {
    List<Moto> findMotoByModelMarqueId(Long id);
    List<Moto> findMotoByNomContainsIgnoreCase(String nom);
}
