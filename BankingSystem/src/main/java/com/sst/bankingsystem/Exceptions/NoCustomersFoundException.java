package com.sst.bankingsystem.Exceptions;

public class NoCustomersFoundException extends RuntimeException {
    public NoCustomersFoundException(String message) {
        super(message);
    }
}
