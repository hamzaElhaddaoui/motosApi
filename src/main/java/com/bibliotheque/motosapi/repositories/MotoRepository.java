package com.bibliotheque.motosapi.repositories;

import com.bibliotheque.motosapi.models.Moto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotoRepository extends CrudRepository<Moto, Long> {
    @Query(value="select * from moto,model,marque where moto.model_id=model.id and model.marque_id=marque.id and marque.id=?1 order by RAND() LIMIT 12",nativeQuery = true)
    List<Moto> findMotoMarqueId(Long id);
    List<Moto> findMotoByNomContainsIgnoreCase(String nom);

    //@Query(value = "select top 12 * from moto order by newid()",nativeQuery = true)
    @Query(value = "SELECT * FROM moto ORDER BY RAND() LIMIT 12",nativeQuery = true)
    List<Moto> getMotoIndex();

    List<Moto> findMotoByModelId(Long id);

    Page<Moto> findAll(Pageable pageable);
}
