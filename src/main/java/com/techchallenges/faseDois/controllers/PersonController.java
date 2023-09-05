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
import com.techchallenges.faseDois.dtos.PersonDTO;
import com.techchallenges.faseDois.dtos.PersonFilterDTO;
import com.techchallenges.faseDois.services.PersonService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("person")
@ApiResponse(responseCode = "400", description = "Returns the error", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = ErrorDTO.class)))
public class PersonController {

    @Autowired
    PersonService personService;

    @Operation(summary = "Create a person")
    @ApiResponse(responseCode = "200", description = "Returns the created person", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = PersonDTO.class)))
    @PostMapping
    public PersonDTO save(@Valid @RequestBody PersonDTO newPerson) {
        return personService.save(newPerson);
    }

    @Operation(summary = "Update a person")
    @ApiResponse(responseCode = "200", description = "Returns the update person", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = PersonDTO.class)))
    @PutMapping
    public PersonDTO update(@Valid @RequestBody PersonDTO personDTO) {
        return personService.update(personDTO);
    }

    @Operation(summary = "Get all persons")
    @ApiResponse(responseCode = "200", description = "Returns all persons", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = PersonDTO.class)))
    @GetMapping
    public List<PersonDTO> getAll() {
        return personService.getAll();
    }

    @Operation(summary = "Get filtered persons")
    @ApiResponse(responseCode = "200", description = "Returns filtered persons", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = PersonDTO.class)))
    @GetMapping("/filter")
    public List<PersonDTO> getFiltered(@ModelAttribute PersonFilterDTO filter) {
        return personService.filter(filter);
    }

    @Operation(summary = "Gets a person by ID")
    @ApiResponse(responseCode = "200", description = "Returns the person", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = PersonDTO.class)))
    @GetMapping("/{id}")
    public PersonDTO getById(@PathVariable UUID id) {
        return personService.getById(id);
    }

    @Operation(summary = "Deletes a person by ID")
    @ApiResponse(responseCode = "200", description = "Empty return", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, schema = @Schema(implementation = PersonDTO.class)))
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable UUID id) {
        personService.delete(id);
        return ResponseEntity.ok().build();
    }

}