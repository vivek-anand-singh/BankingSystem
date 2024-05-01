package com.sst.bankingsystem.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerNotFoundException extends  RuntimeException{
    private Long id;
    public CustomerNotFoundException(String message, Long id){
        super(message);
        this.id = null;
    }
}
