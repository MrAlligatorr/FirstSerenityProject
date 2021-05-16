package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;


public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;


    @Step
    public void navigateToRegister() {
        homePage.open();
        homePage.clickAccountLink();
        homePage.clickRegisterLink();
    }

    @Step
    public void enterCredentials(String firstName, String lastName, String emailAddress, String password) {
        registerPage.setFirstNameField(firstName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailAddressField(emailAddress);
        registerPage.setPasswordField(password);
        registerPage.setConfirmPasswordField(password);
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }

    @Step
    public void checkUserIsRegisteredMessage(String message) {
        Assert.assertEquals(message, registerPage.getThankYouForRegisteringMessage());
    }

    @Step
    public void checkMandatoryFieldsEmptyErrorMessage(){
        registerPage.checkEmptyMandatoryErrorMessage();
    }

    @Step
    public void checkPasswordInvalidSizeErrorMessage(){
        registerPage.checkPasswordSizeErrorMessage();
    }

    @Step
    public void checkConfirmationPasswordMatchErrorMessage(){
        registerPage.checkConfirmPasswordMatchErrorMessage();
    }

    @Step
    public void enterInvalidPasswordSize(String password) {
        registerPage.setPasswordField(password);
    }

    @Step
    public void enterDifferentConfirmationPassword(String password, String confirmPassword) {
        registerPage.setPasswordField(password);
        registerPage.setConfirmPasswordField(confirmPassword);
    }

    @Step
    public void checkAlreadyExistingEmailErrorMessage(){
        registerPage.checkAlreadyExistingAccountErrorMessage();
    }
}
