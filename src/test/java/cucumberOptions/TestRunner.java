package cucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
			features ="src/test/java/features",
			glue="stepDefinitions")
	public class TestRunner {	

}
