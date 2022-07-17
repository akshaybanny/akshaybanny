package TestNg;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_04_invocation_count {
	
	@Test(invocationCount =10 )
	public void Tc1() {

Reporter.log("running of Tc1",true);
	}
	
	
	
	
	
	
	
	
	
	
	

}
