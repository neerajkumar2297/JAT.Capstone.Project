package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;

public class TC001_LoginTest extends ProjectMethod {

	@Test
	public void LoginTest() throws IOException {

		System.out.println("Running ");
		HomePage hp = new HomePage(driver);
		hp.clickLoginButton()

				.validCreds();

	}

}
