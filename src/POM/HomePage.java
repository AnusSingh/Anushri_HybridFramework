package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement search;
	
	@FindBy(xpath="//input[@class='nav-input']")
	private WebElement searchicon;
	
	public HomePage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	
	
	public void searchtxtbox(String name)
	{
		search.sendKeys(name);
	}
	
	
	public void searchclick()
	{
		searchicon.click();
	}
	
	
}
