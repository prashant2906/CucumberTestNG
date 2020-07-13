package stepDefinitions;

import cucumber.api.DataTable;
//import cucumber.api.java.Before;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
//import io.cucumber.java.AfterStep;
import java.util.Map;
import org.junit.After;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.Status;
import BDD_DEMO.BaseExecution.BaseSetup;
import BDD_DEMO.TestBDD.GillatePageObjects;
import Utilities.CaptureScreenShot;
import Utilities.PageUtil;
import Utilities.PropertyFiles;

public class StepDefinition extends BaseSetup
{
	WebDriver driver=BaseSetup.driver;	
	BaseSetup bs=new BaseSetup();
	public PageUtil pu;
	public GillatePageObjects  gpo;
	
	@Before
	public void setUP(){
		System.out.println("Executing Before Method");
		driver=initializeTestBaseSetup("chrome","https://www.gillette.co.in/en-in");
//		InitialisePU(driver);
		pu= new PageUtil(driver);
		gpo=new GillatePageObjects(driver);
		bs.startReport();
		System.out.println("Executed the Before Method");
	}
	
//	@After
//	public void getResult(ITestResult result) throws Exception {
//		
//		try {
//			if (result.getStatus() == ITestResult.SUCCESS) {
//				test.log(Status.PASS, "The Test Case named as : " + result.getName() + " is Passed");
//
//			} else if (result.getStatus() == ITestResult.FAILURE) {
//				test.log(Status.FAIL, "The Test Case named as : " + result.getName() + " is Failed");
//				test.log(Status.FAIL, "Test Failure : " + result.getThrowable());
//				//String filename = result.getMethod().getMethodName();
//				String screenshotPath = CaptureScreenShot.captureScreenshot(driver, result.getName());
//				if (!(driver == null))// if driver closed by manually or api failed then screenshot will not taken.
//					test.addScreenCaptureFromPath(screenshotPath);
//
//				
//			} else if (result.getStatus() == ITestResult.SKIP) {
//				test.log(Status.SKIP, "The Test Case named as : " + result.getName() + " is Skipped");
//
//			}
//		
//		}
//		
//		catch (Exception e) 
//		{
//			// If user close the browser manually then will show the exception and quite the
//			// driver
//			System.out.println(e);
////			driver.quit();
//		
//		}
//	}
//	public void InitialisePU(WebDriver driver) {
//		System.out.println("Executed the Before Annotation");
//		
//	}
	
	
	@Given("^user is on Gillette homepage$")
	public void user_is_on_Gillette_homepage() throws Throwable {
		
		//pu.launchApplication();
		
	   
	}

	@And("^Gillette title is displayed on the screen$")
	public void gillette_title_is_displayed_on_the_screen() throws Throwable {
		System.out.println(pu.getCurrentPageTitle());
		System.out.println(PropertyFiles.propertiesFile().getProperty("titletext"));
//		pu.verifyCurrentPageTitle(PropertyFiles.propertiesFile().getProperty("titletext"));
		
		
	}

	@When("^user clicked on Register link$")
	public void user_clicked_on_Register_link() throws Throwable {
		pu.click(gpo.getRegisterLinkXpath());
	   
	}
	
	@Then("^user fill \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" details$")
	public void user_fill_and_and_and_and_details(String firstname, String lastname, String email, String password, String cpassword) throws Throwable {
//		pu.click(gpo.getRegisterLinkXpath());
		pu.enterTextValue(gpo.getFirstName(), firstname);
		pu.enterTextValue(gpo.getLastName(), lastname);
		pu.enterTextValue(gpo.getEmail(), email);
		pu.enterTextValue(gpo.getPassword(), password);
		pu.enterTextValue(gpo.getConfirmPassword(), cpassword);
		
		
	}
	
	
	
	@Then("^user fill all details$")
	public void user_fill_all_details(DataTable dt1) throws Throwable {
		
			for (Map<String, String> data : dt1.asMaps(String.class, String.class)) {
						pu.click(gpo.getRegisterLinkXpath());
						driver.findElement(gpo.getFirstName()).sendKeys(data.get("FIRSTNAME"));
						driver.findElement(gpo.getLastName()).sendKeys(data.get("LASTNAME"));
						driver.findElement(gpo.getEmail()).sendKeys(data.get("EMAIL"));
						driver.findElement(gpo.getPassword()).sendKeys(data.get("PASSWORD"));
						driver.findElement(gpo.getConfirmPassword()).sendKeys(data.get("CONFIRMPASSWORD"));
						
						Select month = new Select(driver.findElement(gpo.getMonth()));
						month.selectByVisibleText("6");
						Select year = new Select(driver.findElement(gpo.getYear()));
						year.selectByValue("1990");
						driver.findElement(gpo.getZippcode()).sendKeys(data.get("ZIPCODE"));
						driver.findElement(gpo.getSubmitButton()).click();
						
			}
	   
	}

	
	@Then("^user select the \"([^\"]*)\" and \"([^\"]*)\" DOB and \"([^\"]*)\"$")
	public void user_select_the_and_DOB_and(String month,String year, String zipcode) throws Throwable {
		pu.selectFromDropDownByValue(gpo.getMonth(), month);
		pu.selectFromDropDownByValue(gpo.getYear(), year);
		pu.enterTextValue(gpo.getZippcode(),zipcode);
	}

	@Then("^user clicked on create your profile button$")
	public void user_clicked_on_create_your_profile_button() throws Throwable {
	    pu.click(gpo.getSubmitButton());
	    try {
	    if(pu.isElementDisplayed(gpo.getErrormsg()))
	    	if(pu.getWebElement(gpo.getErrormsg()).getText().contains("already exists"))
//	    	.equals("An account with this email address already exists."))
				System.out.println((String)(((WebElement) gpo.getErrormsg()).getText()));
	    else
	    	System.out.println("Regitration Completed");
	    }
	    catch(Exception e){
	    	System.out.println(e.getMessage());
	    }
	}

	
	
/////////////////////////////////////// Sign in Process or Flow /////////////////////////////////////////////

	
//	@Given("^user is on Gillette France homepage Login$")
//	public void user_is_on_Gillette_France_homepage_Login() throws Throwable {
//		 pu.navigateto(PropertyFiles.propertiesFile().getProperty("franceurl"));
//	}
//	
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) throws Throwable {
//		pu.click(gpo.getFrnacecreateacc());
//		
//		
//		List<List<String>> data = credentials.raw();
//		pu.enterTextValue(gpo.getFrancefname(), data.get(0).get(0)); 
//		WebElement we=pu.getWebElement(gpo.getFranceusername()); 
//		we.sendKeys(Keys.ENTER);
//		
////		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//	}
	
}
