package problem_program;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test 
{
	ex_kitelogin1page login1;
	Ex1_KiteLogin2Page login2;
	Ex1_KiteHomePage home;
	
	Sheet sh;
	WebDriver driver;
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException 
	{

		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		 login1 = new ex_kitelogin1page(driver);
		 login2=new Ex1_KiteLogin2Page(driver);
		 home=new Ex1_KiteHomePage(driver);
	}

	@BeforeMethod
	public void logintoapp() 
	{
		login1.set_Ex1_KiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.set_Ex1_KiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.click_Ex1_KiteLogin1PageLoginbtn();
		login2.set_Ex1_KiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.click_Ex1_KiteLogin2PageCntBtn();
		
	}
	
	@Test
	public void verifyuserid() 
	{
		String actID = home.get_Ex1_KiteHomePageUserID();
		String expID = sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(actID, expID);
	}
	
	@AfterMethod
	public void logoutapp() 
	{
		
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException 
	{
	    Thread.sleep(2000);
	    driver.quit();
	}
}


