package com.zpx.junitmockitosolo.resources.exceptions;

import com.zpx.junitmockitosolo.services.exceptions.ObjectNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound (ObjectNotFoundException e, HttpServletRequest request) {
        StandardError error =
                new StandardError(Instant.now(), HttpStatus.NOT_FOUND.value(), e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
