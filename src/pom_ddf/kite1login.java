package pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite1login {
	@FindBy(xpath = "//input[@type='text']")         private WebElement un;
	 @FindBy(xpath = "//input[@placeholder='Password']") private WebElement pwd;
	 @FindBy(xpath = "//button[@type='submit']") private WebElement logi;
		  public kite1login(WebDriver driver) {
			  PageFactory.initElements(driver, this);
		  }
		   
		   public void enterun(String Username) {
			   un.sendKeys(Username);
		   }
		   public void entepwd(String Password) {
			   pwd.sendKeys(Password);
		   }
		   public void login() {
			   logi.click();
		   }

}
