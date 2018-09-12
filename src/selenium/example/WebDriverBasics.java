package selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverBasics {
	public static void main(String[] args) {
		//1 FireFox - geckodriver
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com/");
		driver.navigate().to("http://www.google.com/");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		//driver.findElement(By.id(""))
		String title = driver.getTitle(); //get title
		System.out.println(title);
		String url = driver.getCurrentUrl(); //get current url
		System.out.println(url);
		
		/*driver.findElement(By.name("q")).sendKeys("Text Search");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);*/
		
		//validation point
		if(title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("incorrect title");
		}
		
		//get page source
		//System.out.println(driver.getPageSource());
		
		driver.quit();
		
		
		
	}

}
