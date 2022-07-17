package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_08_keyword_dependsonmethods_02 {
	@Test
	public void login1() {
		Reporter.log("login1 running");
	}
	@Test
	public void login2() {
		Reporter.log("login2 running");
	}
	
	
	
	
	
	
	@Test(dependsOnMethods={"login1","login2"})
    public void logout() {
    	Reporter.log("logout tc running");
	}
}
