package fb_delete_friendrequest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;

public class basic_test implements Autoconstant {
	public WebDriver driver;
	static {
		System.setProperty(chromekey, chromevalue);
	}
	@BeforeClass
	public void openappfb() {
	     
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
		
		
		
		
	}

}
