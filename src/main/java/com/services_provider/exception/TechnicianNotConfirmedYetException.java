package com.services_provider.exception;

public class TechnicianNotConfirmedYetException extends Exception{
    public TechnicianNotConfirmedYetException() {
    }

    public TechnicianNotConfirmedYetException(String message) {
        super(message);
    }
}
