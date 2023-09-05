package com.techchallenges.faseDois.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class AddressFilterDTO {
    private UUID id;
    private String streetName;    
    private String neighborhood;
    private String city;
    private String state;
}
