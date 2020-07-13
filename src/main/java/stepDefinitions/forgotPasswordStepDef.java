package stepDefinitions;

import org.openqa.selenium.WebDriver;
import BDD_DEMO.BaseExecution.BaseSetup;
import BDD_DEMO.TestBDD.GillatePageObjects;
import Utilities.PageUtil;
import Utilities.PropertyFiles;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class forgotPasswordStepDef extends BaseSetup{
	WebDriver driver=BaseSetup.driver;	
	BaseSetup bs=new BaseSetup();
	public PageUtil pu=new PageUtil(driver);
	public GillatePageObjects  gpo = new GillatePageObjects(driver);
	
//	public void InitialisePU(WebDriver driver) {
//		pu= new PageUtil(driver);
//		gpo=new GillatePageObjects(driver);
//		bs.startReport();
//	}
	
	
//	@Given("^user is on Gillette homepage Login$")
//	public void user_is_on_Gillette_homepage_Login() throws Throwable {
//		System.out.println("user_is_on_Gillette_homepage");
//	}
//	
//	@And("^Gillette title is displayed on the screen Login$")
//	public void gillette_title_is_displayed_on_the_screen_Login() throws Throwable {
//		System.out.println("gillette_title_is_displayed_on_the_screen");
//	}
//	
//	@When("^user clicked on Signin link$")
//	public void user_clicked_on_Signin_link() throws Throwable {
//	   pu.click(gpo.getSigninClass());
//	}

	@When("^user clicks on forgot password link$")
	public void user_clicks_on_forgot_password_link() throws Throwable {
	    pu.click(gpo.getForgotPassLink());
	}

	@Then("^user enters \"([^\"]*)\"$")
	public void user_enters(String email) throws Throwable {
		pu.enterTextValue(gpo.getforgotPassEmail(), email);
	}
//	@Then("^user enters \\\"(.*)\\\"$")   
//	public void user_enters(String emailid) throws Throwable {
//	    pu.enterTextValue(gpo.getforgotPassEmail(), emailid);
//	}

	@Then("^user clicked on create new password button$")
	public void user_clicked_on_create_new_password_button() throws Throwable {
	    pu.click(gpo.getforgotPassButton());
	    pu.verifyElementVisible(gpo.getResetPasswordLink());
	    System.out.println("Email Sent");
	    
	}


}
