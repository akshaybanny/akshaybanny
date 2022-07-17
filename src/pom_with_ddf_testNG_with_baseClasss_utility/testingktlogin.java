package pom_with_ddf_testNG_with_baseClasss_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingktlogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		
		kt1login s1=new kt1login(driver);
           s1.setUsernamekt1(sh.getRow(0).getCell(0).getStringCellValue());
           s1.setpasswordkt1(sh.getRow(0).getCell(1).getStringCellValue());
		   s1.loginbtn();
           
           
           kt2login s2=new kt2login(driver);
           s2.setpin(sh.getRow(0).getCell(2).getStringCellValue());
            s2.setcontibtn();
		
		
		kt3home s3=new kt3home(driver);
          s3.VerifyUserid(sh.getRow(0).getCell(3).getStringCellValue());


		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
