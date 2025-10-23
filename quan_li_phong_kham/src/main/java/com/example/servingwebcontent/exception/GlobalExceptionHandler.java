package com.example.servingwebcontent.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    public String handle(NotFoundException e, Model m){
        m.addAttribute("message", e.getMessage());
        return "index";
    }
}
