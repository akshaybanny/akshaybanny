package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_09_sample2 {

	
	@Test
	public void Tc5() {
		Reporter.log("tac5 running",true);
	}
	
	@Test
	public void Tc6() {
		Reporter.log("tac6 running",true);
	}
	@Test(priority=-1)
	public void Tc7() {
		Reporter.log("tac7 running",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
