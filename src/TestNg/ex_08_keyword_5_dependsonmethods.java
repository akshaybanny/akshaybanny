package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_08_keyword_5_dependsonmethods {
	
	@Test
	public void login() {
		Reporter.log("login running",true);
	}
	
	@Test(dependsOnMethods="login")
    public void logout() {
    	Reporter.log("logout tc running");
	}

}
