package com.demowebshop.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	 public static String captureScreenshot(WebDriver driver, String screenshotName) {

	        String path = "test-output/screenshots/" + screenshotName + ".png";

	        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        try {
	            FileUtils.copyFile(source, new File(path));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return path;
	    }

}
