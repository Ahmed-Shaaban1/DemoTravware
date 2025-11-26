package customMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import driver.DriverManager;

public class Scrolling {

	public static void scroll (WebElement element) {
		
		
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView(true);",element);
		
	}
}
