package driver;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
	
	private static WebDriver driver;
	
	public static void setupDriver() {
		
		
		Map<String,Object> chromePrefrences = new HashMap<>();
		
		chromePrefrences.put("credentials_enable_service", false);
		
		chromePrefrences.put("profile.password_manager_enabled", false);
		
		
		
		
		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefrences);
		
		
		options.addArguments("--start-maximized");
		
		options.addArguments("--disable-dev-shm-usage");

		options.addArguments("--no-sandbox");
		
		options.addArguments("--disable-notification");
		
		options.addArguments("--disable-gpu");
		
		options.addArguments("--disable-infobars");

		options.addArguments("--incognito");

		
		
		 driver = new ChromeDriver(options);
		 
		
		
		
		
		
			
	}
	
	
	
	public static WebDriver getDriver() {
		
		return driver;
		
		
	}

	
	
	public static void quitDriver() {
		
		driver.quit();
	}
	
}
