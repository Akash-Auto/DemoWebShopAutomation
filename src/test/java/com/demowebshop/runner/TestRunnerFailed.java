package com.demowebshop.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
        features = "@target/failed_scenarios.txt",
        glue = {
                "com.demowebshop.stepdefinitions",
                "com.demowebshop.hooks"
        },
        plugin = {
                "pretty"
        },
        monochrome = true,
        dryRun = false
)
public class TestRunnerFailed extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
