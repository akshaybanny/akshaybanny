package TestNg;

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

import pom_ddf.kite1login;
import pom_ddf.kite2login;
import pom_ddf.kite3login;

public class test1 {
	WebDriver driver;
	 Sheet sh;
	int a;
	kite1login s1;
	kite2login s2;
	kite3login s3;
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\Akshay\\\\Desktop\\\\Desktop\\\\selenium12 march A\\\\excel sheet.xlsx");
		   sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
				 driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				
				 s1=new kite1login(driver);
				 s2=new kite2login(driver);
				 s3=new kite3login(driver); 
				a=10;
				
				
		
	}
	@BeforeMethod
	public void logintoapp() throws EncryptedDocumentException, IOException {


		s1.enterun(sh.getRow(0).getCell(0).getStringCellValue());
		 s1.entepwd(sh.getRow(0).getCell(1).getStringCellValue());
		 s1.login();
		 s2.enterpin(sh.getRow(0).getCell(2).getStringCellValue());
		 s2.continuebtn();
	}
	@Test
	public void Verifyuserid() {
		String acttext = s3.userid();
		String exptext = sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(acttext, exptext,"failed both condition");
		
	}
	
	
	@AfterMethod
	public void logouttheapp() {
		
	}
	@AfterClass
	public void closethebapp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	
	
	
	
	
	

}



