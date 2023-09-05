package com.techchallenges.faseDois.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techchallenges.faseDois.dtos.AddressFilterDTO;
import com.techchallenges.faseDois.models.Address;

public interface AddressDAO extends JpaRepository<Address, UUID> {

    @Query("""
            SELECT address from Address address WHERE (
                                               
                                               UPPER(:#{#filter.streetName}) = UPPER(address.streetName) OR
                                               UPPER(:#{#filter.neighborhood}) = UPPER(address.neighborhood) OR
                                               UPPER(:#{#filter.city}) = UPPER(address.city) OR
                                               UPPER(:#{#filter.state}) = UPPER(address.state)
            )
            """)
    List<Address> filter(@Param("filter") AddressFilterDTO filter);

}