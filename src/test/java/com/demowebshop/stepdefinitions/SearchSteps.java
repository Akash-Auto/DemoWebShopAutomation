package com.demowebshop.stepdefinitions;

import org.testng.Assert;

import com.demowebshop.base.DriverFactory;
import com.demowebshop.pages.SearchPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	 private SearchPage searchPage;

	    @When("the user searches for {string}")
	    public void userSearchesFor(String product) {

	        searchPage = new SearchPage(DriverFactory.getDriver());
	        searchPage.enterSearchText(product);
	    }

	    @When("the user clicks the search button")
	    public void userClicksSearchButton() {

	        searchPage.clickSearch();
	    }

	    @Then("the search results should be displayed")
	    public void searchResultsShouldBeDisplayed() {

	        Assert.assertTrue(
	                searchPage.isSearchResultDisplayed(),
	                "Search results were not displayed"
	        );
	    }

}
