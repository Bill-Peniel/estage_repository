package com.mef.estage.controllers;

import com.mef.estage.entities.Stages.Stage;
import com.mef.estage.entities.Stages.Stagiaire;
import com.mef.estage.entities.Stages.StatutStage;
import com.mef.estage.repositories.StageRepository;
import com.mef.estage.repositories.StagiaireRepository;
import com.mef.estage.services.StageService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "Stages")
@RequestMapping(value = "/stages")
public class StageController {
    @Autowired
    private StageService stageService;

    private StagiaireRepository stagiaireRepository;

    @GetMapping("/all")
    public List<Stage> allStages (){
        return  stageService.stages();
    }
    @GetMapping("/{id}")
    public Stage getStageById(@PathVariable Long id){
        return  stageService.getById(id);
    }

    @GetMapping("/{statuteStage}")
    public List<Stage> allStagesByStatus(@PathVariable StatutStage statuteStage){
        return stageService.getStagesByStatus(statuteStage);
    }
    public Stagiaire createStage(Stagiaire st){
        // verification en base

        // creation
        return  stagiaireRepository.save(st);
    }

}
