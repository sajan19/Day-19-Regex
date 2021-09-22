package com.junit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class UserValidatorTest {


    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.firstNameValidate("Sajan"));
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid first name", e.getMessage());
        }
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.firstNameValidate("sa");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid first name", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.lastNameValidate("Mhatre"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.lastNameValidate("mh");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid last name", e.getMessage());
        }
    }

    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.emailValidator("sajanmhatre34@gmail.com"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.emailValidator(".saja(mhatr.@.gmail.com");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid email id", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.phoneNumberValidator("91 9988776655"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.phoneNumberValidator("34256");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid phone number", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.passwordValidator("Sajan@555"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.passwordValidator("@@@sajan234");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid password", e.getMessage());
        }
    }
}