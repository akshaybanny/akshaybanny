package Notification_disabled;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class notification_ex_01 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		 option.addArguments("--disable-notifications");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay\\eclipse-workspace\\.metadata\\.plugins\\maven12marA\\browser\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver(option);
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://kite.zerodha.com/");
				
				
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("VS6640");
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("7066650010");
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				
               driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("706665");
				
				
               driver.findElement(By.xpath("//button[text()='Continue ']")).click();

				
				Thread.sleep(3000);
				WebElement hol = driver.findElement(By.xpath("//span[text()='Holdings']"));
				
				Actions act=new Actions(driver); 
				act.click(hol).click().perform();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='Get started ']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("IOC");
				
				driver.findElement(By.xpath("//li[@class=\"search-result-item selected\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//button[@class=\"button-outline button-blue\"])[2]")).click();
				Thread.sleep(1000);

				   WebElement value = driver.findElement(By.xpath("(//input[@type=\"number\"])[2]"));
				//System.out.println(value.getText());
				//System.out.println(actvalue);
				
				
				String acttext=value.getText();
				String exptext="70.75";
				if(acttext.equals(exptext)) {
					System.out.println("pass");
				}
				else {
					System.out.println(acttext);
				}
				
				
				
				
				
				
				
				
				
				
}}
