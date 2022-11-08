package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features= {"src/test/resources/login/login.feature"},glue= {"defination"}, tags = "@NegativeTesting")
public class Test_Runner extends AbstractTestNGCucumberTests{
	
}
