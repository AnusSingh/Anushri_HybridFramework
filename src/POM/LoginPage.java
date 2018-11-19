package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/*@FindBy(xpath="//span[.='Sign in']")
	private WebElement sigin;
	*/
	//"//span[.='Hello. Sign in']"
	
	@FindBy(id="ap_email")
	private WebElement emailid;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement siginbtn;
	
	public LoginPage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}
	
	/*public void siginlink()
	{
		sigin.click();
	}*/
	
	
	public void emailidtxtbox(String name)
	{
		emailid.sendKeys(name);
		
	}
	
	public void passwordtxtbox(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void SigninButton()
	{
		siginbtn.click();
	}
	
}
