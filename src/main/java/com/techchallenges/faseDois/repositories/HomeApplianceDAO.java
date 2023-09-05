package com.techchallenges.faseDois.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.techchallenges.faseDois.dtos.HomeApplianceFilterDTO;
import com.techchallenges.faseDois.models.HomeAppliance;

public interface HomeApplianceDAO extends JpaRepository<HomeAppliance, UUID> {

    @Query("""
            SELECT ha FROM HomeAppliance ha WHERE (
                UPPER(:#{#filter.name}) = UPPER(ha.name) OR
                UPPER(:#{#filter.description}) = UPPER(ha.description) OR
                :#{#filter.type} = ha.type OR
                UPPER(:#{#filter.brand}) = UPPER(ha.brand) OR
                UPPER(:#{#filter.powerInWatts}) = UPPER(ha.powerInWatts) OR
                UPPER(:#{#filter.voltage}) = UPPER(ha.voltage) OR
                UPPER(:#{#filter.model}) = UPPER(ha.model)
            )
            """)
    List<HomeAppliance> filter(@Param("filter") HomeApplianceFilterDTO filter);

}
