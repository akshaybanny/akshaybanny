package problem_program;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ex1_KiteLogin2Page 
{
	@FindBy(xpath = "//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement cntbtn;
	
	public Ex1_KiteLogin2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set_Ex1_KiteLogin2PagePin(String pin) 
	{
		PIN.sendKeys(pin);
	}
	
	public void click_Ex1_KiteLogin2PageCntBtn() 
	{
		cntbtn.click();
	}

}

