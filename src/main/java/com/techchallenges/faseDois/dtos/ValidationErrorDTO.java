package com.techchallenges.faseDois.dtos;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ValidationErrorDTO extends ErrorDTO {
    private Map<String, String> validationErrors;

    public ValidationErrorDTO(Map<String, String> validationErrors, String errorMessage, String exception) {
        super(errorMessage, exception);
        this.validationErrors = validationErrors;
    }
}
