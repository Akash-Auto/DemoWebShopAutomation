package com.demowebshop.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.demowebshop.utils.ConfigReader;

import org.apache.logging.log4j.Logger;
import com.demowebshop.utils.LoggerUtil;

public class DriverFactory {

    private static final Logger logger =
            LoggerUtil.getLogger(DriverFactory.class);

    private static ThreadLocal<WebDriver> driver =
            new ThreadLocal<>();

    public static void initializeDriver() {

        String browser = ConfigReader.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");

            WebDriver webDriver = new ChromeDriver(options);

            driver.set(webDriver);

            logger.info("Chrome browser initialized successfully");
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {

        if (driver.get() != null) {

            logger.info("Closing browser");

            driver.get().quit();

            driver.remove();
        }
    }
}