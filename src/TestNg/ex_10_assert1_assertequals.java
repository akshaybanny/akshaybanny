package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex_10_assert1_assertequals {
   @Test
	public void assertequals() {
		String actresult="hii";
		String expresult="hello";
		Assert.assertEquals(actresult, expresult,"Failed both results are diff");
	}
	
	
	
	
	
}
