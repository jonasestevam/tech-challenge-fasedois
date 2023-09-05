package com.techchallenges.faseDois.mappers;

import org.mapstruct.Mapper;

import com.techchallenges.faseDois.dtos.AddressDTO;
import com.techchallenges.faseDois.models.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper extends BaseMapper<AddressDTO, Address> {
}
