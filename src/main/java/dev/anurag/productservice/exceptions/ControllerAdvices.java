package dev.anurag.productservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import dev.anurag.productservice.dtos.ExceptionDto;

@ControllerAdvice
public class ControllerAdvices {
//    @ExceptionHandler(NotFoundException.class)
//    private ResponseEntity<NotFoundException> handleNotFoundException(NotFoundException e){
//        return new ResponseEntity(
//                new ExceptionDto(HttpStatus.NOT_FOUND,e.getMessage()),
//                HttpStatus.NOT_FOUND
//        );
//    }
}
