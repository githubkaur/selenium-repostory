package PageLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestBase.Base;

public class HomePage extends Base {
	
	
	
	public static WebElement UserName_editbox(WebDriver driver)
	{
		
        return driver.findElement(getlocator("UserName_id"));
	
		
	}

	public static  WebElement  Password_editbox(WebDriver driver)
	{
		
		return driver.findElement(getlocator("password_id"));
		
	}

	public static  WebElement  login_btn(WebDriver driver)
	{
		
		return driver.findElement(getlocator("login_btn"));
		
	}

}
