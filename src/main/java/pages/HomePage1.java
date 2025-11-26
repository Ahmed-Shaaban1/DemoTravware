package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import customMethods.DoActions;
import pageBase.PageBase;

public class HomePage1 extends PageBase {

	public HomePage1(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "from")
	WebElement checkIn;

	@FindBy(name = "to")
	WebElement checkOut;

	@FindBy(id = "child")
	WebElement child;

	@FindBy(id = "adult")
	WebElement adult;

	@FindBy(name = "search_product")
	WebElement searchBtn;

	@FindBy(xpath = "//a[.='29']")
	WebElement day29checkIn;
	
	@FindBy(xpath = "//a[.='30']")
	WebElement day30checkOut;
	
	@FindBy(css = ".ui-icon.ui-icon-circle-triangle-e")
	WebElement monthsBtn;
	
	@FindBy (xpath = "//span[text()='December']")
	WebElement nextCalenderPage;
	
	
	
	

	public void enterCheckIn(String date) {
		checkIn.clear();
		DoActions.sendData(checkIn, date);	
	}

	public void enterCheckout(String date) {
		checkOut.clear();
		DoActions.sendData(checkOut, date);
	}
	
	public void clickSearch() {
		DoActions.clicking(searchBtn);
	}
	
	public String getCheckinValue() {
		String value = checkIn.getAttribute("value");
		System.out.println(value);
		return value;
		
	}
	
	public String getCheckOutValue() {
		String value = checkOut.getAttribute("value");
		System.out.println(value);
		return value;
	}
	
	public void clickCheckin() {
		DoActions.clicking(checkIn);
		DoActions.clicking(day29checkIn);
		
	}
	
	public void clickCheckout() {
		DoActions.clicking(checkOut);
		DoActions.clicking(day30checkOut);
	}
	
	public void navigateCheckinCalender() {
		DoActions.clicking(checkIn);
		DoActions.clicking(monthsBtn);
	}
	
	public String getNextCalenderPageValue() {
		String value = nextCalenderPage.getText();
		System.out.println(value);
		return value;
	}
}
