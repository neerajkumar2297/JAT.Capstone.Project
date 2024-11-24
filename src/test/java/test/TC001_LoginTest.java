package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.ScreenShotCls;

@Listeners(ScreenShotCls.class)

public class TC001_LoginTest extends ProjectMethod{
	
	@Test
	public void LoginTest() throws IOException {
		
		ScreenShotCls ssc= new ScreenShotCls(driver);
		
		HomePage hp = new HomePage(driver);
		hp.clickLoginButton()
		
		.validCreds();
		
	}

}
