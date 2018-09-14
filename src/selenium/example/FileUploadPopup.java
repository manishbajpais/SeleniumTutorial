package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://html.com/input-type-file/");
		//type='file' should be present for Browse/attachfile/uploadfile button
		driver.findElement(By.id("fileupload")).sendKeys("/Users/manish/Downloads/ui-automation.html");
		
	}

}
