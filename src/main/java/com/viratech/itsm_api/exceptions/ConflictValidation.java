package com.viratech.itsm_api.exceptions;

public class ConflictValidation extends RuntimeException {
    public ConflictValidation(String message) {
        super(message);
    }
}
