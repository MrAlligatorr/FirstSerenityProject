package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class LoginPage extends PageObject {

    @FindBy(id = "email")
    private WebElementFacade emailField;

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;

    @FindBy(css = ".error-msg span")
    private WebElementFacade errorMessageSpan;

    @FindBy(id = "advice-required-entry-email")
    private WebElementFacade errorMessageEmail;

    @FindBy(id = "advice-required-entry-pass")
    private WebElementFacade errorMessagePassword;


    public void setEmailField(String email){
        typeInto(emailField, email);
    }

    public void setPasswordField(String password){
        typeInto(passwordField, password);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }

    public void checkInvalidCredentialsMessage(){
        errorMessageSpan.shouldContainOnlyText("Invalid login or password.");
    }

    public void checkEmptyMandatoryFieldsErrorMessage(){
        errorMessageEmail.shouldContainOnlyText("This is a required field.");
        errorMessagePassword.shouldContainOnlyText("This is a required field.");
    }
}
