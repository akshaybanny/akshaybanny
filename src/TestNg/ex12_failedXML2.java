package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex12_failedXML2 {
	
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
		String actresult="hello";
		String expresult="hello";
		Assert.assertEquals(actresult,expresult,"failed both results are diff" );
		Reporter.log("running Tc6",true);
	}

}
