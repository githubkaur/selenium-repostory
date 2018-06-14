package PageLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestBase.Base;

public class Generic extends Base {
	
	public static  Select   deropdownhandle(WebDriver driver,By prop)
	{
		Select s=new Select(driver.findElement(prop));
		
		return s;
	}
	public static  Select deropdownhandle2(WebDriver driver,By prop,String exp)
	{
		Select s=new Select(driver.findElement(prop));
		
	List<WebElement> option=s.getOptions();
	
	  for(WebElement op:option)
	  {
		 String actText= op.getText();
		 
		 if(actText.contains(exp))
		 {
			 s.selectByVisibleText(exp);
			 break;
		 }
	  }
		return s;
	}
	/*public static boolean IsTittle(WebDriver driver, String actual)
	{
		
		boolean t=driver.getTitle().contains(actual);
		return t;
		
	}
	public static boolean IsAlertPresent(WebDriver driver,String actual)
	{
		boolean b=driver.switchTo().alert().getText().contains(actual);
		return b;
	}*/
}
