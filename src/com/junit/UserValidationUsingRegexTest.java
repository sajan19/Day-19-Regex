package com.junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidationUsingRegexTest {
    //First Name Test Cases
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.firstNameValidaion("Sajan");
//        Assert.assertEquals(true,result);
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.firstNameValidaion("Sa");
        Assert.assertFalse(result);
    }
    //Last Name Test Cases
  @Test
    public void givenLastName_whenProper_ShouldReturnTrue(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.lastNameValidaion("Mhatre");
//        Assert.assertEquals(true,result);
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.lastNameValidaion("Mh");
//        Assert.assertEquals(false,result);
        Assert.assertFalse(result);
    }

    //Email Test Cases
    @Test
    public void givenEmail_whenProper_ShouldReturnTrue(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.emailValidation("sajanmhatre@gmail.com");
//        Assert.assertEquals(true,result);
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.emailValidation("abc@gmail.com.1a");
//        Assert.assertEquals(false,result);
        Assert.assertFalse(result);
    }
    //Mobile Number Cases
    @Test
    public void givenMobileNumber_whenProper_ShouldReturnTrue(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.mobileNumValidation("91 9930456789");
//        Assert.assertEquals(true,result);
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNumber_whenNotProper_ShouldReturnFalse(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.mobileNumValidation("0 4856432999");
//        Assert.assertEquals(true,result);
        Assert.assertFalse(result);
    }
    //Password Test Cases
    @Test
    public void givenPassword_whenProper_ShouldReturnTrue(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.passwordValidation("Sajan@4564");
//        Assert.assertEquals(true,result);
        Assert.assertTrue(result);
    }
    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse(){
        UserValidationUsingRegex validation = new UserValidationUsingRegex();
        boolean result = validation.passwordValidation("77@4564");
//        Assert.assertEquals(true,result);
        Assert.assertFalse(result);
    }




}