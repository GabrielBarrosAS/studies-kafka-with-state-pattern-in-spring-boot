package com.example.carInventoryControl.exceptions;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ExceptionDetails {
    protected int statusCode;
    protected String message;
    protected String error;
    protected LocalDateTime timestamp;
}
