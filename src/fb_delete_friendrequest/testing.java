package fb_delete_friendrequest;

import org.testng.annotations.Test;

public class testing extends basic_test {
	@Test
	public void testvalidlogin() throws InterruptedException {
		
	
	login1page s1= new login1page(driver);
	s1.setusername();
	s1.setpwd();
	s1.clicklogin();
	
	Thread.sleep(4000);

	login2page s2= new login2page(driver);
	Thread.sleep(4000);
    s2.icon();

	
	
	
	Thread.sleep(2000);
	s2.searchsendkeys();
	Thread.sleep(2000);
	s2.clickhername();
	Thread.sleep(2000);
	s2.removefriendclick();
	
	s2.clicklogmenu();
    s2.clicklogout();
	
	
	
	


	
	}
}
