package org.example.Kalyan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class KalyanGlobalException
{
    @ExceptionHandler
    public ResponseEntity handleException(CatchException catchException)
    {
        InfoException infoException = new InfoException();
        infoException.setInfo(catchException.getMessage());
        return new ResponseEntity(infoException, HttpStatus.NOT_FOUND);
    }

}
