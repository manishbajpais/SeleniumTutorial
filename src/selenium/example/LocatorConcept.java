package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {
	public static void main(String[] args) {
		
		//priority of using selectors
		//1 xpath
		//2. id
		//3. name
		//4. linktext
		//5. partial link text
		//6. CSSSelector
		//7. class Name
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		driver.findElement(By.id("firstname")).sendKeys("Manish");
		driver.findElement(By.id("lastname")).sendKeys("Bajpai");
		driver.findElement(By.id("email")).sendKeys("manish.cnbi@gmail.com");
		driver.findElement(By.id("PASSWORD")).sendKeys("s_13013134S");
		//driver.findElement(By.id("ppaFormSbtBtn")).click();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("userid")).sendKeys("manish.cnbi@gmail.com");
		driver.findElement(By.id("")).sendKeys("s_13013134S");
		driver.findElement(By.id("sgnBt")).click();
		
		//driver.quit();
	}

}
