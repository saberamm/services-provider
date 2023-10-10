package com.services_provider.exception;

public class NotValidModelException extends Exception{
    public NotValidModelException(String message) {
        super(message);
    }

    public NotValidModelException() {
    }
}