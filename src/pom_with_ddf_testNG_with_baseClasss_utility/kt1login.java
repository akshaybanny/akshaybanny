package pom_with_ddf_testNG_with_baseClasss_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kt1login {
	
	
	@FindBy(xpath="//input[@id='userid']") private WebElement Userid;
	@FindBy(xpath="//input[@id='password']") private WebElement Password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loki;
	
	public kt1login(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public void setUsernamekt1(String user) {
		Userid.sendKeys(user);
	}
	
	public void setpasswordkt1(String password) {
		Password.sendKeys(password);
	}
	public void loginbtn() {
		loki.click();
	}
	
	

}
