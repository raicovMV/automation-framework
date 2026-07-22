package com.maxim.framework.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SignupLoginPage {

    // Dependencies
    private final Page page;
    // Locators
    private final Locator emailInput;
    private final Locator signupNameInput;
    private final Locator signupButton;

    // Constructor
    public SignupLoginPage(Page page) {
        this.page = page;
        this.emailInput = page.locator("[data-qa='signup-email']");
        this.signupNameInput = page.locator("[data-qa='signup-name']");
        this.signupButton = page.locator("[data-qa='signup-button']");
    }

    // Actions
    public void enterSignupEmail(String email) {
        emailInput.fill(email);
    }

    public void enterSignupName(String name){
        signupNameInput.fill(name);
    }

    public void fillSignupForm(String name, String email) {
        enterSignupName(name);
        enterSignupEmail(email);
    }

    public AccountInformationPage clickSignup(){
        signupButton.click();
        return new AccountInformationPage(page);
    }

    // State / getters
    public String getSignupEmailValue() {
        return emailInput.inputValue();
    }

    public String getSignupNameValue(){
        return signupNameInput.inputValue();
    }
}
