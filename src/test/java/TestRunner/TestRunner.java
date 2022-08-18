package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = {
			"pretty","html:target/HtmlReports",
			"json:target/cucumber.json"
		},
		features="src/test/resources",
		glue={ "StepDefinitions"},
		monochrome=true,
	//	dryRun=true,
		tags="@parameterization"
	


		)
public class TestRunner {


}
