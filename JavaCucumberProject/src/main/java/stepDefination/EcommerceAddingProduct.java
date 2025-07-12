package stepDefination;


import java.io.IOException;
import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CartPage;
import page.LoginPage;
import page.PaymentPage;
import page.ProductPage;

public class EcommerceAddingProduct extends Base {
	LoginPage loginPage;
	ProductPage productPage;
	CartPage cartPage;
	PaymentPage paymentPage;

	@Given("Landed on Login page")
	public void Landed_on_Login_page() {
		initialize();
		loginPage = new LoginPage(driver);
	}

	@When("Enter valid {string} and {string}")
	public void enter_valid_UserId_and_Password(String use, String pass) {
		loginPage.enterUsernameAndPassword(use, pass);

	}

	@And("Click on Login button")
	public void click_on_Login_button() {
		loginPage.clickOnLoginButton();
	}

	@Then("User Navigate to next page")
	public void user_Navigate_to_next_page() throws InterruptedException, IOException {
		Thread.sleep(3000);
		takeScreenshot();
		loginPage.close();
	}
	
	@Given("User is logged in with valid credential")
	public void user_is_logged_in_with_valid_credentials()
	{
		initialize();
		loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("srp@gmail.com", "Parida123");
		loginPage.clickOnLoginButton();
	}
	@When("User add {string} to the cart")
	public void user_click_on_add_product_to_the_cart(String product) throws Throwable {
		productPage = new ProductPage();
		productPage.addProductToCart(product);
		
	}
	@Then("Product should appear in the cart")
	public void product_should_appear_in_the_cart() throws InterruptedException
	{
		 cartPage = new CartPage();
		 cartPage.checkOut();
		 paymentPage = new PaymentPage();
		 paymentPage.makePayment();
		
		
		
	}
}
