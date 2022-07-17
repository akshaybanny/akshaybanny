package pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite2login {
	@FindBy(xpath = "//input[@minlength=\"6\"]")  private WebElement pin;
	@FindBy(xpath = "//button[@class=\"button-orange wide\"]")  private   WebElement logi;
	
	
	public kite2login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin(String Pin) {
		pin.sendKeys(Pin);
	}
	
	public void continuebtn() {
		logi.click();
	}

}
