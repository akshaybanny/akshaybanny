package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex_03_annotations {
	
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open browser", true);
		
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login to app", true);
	}
	@Test
	public void verifyUserid2() {
		Reporter.log("running id2", true);
	}
	@Test
	public void verifyUserid1() {
		Reporter.log("running id1", true);
	}
	@Test
	public void verifyUserid3() {
		Reporter.log("running id3", true);
	}
	
	@AfterMethod
	public void logouttheapp() {
		Reporter.log("logout the app", true);
	}
	@AfterClass
	public void closethebapp() {
		Reporter.log("close the browser", true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
