package selenium.example;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com/");
		//Take screenshot and store as file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location
		Files.copy(src, new File("/Users/manish/Desktop/Screenshot/google.png"));
	}

}
