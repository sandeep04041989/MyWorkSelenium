package TestSuite;

import pageObjects.Home_Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


//import GenricUtility.BrowserDriver;
//import GenricUtility.ConstantAndVariables;
import GenricUtility.*;

//import pageObjects.Home_Page;

public class VerifyHomePage {
	
	
	
	 public static void main(String[] args) {
		 
		// WebDriver driver =BrowserDriver.createChromeDriver();
		
		// driver.get(ConstantAndVariables.URL);
		 
		 
		// Home_Page.txtbx_User(driver,"UserName").sendKeys(ConstantAndVariables.Username);
		// Home_Page.txtbx_Pwd(driver,"Password").sendKeys(ConstantAndVariables.Password);
		// Home_Page.lnk_SignOn(driver,"SignOnlink").click();
		// driver.close();
		 
		 
		 
		 Reporter.CreateTemplate(ConstantAndVariables.ReportFilePath);
		 
		 
		 
	 }
	
	

}
