package test;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;
import pages.LoginPage;

public class TC001_LoginTest extends ProjectMethod{
	
	@Test
	public void LoginTest() {
		
		test=extent.createTest("Test1");
		
		
		HomePage hp = new HomePage(driver);
		hp.clickLoginButton()
		
		.validCreds();
		
	}

}
