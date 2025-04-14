package com.mef.estage.entities.Referentiels;

import com.mef.estage.entities.Base.NamedEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@Table(	name = "Sections",
        indexes = {
                @Index(name = "sect_code_ix", columnList = "code"),
                @Index(name = "sect_libelle_ix", columnList = "libelle")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "SECTION_UK", columnNames = {"code", "isDelete"})
        })
public class Section extends NamedEntity {

}
