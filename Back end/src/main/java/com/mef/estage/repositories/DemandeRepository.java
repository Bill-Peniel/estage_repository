package com.mef.estage.repositories;

import com.mef.estage.entities.Demandes.Demande;
import com.mef.estage.entities.Demandes.StatutDemande;
import com.mef.estage.entities.Stages.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemandeRepository extends JpaRepository<Demande, Long> {

    Demande findByNumero(String numero);

    List<Demande> findByStatus(StatutDemande statutDemande);
}
