package com.demowebshop.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {
	
	private WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	// Page Objects
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[contains(text(),'Computers')]")
	private WebElement computerLink;
	
	@FindBy(xpath = "//ul[@class='sublist']//a[contains(text(),'Desktops')]")
	private WebElement DesktopLink;
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img")
	private WebElement deskTopImage;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-72']")
	private WebElement addToCartButton;
	
	@FindBy(id = "bar-notification")
	private WebElement verifyProductAddedToCart;
	
	//Page methods
	
	public void clickOncomputerLink() {
		
		computerLink.click();
		
	}
	
	public void clickOnDesktopLink() {
		
		DesktopLink.click();
		
	}
	
	public void clickdeskTopImage() {
		
		deskTopImage.click();
		
	}
	
	public void clickOnaddToCartButton() {
		
		addToCartButton.click();
		
	}
	
	// very imp concept interview point of view when xpath is correct element takes time for loading 
	// if we not using waits still getting NoSuchElementException
	public boolean verifyProductAddedToCart() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    return wait.until(
	            ExpectedConditions.visibilityOf(verifyProductAddedToCart)
	    ).isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
