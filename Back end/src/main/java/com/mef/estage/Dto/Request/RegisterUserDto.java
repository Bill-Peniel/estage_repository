package com.mef.estage.Dto.Request;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Builder
public class RegisterUserDto {
    @NotBlank
    @NotEmpty(message = "le username est obligatoire")
    @Size(min = 3, max = 20)
    private String username;

    @NotBlank
    @NotEmpty(message = "le username ne doit pas etre vide")
    @Email(message = "email n'est pas bien formatté ")
    private String email;

    @NotBlank
    @NotEmpty(message = "le password est obligatoire")
    @Size(min = 6, max = 40)
    private String password;

}