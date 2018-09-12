package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.findElement(By.id("fileupload")).sendKeys("/Users/manish/Downloads/ui-automation.html");
	}

}
