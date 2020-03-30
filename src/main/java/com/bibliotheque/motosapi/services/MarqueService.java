package com.bibliotheque.motosapi.services;

import com.bibliotheque.motosapi.models.Marque;
import com.bibliotheque.motosapi.repositories.MarqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarqueService {

    @Autowired
    private MarqueRepository marqueRepository;

    public List<Marque> getAllMarques() {
        List<Marque> marques = new ArrayList<>();
        marqueRepository.findAll().forEach(marques::add);
        return marques;
    }

    public Marque getMarqueById(Long id){
        var optionalMarque = marqueRepository.findById(id);
        if(optionalMarque.isPresent())
            return optionalMarque.get();
        return null;
    }

    public void addMarque(Marque marque){
        marqueRepository.save(marque);
    }

    public void updateMarque(Long id, Marque marque){
        if(getMarqueById(id)!=null && id == marque.getId()){
            marqueRepository.save(marque);
        }
    }

    public void deleteMarque(Long id){
        marqueRepository.deleteById(id);
    }
}
