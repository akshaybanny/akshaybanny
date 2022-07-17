package page_of_object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage3 {
	
	WebDriver driver;
	@FindBy(xpath = "//input[@type=\"text\"]") private WebElement searchbar;


	@FindBy(xpath = "//button[text()='B ']") private WebElement buybtn;
	@FindBy(xpath = "(//input[@type=\"number\"])[1]") private WebElement getitem;
	public kitehomepage3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setsearchbar() {
		searchbar.sendKeys("WIPRO");
	}


	
	public void buybutton() {
Actions act=new Actions(driver);
act.moveToElement(buybtn).click().perform();
       

	}
	
	public void verifyuserid() {
		String acttext=getitem.getText();
		String exptext="1";
		if(acttext.equals(exptext)) {
			System.out.println("pass the value is one");
		}
		else {
			System.out.println("failed");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
