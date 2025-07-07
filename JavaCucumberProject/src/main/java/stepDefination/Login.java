package stepDefination;



import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class Login extends Base{

	LoginPage loginPage ;
	@Given("Landed on Login page")
		public void  Landed_on_Login_page() {
		initialize();
	}
	@When("^Enter valid {string} and {string}$" )
	public void enter_valid_UserId_and_Password(String use, String pass) {
		loginPage.enterUsernameAndPassword(use, pass);
		
	}
	@And("Click on Login button")
    public void click_on_Login_button() {
		loginPage.clickOnLoginButton();
	}
    @Then("User Navigate to next page")
    public void user_Navigate_to_next_page() throws InterruptedException
    {
    	Thread.sleep(3000);
    	loginPage.close();
    }
    
}
