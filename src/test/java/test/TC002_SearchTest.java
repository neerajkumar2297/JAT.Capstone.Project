package test;

import org.testng.annotations.Test;

import base.ProjectMethod;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

public class TC002_SearchTest extends ProjectMethod {
	
	@Test
	public void SearchTest() {
		test=extent.createTest("Test2");
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
		
		/*
		
		SearchPage obj = new SearchPage(driver);
		
		.selectLocation()
		.hotels()
		.room_type()
		.room_nos()
		.datepick_in()
		.datepick_out()
		.adult_room()
		.child_room()
		.Submit()
		
		*/
		
		
		;
		
	}

}
