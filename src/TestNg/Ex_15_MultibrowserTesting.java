package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex_15_MultibrowserTesting {
    @Parameters("browserName")
	@Test
	public void Tc(String browserName) throws InterruptedException {
		
		WebDriver driver=null;
		
		if(browserName.equals("Chrome")) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			 driver=new ChromeDriver();
		}
		else if(browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akshay\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			
			 driver=new FirefoxDriver();
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("VS6640");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("7066650010");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
       driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("706665");
		
		
       driver.findElement(By.xpath("//button[text()='Continue ']")).click();

       String acttext=driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String exptext="VS6640";
		if(acttext.equals(exptext)) {
			System.out.println("pass ho gaya pappu");
		}
		else {
			System.out.println("fail ho gaya pappu");
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		}
  }
