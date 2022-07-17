package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex_10_Assertclass_assertNull {
	@Test
	public void assertnull() {
		String actresult="abc";
		Assert.assertNull(actresult,"actual result is null");
	}

}
