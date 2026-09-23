package com.demowebshop.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.demowebshop.utils.ConfigReader;

public class BaseTest {
	
	  protected WebDriver driver;

	    @BeforeMethod
	    public void setUp() {

	        DriverFactory.initializeDriver();

	        driver = DriverFactory.getDriver();

	        driver.get(ConfigReader.getProperty("url"));
	    }

	    @AfterMethod
	    public void tearDown() {

	        DriverFactory.quitDriver();
	    }
}
