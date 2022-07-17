package problem_program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ex_kitelogin1page {
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbtn;
	
	public ex_kitelogin1page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set_Ex1_KiteLogin1PageUsername(String username) 
	{
		UN.sendKeys(username);
	}
	
	public void set_Ex1_KiteLogin1PagePassword(String password) 
	{
		pwd.sendKeys(password);
	}
	
	public void click_Ex1_KiteLogin1PageLoginbtn()
	{
		loginbtn.click();
	}
}
