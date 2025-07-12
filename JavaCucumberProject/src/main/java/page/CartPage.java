package page;

import org.openqa.selenium.By;

import base.Base;

public class CartPage extends Base{

	public void checkOut() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(normalize-space(), 'Cart ')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(normalize-space(), 'Checkout')]")).click();
	}

}
