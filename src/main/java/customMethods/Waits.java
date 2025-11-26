package customMethods;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverManager;

public class Waits {
	
	static int timeOut = 10;
	
	public static WebElement waitForElementToBeVisible(WebElement element) {
		
		return new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(timeOut)).until(ExpectedConditions.visibilityOf(element));
				
	}
	
	public static WebElement waitForElementToBeClickable(WebElement element) {
		
		return new WebDriverWait(DriverManager.getDriver(),Duration.ofSeconds(timeOut)).until(ExpectedConditions.elementToBeClickable(element));
			
	}
	
}
