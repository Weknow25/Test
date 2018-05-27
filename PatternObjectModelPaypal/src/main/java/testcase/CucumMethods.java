package testcase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class CucumMethods extends SeMethods{
	@Before
	public void beforeMethods(Scenario scen){
		startResult();
		startTestModule(scen.getName(), scen.getId());	
		test = startTestCase(scen.getName());
		test.assignCategory("Functional");
		test.assignAuthor("Vinoth");
		startApp("chrome");	
	}
	@After
	public void afterMethods(){
		closeAllBrowsers();
		endResult();
	}

}
