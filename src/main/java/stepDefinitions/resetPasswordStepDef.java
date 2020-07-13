package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BDD_DEMO.BaseExecution.BaseSetup;
import BDD_DEMO.TestBDD.GillatePageObjects;
import Utilities.PageUtil;
import Utilities.PropertyFiles;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class resetPasswordStepDef {
	WebDriver driver=BaseSetup.driver;	
	BaseSetup bs=new BaseSetup();
	public PageUtil pu=new PageUtil(driver);
	public GillatePageObjects  gpo = new GillatePageObjects(driver);
	String pw;
	@Given("^user should redirect to \"([^\"]*)\"$")
	public void user_should_redirect_to(String gmail) throws Throwable {
	   pu.navigateto(gmail);
	   
	   
	}
	
	
	@And("^enter the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_credentials_and(String username, String password) throws Throwable {
		 pu.enterTextValue(gpo.getGmailusername(),username);
		   WebElement user=pu.getWebElement(gpo.getGmailusername());
	       user.sendKeys(Keys.ENTER);
	    //   pu.wait(6000);
	       Thread.sleep(5000);
	       pu.enterTextValue(gpo.getGmailpassword(),password);
	       WebElement pass= pu.getWebElement(gpo.getGmailpassword());
	       pass.sendKeys(Keys.ENTER);
//	       pu.wait(8000);      
	}
/*
	@Given("^enter the credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_credentials_and(String username, String password) throws Throwable {
	     
		   pu.enterTextValue(gpo.getGmailusername(),username);
		   WebElement user=pu.getWebElement(gpo.getGmailusername());
	       user.sendKeys(Keys.ENTER);
	       pu.wait(6000);
	       pu.enterTextValue(gpo.getGmailpassword(),password);
	       WebElement pass= pu.getWebElement(gpo.getGmailusername());
	       pass.sendKeys(Keys.ENTER);
	       pu.wait(8000);      
	       
	}
*/
	@When("^user click reset password button in email$")
	public void user_click_reset_password_button_in_email() throws Throwable {
		Thread.sleep(5000);
//	    pu.click(gpo.getGmaillabel());
//	    Thread.sleep(3000);
	    List<WebElement> elementList = new ArrayList<WebElement>();
	    elementList= pu.getWebElements(gpo.getGmailmail());
        elementList.get(1).click();
        pu.click(gpo.getgmailResetPassLink());
	    
         pw=pu.getParentWindow();
        pu.switchToChildWindow();
//        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
        String url = driver.getCurrentUrl();
        System.out.println(url);
	}

	@Then("^user fill \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_fill_and(String arg1, String arg2) throws Throwable {
		pu.enterTextValue(gpo.getNewpassword(), arg1);
		pu.enterTextValue(gpo.getConnewpassword(), arg2);
		pu.click(gpo.getNewpasswordsubmit());
		Thread.sleep(2000);
		
	    
	}

	@And("^try to login again using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void try_to_login_again_using_new_password(String arg1, String arg2) throws Throwable {
		pu.enterTextValue(gpo.getUserID(), arg1);
		 pu.enterTextValue(gpo.getSigninPassword(), arg2); 
		 pu.click(gpo.getSigninButton());
		  Thread.sleep(2000);
		  pu.click(gpo.getLogoutLink());
		  pu.click(gpo.getlogoutConfirm());
		  driver.close();
		  pu.switchMainWindow(pw);
		  Thread.sleep(2000);
		  WebElement dc= pu.getWebElement(gpo.getGmaildeletecheckbox());
		  
          Actions action = new Actions(driver);
          action.moveToElement(dc).build().perform();
          pu.click(gpo.getGmaildeleteicon());
          Thread.sleep(2000);

	}


}
