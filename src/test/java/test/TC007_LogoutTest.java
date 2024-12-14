package test;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;

public class TC007_LogoutTest extends ProjectMethod{
	
	@Test
	public void LogoutTest() {
		
		
			
		HomePage hp = new HomePage(driver);
		
		hp.clickLoginButton()
		.validCreds();
		
		hp.methodLogout()
		.logout();
	
	}
	

}
