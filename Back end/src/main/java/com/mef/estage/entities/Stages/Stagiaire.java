package com.mef.estage.entities.Stages;

import com.mef.estage.entities.Base.BaseEntity;
import com.mef.estage.entities.Base.NamedEntity;
import jakarta.persistence.Column;
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
@Table(name = "Stagiaires")
public class Stagiaire extends NamedEntity {

    @Column(unique = true)
    private String code;

    private String firstName;

    private String lastName;

    private String filière;

    private Date dateNaissance;

    private String lieuNaissance;

    private String nationalité;

    private String photo;
            ;
    private String file;

}
