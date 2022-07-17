package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex_10_Assertclass_Assertnotnull {

	
	
	@Test
	public void assertnull() {
		String actresult=null;
		Assert.assertNotNull(actresult,"actual result is not null");
	}



}
