package tests;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataReader.JsonDataReader;
import driver.DriverManager;
import pages.HomePage1;
import testBase.testBase;

public class PositiveTests extends testBase{
	
	HomePage1 homeObject;
	JsonDataReader jsnReader;
	
	@Test (priority = 2 , description = "using valid input in checkin and checkout")
	public void validDateTypeInTest() throws IOException, ParseException {
		
		homeObject = new HomePage1(DriverManager.getDriver());
		JsonDataReader jsnReader = new JsonDataReader();
		jsnReader.jsonReader();
		
		homeObject.enterCheckIn(jsnReader.earlyDate);
		homeObject.enterCheckout(jsnReader.laterDate);
		Assert.assertEquals(homeObject.getCheckinValue(), jsnReader.earlyDate);
		Assert.assertEquals(homeObject.getCheckOutValue(), jsnReader.laterDate);

	}
	
	@Test (priority = 1, description = "clicking valid input in checkin and checkout")
	public void validDateClickingTest() throws IOException, ParseException {
		
		homeObject = new HomePage1(DriverManager.getDriver());
		jsnReader = new JsonDataReader();
		jsnReader.jsonReader();


		homeObject.clickCheckin();
		Assert.assertEquals(homeObject.getCheckinValue(), jsnReader.earlyDate);
		homeObject.clickCheckout();
		Assert.assertEquals(homeObject.getCheckOutValue(), jsnReader.laterDate);

	}
	
	@Test (priority = 3 , description = "checking calender navigation")
	public void navigateCalender() throws IOException, ParseException {
		homeObject = new HomePage1(DriverManager.getDriver());
		jsnReader = new JsonDataReader();
		jsnReader.jsonReader();
		
		homeObject.navigateCheckinCalender();
		Assert.assertEquals(homeObject.getNextCalenderPageValue(),jsnReader.nextCalenderPage);
	}
	
	
	
}

