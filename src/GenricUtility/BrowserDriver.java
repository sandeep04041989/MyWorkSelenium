package GenricUtility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserDriver 

{
	
	
	 public static WebDriver createFirefoxDriver()
	 {
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        return driver;
	 }  
	  
	 
	 public static WebDriver createChromeDriver()
	 {
		 System.setProperty("webdriver.chrome.driver", "D:/Personal/Selenium/Drivers/chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        return driver;
	 }  
	 
	 public static WebDriver createIEDriver()
	 {
		    	 
		    System.setProperty("webdriver.ie.driver", "D:/Personal/Selenium/Drivers/IEDriverServer_Win32_2.53.0/IEDriverServer.exe");
	        WebDriver driver = new InternetExplorerDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        return driver;
	 }  
	
	
	
}
	
	
	
	
	

