package com.mef.estage.entities.Referentiels;

import com.mef.estage.entities.Base.BaseEntity;
import com.mef.estage.entities.Base.NamedEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(	 name = "Structure",
        indexes = {
                @Index(name = "struct_code_ix", columnList = "code"),
                @Index(name = "struct_libelle_ix", columnList = "libelle")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "STRUCTURE_UK", columnNames = {"code", "isDelete"})
        }
        )
public class Structure extends NamedEntity {

    private static final long serialVersionUID = 1L;

    @Comment("le sigle de la structure")
    @Column(name = "sigle", length = 64, nullable = false)
    private String uaAcronyme;

    @Comment("Adresse de la structure")
    @Column(name = "adresse", length = 64)
    private String uaAdresse;

    @Comment("site web de la structure")
    @Column(name = "siteweb", length = 64)
    private String uaSiteWeb;

    @Comment("le superieur de la structure")
    @Column(name = "structsup", length = 64, nullable = false)
    private Structure uaSup;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Section section;

    public String getDenomination() {
        return getLibelle();
    }

    public String getFullname() {
        return getCode() + " - " + getLibelle();
    }

}
