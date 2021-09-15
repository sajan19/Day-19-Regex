package com.junit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class EmailValidationTest {
        //Variables
        String email;
        boolean expectedResult;
        //Constructor
        public EmailValidationTest(String email, boolean expectedResult) {
            this.email = email;
            this.expectedResult = expectedResult;
        }
        //Email Id's to be Checked
        @Parameterized.Parameters
        public static Collection data() {
            return Arrays.asList(new Object[][]{{"abc@yahoo.com", true},
                    {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true}, {"abc-100@abc.net", true},
                    {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.com", true}, {"abc+100@gmail.com", true},
                    {"abc", false}, {"abc@.com.my", false}, {"bc123@gmail.a", false}, {"abc123@.com", false},
                    {"abc123@.com.com", false}, {".abc@abc.com", false}, {"abc()*@gmail.com", false}, {"abc@%*.com", false}, {"abc..2002@gmail.com", false},
                    {"abc.@gmail.com", false}, {"abc@abc@gmail.com", false}, {"abc@gmail.com.1a", false}, {"abc@.gmail.com.aa.au", false}

            });
        }
        //Test to check validatity of Email Id's
        @Test
       public void givenEmail_ShouldReturnAsPerTheParameterisedResult() {
            EmailValidationUsingRegex validation = new EmailValidationUsingRegex();
            boolean result = validation.emailValidationTest(this.email);
//        Assert.assertEquals(true,result);
            Assert.assertEquals(this.expectedResult, result);
        }
    }

