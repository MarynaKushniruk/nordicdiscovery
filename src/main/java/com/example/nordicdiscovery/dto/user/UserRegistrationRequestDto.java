package com.example.nordicdiscovery.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRegistrationRequestDto {
    @NotBlank
    private String fullName;

    @NotBlank
    @Size(min = 4, max = 50)
    private String email;

    @NotBlank
    private String phoneNumber;

    @NotBlank
    @Size(min = 6, max = 100)
    private String password;

    @NotBlank
    @Size(min = 6, max = 100)
    private String repeatPassword;
}
