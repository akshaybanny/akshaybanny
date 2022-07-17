package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex11_disable_execution_sample2 {
	@Test
	public void Tc4() {
		Reporter.log("running Tc4",true);
	}
	
	
	@Test
	public void Tc5() {
		Reporter.log("running Tc5",true);
	}
	
	
	@Test
	public void Tc6() {
		Reporter.log("running Tc6",true);
	}
}
