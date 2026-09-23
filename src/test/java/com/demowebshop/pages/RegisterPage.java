
package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    // ==========================================
    // Page Objects
    // ==========================================

    @FindBy(className = "ico-register")
    private WebElement registerLink;

    @FindBy(id = "gender-male")
    private WebElement maleGender;

    @FindBy(id = "FirstName")
    private WebElement firstNameField;

    @FindBy(id = "LastName")
    private WebElement lastNameField;

    @FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "Password")
    private WebElement passwordField;

    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(id = "register-button")
    private WebElement registerButton;
    
    @FindBy(xpath ="//h1[text()='Register']")
    private WebElement registrationSuccessMessage;
    
    //Registration with an already registered email

    @FindBy(xpath = "//li[text()='The specified email already exists']")
    private WebElement registerdEmailVerification;
    
    //Password mismatch scenario
    
    @FindBy(xpath = "//span[text()='The password and confirmation password do not match.']")
    private WebElement passwordMismatchVerification;

    // ==========================================
    // Constructor
    // ==========================================

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    // ==========================================
    // Page Actions
    // ==========================================

    public void clickOnRegisterLink() {
        registerLink.click();
    }

    public void selectGender() {
        maleGender.click();
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void confirmPassword(String password) {
        confirmPasswordField.sendKeys(password);
    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }
    
    public boolean isRegistrationSuccessful() {
        return registrationSuccessMessage.isDisplayed();
    }
    
    //scenarion 2
    
    public boolean registerdEmailVerification() {
    	
    return registerdEmailVerification.isDisplayed();
    }
    
    //secanrio 3
    
    public boolean isPasswordMismatchErrorDisplayed() {
    	
    return	passwordMismatchVerification.isDisplayed();
    	
    }
    
    
    
}

