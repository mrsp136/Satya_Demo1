package page;

import org.openqa.selenium.By;

import base.Base;

public class PaymentPage extends Base {

	public void makePayment() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(normalize-space(), 'CVV Code ')]/following-sibling::input")).sendKeys("1234");
		driver.findElement(By.xpath("//div[contains(text(), 'Name on Card')]/following-sibling::input")).sendKeys("Srp");
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.//span[contains(text(), 'India')] and not(contains(text(), 'British Indian Ocean Territory'))]")).click();
		driver.findElement(By.xpath("//a[contains(normalize-space(), 'Place Order')] ")).click();
	}

}
