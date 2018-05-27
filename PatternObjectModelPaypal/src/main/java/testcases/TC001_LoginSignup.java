package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PaypalhomePage;
import wdMethods.ProjectMethods;

public class TC001_LoginSignup extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_Signup";
		testDescription="Signup in PayPal Application";
		testNodes="Paypal";
		category="Smoke";
		authors="Vinoth";
		browserName="chrome";
		dataSheetName="TC007";
	}
	@Test(dataProvider="fetchData")
	public void signUp(String country) {
		
		new PaypalhomePage()
		.clickonSignUp()
		.verifyacselect()
		.clicknext()
		.selectcountry(country);
		//.clickLogOut();			
	}

}
