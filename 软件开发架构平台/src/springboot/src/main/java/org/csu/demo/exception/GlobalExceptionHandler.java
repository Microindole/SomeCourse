package org.csu.demo.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ConstraintViolationException.class)
    public ModelAndView validationException(ConstraintViolationException e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("loginMsg", processExceptionMessage(e.getMessage()));
        return modelAndView;
    }

    private String processExceptionMessage(String message){
        String [] msgArray = message.split(",");
        StringBuilder result = new StringBuilder();
        for(String msg : msgArray){
            String [] tempArray = msg.split(":");
            result.append(tempArray[1]);
        }

        return result.toString();
    }
}
