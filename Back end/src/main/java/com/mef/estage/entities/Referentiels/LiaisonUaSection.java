package com.mef.estage.entities.Referentiels;

import com.mef.estage.entities.Base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Comment;

import java.io.Serializable;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "LiaisonUaSection")
@Table(name = "LiaisonUaSection",
        indexes = {
                @Index(name = "liais_code_ix", columnList = "code")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "LIAIS_UA_UK", columnNames = {"code", "structure_id", "section_id", "isDelete"})
        })
public class LiaisonUaSection extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "structure_id", nullable = false)
    @Comment("ID STRUCTURE.")
     Structure ua;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "section_id", nullable = false)
    @Comment("ID section.")
     Section section;

}
