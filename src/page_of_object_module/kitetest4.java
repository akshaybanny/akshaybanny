package page_of_object_module;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class kitetest4 {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Akshay\\Desktop\\Desktop\\selenium12 march A\\excel sheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		
		kitelogin1 s1=new kitelogin1(driver);
           s1.setusernamekt1(sh.getRow(0).getCell(0).getStringCellValue());
            s1.setpasswordkt1(sh.getRow(0).getCell(1).getStringCellValue());
		s1.clicklogin();
		kitelogin2 s2=new kitelogin2(driver);
s2.setpinkt2(sh.getRow(0).getCell(2).getStringCellValue());
s2.clickcontinuebtnkt2();
		
		
		kitehomepage3 s3=new kitehomepage3(driver);
       
       s3.setsearchbar();
       Thread.sleep(2000);
     
       s3.buybutton();
		


		
		
		
	}




}
