package com.bibliotheque.motosapi.controllers;

import com.bibliotheque.motosapi.models.Marque;
import com.bibliotheque.motosapi.services.MarqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MarqueController {

    @Autowired
    private MarqueService marqueService;

    @GetMapping("/marques")
    public List<Marque> getAllMarques(){
        return marqueService.getAllMarques();
    }

    @GetMapping("/marques/{id}")
    public Marque getMarqueById(@PathVariable Long id){
        return marqueService.getMarqueById(id);
    }

    @PostMapping("/marques")
    public void addMarque(@RequestBody Marque marque){
        marqueService.addMarque(marque);
    }

    @PutMapping("/marques/{id}")
    public void updateMarque(@PathVariable Long id, @RequestBody Marque marque){
        marqueService.updateMarque(id,marque);
    }

    @DeleteMapping("/marques/{id}")
    public void deleteMarque(@PathVariable Long id){
        marqueService.deleteMarque(id);
    }
}
