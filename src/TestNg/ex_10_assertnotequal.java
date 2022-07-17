package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex_10_assertnotequal {
	@Test
	public void assertnotequals() {
		String actresult="hii";
		String expresult="hi";
		Assert.assertEquals(actresult, expresult,"Failed both results are diff");
	}
}
