package selenium.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindElementsConceptEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List <WebElement> linklist = driver.findElements(By.tagName("a")); 
		System.out.println(linklist.size());
		for(int i=0; i<linklist.size();i++) {
			String text = linklist.get(i).getText();
			System.out.println(text);
		}
		
	}
}
