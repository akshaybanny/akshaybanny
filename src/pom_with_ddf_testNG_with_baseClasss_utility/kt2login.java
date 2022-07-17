package pom_with_ddf_testNG_with_baseClasss_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kt2login {
	
	
	@FindBy(xpath="//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement Contibtn;

	public kt2login(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public void setpin(String pin) {
		Pin.sendKeys(pin);
	}
	public void setcontibtn() {
		Contibtn.click();
	}
	
	
}
