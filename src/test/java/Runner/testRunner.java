package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;


@RunWith(Cucumber.class)
@CucumberOptions(
         features = "classpath:features",
         glue = "StepDefinition",
         tags = "@AllHomePage",
         dryRun = false,
         strict = true,
         monochrome = true,
         plugin = {
		"pretty",
		"html:target/site/cucumber-pretty",
		"json:target/cucumber.json"
          },
         publish = true
         )

public class testRunner{

		@AfterClass
		public static void generateReport() {
			CucumberReportingConfig.reportConfig();
		}
			
	
			
			
			
			
			
			
	
}
