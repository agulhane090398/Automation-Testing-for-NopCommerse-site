package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		//dryRun = true,
		monochrome = true,
		features="Features/Customer.feature",
		glue="stepDefinations",
		plugin= {"pretty" , "html:html-report"}
		)
public class TestRunner {

}
