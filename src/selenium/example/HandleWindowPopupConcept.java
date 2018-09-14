package selenium.example;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopupConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String ParentwindowId = it.next();
		System.out.println("Parent Window ID: "+ParentwindowId);
		
		String ChildWindowID = it.next();
		System.out.println("Chile Window ID: "+ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		System.out.println("Child Window title"+ driver.getTitle());
		
		driver.close();
		driver.switchTo().window(ParentwindowId);
		System.out.println("Parent window title: "+ driver.getTitle());
		
	}

}
