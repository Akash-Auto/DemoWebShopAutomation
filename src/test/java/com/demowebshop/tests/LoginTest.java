package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.base.BaseTest;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.utils.ConfigReader;

public class LoginTest extends BaseTest {

	
	@Test
	public void verifySuccessfulLogin() {
		
		HomePage homePage=new HomePage(driver);
		LoginPage loginPage=new LoginPage(driver);
		
		homePage.clickLogin();
		
		String email = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
		
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        
        Assert.assertTrue(homePage.isLogoutDisplayed(),
                "Login was not successful");
        
        
		
	}
	
	
}
