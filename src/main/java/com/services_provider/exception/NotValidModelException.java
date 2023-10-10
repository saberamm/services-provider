package com.services_provider.exception;

public class NotValidModelException extends RuntimeException{
    public NotValidModelException(String message) {
        super(message);
    }

    public NotValidModelException() {
    }
}