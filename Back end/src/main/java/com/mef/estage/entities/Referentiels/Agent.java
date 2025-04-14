package com.mef.estage.entities.Referentiels;

import com.mef.estage.entities.Base.BaseEntity;
import com.mef.estage.entities.Base.NamedEntity;
import com.mef.estage.entities.administration.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "agents",
        indexes = {
                @Index(name = "agt_code_ix", columnList = "code"),
                @Index(name = "agt_matricule_ix", columnList = "matricule"),
                @Index(name = "agt_nom_ix", columnList = "noms"),
                @Index(name = "agt_prenom_ix", columnList = "prenoms"),
                @Index(name = "agt_email_ix", columnList = "email")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "agents_uk", columnNames = {"code", "isDelete"})
        }
)
public class Agent extends NamedEntity {


   // @Comment("Numero matricule agent")
    @Size(max = 20)
    private String matricule;

   // @Comment("Numero ifu de l'agent")
    @Size(max = 20)
    private String ifu;

   // @Comment("Numero npi de l'agent")

    @Size(max = 20)
    private String npi;

   // @Comment("Nom agent")
    @Column(name = "noms", length = 64, nullable = false)
    private String firstName;

   // @Comment("Prénoms agent")
    @Column(name = "prenoms", length = 64, nullable = false)
    private String lastName;

   // @Column(name = "email", length = 64, nullable = false)
    @Email
    @Comment("Adresse email agent")
    private String email;

    @NotBlank
    @Size(max = 20)
    private String sexe;

    @NotBlank
    @Size(max = 20)
    private String rangAgent;

//    @Lob
//    @Column(name = "photo", columnDefinition="BLOB")
//    private byte[] photo;

    @OneToOne(optional = false, mappedBy = "agent", cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Structure structure;

    public String getFullnameCombo() {
        return String.format("%s - %s %s", getMatricule(), getFirstName(), getLastName());
    }

    public Agent(String matricule, String ifu, String npi,  String firstName, String lastName, String rangAgent){
        this.matricule = matricule;
        this.ifu = ifu;
        this.npi=npi;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rangAgent = rangAgent;
    }

}
