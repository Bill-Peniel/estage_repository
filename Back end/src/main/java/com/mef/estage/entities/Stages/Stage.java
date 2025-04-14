package com.mef.estage.entities.Stages;

import com.mef.estage.entities.Base.BaseEntity;
import com.mef.estage.entities.Referentiels.Structure;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "Stages")
public class Stage extends BaseEntity {

    private TypeStage typeStage;

    private Date dateDebut;

    private Date dateFIn;

    private Structure structure;

    private Stagiaire stagiaire;

    private StatutStage statutStage;
 }
