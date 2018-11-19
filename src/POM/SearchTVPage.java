package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchTVPage {
	
	
	
	//@FindBy(xpath="//li[@class='s-result-item celwidget  AdHolder'][1]")
	@FindBy(xpath="//div[contains(@class,'a-row a-spacing-small')]//a[contains(@title,'Toshiba 32LF221U19 32-inch 720p HD Smart LED TV - Fire TV Edition')]//h2[contains(@class,'a-text-normal')]")
	private WebElement searchTV;
	
	public SearchTVPage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	
	
	public void searchTV()
	{
		searchTV.click();
	}

}
