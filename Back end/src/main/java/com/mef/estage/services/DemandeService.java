package com.mef.estage.services;

import com.mef.estage.entities.Demandes.Demande;
import com.mef.estage.entities.Demandes.StatutDemande;
import com.mef.estage.repositories.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeService {

    @Autowired
    private DemandeRepository demandeRepository;

    public List<Demande> listDemandes(){
        return demandeRepository.findAll();
    }

    public List<Demande> listByStatus(StatutDemande statutDemande){
        return demandeRepository.findByStatus(statutDemande);
    }

    public Demande getDemandeByNumero(String numero){
        return demandeRepository.findByNumero(numero);
    }


}
