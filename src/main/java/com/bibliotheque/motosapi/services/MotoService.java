package com.bibliotheque.motosapi.services;

import com.bibliotheque.motosapi.models.Moto;
import com.bibliotheque.motosapi.repositories.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class MotoService {

    @Autowired
    private MotoRepository motoRepository;

    int nbMax;
    Random rand ;

    public MotoService(){
        nbMax=12;
        rand= new Random();
    }

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

    public List<Moto> getIndexMoto(){

        List<Moto> motos = new ArrayList<>();
        List<Moto> allMotos = getAllMoto();
        for (int i=0;i<nbMax;i++){
            motos.add(allMotos.get(rand.nextInt(allMotos.size())));
        }
        return motos;
    }

    public List<Moto> getMotoByMarqueId(Long id){
        List<Moto>motos = motoRepository.findMotoByModelMarqueId(id);
        List<Moto> motosSelectionee = new ArrayList<>();
        for (int i=0 ; i<nbMax; i++)
            motosSelectionee.add(motos.get(rand.nextInt(motos.size())));
        return motosSelectionee;
    }

    public List<Moto> getMotoByName(String nom){
        return this.motoRepository.findMotoByNomContainsIgnoreCase(nom).stream().limit(120).collect(Collectors.toList());
    }
}
