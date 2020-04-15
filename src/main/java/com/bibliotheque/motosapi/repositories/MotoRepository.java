package com.bibliotheque.motosapi.repositories;

import com.bibliotheque.motosapi.models.Moto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Long> {
    @Query(value="select top 12 * from moto,model,marque where moto.model_id=model.id and model.marque_id=marque.id and marque.id=?1 order by newid()",nativeQuery = true)
    List<Moto> findMotoMarqueId(Long id);
    List<Moto> findMotoByNomContainsIgnoreCase(String nom);
    @Query(value = "select top 12 * from moto order by newid()",nativeQuery = true)
    List<Moto> getMotoIndex();
}
