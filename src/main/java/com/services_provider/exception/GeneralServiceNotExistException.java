package com.services_provider.exception;

public class GeneralServiceNotExistException extends Exception {
    public GeneralServiceNotExistException(String message) {
        super(message);
    }

    public GeneralServiceNotExistException() {
    }
}
