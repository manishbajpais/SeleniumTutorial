package selenium.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		String textalert = alert.getText();
		System.out.println(textalert);
		if(textalert.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		} else {
			System.out.println("InCorrect Alert Message");
		}
		alert.accept();
		//alert.dismiss(); // if in a alert, cancel button is there

	}

}
