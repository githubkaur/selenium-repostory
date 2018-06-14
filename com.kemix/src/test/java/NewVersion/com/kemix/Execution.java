package NewVersion.com.kemix;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Excel.excel;

public class Execution extends Repository{
	
	@BeforeTest
	public void launchHome()
	{
		launch();
	}
	@Test(priority=1)
	public void Verifylogin()
	{
		login();
	}

	@Test(priority=2)
	public void VerifyClickBranches()
	{
		clickBranch();
	
	}
	@Test(priority=3)
	public void VerifySearchBranch()
	
	{
		branchSearch();
	}
	/*@Test(priority=4)
	public void VrifyNewBranchClick()
	{
		newBranchClick();
	}*/
	
	/*@Test(priority=5)
	public void VrifyNewBranchEntry()
	{
		Create_newBranch();
	}*/
	
	public void verify_content() throws IOException
	{
		excel.excelconnection("Excelfile.xls", "Sheet1");
		excel.outputexcelconnection("Excelfile.xls", "output.xls", "Sheet1");
		int j=excel.ccount();
		for(int i=1;i<excel.rcount();i++)
		{
			
			Create_newBranch(excel.readdata(0, i));
		
		String txt=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if(txt.contains(" created Sucessfully"))
		{
			excel.writedata(j++, i, "Record created:Displayed:"+txt);
			j--;
		}
		else
		{
			excel.writedata(j++, i, "alert is n/a");
			j--;
		}
		}
		excel.saveworkbok();
	}
	
		
	}
	

