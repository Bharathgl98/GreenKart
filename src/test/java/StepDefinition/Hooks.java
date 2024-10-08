package StepDefinition;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class Hooks {
TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	@After
	public void afterScenario()
	{
		try {
			testContextSetup.testbase.WebDriverManager().quit();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
	}
}
