package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class LoginPage extends Base {
	WebDriver driver;
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsernameAndPassword(String username, String Password) {
		driver.findElement(By.id("userEmail")).sendKeys(username);
		driver.findElement(By.id("userPassword")).sendKeys(Password);
	}
	public void clickOnLoginButton() {
		driver.findElement(By.id("login"));
	}

}
