package runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(tags = "", features = "src/test/resources/Feature/gopi.feature", 
glue = "steps1",
plugin = {"pretty", "html:target/cucumber-html-report"},
dryRun=false

//strict=true
		)
 

//https://stackoverflow.com/questions/41034116/how-to-execute-cucumber-feature-file-parallel
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
 
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
 
}