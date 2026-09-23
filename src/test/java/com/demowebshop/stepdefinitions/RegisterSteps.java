package com.demowebshop.stepdefinitions;

import org.testng.Assert;

import com.demowebshop.base.DriverFactory;
import com.demowebshop.pages.RegisterPage;

import io.cucumber.java.en.*;

public class RegisterSteps {

	private RegisterPage registerPage;

	@When("the user clicks on the Register link")
	public void the_user_clicks_on_the_register_link() {
		registerPage = new RegisterPage(DriverFactory.getDriver());
		registerPage.clickOnRegisterLink();
	}

	@And("the user selects the gender")
	public void the_user_selects_the_gender() {
		registerPage.selectGender();
	}

	@And("the user enters a unique first name")
	public void the_user_enters_a_unique_first_name() {
		registerPage.enterFirstName("Ganesh");
	}

	@And("the user enters a unique last name")
	public void the_user_enters_a_unique_last_name() {
		registerPage.enterLastName("Surya");
	}

	@And("the user enters a unique email address")
	public void the_user_enters_a_unique_email_address() {
		registerPage.enterEmail("Ganeshsury@12345.com");
	}

	@And("the user enters a valid registration password")
	public void the_user_enters_a_valid_registration_password() {
		registerPage.enterPassword("1234567");
	}

	@And("the user confirms the registration password")
	public void the_user_confirms_the_registration_password() {
		registerPage.confirmPassword("1234567");
	}

	@And("the user clicks the Register button")
	public void the_user_clicks_the_register_button() {
		registerPage.clickOnRegisterButton();
	}

	@Then("the user should be registered successfully")
	public void the_user_should_be_registered_successfully() {

		Assert.assertTrue(
				registerPage.isRegistrationSuccessful(),
				"Registration was not successful"
				);

	}

	//Negative Scenario Only New Steps


	@And("the user enters a first name")
	public void the_user_enters_a_first_name() {

		registerPage.enterFirstName("Ganesh");

	}

	@And("the user enters a last name")
	public void the_user_enters_a_last_name() {
		
		registerPage.enterLastName("Surya");
	}

	@And("the user enters an already registered email address")
	public void the_user_enters_an_already_registered_email_address() {
		registerPage.enterEmail("Ganeshsury@12345.com");
	}

	@Then("the user should see an email already registered error")
	public void the_user_should_see_an_email_already_registered_error() {
		Assert.assertTrue(registerPage.registerdEmailVerification(),
				"Email not verified");
	}
	
	//Password Mismatch scenario
	
	@When("the user confirms the registration password incorrectly")
	public void the_user_confirms_the_registration_password_incorrectly() {
		
		registerPage.confirmPassword("12345");
	   
	}

	@Then("the user should see a password mismatch error")
	public void the_user_should_see_a_password_mismatch_error() {
		
		Assert.assertTrue(registerPage.isPasswordMismatchErrorDisplayed(),
				"Password mismatch error was not displayed");
	   
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
