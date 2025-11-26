package tests;


import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import dataReader.JsonDataReader;
import driver.DriverManager;
import pages.HomePage1;
import testBase.testBase;

public class NegativeTests extends testBase{
	
	HomePage1 homeObject;
	JsonDataReader jsnReader;

	
	@Test (description = "choosing reversed order for dates")
	public void dateFROMafterdateTo() throws IOException, ParseException {
		homeObject = new HomePage1(DriverManager.getDriver());
		JsonDataReader jsnReader = new JsonDataReader();
		jsnReader.jsonReader();

		
		homeObject.enterCheckIn(jsnReader.laterDate);
		homeObject.enterCheckout(jsnReader.earlyDate);
		Assert.assertEquals(homeObject.getCheckinValue(),jsnReader.laterDate);
		Assert.assertEquals(homeObject.getCheckOutValue(), jsnReader.earlyDate);
		
		
		
	}

	@Test (description = "using invalid date")
	public void invalidDate() throws IOException, ParseException {
		homeObject = new HomePage1(DriverManager.getDriver());
		JsonDataReader jsnReader = new JsonDataReader();
		jsnReader.jsonReader();

		
		
		homeObject.enterCheckIn(jsnReader.invalidDate);
		homeObject.getCheckOutValue();
		Assert.assertEquals(homeObject.getCheckOutValue(),jsnReader.invalidDateValue);
	}
	
	
	@Test (description = "using special characters input in checkin")
	public void specialCharactersInputinCheckIn() throws IOException, ParseException {
		homeObject = new HomePage1(DriverManager.getDriver());
		JsonDataReader jsnReader = new JsonDataReader();
		jsnReader.jsonReader();

		
		homeObject.enterCheckIn(jsnReader.specialCharacter1);
		Assert.assertEquals(homeObject.getCheckinValue(),jsnReader.emptyValue );
		
	}
	
	
	@Test (description = "using special characters input in checkout")
	public void specialCharactersInputinCheckOUT() throws IOException, ParseException {
		homeObject = new HomePage1(DriverManager.getDriver());
		JsonDataReader jsnReader = new JsonDataReader();
		jsnReader.jsonReader();

		
		
		homeObject.enterCheckout(jsnReader.specialCharacter2);
		Assert.assertEquals(homeObject.getCheckOutValue(),jsnReader.emptyValue);
		
	}
	
}
