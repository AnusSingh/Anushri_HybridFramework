package Scripts;

import org.testng.annotations.Test;

import generic.Basetest;
import generic.Excel;
import POM.LoginPage;

public class InvalidLogin extends Basetest {
	
	@Test
	public void Invalid() throws InterruptedException
	{

	LoginPage lp=new LoginPage(driver);
	
	//lp.siginlink();
	Thread.sleep(5000);
    String us= Excel.getdata(excelpath, "Sheet1", 1, 0);
	lp.emailidtxtbox(us);
	
    String pwd=Excel.getdata(excelpath, "Sheet1", 1, 1);
    
    lp.passwordtxtbox(pwd);
    lp.SigninButton();
    
	}

}
