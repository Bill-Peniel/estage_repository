package com.mef.estage.repositories;

import com.mef.estage.entities.administration.Role;
import com.mef.estage.entities.administration.User;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.Set;

public interface RoleRepository extends BaseRepository<Role> {
   // Optional<Role> findByName(ERole name);

    @Query("FROM #{#entityName} p where p.isDelete = false " +
            "and p.id not in (" +
            "   select pu.role from UserRole pu " +
            "   where pu.role = p and pu.user = ?1 " +
            "   and pu.isDelete = false" +
            ")")
    public Set<Role> getNotActiveRolesByUser(User user);
}