package com.mimaraslan.exception;

import lombok.Getter;

@Getter
public class UserProfileServiceException extends RuntimeException {

    private final ErrorType type;

    public UserProfileServiceException(ErrorType type) {
        super(type.getMessage());
        this.type = type;
    }

    public UserProfileServiceException(ErrorType type, String message) {
        super(message);
        this.type = type;
    }

}
