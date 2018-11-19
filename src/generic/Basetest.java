package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Basetest implements Constant {
	public WebDriver driver;
	
	@BeforeTest
	public void open() throws InterruptedException
	{
		System.setProperty(key, value);
	     WebDriver driver=new ChromeDriver();
	    String url=Property.getPropertyData(propertyfilepath, "URL");
	    
	    driver.get(url);
	    Thread.sleep(2000);
	}
	
	@AfterTest
	public void close()
	{
		//driver.close();
	}
	
	

}
