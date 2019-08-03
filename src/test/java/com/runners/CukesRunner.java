package com.runners;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/Features/verifyTitle.feature",
        glue = "com.step_definitions",
        dryRun = true
)
public class CukesRunner {
}
