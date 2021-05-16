package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailAddressField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmPasswordField;

    @FindBy(css = "[title = 'Register'] span span")
    private WebElementFacade registerButton;

    @FindBy(id = "advice-required-entry-firstname")
    private WebElementFacade errorMessageFirstName;

    @FindBy(id = "advice-required-entry-lastname")
    private WebElementFacade errorMessageLastName;

    @FindBy(id = "advice-required-entry-email_address")
    private WebElementFacade errorMessageEmail;

    @FindBy(id = "advice-required-entry-password")
    private WebElementFacade errorMessagePassword;

    @FindBy(id = "advice-required-entry-confirmation")
    private WebElementFacade errorMessageConfirm;

    @FindBy(id = "advice-validate-password-password")
    private WebElementFacade errorMessagePasswordSize;

    @FindBy(id = "advice-validate-cpassword-confirmation")
    private WebElementFacade errorMessageConfirmPasswordMatch;

    @FindBy(css = ".messages span")
    private WebElementFacade thankYouForRegisteringMessage;

    @FindBy(css = ".error-msg span")
    private WebElementFacade errorMessageAlreadyExistingAccount;


    public void setFirstNameField(String firstName) {
        typeInto(firstNameField, firstName);
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setEmailAddressField(String emailAddress) {
        typeInto(emailAddressField, emailAddress);
    }

    public void setPasswordField(String password) {
        typeInto(passwordField, password);
    }

    public void setConfirmPasswordField(String confirmPassword) {
        typeInto(confirmPasswordField, confirmPassword);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public void checkEmptyMandatoryErrorMessage() {
        errorMessageFirstName.shouldContainOnlyText("This is a required field.");
        errorMessageLastName.shouldContainOnlyText("This is a required field.");
        errorMessageEmail.shouldContainOnlyText("This is a required field.");
        errorMessagePassword.shouldContainOnlyText("This is a required field.");
        errorMessageConfirm.shouldContainOnlyText("This is a required field.");
    }

    public void checkPasswordSizeErrorMessage() {
        errorMessagePasswordSize.shouldContainOnlyText("Please enter 6 or more characters without leading or trailing spaces.");
    }

    public void checkConfirmPasswordMatchErrorMessage() {
        errorMessageConfirmPasswordMatch.shouldContainOnlyText("Please make sure your passwords match.");
    }

    public String getThankYouForRegisteringMessage() {
        return thankYouForRegisteringMessage.getText();
    }

    public void checkAlreadyExistingAccountErrorMessage(){
        errorMessageAlreadyExistingAccount.shouldContainOnlyText("There is already an account with this email address. " +
                "If you are sure that it is your email address, click here to get your password and access your account.");
    }
}

