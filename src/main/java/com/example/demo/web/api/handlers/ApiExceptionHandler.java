package com.example.demo.web.api.handlers;

import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ApiExceptionHandler {
    private final Logger logger = Logger.getLogger(ApiExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public HttpEntity<Map<String, ?>> handleException(Exception ex) {
        logger.error(ex.getMessage(),ex);
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(Collections.singletonMap("error", ex.getMessage()));
    }
}
