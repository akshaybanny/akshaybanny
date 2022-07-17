package pom_with_ddf_testNG_with_baseClasss_utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base22class {
	
	WebDriver driver;
	public void initializeBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(utility_22_class.getPFdata("URL"));
	
		
		
		
		
	}
	
	
	
	
	

}
