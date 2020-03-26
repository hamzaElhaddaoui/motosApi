package com.bibliotheque.motosapi.services;

import com.bibliotheque.motosapi.models.Model;
import com.bibliotheque.motosapi.repositories.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModelService {

    @Autowired
    private ModelRepository modelRepository;

    public List<Model> getAllModels(){
        List<Model> models = new ArrayList<>();
        modelRepository.findAll().forEach(models::add);
        return models;
    }

    public List<Model> getAllModelsByCategorie(String id){
        return modelRepository.findByCategorieId(id);
    }

    public Model getModelById(String id){
        var optionModel = modelRepository.findById(id);
        if(optionModel.isPresent())
            return optionModel.get();
        else
            return null;
    }

    public void addModel(Model model){
        modelRepository.save(model);
    }

    public void updateModel(String id, Model model){
        if(this.getModelById(id)!=null)
            modelRepository.save(model);
    }

    public void deleteModel(String id){
        modelRepository.deleteById(id);
    }
}
