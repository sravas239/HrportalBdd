package runner.java;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		plugin = { "pretty",
	    			"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	    			"html:target/cucumber-reports.html"},
	    glue = "stepDefinitions",
	    monochrome = true
	)
public class TestRunner {
}

