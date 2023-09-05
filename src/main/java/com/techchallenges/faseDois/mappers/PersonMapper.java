package com.techchallenges.faseDois.mappers;

import org.mapstruct.Mapper;

import com.techchallenges.faseDois.dtos.PersonDTO;
import com.techchallenges.faseDois.models.Person;

@Mapper(componentModel = "spring")
public interface PersonMapper extends BaseMapper<PersonDTO, Person> {
}
