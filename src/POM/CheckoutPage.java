package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	
	@FindBy(id="hlb-ptc-btn-native")
	private WebElement checkout;
	
	
	@FindBy(id="siNoCoverage-announce")
	private WebElement nocoverage;
	
	
	@FindBy(id="address-book-entry-2")
	private WebElement addressdelivered;
	
	public CheckoutPage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	
	
     public void nocoverageButton()
	
	{
    	 nocoverage.click();
	}

	public void CheckoutButton()
	
	{
		checkout.click();
	}
 public void deliveryAddress()
 {
	 addressdelivered.click();
 }
}
