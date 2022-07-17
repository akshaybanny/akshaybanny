package fb_delete_friendrequest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2page {
	
	
	@FindBy(xpath="(//input[@placeholder=\"Search Facebook\"])[1]") WebElement searchicon;
	
	@FindBy(xpath="(//div[@class=\"s45kfl79 emlxlaya bkmhp75w spb7xbtv\"])[1]") WebElement searchtab;
	@FindBy(xpath="(//span[text()='Shradha Achame'])[1]") WebElement hernameSA;
	@FindBy(xpath="//div[@aria-label=\"Cancel Request\"]") WebElement addfriend;
	@FindBy(xpath ="//div[@class=\"j83agx80 l9j0dhe7\"]") private WebElement logmenu;
	 @FindBy(xpath = "//span[text()='Log Out']") private WebElement logout;
	
	
	public login2page(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	
	public void icon() {
		   searchicon.sendKeys("shradha achame");
	   }
	
	

	 public void searchsendkeys() {
		   searchtab.click();
	   }
	 public void clickhername() {
		   hernameSA.click();
	   }
	 public void removefriendclick() {
		   addfriend.click();
	   }
	 
    public void clicklogmenu() {
   	 logmenu.click();
    }


	 
	 public void clicklogout() {
		   logout.click();
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
