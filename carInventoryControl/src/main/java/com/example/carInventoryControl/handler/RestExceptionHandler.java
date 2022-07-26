package com.example.carInventoryControl.handler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.carInventoryControl.exceptions.BadRequestException;
import com.example.carInventoryControl.exceptions.ExceptionDetails;
import com.example.carInventoryControl.exceptions.NotFoundException;

public class RestExceptionHandler {

        @ExceptionHandler(NotFoundException.class)
        public ResponseEntity<ExceptionDetails> handlerNotFoundException(NotFoundException notFoundException) {
                return new ResponseEntity<>(
                                ExceptionDetails.builder()
                                                .timestamp(LocalDateTime.now())
                                                .statusCode(HttpStatus.NOT_FOUND.value())
                                                .message(notFoundException.getMessage())
                                                .error("Resource not found")
                                                .build(),
                                HttpStatus.NOT_FOUND);
        }

        @ExceptionHandler(BadRequestException.class)
        public ResponseEntity<ExceptionDetails> handlerBadRequestException(BadRequestException badRequestException) {
                return new ResponseEntity<>(
                                ExceptionDetails.builder()
                                                .timestamp(LocalDateTime.now())
                                                .statusCode(HttpStatus.BAD_REQUEST.value())
                                                .message(badRequestException.getMessage())
                                                .error("Invalid operation")
                                                .build(),
                                HttpStatus.BAD_REQUEST);
        }

}
