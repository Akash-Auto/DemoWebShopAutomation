package com.demowebshop.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "small-searchterms")
    private WebElement searchBox;

    @FindBy(css = "input[value='Search']")
    private WebElement searchButton;

    @FindBy(css = "div.product-item")
    private WebElement searchResult;

    public void enterSearchText(String product) {
        searchBox.clear();
        searchBox.sendKeys(product);
    }

    public void clickSearch() {
        searchButton.click();
    }

    public boolean isSearchResultDisplayed() {
        return searchResult.isDisplayed();
    }

}
