package selenium.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/manish/eclipse-workspace/SeleniumExample/src/selenium/example/config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("URL"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("name1"));
		
		String URL = prop.getProperty("URL");
		System.out.println(URL);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "/Users/manish/Documents/geckodriver");
			driver = new FirefoxDriver(); //launch firefox
			
		} else if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/manish/Documents/chromedriver");
			driver = new ChromeDriver(); //launch chrome
			
		} else if(browserName.equals("IE")) {
			System.setProperty("webdriver.internetexplorer.driver", "/Users/manish/Documents/internetexplorerdriver");
			driver = new InternetExplorerDriver(); //launch IE
		} else {
			System.setProperty("webdriver.safari.driver", "/Users/manish/Documents/safaridriver");
			driver = new SafariDriver(); //launch Safari
		}
		driver.get(URL);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys("firstname");
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys("lastname");
		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys("city");
	}

}
