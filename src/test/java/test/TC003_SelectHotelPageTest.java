package test;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;

public class TC003_SelectHotelPageTest extends ProjectMethod {
	
	
	@Test
	public void SelectHotelPageTest() {
		test=extent.createTest("Test3");
		
			
		HomePage hp = new HomePage(driver);
		
		hp.clickLoginButton()
		.validCreds();
		
		
		hp.methodSearch()
		.selectLocation()
		.hotels()
		.room_type()
		.room_nos()
		.datepick_in()
		.datepick_out()
		.adult_room()
		.child_room()
		.Submit();
		
		
		hp.methodSelectHotel()
		.hotelSelect();
	
		
	}
}
