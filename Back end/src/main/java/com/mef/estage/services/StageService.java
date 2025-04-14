package com.mef.estage.services;

import com.mef.estage.entities.Stages.Stage;
import com.mef.estage.entities.Stages.StatutStage;
import com.mef.estage.repositories.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StageService {
    @Autowired
    private StageRepository stageRepository;

    public List<Stage> stages(){
        return stageRepository.findAll();
    }

    public Stage getById(Long id){
        return  stageRepository.findById(id).get();
    }

    public List<Stage> getStagesByStatus(StatutStage status){
        return stageRepository.findByStatus(status);

    }



}
