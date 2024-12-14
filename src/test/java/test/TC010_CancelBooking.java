package test;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;

public class TC010_CancelBooking extends ProjectMethod {
	
	@Test
	public void CancelBooking() throws InterruptedException {
	
	HomePage hp = new HomePage(driver);
	
	hp.clickLoginButton()
	.validCreds();
	
	
	hp.methodBookedIternary()
	.clickBookedIternary()
	.searchOrderId();
	
	Thread.sleep(1000);
	
	hp.methodCancelBooking()
	.clickCancelbtn()
	.cancelledMsg();
	
	}
}
