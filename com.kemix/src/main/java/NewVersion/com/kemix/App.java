package NewVersion.com.kemix;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageLibrary.Generic;
import PageLibrary.HomePage;
import TestBase.Base;


public class App 
{
	
    /*public static void main(WebDriver driver) {
    	String x = config("Build1url");
    	System.out.println(x);
    	
    	
    	Generic.deropdownhandle(driver, By.id("")).selectByVisibleText("");;
    	Generic.deropdownhandle(driver, By.id(id));
    	
    	Generic.deropdownhandle2(driver, By.id(""), "INDIA");
    	Generic.deropdownhandle2(driver, By.id(""), "Karnataka");
	}*/
	
	
	public static void main(String[] args)  
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://srssprojects.in/home.aspx");
		String title=driver.getCurrentUrl();
		System.out.println(title);
		//Thread.sleep(1000);
driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	
	}
}
