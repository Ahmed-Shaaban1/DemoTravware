package customMethods;

import org.openqa.selenium.WebElement;

public class DoActions {
	
	public static void sendData(WebElement element , String data) {
		
		Scrolling.scroll(element);
		Waits.waitForElementToBeVisible(element);
		Waits.waitForElementToBeClickable(element);
		element.sendKeys(data);
		
	}

	
	public static void clicking (WebElement element) {
		
		Scrolling.scroll(element);
		Waits.waitForElementToBeVisible(element);
		Waits.waitForElementToBeClickable(element);
		element.click();
	}
}
