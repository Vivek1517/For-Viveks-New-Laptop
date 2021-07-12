package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= "E:/Java Project/PageFactoryPractice/src/main/java/Features",
glue = "StepDefinations")
public class TestRunner {
}
