package NewVersion.com.kemix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import Excel.excel;
import PageLibrary.Branches;
import PageLibrary.Generic;
import PageLibrary.HomePage;
import PageLibrary.NewBranch;
import TestBase.Base;
import Utility.validation;

public class Repository  extends Generic
{
	WebDriver driver;
	public void launch()
	{
	driver=new FirefoxDriver();
	driver.get(config("Build1url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	 if(validation.IsTextPresent(driver, "Welcome to KEXIM Bank"))
	    {
	    	
	    	Reporter.log("Lauch Sucessfully");
	    }
	    else
	    {
	    
	    	Reporter.log("Test is failed");
	    	
	    }		
}
	public void login()
	{
		HomePage.UserName_editbox(driver).sendKeys(config("username"));
		HomePage.Password_editbox(driver).sendKeys(config("password"));

	    HomePage.login_btn(driver).click();	
	   
	    if(validation.IsTextPresent(driver, "Welcome to Admin "))
	    {
	    	System.out.println("Login Sucessfully");
	    }
	    else
	    {
	    
	    	System.out.println("wrong username or password");
	      }	
	}
	
	
	public void clickBranch()
	{
	    Branches.branchClick(driver).click();
	    if(validation.IsTextPresent(driver, " Branch Details"))
	    {
	    	System.out.println("Branch Page");
	    }
	    else
	    {
	    
	    	System.out.println("Branch Page Failed");
	
	    }	  
	}
	
	public void branchSearch()
	{
	
		Generic.deropdownhandle2(driver, getlocator("country_dd"), "INDIA");
		Generic.deropdownhandle2(driver, getlocator("State_dd"),"GOA");
		Generic.deropdownhandle2(driver, getlocator("City_dd"), "GOA");
		Branches.search_btn(driver).click();
		
		}
	
	public void newBranchClick()
	{
		NewBranch.newbranch_btn(driver).click();
	}
	
	public void Create_newBranch(String bname)
	{
		NewBranch.Branchname(driver).sendKeys(bname);
		NewBranch.Branch_Address1(driver).sendKeys("#1231");
		NewBranch.Branch_Address2(driver).sendKeys("JPnagar1");
		NewBranch.Branch_Address3(driver).sendKeys("first cross1");
		NewBranch.Area(driver).sendKeys("golden temple1");
		NewBranch.zipCode(driver).sendKeys("142356");
		Generic.deropdownhandle2(driver, getlocator("Branch_Country_dd"), "INDIA");
		Generic.deropdownhandle2(driver, getlocator("Branch_State_dd"), "GOA");
		Generic.deropdownhandle2(driver, getlocator("Branch_City_dd"), "GOA");
		NewBranch.BranchSubmit(driver).click();
				
	}
	
	public Object[] excelcontent(String filename, String sheetname)
	{
		excel.excelconnection(filename, sheetname);
		int rc=excel.rcount();
		int cc=excel.ccount();
		  String[][] data=new String[rc-1][cc];
		  for(int r=1;r<rc;r++)
		  {
			  for(int c=0;c<cc;c++)
			  {
			  data[r-1][c]=excel.readdata(c , r);
		  }
		  }
		return data;
	}
	
	
	
}
