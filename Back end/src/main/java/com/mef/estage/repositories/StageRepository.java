package com.mef.estage.repositories;

import com.mef.estage.entities.Stages.Stage;
import com.mef.estage.entities.Stages.StatutStage;
import com.mef.estage.entities.Stages.TypeStage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StageRepository extends JpaRepository<Stage, Long> {

    List<Stage> findByCode(String code);

    List<Stage> findByStatus(StatutStage statutStage);

    List<Stage> findByType(TypeStage typeStage);



}
