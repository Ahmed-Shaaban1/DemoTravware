package testBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import driver.DriverManager;
import utilities.helperScreenShot;

public class testBase {
	
	@BeforeSuite
	public void setup() {
		
		DriverManager.setupDriver();
		DriverManager.getDriver().get("https://demo1.leotheme.com/ap_booking_demo/en/home-2.html");
		
	}
	
	@AfterMethod
	public void fScreenShot(ITestResult result) {
		
		if (ITestResult.FAILURE == result.getStatus()) {
			
			String testName = result.getName();
			
			helperScreenShot.captureScreenShot(DriverManager.getDriver(), testName);
			
		}
	}
	
	@AfterSuite
	public void tearDown() {
		
		DriverManager.quitDriver();
	}
	

}

	