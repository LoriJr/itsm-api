package com.viratech.itsm_api.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConflictValidation.class)
    public ErrorResponse conflictValidationExceptionHandler(ConflictValidation ex, HttpServletRequest request){
        LocalDateTime timestamp = LocalDateTime.now();
        int statusCode = HttpStatus.CONFLICT.value();
        String message = ex.getMessage();
        String path = request.getRequestURI();

        return new ErrorResponse(
                timestamp,
                statusCode,
                message,
                path
                );
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ErrorResponse resourceNotFoundeExceptionHandler(ResourceNotFoundException ex, HttpServletRequest request){

        LocalDateTime timestamp = LocalDateTime.now();
        int statusCode = HttpStatus.NOT_FOUND.value();
        String message = ex.getMessage();
        String path = request.getRequestURI();

        return new ErrorResponse(
                timestamp,
                statusCode,
                message,
                path
        );

    }

}
