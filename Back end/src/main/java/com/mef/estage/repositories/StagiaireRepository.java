package com.mef.estage.repositories;

import com.mef.estage.entities.Stages.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StagiaireRepository extends JpaRepository <Stagiaire,String> {

    Stagiaire findByCode(String code);

    List<Stagiaire> findByFiliere(String filiere);


}
