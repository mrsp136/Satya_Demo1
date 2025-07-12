package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class ProductPage extends Base {
	//String pro = "IPHONE 13 PRO";
	WebElement secProduct;

	public void addProductToCart(String product) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(product);

		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card-body']"));
		
		// System.out.println(driver.findElement(By.xpath("//div[@class='card-body']/h5/b")).getText());
		for (WebElement p : products) {
			System.out.println("Satyal");
			//System.out.println(p.findElement(By.xpath(".//h5/b")).getText());
			if (p.findElement(By.xpath(".//h5/b")).getText().equalsIgnoreCase(product)) {
				p.findElement(By.xpath(".//i[@class='fa fa-shopping-cart']")).click();
				System.out.print(product+ "Product add to the cart.");

			}
		}

	}

	
	 
	 

}
