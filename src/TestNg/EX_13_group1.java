package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EX_13_group1 {
	
	@Test(groups="Profile")
	public void Tc1() {
		Reporter.log("running tc1",true);
	}
	
	@Test(groups="Profile")
	public void Tc2() {
		Reporter.log("running tc2",true);
	}
	@Test(groups="Profile")
	public void Tc3() {
		Reporter.log("running tc3",true);
	}
	
	@Test(groups="Wishlist")
	public void Tc4() {
		Reporter.log("running tc4",true);
	}
	@Test(groups="Wishlist")
	public void Tc5() {
		Reporter.log("running tc5",true);
	}
	
	@Test(groups="Orders")
	public void Tc6() {
		Reporter.log("running tc6",true);
	}
	
	
	
	
	
	
	
	
	
	

}
