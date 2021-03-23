package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:Features"
		,glue= {"stepdefinitions"}
		,tags = {"@Deletar"}
		,plugin = {"pretty","html:target/cucumber-reports"} 
		,dryRun = false
		,monochrome = true
		)


public class TestRunner {

}
