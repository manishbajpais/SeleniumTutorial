package selenium.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitConcept {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//dydnamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); //page load timeout
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // implicit wait
	}
}
