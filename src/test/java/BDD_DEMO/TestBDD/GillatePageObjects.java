package BDD_DEMO.TestBDD;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.PropertyFiles;
public class GillatePageObjects 
{
	
	WebDriver driver; 
	
    public GillatePageObjects(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

       // PageFactory.initElements(driver, this);

    }
    //HomePage Link
    By title =By.cssSelector(PropertyFiles.propertiesFile().getProperty("title"));
    
    //Register Links 
    By registerLink= By.xpath(PropertyFiles.propertiesFile().getProperty("registerxpath"));
    By registerByClass = By.className(PropertyFiles.propertiesFile().getProperty("registerclass"));
    By firstname= By.id(PropertyFiles.propertiesFile().getProperty("firstnameid"));
    By lastname= By.id(PropertyFiles.propertiesFile().getProperty("lastnameid"));
    By emailid = By.id(PropertyFiles.propertiesFile().getProperty("emailid"));
    By password = By.id(PropertyFiles.propertiesFile().getProperty("passwordid"));
    By confirm = By.id(PropertyFiles.propertiesFile().getProperty("confirmid"));
    By month= By.id(PropertyFiles.propertiesFile().getProperty("monthid"));
    By year=By.id(PropertyFiles.propertiesFile().getProperty("yearid"));
    By zippcode = By.id(PropertyFiles.propertiesFile().getProperty("zippcodeid"));
    By submit = By.id(PropertyFiles.propertiesFile().getProperty("submitid"));
    By errormsg = By.id(PropertyFiles.propertiesFile().getProperty("errormsg"));
    
	//Signin Links
    By signinLink =  By.xpath(PropertyFiles.propertiesFile().getProperty("signinxpath"));
    By signinclass =   By.className(PropertyFiles.propertiesFile().getProperty("signinclass"));
    By Userid =   By.id(PropertyFiles.propertiesFile().getProperty("userid"));
    By SigningPassword =   By.name(PropertyFiles.propertiesFile().getProperty("passwordname"));
    By SigningPasswordxpath =   By.xpath(PropertyFiles.propertiesFile().getProperty("passwordxpath"));
    By signinButton =   By.id(PropertyFiles.propertiesFile().getProperty("signinid"));
    By logoutlink= By.className(PropertyFiles.propertiesFile().getProperty("logout"));
    By logoutConfirm=By.id(PropertyFiles.propertiesFile().getProperty("logoutConfirm"));
    By forgotPassLink= By.className(PropertyFiles.propertiesFile().getProperty("forgotPassLink"));
    By forgotPassEmail= By.id(PropertyFiles.propertiesFile().getProperty("forgotPassEmail"));
    By forgotPassButton= By.id(PropertyFiles.propertiesFile().getProperty("forgotPassButton"));
    By ResetPasswordLink= By.linkText(PropertyFiles.propertiesFile().getProperty("ResetPasswordLink"));
    By franceusername=By.id(PropertyFiles.propertiesFile().getProperty("franceusername"));
    
    
	//Language Links
    By languagexpath =   By.xpath(PropertyFiles.propertiesFile().getProperty("languagexpath"));
    By languageclass =   By.className(PropertyFiles.propertiesFile().getProperty("languageclass"));
    By germany = By.xpath(PropertyFiles.propertiesFile().getProperty("germanyxpath"));
    By france =  By.xpath(PropertyFiles.propertiesFile().getProperty("francexpath"));

    //ResetPassword
    By gmailusername = By.xpath(PropertyFiles.propertiesFile().getProperty("gmailusername"));
    By gmailpassword=By.xpath(PropertyFiles.propertiesFile().getProperty("gmailpassword"));
   	By gmaillabel=By.cssSelector(PropertyFiles.propertiesFile().getProperty("gmaillabel"));
   	By gmailmail=By.xpath(PropertyFiles.propertiesFile().getProperty("gmailmail"));
    By gmailresetPassLink=By.xpath(PropertyFiles.propertiesFile().getProperty("gmailresetPassLink"));
    By newpassword=By.cssSelector(PropertyFiles.propertiesFile().getProperty("newpassword"));
	By connewpassword=By.cssSelector(PropertyFiles.propertiesFile().getProperty("connewpassword"));
	By newpasswordsubmit=By.cssSelector(PropertyFiles.propertiesFile().getProperty("newpasswordsubmit"));
	By gmaildeletecheckbox=By.xpath(PropertyFiles.propertiesFile().getProperty("gmaildeletecheckbox"));
	By gmaildeleteicon=By.xpath(PropertyFiles.propertiesFile().getProperty("gmaildeleteicon"));
	By frnacecreateacc=By.xpath(PropertyFiles.propertiesFile().getProperty("frnacecreateacc"));
	By francefname=By.id(PropertyFiles.propertiesFile().getProperty("francefname"));
	
	
	public By getFrancefname() {
		return francefname;
	}

	public By getFrnacecreateacc() {
		return frnacecreateacc;
	}

	public By getFranceusername() {
		return franceusername;
	}
	
    public By getGmaildeletecheckbox() {
		return gmaildeletecheckbox;
	}
	public By getGmaildeleteicon() {
		return gmaildeleteicon;
	}
	public By getNewpasswordsubmit() {
		return newpasswordsubmit;
	}
    public By getConnewpassword() {
		return connewpassword;
	}
	public By getNewpassword() {
		return newpassword;
	}
    public By getgmailResetPassLink() {
		return gmailresetPassLink;
	}
	public By getGmailpassword() {
		return gmailpassword;
	}
    public By getGmailmail() {
		return gmailmail;
	}
    public By getGmaillabel() {
		return gmaillabel;
	}
	public By getGmailusername() {
		return gmailusername;
	}
	
	public By getRegisterLinkXpath()
    {
    	return registerLink;
    	
    }
    public By getRegisterLinkClass()
    {
    	return registerByClass;
    	
    }
    public By getFirstName()
    {
    	return firstname;
    	
    }
    public By getLastName()
    {
    	return lastname;
    	
    }
    public By getEmail()
    {
    	return emailid;
    	
    }
    public By getPassword()
    {
    	return password;
    	
    }
    public By getConfirmPassword()
    {
    	return confirm;
    	
    }
    public By getMonth()
    {
    	return month;
    	
    }


    public By getYear()
    {
    	return year;
    	
    }
    public By getZippcode()
    {
    	return zippcode;
    	
    }
    public By getSubmitButton()
    {
    	return submit;
    	
    }
    
    public By getErrormsg() {
		
    	return errormsg;
	}
    
    public By getSigninXpath()
    {
    	return signinLink;
    	
    }
    public By getSigninClass()
    {
    	return signinclass;
    	
    }
    public By getUserID()
    {
    	return Userid;
    	
    }
    public By getSigninPassword()
    {
    	return SigningPassword;
    	
    }
    public By getSigninPasswordXpath()
    {
    	return SigningPasswordxpath;
    	
    }
    public By getSigninButton()
    {
    	return signinButton;
    	
    }
    public By getLogoutLink()
    {
    	return logoutlink;
    	
    }
    public By getlogoutConfirm()
    {
    	return logoutConfirm;
    }
    
    public By getForgotPassLink()
    {
    	return forgotPassLink;
    }
    
    public By getforgotPassEmail() {
    	return  forgotPassEmail;
    }
    
    public By getforgotPassButton() {
    	return forgotPassButton;
    }
    
    public By getResetPasswordLink() {
    	return ResetPasswordLink;
    }
    
    public By getLanguageXpath()
    {
    	return languagexpath;
    	
    }

    public By getLanguageClass()
    {
    	return languageclass;
    	
    }
    public By getGermany()
    {
    	return germany;
    }
    public By getFrance()
    {
    	return france;			
    }
    
    

}
