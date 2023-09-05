package com.techchallenges.faseDois.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techchallenges.faseDois.dtos.PersonFilterDTO;
import com.techchallenges.faseDois.models.Person;

public interface PersonDAO extends JpaRepository<Person, UUID> {

    @Query("""
            SELECT person from Person person WHERE (
                    UPPER(:#{#filter.name}) = UPPER(person.name) OR
                    UPPER(:#{#filter.email}) = UPPER(person.email) OR
                    UPPER(:#{#filter.phoneNumber}) = UPPER(person.phoneNumber) OR
                    UPPER(:#{#filter.gender}) = UPPER(person.gender) OR
                    :#{#filter.birthDate} = person.birthDate OR 
                    UPPER(:#{#filter.parentEmail}) = UPPER(person.parent.email)
            )
            """)
    List<Person> filter(@Param("filter") PersonFilterDTO filter);
}
