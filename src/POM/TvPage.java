package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvPage {
	@FindBy(xpath="//span[.='32 inches']")
	private WebElement tvsize;
	
	@FindBy(id="add-to-cart-button")
	private WebElement addtocart;
	
	public TvPage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	
	
	public void TvSize()
	{
		tvsize.click();
	}

	public void AddToCardButton()
	
	{
		addtocart.click();
	}
	
	
}
