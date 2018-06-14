package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class validation {
	
  public static boolean IsTextPresent(WebDriver driver,String exp)
  {
   return driver.findElement(By.tagName("tbody")).getText().contains(exp);
}
}