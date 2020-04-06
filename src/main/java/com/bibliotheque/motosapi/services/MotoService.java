package com.bibliotheque.motosapi.services;

import com.bibliotheque.motosapi.models.Moto;
import com.bibliotheque.motosapi.repositories.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public List<Moto> getAllMoto(){
        List<Moto> motos = new ArrayList<>();
        motoRepository.findAll().forEach(motos::add);
        return motos;
    }

    public Moto getMotoById(Long id){
        var motoOption = motoRepository.findById(id);
        if(motoOption.isPresent())
            return motoOption.get();
        return null;
    }

    public void addMoto(Moto moto){
        motoRepository.save(moto);
    }

    public void updateMoto(Long id, Moto moto){
        if(id.equals(moto.getId()) && getMotoById(id)!=null){
            motoRepository.save(moto);
        }
    }

    public void deleteMoto(Long id){
        motoRepository.deleteById(id);
    }


}
