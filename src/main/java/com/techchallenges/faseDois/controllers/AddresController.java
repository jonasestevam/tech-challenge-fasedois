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

import com.techchallenges.faseDois.dtos.AddressDTO;
import com.techchallenges.faseDois.dtos.AddressFilterDTO;
import com.techchallenges.faseDois.dtos.ErrorDTO;
import com.techchallenges.faseDois.services.AddressService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("address")
@ApiResponse(responseCode = "400", description = "Returns the error", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorDTO.class)))
public class AddresController {

    @Autowired
    AddressService addressService;

    @Operation(summary = "Create an address")
    @ApiResponse(responseCode = "201", description = "Returns the created address", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = AddressDTO.class)))
    @PostMapping
    public AddressDTO save(@Valid @RequestBody AddressDTO addressDTO) {
        return addressService.save(addressDTO);
    }

    @Operation(summary = "Update an address")
    @ApiResponse(responseCode = "200", description = "Returns the updated address", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = AddressDTO.class)))
    @PutMapping
    public AddressDTO update(@Valid @RequestBody AddressDTO addressDTO) {
        return addressService.update(addressDTO);
    }

    @Operation(summary = "Get all the addresses")
    @ApiResponse(responseCode = "200", description = "Returns all the addresses", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
    @ArraySchema(schema = @Schema(implementation = AddressDTO.class))
    @GetMapping
    public List<AddressDTO> getAll() {
        return addressService.getAll();
    }

    @Operation(summary = "Get the filtered addresses")
    @ApiResponse(responseCode = "200", description = "Returns the filtered addresses", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
    @ArraySchema(schema = @Schema(implementation = AddressDTO.class))
    @GetMapping("/filter")
    public List<AddressDTO> getFiltered(@ModelAttribute AddressFilterDTO filter) {
        return addressService.filter(filter);
    }

    @Operation(summary = "Gets an address by ID")
    @ApiResponse(responseCode = "200", description = "Returns the address", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = AddressDTO.class)))
    @GetMapping("/{id}")
    public AddressDTO getById(@PathVariable UUID id) {
        return addressService.getById(id);
    }

    @Operation(summary = "Deletes an address by ID")
    @ApiResponse(responseCode = "200", description = "Empty return", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        addressService.delete(id);
        return ResponseEntity.ok().build();
    }
}
