package com.techchallenges.faseDois.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PersonFilterDTO {
    private String name;
    private String email;
    private String phoneNumber;
    private String gender;
    private LocalDate birthDate;
    private String parentEmail;
}
