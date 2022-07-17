package pom_with_ddf_testNG_with_baseClasss_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kt3home {
	
	@FindBy(xpath="//span[@class='user-id']") private WebElement Userid;
	
	
	public kt3home(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
	
	public void VerifyUserid(String userid) {
		String actid=Userid.getText();
		String expId="VS6640";
		if(actid.equals(expId)) {
			System.out.println("pass ho gaya akshay");
		}
		else {
			System.out.println("failed ho gaya ");
		}
	}
	
	
	
	
	
	
	
	
	

}
