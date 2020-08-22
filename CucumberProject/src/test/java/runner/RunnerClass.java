package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(features="D:/Dakshata Java Programs/CucumberProject/features",
					glue ={"/CucumberProject/src/test/java/stepDefinition"},
					plugin = {"pretty","html:target/htmlreports"})
	
	
		public class RunnerClass {
	

}
