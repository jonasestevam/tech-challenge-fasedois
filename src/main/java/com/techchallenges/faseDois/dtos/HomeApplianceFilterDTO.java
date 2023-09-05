package com.techchallenges.faseDois.dtos;

import com.techchallenges.faseDois.enuns.HomeApplianceTypeEnum;

import lombok.Data;

@Data
public class HomeApplianceFilterDTO {
    private String name;
    private String description;
    private HomeApplianceTypeEnum type;
    private String brand;
    private String powerInWatts;
    private String voltage;
    private String model;
}
