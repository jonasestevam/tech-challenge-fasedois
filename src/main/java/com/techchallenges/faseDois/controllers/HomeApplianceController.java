package com.techchallenges.faseDois.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techchallenges.faseDois.dtos.ErrorDTO;
import com.techchallenges.faseDois.dtos.HomeApplianceDTO;
import com.techchallenges.faseDois.dtos.HomeApplianceFilterDTO;
import com.techchallenges.faseDois.services.HomeApplianceService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("homeappliance")
@ApiResponse(responseCode = "400", description = "Returns the error", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorDTO.class)))
public class HomeApplianceController {

    @Autowired
    HomeApplianceService homeApplianceService;

    @Operation(summary = "Create a home appliance")
    @ApiResponse(responseCode = "200", description = "Returns the created home appliance", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = HomeApplianceDTO.class)))
    @PostMapping
    public HomeApplianceDTO save(@Valid @RequestBody HomeApplianceDTO newHomeAppliance) {
        return homeApplianceService.save(newHomeAppliance);
    }

    @Operation(summary = "Update a home appliance")
    @ApiResponse(responseCode = "200", description = "Returns the update home appliance", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = HomeApplianceDTO.class)))
    @PutMapping
    public HomeApplianceDTO update(@Valid @RequestBody HomeApplianceDTO homeApplianceToEdit) {
        return homeApplianceService.update(homeApplianceToEdit);
    }

    @Operation(summary = "Get all the home appliances")
    @ApiResponse(responseCode = "200", description = "Returns all the home appliance", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = HomeApplianceDTO.class)))
    @GetMapping
    public List<HomeApplianceDTO> getAll() {
        return homeApplianceService.getAll();
    }

    @Operation(summary = "Get the filtered home appliances")
    @ApiResponse(responseCode = "200", description = "Returns the filtered home appliances", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = HomeApplianceDTO.class)))
    @GetMapping("filter")
    public List<HomeApplianceDTO> getFiltered(@ModelAttribute HomeApplianceFilterDTO filter) {
        return homeApplianceService.filter(filter);
    }

    @Operation(summary = "Gets a home appliance by ID")
    @ApiResponse(responseCode = "200", description = "Returns the home appliance", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = HomeApplianceDTO.class)))
    @GetMapping("/{id}")
    public HomeApplianceDTO getByID(@PathVariable UUID id) {
        return homeApplianceService.getById(id);
    }

    @Operation(summary = "Deletes a home appliance by ID")
    @ApiResponse(responseCode = "200", description = "Empty return", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = HomeApplianceDTO.class)))
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        homeApplianceService.delete(id);
        return ResponseEntity.ok().build();
    }

}
