package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex_10_asserttrue
{

	
	 @Test
		public void asserttrue() {

           boolean actresult=true;
			Assert.assertTrue(actresult,"Failed both results is false");
		}
	
	
	
	
	
	
}
