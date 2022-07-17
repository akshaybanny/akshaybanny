package fb_delete_friendrequest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1page {
	
	
	@FindBy(id="email") WebElement userid;
	@FindBy(xpath = "//input[@type=\"password\"]") private WebElement pwd;
	 @FindBy(xpath = "//button[@name=\"login\"]") private WebElement logi;
	
	
	public login1page(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	   
	   public void setusername() {
		   userid.sendKeys("8411905476");
	   }
	   public void setpwd() {
		   pwd.sendKeys("Akshay@123");
	   }
	   public void clicklogin() {
		   logi.click();
	   }
	
	
	
	
	

}
