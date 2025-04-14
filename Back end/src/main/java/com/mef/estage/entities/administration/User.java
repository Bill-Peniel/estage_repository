package com.mef.estage.entities.administration;

import com.mef.estage.entities.Base.BaseEntity;
import com.mef.estage.entities.Referentiels.Agent;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.*;
import org.hibernate.annotations.Comment;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Principal;
import java.util.*;


@Getter
@Setter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users",
        indexes = {
                @Index(name = "usr_code_ix", columnList = "code"),
                @Index(name = "usr_username_ix", columnList = "username"),
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "USERS_UK", columnNames = {"code", "isDelete"})
        }
)
public class User extends BaseEntity  implements UserDetails {


@NotBlank
@Size(max = 20)
private String username;

@Email
@Size(min = 5, max = 254)
@Column(length = 254, unique = true)
private String email;

@NotBlank
@NotNull
@Column(name = "motdepasse", nullable = false)
private String password;

@Column(name = "etat", nullable = false)
private boolean active;

@OneToOne(fetch = FetchType.LAZY, optional = true)
@JoinColumn(name = "agent_id")
private Agent agent;


public User(String username, String email, String password) {
    this.username = username;
    this.email = email;
    this.password = password;
}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
