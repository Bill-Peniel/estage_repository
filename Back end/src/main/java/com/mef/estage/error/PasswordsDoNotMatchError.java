package com.mef.estage.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class PasswordsDoNotMatchError extends ResponseStatusException {
    public PasswordsDoNotMatchError() {
        super(HttpStatus.BAD_REQUEST, "le mot de passe est Incorrect");
    }
}
