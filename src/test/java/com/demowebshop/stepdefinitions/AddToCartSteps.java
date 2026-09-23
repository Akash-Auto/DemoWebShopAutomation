package com.demowebshop.stepdefinitions;

import org.testng.Assert;

import com.demowebshop.base.DriverFactory;
import com.demowebshop.pages.AddToCartPage;

import io.cucumber.java.en.*;

public class AddToCartSteps {
	
	private AddToCartPage addToCartPage;

	@And("the user clicks on Computers")
	public void the_user_clicks_on_computers() {
		
		addToCartPage=new AddToCartPage(DriverFactory.getDriver());
		addToCartPage.clickOncomputerLink();
	   
	}

	@And("the user clicks on Desktops")
	public void the_user_clicks_on_desktops() {
	   
		addToCartPage.clickOnDesktopLink();
		
	}

	@And("the user selects a desktop product")
	public void the_user_selects_a_desktop_product() {
	    
		addToCartPage.clickdeskTopImage();
		
	}

	@And("the user clicks on Add to cart")
	public void the_user_clicks_on_add_to_cart() {
		
		addToCartPage.clickOnaddToCartButton();
	   
	}

	@Then("the product should be added to the shopping cart")
	public void the_product_should_be_added_to_the_shopping_cart() {
		
		Assert.assertTrue(addToCartPage.verifyProductAddedToCart());
	   
	}
	
	
	
	
	
	
	
}
