package com.services_provider.exception;

public class DuplicateSubServiceNameException extends Exception {
    public DuplicateSubServiceNameException(String message) {
        super(message);
    }

    public DuplicateSubServiceNameException() {
    }
}
