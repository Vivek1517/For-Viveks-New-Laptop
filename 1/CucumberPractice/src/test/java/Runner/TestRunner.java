package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Feature/",
glue = {"stepDefinitions"},
tags = "@smoke",
plugin = {"html:target/Vivreports"})
public class TestRunner {
}
