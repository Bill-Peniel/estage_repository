package com.mef.estage.entities.Demandes;

import com.mef.estage.entities.Base.BaseEntity;
import com.mef.estage.entities.Stages.Stagiaire;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Demandes")
public class Demande extends BaseEntity {

    @Column(unique = true)
    private String numeroDemande;

    @CreatedDate
    private Date dateDemande;

    private StatutDemande statut;

    @OneToMany
    Set<Stagiaire> listStagiaire = new HashSet<>();

}
