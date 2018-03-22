package com.pnp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 *
 * 
 */

@ControllerAdvice
public class DataNotFoundExceptionMapper{
    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ErrorMessage> dataNotFound(DataNotFoundException dd)
    {
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setMessage(dd.getMessage());
        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
    }
} //end of code
