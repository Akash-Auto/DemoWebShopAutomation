package com.demowebshop.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.base.BaseTest;

public class WebDriverTest extends BaseTest {
	
	  @Test
	    public void verifyBrowserLaunch() {

	        String title = driver.getTitle();

	        System.out.println("Page Title: " + title);

	        Assert.assertTrue(title.contains("Demo Web Shop"));
	    }

}
