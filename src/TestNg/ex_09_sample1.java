package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_09_sample1 {
	@Test
	public void Tc1() {
		Reporter.log("tac1 running",true);
	}
	
	@Test
	public void Tc2() {
		Reporter.log("tac2 running",true);
	}
	@Test
	public void Tc3() {
		Reporter.log("tac3 running",true);
	}
	
	@Test(enabled=false)
	public void Tc4() {
		Reporter.log("tac4 running",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
