package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ex_10_softassert_01 {
	
	@Test
	public void Tc1() {
		
		SoftAssert soft=new SoftAssert();
		String actresult="hii";
		String expResult="hello";
		 
		soft.assertEquals(actresult, expResult,"both results are diff");
		
		
		boolean actresult1=false;
		soft.assertTrue(actresult1,"act result is false we want true");
		
		
		soft.assertAll();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
