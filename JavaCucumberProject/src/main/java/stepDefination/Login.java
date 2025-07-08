package stepDefination;



import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class Login extends Base{
	 LoginPage loginPage;
	@Given("Landed on Login page")
		public void  Landed_on_Login_page() {
		initialize();
		 loginPage = new LoginPage(driver);
	}
	@When("Enter valid {string} and {string}" )
	public void enter_valid_UserId_and_Password(String use, String pass) {
		loginPage.enterUsernameAndPassword(use, pass);
		
	}
	@And("Click on Login button")
    public void click_on_Login_button() {
		loginPage.clickOnLoginButton();
	}
    @Then("User Navigate to next page")
    public void user_Navigate_to_next_page() throws InterruptedException, IOException
    {
    	Thread.sleep(3000);
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	File dst = new File("screenshot.png");
    	FileUtils.copyFile(src, dst);
    	
    	loginPage.close();
    }
    
}
