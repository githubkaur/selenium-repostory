package Step_def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hooks 
{
	public static  WebDriver driver;
	
	
	public void  openbrowser()
	{
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver
		
	}

}
