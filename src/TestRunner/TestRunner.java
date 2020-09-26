package TestRunner;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		feature="src\\Features\\Print.feature",
		glue= "StepDefination")
public class TestRunner {

}
