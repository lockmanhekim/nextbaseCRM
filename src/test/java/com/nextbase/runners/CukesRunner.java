package com.nextbase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "C:\\Users\\user\\nextbaseCRM\\src\\test\\resources\\feature",
        glue = "com/nextbaseCRM/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}