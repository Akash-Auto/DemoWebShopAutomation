package com.demowebshop.stepdefinitions;
import org.testng.Assert;

import com.demowebshop.base.DriverFactory;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.utils.ConfigReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
	
	private HomePage homePage;
    private LoginPage loginPage;

    @Given("the user is on the Demo Web Shop home page")
    public void userIsOnHomePage() {

        homePage = new HomePage(DriverFactory.getDriver());
    }

    @When("the user clicks on the Log in link")
    public void userClicksLogin() {

        homePage.clickLogin();
    }

    @And("the user enters a valid email address")
    public void userEntersEmail() {

        loginPage = new LoginPage(DriverFactory.getDriver());

        String email = ConfigReader.getProperty("username");

        loginPage.enterEmail(email);
    }

    @And("the user enters a valid password")
    public void userEntersPassword() {

        String password = ConfigReader.getProperty("password");

        loginPage.enterPassword(password);
    }

    @And("the user clicks the Log in button")
    public void userClicksLoginButton() {

        loginPage.clickLogin();
    }

    @Then("the user should be logged in successfully")
    public void userShouldBeLoggedIn() {

        Assert.assertTrue(
                homePage.isLogoutDisplayed(),
                "Login was not successful"
        );
    }
    
    @Given("the user is logged in to the Demo Web Shop")
    public void userIsLoggedIn() {

        homePage = new HomePage(DriverFactory.getDriver());
        loginPage = new LoginPage(DriverFactory.getDriver());

        homePage.clickLogin();

        String email = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        Assert.assertTrue(
                homePage.isLogoutDisplayed(),
                "User was not logged in successfully"
        );
    }

    @When("the user clicks on the Log out link")
    public void userClicksLogout() {

        homePage.clickLogout();
    }

    @Then("the user should be logged out successfully")
    public void userShouldBeLoggedOut() {

        Assert.assertTrue(
                homePage.isLoginDisplayed(),
                "Logout was not successful"
        );
    }
    
    //Scenario Outline
    
    @And("the user enters {string} as email address")
    public void userEntersEmailAddress(String email) {

        loginPage = new LoginPage(DriverFactory.getDriver());
        loginPage.enterEmail(email);
    }
    
    @And("the user enters {string} as password")
    public void userEntersPassword(String password) {
        loginPage.enterPassword(password);
    }
    
    @Then("the user should see the {string}")
    public void userShouldSeeThe(String expectedResult) {

        if (expectedResult.equals("success")) {
            Assert.assertTrue(
                homePage.isLogoutDisplayed(),
                "Login was not successful"
            );
        } else if (expectedResult.equals("failure")) {
            Assert.assertTrue(
                loginPage.isLoginErrorDisplayed(),
                "Login error was not displayed"
            );
        }
    }
    
    
    
    
    
    
    

}
