package com.mef.estage.controllers;

import com.mef.estage.entities.administration.Role;
import com.mef.estage.entities.administration.User;
import com.mef.estage.error.RoleNotFoundError;
import com.mef.estage.error.UserNotFoundError;
import com.mef.estage.services.RoleService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/roles")
@RequiredArgsConstructor
@Tag(name = "Roles")
public class RoleController {

    private final RoleService roleService;

    @GetMapping("/")
    public ResponseEntity<List<Role>> allRoles() {
        List <Role> roles = roleService.allRoles();

        return ResponseEntity.ok(roles);
    }

    @GetMapping("/{id}")
    public Role findById(@PathVariable long id) {
        return roleService.findById(id)
                .orElseThrow(() -> new RoleNotFoundError());
    }


}
