package com.bibliotheque.motosapi.controllers;

import com.bibliotheque.motosapi.models.Model;
import com.bibliotheque.motosapi.models.Moto;
import com.bibliotheque.motosapi.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModelController {

    @Autowired
    private ModelService modelService;

    @GetMapping("/models")
    public List<Model> getAllModels(){
        return modelService.getAllModels();
    }

//    @GetMapping("/categories/{id}/models")
//    public List<Model> getAllModelsByCategorie(@PathVariable Long id){
//        return modelService.getAllModelsByCategorie(id);
//    }

    @GetMapping("/models/{id}")
    public Model getModel(@PathVariable Long id){
        return this.modelService.getModelById(id);
    }

    @PostMapping("/models")
    public void addModel(@RequestBody Model model){
        modelService.addModel(model);
    }

    @PutMapping("/models/{id}")
    public void updateModel(@RequestBody Model model,@PathVariable Long id){
        modelService.updateModel(id,model);
    }

    @DeleteMapping("/models/{id}")
    public void deleteModel(@PathVariable Long id){
        modelService.deleteModel(id);
    }
}
