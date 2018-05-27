package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class PaypalhomePage extends ProjectMethods{
	public PaypalhomePage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.ID,using="signup-button")
	private WebElement signup;
	public PaypalAccountpage clickonSignUp() {
		click(signup);
		return new PaypalAccountpage();		
	}
	

}
