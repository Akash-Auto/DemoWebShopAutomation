package com.demowebshop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.base.BasePage;

public class LoginPage extends BasePage {


	private WebDriver driver;

	public LoginPage(WebDriver driver) {
	    super(driver);
	    PageFactory.initElements(driver, this);
	}

	@FindBy(id="Email")
	private WebElement emailTextBox;

	@FindBy(id = "Password")
	private WebElement passwordTextBox;

	@FindBy(css = "input[value='Log in']")
	private WebElement loginButton;

	// Scenario Outline

	@FindBy(css = "span.field-validation-error")
	private WebElement loginErrorMessage;



	public void enterEmail(String email) {

		type(emailTextBox, email);

	}

	public void enterPassword(String password) {

		type(passwordTextBox, password);
	}

	public void clickLogin() {

		click(loginButton);
	}

	//Scenario Outline
	public boolean isLoginErrorDisplayed() {
		return isDisplayed(loginErrorMessage);
	}



}
