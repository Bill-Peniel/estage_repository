package com.mef.estage.services;

import com.mef.estage.Dto.Request.RegisterRoleDto;
import com.mef.estage.Dto.Request.RegisterUserDto;
import com.mef.estage.entities.administration.Role;
import com.mef.estage.entities.administration.User;
import com.mef.estage.repositories.RoleRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService extends AbstractBaseService<Role>{

    @Autowired
    @Getter
    private RoleRepository repository;

    public RoleService() {
        super(Role.class);
    }

    public List<Role> allRoles() {
       List<Role> roles = new ArrayList<>();

        repository.findAll().forEach(roles::add);

        return roles;
    }

    public Optional<Role> findById(Long id) {

        Optional<Role> role = repository.findById(id);

        return role;
    }

    public Role save(RegisterRoleDto input) {
        Role role = new Role();

        return repository.save(role);
    }

}
