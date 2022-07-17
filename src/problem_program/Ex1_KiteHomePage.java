package problem_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1_KiteHomePage 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;
	
	public Ex1_KiteHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String get_Ex1_KiteHomePageUserID() 
	{
        String actID = userID.getText();
		return actID;		
	}
	
	

}

