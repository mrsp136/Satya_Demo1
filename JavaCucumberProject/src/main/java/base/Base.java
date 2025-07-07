package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	 public static WebDriver driver;

	public void initialize () {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
	}
	public void close() {
		driver.close();
	}
	public WebDriver getDriver() {
		return driver;
	}

}
