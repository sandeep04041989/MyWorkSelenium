package GenricUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.openqa.selenium.By;
public class RepositoryParser {
	


	private FileInputStream stream;
	protected String RepositoryFile;
	private  Properties propertyFile = new Properties();
	
	public static  By getbjectLocator(String locatorName )
	
	{
		
		
		try {
			File file = new File("OR.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			
			String locatorProperty = properties.getProperty(locatorName);
			System.out.println(locatorProperty.toString());
			String locatorType = locatorProperty.split(":")[0];
			String locatorValue = locatorProperty.split(":")[1];
			
			By locator = null;
			switch(locatorType)
			{
			case "Id":
				locator = By.id(locatorValue);
				break;
			case "name":
				locator = By.name(locatorValue);
				break;
			case "CssSelector":
				locator = By.cssSelector(locatorValue);
				break;
			case "linkText":
				locator = By.linkText(locatorValue);
				break;
			case "PartialLinkText":
				locator = By.partialLinkText(locatorValue);
				break;
			case "TagName":
				locator = By.tagName(locatorValue);
				break;
			case "Xpath":
				locator = By.xpath(locatorValue);
				break;
			}
			return locator;
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	


}

