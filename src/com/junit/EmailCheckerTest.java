package com.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)
class EmailCheckerTest {
     String email;
     Boolean expectedResult;
     EmailChecker emailChecker;

    @Before
    public void initialize() {
        emailChecker = new EmailChecker();
    }

    public EmailCheckerTest(String email, Boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true}, {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true}
                {"abc", false}, {"abc@.com.my", false}, {"bc123@gmail.a", false}, {"abc123@.com", false},
                {"abc123@.com.com", false}, {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false}

        });
    }
    @Test
    void givenEmail_ShouldReturnAsPerTheParameterisedResult() {
        EmailChecker validation = new EmailChecker();
        boolean result = validation.validateEmail(this.email);
//        Assert.assertEquals(true,result);
        Assert.assertEquals(this.expectedResult, result);
    }
}