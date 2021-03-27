package com.bibliotheque.motosapi.controllers;

import com.bibliotheque.motosapi.models.Moto;
import com.bibliotheque.motosapi.services.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
public class MotoController {

    @Autowired
    private MotoService motoService;

    @GetMapping("/motos/index")
    public List<Moto> getIndexMoto(){ return motoService.getIndexMoto();}

    @GetMapping("/motosModel/{id}")
    public List<Moto> getMotosModel(@PathVariable Long id){
//        Random rand = new Random();
        List<Moto> mt = motoService.getMotosModel(id);
        Collections.shuffle(mt);

        List<Moto> motos = new ArrayList<>();

        for(int i=0; i<3 && i<mt.size() ; i++){
            motos.add(mt.get(i));
        }
//        List<Moto> motos = rand.ints(3,0,mt.size())
//                            .mapToObj(i -> mt.get(i))
//                            .distinct()
//                            .collect(Collectors.toList());
        if(motos.size()==1)
            return null;
        else
            return motos;
    }

    @GetMapping("/motos/recherche/{nom}")
    public List<Moto> getMotoByNom(@PathVariable String nom){
        return this.motoService.getMotoByName(nom);
    }

    @GetMapping("/motos/marques/{idMarque}")
    public List<Moto> getMotosByMarque(@PathVariable Long idMarque){
        return motoService.getMotoByMarqueId(idMarque);
    }

    @GetMapping("/motos")
    public List<Moto> getAllMotos(){
        return motoService.getAllMoto();
    }

    @GetMapping("/motos/{id}")
    public Moto getMotoById(@PathVariable Long id){
        return motoService.getMotoById(id);
    }

    @PostMapping("/api/motos")
    public void addMoto(@RequestBody Moto moto){
        motoService.addMoto(moto);
    }

    @PutMapping("/motos/{id}")
    public void updateMoto(@PathVariable Long id, @RequestBody Moto moto){
        motoService.updateMoto(id,moto);
    }

    @DeleteMapping("/motos/{id}")
    public void deleteMoto(@PathVariable Long id){
        motoService.deleteMoto(id);
    }
}
