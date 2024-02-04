package com.mimaraslan.exception;

import lombok.Getter;

@Getter
public class AuthServiceException extends RuntimeException {

    private final ErrorType type;

    public AuthServiceException(ErrorType type) {
        super(type.getMessage());
        this.type = type;
    }

    public AuthServiceException(ErrorType type, String message) {
        super(message);
        this.type = type;
    }

}
