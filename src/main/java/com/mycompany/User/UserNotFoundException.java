package com.mycompany.User;

public class UserNotFoundException extends Throwable {

    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
