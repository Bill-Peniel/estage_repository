package com.mef.estage.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RoleNotFoundError extends ResponseStatusException {
    public RoleNotFoundError() {
        super(HttpStatus.BAD_REQUEST, "Role non trouvé");
    }
}
