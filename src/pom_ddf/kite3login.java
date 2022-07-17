package pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kite3login {
	@FindBy(xpath="//span[@class='user-id']")  private	WebElement Userid;



	public kite3login(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public String userid() {
		String acttext=Userid.getText();
		return acttext;
	}
	
	
		
		
		public void Userid(String userId) {
			String acttext=Userid.getText();
			String exptext="VS6640";
			if(acttext.equals(exptext)) {
				System.out.println("pass");
			}
			else {
				System.out.println("fail");
			}
			
			
		}

}
