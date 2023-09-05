package com.techchallenges.faseDois.dtos;

import java.util.UUID;
import com.techchallenges.faseDois.enuns.HomeApplianceTypeEnum;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class HomeApplianceDTO {
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotNull
    private HomeApplianceTypeEnum type;

    @NotBlank
    private String brand;

    @NotBlank
    private String powerInWatts;

    @NotBlank
    private String voltage;

    @NotBlank
    private String model;

    private PersonDTO owner;
}
