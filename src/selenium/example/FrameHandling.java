package selenium.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.name("username")).sendKeys("manish123");
		driver.findElement(By.name("password")).sendKeys("manish123");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("inpuut[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		
		/*frame handle method*/
		
		//1. first method
		driver.switchTo().frame(1);
		//2. second method
		//driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
	}

}
