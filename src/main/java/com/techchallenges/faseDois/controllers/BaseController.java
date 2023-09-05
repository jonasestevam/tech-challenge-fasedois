package com.techchallenges.faseDois.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.techchallenges.faseDois.dtos.ErrorDTO;
import com.techchallenges.faseDois.dtos.ValidationErrorDTO;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class BaseController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ValidationErrorDTO handleValidationErrors(MethodArgumentNotValidException exception) {
        return new ValidationErrorDTO(parseValidationErrorsToMap(exception), "Erro(s) de validação",
                exception.getDetailMessageCode());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ErrorDTO handleExceptions(Exception exception) {
        log.error(Arrays.toString(exception.getStackTrace()), exception);
        return new ErrorDTO(exception.getMessage(), exception.toString());
    }

    private Map<String, String> parseValidationErrorsToMap(MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap<>();
        exception.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
