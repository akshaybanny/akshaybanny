package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex_10_assertfalse {
	@Test
	public void assertfalse() {
		boolean actresult=true;
		Assert.assertFalse(actresult,"actual result false so failed");
	}
	
	

}
