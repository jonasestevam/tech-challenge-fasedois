package com.techchallenges.faseDois.mappers;

import org.mapstruct.Mapper;

import com.techchallenges.faseDois.dtos.HomeApplianceDTO;
import com.techchallenges.faseDois.models.HomeAppliance;

@Mapper(componentModel = "spring")
public interface HomeApplianceMapper extends BaseMapper<HomeApplianceDTO, HomeAppliance> {
}
