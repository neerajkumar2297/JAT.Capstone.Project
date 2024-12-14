package test;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;

public class TC008_BookAndConfirmTest extends ProjectMethod {
	
	@Test
	public void BookAndConfirmTest() throws InterruptedException {
	
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
	.Submit()
	;
	
	
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
	
	Thread.sleep(2000);
	
	hp.methodBookAndConfirm()
	.order_NUM()
	;
	
	Thread.sleep(2000);
	
	
	
	hp.methodBookedIternary()
	.clickBookedIternary();
	
	
	hp.methodBookAndConfirm()
	
	.OrderIdSearch();
	
	
	
	hp.methodBookAndConfirm()
	.AssertandConfirm();

	}

}
