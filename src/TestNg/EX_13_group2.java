package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX_13_group2 {
	@Test(groups="Profile")
	public void Tc7() {
		Reporter.log("running tc7",true);
	}
	
	@Test(groups="Profile")
	public void Tc8() {
		Reporter.log("running tc8",true);
	}
	@Test(groups="Profile")
	public void Tc9() {
		Reporter.log("running tc9",true);
	}
	
	@Test(groups="Wishlist")
	public void Tc10() {
		Reporter.log("running tc10",true);
	}
	@Test(groups="Wishlist")
	public void Tc11() {
		Reporter.log("running tc11",true);
	}
	
	@Test(groups="Orders")
	public void T12() {
		Reporter.log("running tc12",true);
	}
	@Test(groups="Orders")
	public void Tc13() {
		Reporter.log("running tc13",true);
	}
}
