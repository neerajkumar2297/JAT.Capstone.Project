package test;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;

public class TC006_BookedIternaryTest extends ProjectMethod {
	
	@Test
	public void LoginTest() {
		
			
		HomePage hp = new HomePage(driver);
		
		hp.clickLoginButton()
		.validCreds();
		
		hp.methodBookedIternary()
		.clickBookedIternary()
		.searchOrderId();
	}

}
