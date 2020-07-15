package stepDefinitions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BDD_DEMO.BaseExecution.BaseSetup;
import BDD_DEMO.TestBDD.GillatePageObjects;
import Utilities.PageUtil;
import Utilities.PropertyFiles;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDef extends BaseSetup{
	WebDriver driver=BaseSetup.driver;	
	BaseSetup bs=new BaseSetup();
	public PageUtil pu=new PageUtil(driver);
	public GillatePageObjects  gpo = new GillatePageObjects(driver);
	
//	public void InitialisePU(WebDriver driver) {
//		pu= new PageUtil(driver);
//		gpo=new GillatePageObjects(driver);
//		bs.startReport();
//	}
	
	
	@Given("^user is on Gillette homepage Login$")
	public void user_is_on_Gillette_homepage_Login() throws Throwable {
		System.out.println("user_is_on_Gillette_homepage");
		System.out.println("WELCOME TO INDIA LOGIN");
		pu.navigateto(PropertyFiles.propertiesFile().getProperty("applicationUrl"));
	}
	
	@And("^Gillette title is displayed on the screen Login$")
	public void gillette_title_is_displayed_on_the_screen_Login() throws Throwable {
		System.out.println("gillette_title_is_displayed_on_the_screen");
	}
	
	@When("^user clicked on Signin link$")
	public void user_clicked_on_Signin_link() throws Throwable {
	   pu.click(gpo.getSigninClass());
	}

	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password){
	 pu.enterTextValue(gpo.getUserID(), username);
	 pu.enterTextValue(gpo.getSigninPassword(), password);
	 }
	

	@Then("^user clicked on Signin button$")
	public void user_clicked_on_Signin_button() throws Throwable {
		pu.implicitWait(driver);
		pu.click(gpo.getSigninButton());
	  pu.explicitWaitForWebElement(driver, gpo.getLogoutLink());
	  
	  pu.click(gpo.getLogoutLink());
	  pu.click(gpo.getlogoutConfirm());
	}
	
	
//	@After("@Registration" )
//	@Given("^user is on Gillette France homepage Login$")
//	public void user_is_on_Gillette_France_homepage_Login() throws Throwable {
//		System.out.println("WELCOME TO FRANCE LOGIN");
//		 pu.navigateto(PropertyFiles.propertiesFile().getProperty("franceurl"));
//	}
//	
//	@After("@Registration" )
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password() throws Throwable {
		
		
		
//		pu.click(gpo.getFrnacecreateacc());
		
		
//		List<List<String>> data = credentials.raw();
//		pu.enterTextValue(gpo.getFrancefname(), data.get(0).get(0)); 
//		WebElement we=pu.getWebElement(gpo.getFranceusername()); 
//		we.sendKeys(Keys.ENTER);
//		
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	}
	
}
