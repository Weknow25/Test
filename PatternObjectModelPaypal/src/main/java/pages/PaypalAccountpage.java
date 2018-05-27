package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import wdMethods.ProjectMethods;

public class PaypalAccountpage extends ProjectMethods{
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement select;
	public PaypalAccountpage verifyacselect() {
		verifySelected(select);
		return this;		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement next;
	public PaypalSignup clicknext() {
		click(next);
		return new PaypalSignup();		
	}
	
	
}
