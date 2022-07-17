package page_of_object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2 {
	
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@type=\"submit\"]") private WebElement condom;
	
	
	public kitelogin2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void setpinkt2(String Pin) {
		pin.sendKeys(Pin);
	}
	public void clickcontinuebtnkt2() {
		condom.click();
	}
	
	
	
	
	
	
	
	
	

}
