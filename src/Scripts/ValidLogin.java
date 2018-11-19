package Scripts;

import generic.Basetest;
import generic.Constant;
//import generic.Excel;
import generic.Property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.CheckoutPage;
import POM.HomePage;
import POM.LoginPage;
import POM.SearchTVPage;
import POM.TvPage;

public class ValidLogin implements Constant {
	
	@Test
	public void Login() throws InterruptedException{
		
		System.setProperty(key, value);
	     WebDriver driver=new ChromeDriver();
	    String url=Property.getPropertyData(propertyfilepath, "URL");
	    
	    driver.get(url);
		
	
		LoginPage lp=new LoginPage(driver);
		//lp.siginlink();
	
	    String name=Property.getPropertyData(propertyfilepath,"EMAILID");
	    System.out.println(name);
		lp.emailidtxtbox(name);
	  
	    String pwd=Property.getPropertyData(propertyfilepath,"PASSWORD");
	    
	    lp.passwordtxtbox(pwd);
	    lp.SigninButton();
	    
	    //Home Page
	    HomePage hp=new HomePage(driver);
	    System.out.println("Login page initiated123654");
	    
	    String name1=Property.getPropertyData(propertyfilepath,"SEARCH");
	    hp.searchtxtbox(name1);
	    hp.searchclick();
        //Search TV
	    SearchTVPage stp =new SearchTVPage(driver);
	    stp.searchTV();
	    
	    //TV Page
	    TvPage tvp =new TvPage(driver);
	    tvp.TvSize();
	    tvp.AddToCardButton();
	    
	    //Checkout Page
	    CheckoutPage cop=new CheckoutPage(driver);
	    cop.CheckoutButton();
	    Thread.sleep(2000);
	    cop.nocoverageButton();
	    Thread.sleep(2000);
	    cop.deliveryAddress();
	    
}
}
