package pageObjects;

import java.io.IOException;

import org.openqa.*;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import GenricUtility.RepositoryParser;



public class Home_Page   {
	
	
	
	

	private static WebElement selement = null;
	
	public static WebElement lnk_Register(WebDriver driver,String locatorName )
	{
		
		
		selement=driver.findElement(RepositoryParser.getbjectLocator(locatorName));
		return selement;
		
	}
	
	
	public static WebElement lnk_SignOn(WebDriver driver,String locatorName )
	{
	
		selement=driver.findElement(RepositoryParser.getbjectLocator(locatorName));
		
		return selement;
		
	}
	
	public static WebElement txtbx_User(WebDriver driver,String locatorName )
	{
		
		selement=driver.findElement(RepositoryParser.getbjectLocator(locatorName));
		
		return selement;
		
	}
	
	
	public static WebElement txtbx_Pwd(WebDriver driver,String locatorName )
	{
		
		selement=driver.findElement(RepositoryParser.getbjectLocator(locatorName));
		
		return selement;
		
	}
	

	public static WebElement Img_SignIn(WebDriver driver,String locatorName )
	{
		
		selement=driver.findElement(RepositoryParser.getbjectLocator(locatorName));
		
		return selement;
		
	}
	
	
	

}
