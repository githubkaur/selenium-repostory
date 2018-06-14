package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class Branches extends Base
{
	
	
	
	public static WebElement branchClick(WebDriver driver)
	{
		return driver.findElement(getlocator("branches_xpath"));
		
	}

      public static Select country_dd(WebDriver driver)
      {
      	return new Select(driver.findElement(getlocator("country_dd")));
      }
    	
      public static Select state_dd(WebDriver driver)
      {
      	return new Select(driver.findElement(getlocator("State_dd")));
      }
      
    
        
public static Select City_DB(WebDriver driver)
{
	return new Select(driver.findElement(getlocator("City_dd")));
}
	
	 public static WebElement search_btn(WebDriver driver)
     {
     	return (driver.findElement(getlocator("Search_btn")));
     }
     
    
	 public static WebElement clear_btn(WebDriver driver)
     {
     	return (driver.findElement(getlocator("clear")));
     }
     
    
	public static  WebElement  newbranch_btn(WebDriver driver)
	{
		
		return driver.findElement(getlocator("newbranch_btn"));
		
	}

	

}
