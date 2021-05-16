package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {

    @Steps
    private RegisterSteps registerSteps;


    @Test
    public void registerWithValidCredentials() {
        registerSteps.navigateToRegister();
        registerSteps.enterCredentials("Betty", "McNara", Constants.INVALID_USER_EMAIL, "123456");
        registerSteps.clickRegister();
        registerSteps.checkUserIsRegisteredMessage("Thank you for registering with Madison Island.");
    }

    @Test
    public void registerWithEmptyFields() {
        registerSteps.navigateToRegister();
        registerSteps.clickRegister();
        registerSteps.checkMandatoryFieldsEmptyErrorMessage();
    }

    @Test
    public void registerWithInvalidSizePassword() {
        registerSteps.navigateToRegister();
        registerSteps.enterInvalidPasswordSize("123");
        registerSteps.clickRegister();
        registerSteps.checkPasswordInvalidSizeErrorMessage();
    }

    @Test
    public void registerWithDifferentConfirmationPassword() {
        registerSteps.navigateToRegister();
        registerSteps.enterDifferentConfirmationPassword("123456", "654321");
        registerSteps.clickRegister();
        registerSteps.checkConfirmationPasswordMatchErrorMessage();
    }

    @Test
    public void registerWithExistingEmail() {
        registerSteps.navigateToRegister();
        registerSteps.enterCredentials("Betty","McNara", Constants.INVALID_USER_EMAIL, "123456");
        registerSteps.clickRegister();
        registerSteps.checkAlreadyExistingEmailErrorMessage();
    }
}
