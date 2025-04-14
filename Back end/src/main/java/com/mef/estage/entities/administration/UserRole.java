package com.mef.estage.entities.administration;

import com.mef.estage.entities.Base.BaseEntity;
import com.mef.estage.entities.Referentiels.LiaisonUaSection;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "UserRole")
@Table(name = "Profil_utilisateurs",
        indexes = {
                @Index(name = "pfu_code_ix", columnList = "code")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "PROFIL_UTIL_UK", columnNames = {"code", "user_id", "role_id", "isDelete"})
        })
public class UserRole extends BaseEntity {


    private LiaisonUaSection liaisUaSection;

    @Column(name = "etat")
    @Comment("Etat du profil utilisateur.")
    boolean active;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @Comment("ID utilisateur.")
    User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    @Comment("ID profil.")
    Role role;

    public UserRole(Long profilUtilId, User utilisateur, Role profil) {
        this.id = profilUtilId;
        this.user = utilisateur;
        this.role = profil;
    }
}
