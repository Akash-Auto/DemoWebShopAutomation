package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utils.WaitUtil;

public class HomePage {

	private WebDriver driver;
	private WaitUtil waitUtil;  // Very Imp

	public HomePage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	    waitUtil = new WaitUtil(driver);
	}
	
	
	@FindBy(className = "ico-login")
	WebElement loginLink;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	private WebElement logoutLink;
	
	
	//Method
	public void clickLogin() {
	    loginLink.click();
	}

	public void clickLogout() {
	    logoutLink.click();
	}

	public boolean isLogoutDisplayed() {
	    return logoutLink.isDisplayed();
	}

	public boolean isLoginDisplayed() {
	    return loginLink.isDisplayed();
	}
	
	
	
	
}
