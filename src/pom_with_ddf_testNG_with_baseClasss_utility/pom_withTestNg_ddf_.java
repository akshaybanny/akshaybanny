package pom_with_ddf_testNG_with_baseClasss_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pom_withTestNg_ddf_ extends Base22class {
	kt1login s1;
	kt2login s2;
	kt3home s3;
	Sheet sh ;
	int Tcd;
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException  {
			FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
			 sh = WorkbookFactory.create(file).getSheet("DDF");

			 initializeBrowser();		
			s1=new kt1login(driver);
			 s2=new kt2login(driver);
			 s3=new kt3home(driver);
		
	}
	@BeforeMethod
	public void login() throws IOException {
		s1.setUsernamekt1(utility_22_class.getPFdata("UN"));
        s1.setpasswordkt1(utility_22_class.getPFdata("PWD"));
		s1.loginbtn();
		 s2.setpin(utility_22_class.getPFdata("PIN"));
         s2.setcontibtn();
		
	}
	
	@Test
	public void verifyuserid() {
		Tcd=101;
     s3.VerifyUserid(sh.getRow(0).getCell(3).getStringCellValue());

	}
	
	
	@AfterMethod
	public void logouttheapp(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE) {
		  utility_22_class.capturess(driver, Tcd);
		}

		
		
	}
	
	@AfterClass
	public void closethebapp() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
