package com.mef.estage.Dto.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegisterRoleDto {

    @NotBlank
    @NotEmpty(message = "le libelle est obligatoire")
    @Size(min = 3, max = 20)
    private String libelle;


}
