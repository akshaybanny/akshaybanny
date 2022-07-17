package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex_08_keyword4_timeout {
	@Test(timeOut=6000)
	public void tc1() throws InterruptedException {
		Thread.sleep(4000);
		Reporter.log("running tc1",true);
	}

}
