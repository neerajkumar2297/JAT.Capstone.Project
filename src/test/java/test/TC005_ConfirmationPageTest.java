package test;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;

public class TC005_ConfirmationPageTest extends ProjectMethod{

	
	@Test
	
	public void ConfirmationPageTest() {
					
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
		
		
		hp.methodBookHotel()
		.first_name()
		.last_name()
		.address()
		.cc_num()
		.cc_type()
		.cc_exp_month()
		.cc_exp_year()
		.cc_cvv()
		.book_now();
		
		
		hp.methodConfirmation()
		.order_no()
		
		;
		
	}
}
