package selenium.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTestClass {
	public static void main(String[] args) {
		//System.setProperty("", "");
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		driver.manage().window().maximize();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("incorrect title");
		}
		
		driver.quit();
	}

}
