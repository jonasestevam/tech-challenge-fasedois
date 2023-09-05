package com.techchallenges.faseDois.models;

import java.util.UUID;

import com.techchallenges.faseDois.enuns.HomeApplianceTypeEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_HOMEAPPLIANCE")
public class HomeAppliance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TYPE")
    private HomeApplianceTypeEnum type;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "POWERWATTS")
    private String powerInWatts;

    @Column(name = "VOLTAGE")
    private String voltage;

    @Column(name = "MODEL")
    private String model;

    @ManyToOne
    @JoinColumn(name = "PERSON_ID")
    private Person owner;
}
