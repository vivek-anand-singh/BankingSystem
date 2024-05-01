package com.sst.bankingsystem.ExceptionHandlers;

import com.sst.bankingsystem.Dtos.ExceptionDto;
import com.sst.bankingsystem.Exceptions.CustomerNotFoundException;
import com.sst.bankingsystem.Exceptions.NoCustomersFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleCustomerNotFoundException(CustomerNotFoundException e) {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("Customer not found");
        exceptionDto.setDescription("Customer with id " + e.getId() + " not found");
        return new ResponseEntity<>(exceptionDto, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoCustomersFoundException.class)
    public ResponseEntity<ExceptionDto> handleNoCustomersFoundException(NoCustomersFoundException e) {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("No customers found");
        exceptionDto.setDescription("NoCustomersFoundException");
        return new ResponseEntity<>(exceptionDto, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> handleException(Exception e) {
        ExceptionDto exceptionDto = new ExceptionDto();
        exceptionDto.setMessage("Something went wrong");
        exceptionDto.setDescription("GeneralExceptionCaught");

        ResponseEntity<ExceptionDto> responseEntity =  new ResponseEntity<>(exceptionDto, HttpStatus.BAD_REQUEST);
        return responseEntity;
    }
}
