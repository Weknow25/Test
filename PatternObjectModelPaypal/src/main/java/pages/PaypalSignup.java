package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import wdMethods.ProjectMethods;

public class PaypalSignup extends ProjectMethods{
	@FindBy(how=How.ID,using="country")
	private WebElement drop;
	public PaypalSignup selectcountry(String data) {
		selectDropDownUsingText(drop, data);
		return this;		
	}
	
}
