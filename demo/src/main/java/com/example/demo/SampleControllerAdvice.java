package com.example.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;

@ControllerAdvice(basePackages = "com.example.demo")
public class SampleControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        // You can customize the error message or handle the exception here
        String errorMessage = "An error occurred: " + e.getMessage();
        return ResponseEntity.ok(errorMessage); 
    }
}
