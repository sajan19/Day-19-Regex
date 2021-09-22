package com.junit;
//Create Custom Exception
public class UserRegistrationException extends Exception {
    public UserRegistrationException(String message) {
        super(message);
    }
}