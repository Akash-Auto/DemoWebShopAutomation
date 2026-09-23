package com.demowebshop.hooks;


import java.io.File;
import java.nio.file.Files;

import com.demowebshop.base.DriverFactory;
import com.demowebshop.utils.ConfigReader;
import com.demowebshop.utils.ScreenshotUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CucumberHooks {


	@Before(order = 0)
	public void setUp() {

		DriverFactory.initializeDriver();

		DriverFactory.getDriver().get(
				ConfigReader.getProperty("url")
				);
	}

	@Before("@smoke")
	public void smokeSetup() {
		System.out.println("Smoke test started");
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {

			String screenshotPath = ScreenshotUtil.captureScreenshot(
					DriverFactory.getDriver(),
					scenario.getName()
					);

			try {
				byte[] screenshot = Files.readAllBytes(
						new File(screenshotPath).toPath()
						);

				scenario.attach(
						screenshot,
						"image/png",
						"Failure Screenshot"
						);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@After(order = 0)
	public void closeBrowser() {
	    DriverFactory.quitDriver();
	}

}
