package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_07__keyword_priority_2 {
	@Test(priority=1)
	public void tc3() {
		Reporter.log("running tc3",true);     //duplicate priority
	}
	
	@Test(priority=1)
	public void tc2() {
		Reporter.log("running tc2",true); //duplicate priority
	}
	@Test
	public void tc1() {
		Reporter.log("running tc1",true);    //by default priority (0)
	}
	@Test(priority=-2)                     //priority can be -ve
	public void tc4() {
		Reporter.log("running tc4",true);
	}
}
