package com.techchallenges.faseDois.dtos;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class PersonDTO {
    private UUID id;

    @NotBlank
    private String name;

    @Email
    @NotNull
    private String email;

    @NotBlank
    private String phoneNumber;

    private String gender;

    @NotNull
    private LocalDate birthDate;

    private PersonDTO parent;

    private List<AddressDTO> addresses;
}
