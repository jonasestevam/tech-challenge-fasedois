package com.techchallenges.faseDois.models;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_ADDRESS")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ADDRESS_ID")
    private UUID id;

    @Column(name = "STREET_NAME")
    private String streetName;

    @Column(name = "NEIGHBORHOOD_NAME")
    private String neighborhood;

    @Column(name = "CITY_NAME")
    private String city;

    @Column(name = "STATE_NAME")
    private String state;

    @Column(name = "NUMBER")
    private int number;

}
