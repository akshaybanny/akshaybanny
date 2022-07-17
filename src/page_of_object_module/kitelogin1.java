package page_of_object_module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin1 {
	
	@FindBy(xpath = "//input[@maxlength='6']") private WebElement user;
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement loki;
	
	
	public kitelogin1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setusernamekt1(String Username) {
		user.sendKeys(Username);
	}
	public void setpasswordkt1(String Password) {
		pass.sendKeys(Password);
	}
	public void clicklogin() {
		loki.click();
	}
	
	

}
