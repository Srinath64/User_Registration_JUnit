package com.demo;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {

    //Test First Name Is Valid or Invalid

    @Test
    public void testFirstNameHappy() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName("Srinath");
        Assertions.assertEquals(true, isValid);
    }
    @Test
    public void testFirstNameSad() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName("srinath");
        Assertions.assertEquals(false, isValid);
    }

    //Test Last Name Is Valid or Invalid

    @Test
    public void testLastNameHappy() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName("Sivakumar");
        Assertions.assertEquals(true, isValid);
    }
    @Test
    public void testLastNameSad() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateName("sivakumar");
        Assertions.assertEquals(false, isValid);
    }

    //Test Email Is Valid or Invalid

    @Test
    public void testEmailHappy() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateEmail("Sri.s@bridge.co.in");
        Assertions.assertEquals(true, isValid);
    }
    @Test
    public void testEmailSad() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateEmail(".sri@bridge.co.in");
        Assertions.assertEquals(false, isValid);
    }

    //Test Mobile Number Is Valid or Invalid

    @Test
    public void testMobileNumberHappy() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateMobileNumber("91 9994982171");
        Assertions.assertEquals(true, isValid);
    }
    @Test
    public void testMobileNumberSad() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validateMobileNumber("91 999498");
        Assertions.assertEquals(false, isValid);
    }

    //Test Password Is Valid or Invalid

    @Test
    public void testPasswordHappy() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validatePassword("Srivarun@64");
        Assertions.assertEquals(true, isValid);
    }
    @Test
    public void testPasswordSad() {
        UserValidation userValidator = new UserValidation();
        boolean isValid = userValidator.validatePassword("srivarun@64");
        Assertions.assertEquals(false, isValid);
    }

}
