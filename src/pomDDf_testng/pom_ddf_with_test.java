package pomDDf_testng;


import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import problem_program.Ex1_KiteHomePage;
import problem_program.Ex1_KiteLogin2Page;
import problem_program.ex_kitelogin1page;

public class pom_ddf_with_test extends base_class{
	ex_kitelogin1page login1;
	Ex1_KiteLogin2Page login2;
	Ex1_KiteHomePage home;
	
	

	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException 
	{

		
		
		 initializebrowser();
		
		 login1 = new ex_kitelogin1page(driver);
		 login2=new Ex1_KiteLogin2Page(driver);
		 home=new Ex1_KiteHomePage(driver);
	}

	@BeforeMethod
	public void logintoapp() throws EncryptedDocumentException, IOException 
	{
		login1.set_Ex1_KiteLogin1PageUsername(utility_class1.getTd(0, 0));
		login1.set_Ex1_KiteLogin1PagePassword(utility_class1.getTd(0, 1));
		login1.click_Ex1_KiteLogin1PageLoginbtn();
		login2.set_Ex1_KiteLogin2PagePin(utility_class1.getTd(0, 2));
		login2.click_Ex1_KiteLogin2PageCntBtn();
		
	}
	
	@Test
	public void verifyuserid() throws EncryptedDocumentException, IOException 
	{
		String actID = home.get_Ex1_KiteHomePageUserID();
		String expID = utility_class1.getTd(0, 3);
		Assert.assertEquals(actID, expID);
	}
	
	@AfterMethod
	public void logoutapp() 
	{
		
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException 
	{
	    Thread.sleep(2000);
	    driver.quit();
	}

}
