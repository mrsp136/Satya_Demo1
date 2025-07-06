package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	@Given("Landed on Login page")
		public void  Landed_on_Login_page() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Driver launched: " + driver);
		driver.get("https://rahulshettyacademy.com/client");
	}
	@When("^Enter valid (.*) and (.*)$" )
	public void enter_valid_UserId_and_Password() {
		
	}
	@And("Click on Login button")
    public void click_on_Login_button() {
		
	}
    @Then("User Navigate to next page")
    public void user_Navigate_to_next_page()
    {
    	
    }
    
}
