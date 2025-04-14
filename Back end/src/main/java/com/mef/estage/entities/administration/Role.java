package com.mef.estage.entities.administration;

import com.mef.estage.entities.Base.NamedEntity;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "profils",
        indexes = {
                @Index(name = "pf_code_ix", columnList = "code"),
                @Index(name = "pf_libelle_ix", columnList = "libelle")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "PROFIL_UK", columnNames = {"code", "isDelete"})
        }
)
public enum Role  {

    ADMIN, STAG, AGENT

}
