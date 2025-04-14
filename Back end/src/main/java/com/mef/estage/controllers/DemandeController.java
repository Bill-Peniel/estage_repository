package com.mef.estage.controllers;

import com.mef.estage.entities.Demandes.Demande;
import com.mef.estage.entities.Demandes.StatutDemande;
import com.mef.estage.services.DemandeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "Demandes")
@RequestMapping(value = "/demandes")
public class DemandeController {
    @Autowired
    private DemandeService demandeService;

    @GetMapping(path = "/all")
    public List<Demande> allDemandes(){
        return demandeService.listDemandes();
    }

    @GetMapping(path = "/{statuteDemand}")
    public  List<Demande> allDemandeByStatus(StatutDemande statuteDemand){
        return  demandeService.listByStatus(statuteDemand);
    }


}
