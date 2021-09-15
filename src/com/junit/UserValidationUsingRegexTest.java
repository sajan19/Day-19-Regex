package com.junit;

import com.junit.UserValidationUsingRegex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class UserValidationUsingRegexTest {
        String email;
        boolean expectedResult;

        public UserValidationUsingRegexTest(String email, boolean expectedResult) {
            this.email = email;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Collection data() {
            return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                    {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true}, {"abc-100@abc.net", true},
                    {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true},
                    {"abc", false}, {"abc@.com.my", false}, {"bc123@gmail.a", false}, {"abc123@.com", false},
                    {"abc123@.com.com", false}, {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"\"abc..2002@gmail.com", false},
                    {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@.gmail.com.aa.au", false}

            });
        }

        @Test
       public void givenEmail_ShouldReturnAsPerThePArameterisedResult() {
            UserValidationUsingRegex validation = new UserValidationUsingRegex();
            boolean result = validation.emailValidationTest(this.email);
//        Assert.assertEquals(true,result);
            Assert.assertEquals(this.expectedResult, result);
        }
    }

