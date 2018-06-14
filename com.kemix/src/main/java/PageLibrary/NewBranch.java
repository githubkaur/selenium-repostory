package PageLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class NewBranch extends Base {
	
	public static WebElement branches_btn(WebDriver driver)
	{
		
        return driver.findElement(getlocator("newbranch_btn_id"));
	
		
	}

	public static  WebElement  newbranch_btn(WebDriver driver)
	{
		
		return driver.findElement(getlocator("newbranch_btn_id"));
		
	}

	public static  WebElement  Branchname(WebDriver driver)
	{
		
		return driver.findElement(getlocator("Branch_BranchName_id"));
		
	}
	
	public static  WebElement  Branch_Address1(WebDriver driver)
	{
		
		return driver.findElement(getlocator("Branch_Address1_id"));
		
	}
	
	public static  WebElement  Branch_Address2(WebDriver driver)
	{
		
		return driver.findElement(getlocator("Branch_Address2_id"));
		
	}
	public static  WebElement  Branch_Address3(WebDriver driver)
	{
		
		return driver.findElement(getlocator("Branch_Address3_id"));
		
	}

	
	public static  WebElement  Area(WebDriver driver)
	{
		
		return driver.findElement(getlocator("Branch_Area_id"));
		
	}
	
	public static  WebElement  zipCode(WebDriver driver)
	{
		
		return driver.findElement(getlocator("Branch_ZipCode_id"));
		
	}
	
	
	public static  Select  CountryCode(WebDriver driver)
	{
		
		return new Select (driver.findElement(getlocator("Branch_Country_dd")));
		
	}
	
	
	public static  Select  branchState(WebDriver driver)
	{
		
		return new Select (driver.findElement(getlocator("Branch_State_dd")));
		
	}
	
	public static Select BranchCity(WebDriver driver)
	{
		return new Select(driver.findElement(getlocator("Branch_City_dd")));
	}
	
	public static WebElement BranchSubmit(WebDriver driver)
	{
		return driver.findElement(getlocator("Branch_submit_btn"));
	}
}


