package com.bibliotheque.motosapi.controllers;

import com.bibliotheque.motosapi.models.Moto;
import com.bibliotheque.motosapi.services.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MotoController {

    @Autowired
    private MotoService motoService;

    @GetMapping("/motos/index")
    public List<Moto> getIndexMoto(){
        return motoService.getIndexMoto();
    }

    @GetMapping("/motos")
    public List<Moto> getAllMotos(){
        return motoService.getAllMoto();
    }

    @GetMapping("/motos/{id}")
    public Moto getMotoById(@PathVariable Long id){
        return motoService.getMotoById(id);
    }

    @PostMapping("/motos")
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
