package Utilities;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.Status;

import BDD_DEMO.BaseExecution.BaseSetup;
import runner.TestRunner;

import org.openqa.selenium.StaleElementReferenceException;

public class PageUtil {
	WebDriver driver;
	
	SoftAssert sAssert;
	Assertion hAssert;
	String url = PropertyFiles.propertiesFile().getProperty("applicationUrl");
   	

	public PageUtil(WebDriver driver) 
	{
		this.driver = driver;
        sAssert = new SoftAssert();
		hAssert = new Assertion();
	}

	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	public void explicitWaitLink(WebDriver driver, String linkText) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
	}

	public void explicitWaitForWebElement(WebDriver driver, By locator) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

		catch (NoSuchElementException e) {
			// e.printStackTrace();
			System.err.format("No Element Found: " + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found after wait" + e);
		}

	}

	public void explicitWaitForWebElementAttribute(WebDriver driver, By locator, String attribute, String value) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.attributeContains(locator, attribute, value));
		}

		catch (NoSuchElementException e) {
			// e.printStackTrace();
			System.err.format("No Element Found: " + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found after wait" + e);
		}

	}

	
	public String getCurrentPageTitle() {
		String title = null;
		try {

			title = driver.getTitle();
			// System.out.println(title);
			//logger.info("User gets the Current Page Title " + title);

		} catch (Exception e) {
			e.printStackTrace();
			//logger.info("Element is not found");
		}
		return title;
	}

	public void verifyCurrentPageTitle(String expectedTitle) {

		String actualTitle = getCurrentPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		BaseSetup.test.log(Status.PASS,"The expected title: " + expectedTitle + " matches with the title: " + actualTitle);
		//logger.info("User verifies the current Page Title as " + expectedTitle);
		// sAssert.assertAll();

	}

	public String getCurrentPageUrl() {
		String pageUrl = driver.getCurrentUrl();
		//logger.info("User gets the Current Page URL as " + pageUrl);
		return pageUrl;
	}
	
public void assertCurrentPageUrl(String expectedUrl) {
		String actualUrl = getCurrentPageUrl();
		Assert.assertTrue(actualUrl.contains(expectedUrl));
		// hAssert.assertTrue(actualUrl.contains(expectedUrl), "The URL
		// validation matched");
		// hAssert.assertEquals(actualUrl, expectedUrl);
		//logger.info("User verifies the current Page URL as " + expectedUrl);
		BaseSetup.test.log(Status.PASS, "The expected URL: " + expectedUrl + " matches with the URL: " + actualUrl);
		// return getCurrentPageUrl().contains(expectedUrl);
	}

	public boolean verifyElementPresent(By locator)

	{
		boolean bValue = false;
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			if (element.isDisplayed() || element.isEnabled())
				BaseSetup.test.log(Status.PASS, "The element " + element.toString() + " is found");
			bValue = true;
		}

		catch (NoSuchElementException e) {
			e.printStackTrace();
			//logger.info("The element is not found");
			BaseSetup.test.log(Status.FAIL, "The element " + element.toString() + " is not found");
			bValue = false;
		}

		catch (StaleElementReferenceException e) {
			e.printStackTrace();
			BaseSetup.test.log(Status.FAIL, "The element " + element.toString() + "is not available in Dom");
			//logger.info("The element is not available in Dom");
			bValue = false;
		}

		return bValue;

	}

	public boolean verifyElementPresent(WebElement element)

	{
		boolean bValue = false;

		try {
			if (element.isDisplayed() || element.isEnabled())
				BaseSetup.test.log(Status.PASS, "The element " + element.toString() + " is found");
			bValue = true;
		}

		catch (NoSuchElementException e) {
			e.printStackTrace();
			//logger.info("The element is not found");
			BaseSetup.test.log(Status.FAIL, "The element " + element.toString() + " is not found");
			bValue = false;
		}

		catch (StaleElementReferenceException e) {
			e.printStackTrace();
			BaseSetup.test.log(Status.FAIL, "The element " + element.toString() + "is not available in Dom");
			//logger.info("The element is not available in Dom");
			bValue = false;
		}

		return bValue;

	}

	public boolean verifyElementNotPresent(By locator) {

		try {
			driver.findElement(locator);
			return false;
		} catch (NoSuchElementException e) {
			// e.getStackTrace();
			return true;
		}
	}

	public boolean verifyElementVisible(By locator) {

		try {
			driver.findElement(locator).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			e.getStackTrace();
			return false;
		}
	}

	public boolean verifyElementVisible(WebElement element) {

		try {
			element.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			e.getStackTrace();
			return false;
		}
	}

	public boolean verifyElementNotVisible(By locator) {

		try {
			if (driver.findElement(locator).isDisplayed() == false)
				;
			BaseSetup.test.log(Status.PASS, locator + " : element is not displaying on the page");

			return false;
		} catch (NoSuchElementException e) {
			BaseSetup.test.log(Status.FAIL, locator + " : element is displaying on the page");
			e.getStackTrace();
			return true;
		}
	}

	public boolean verifyElementNotEnabled(By locator) {

		try {

			if (!(driver.findElement(locator).isEnabled()))
				//logger.info(locator + " : This element is  enabled");
			BaseSetup.test.log(Status.FAIL, locator + " : element is enabled");

			return true;
		} catch (NoSuchElementException e) {
			e.getStackTrace();
			//logger.info(locator + " : This element is not enabled");
			BaseSetup.test.log(Status.FAIL, locator + " : element not enabled");
			return false;
		}

	}

	// To get the Locator Text
	public String getLocatorText(By locator) {
		try {
			String sText = driver.findElement(locator).getText();
			//logger.info("Element Text is " + sText);

		} catch (NoSuchElementException e) {
			e.printStackTrace();
			//logger.info(locator + " : This element is not found");
			BaseSetup.test.log(Status.FAIL, locator + " : element not found");
		}
		return driver.findElement(locator).getText().toString();
	}

	public boolean isElementDisplayed(By locator) {
		if (driver.findElements(locator).size() > 0 && driver.findElement(locator).isDisplayed()) {

			BaseSetup.test.log(Status.PASS, getLocatorText(locator) + " is displayed on the Page");
			return true;

		} else {
			BaseSetup.test.log(Status.FAIL, locator + " is not Displayed on the Page");
			return false;
		}
	}

	public boolean isElementDisplayed(WebElement element) {

		if (element.isDisplayed()) {

			BaseSetup.test.log(Status.PASS, element.getText() + " is displayed on the Page");
			return true;

		} else {
			BaseSetup.test.log(Status.FAIL, element.getText() + " is not Displayed on the Page");
			return false;
		}
	}

	public boolean isElementEnabled(By locator) {

		WebElement element = driver.findElement(locator);

		if (element.isEnabled()) {

			BaseSetup.test.log(Status.PASS, getLocatorText(locator) + " is enabled on the Page");
			return true;
		}

		else

		{
			BaseSetup.test.log(Status.FAIL, locator + " is not enabled on the Page");
			return false;
		}
	}

	public boolean isElementDisabled(By locator) {

		WebElement element = driver.findElement(locator);

		if (!element.isEnabled()) {

			BaseSetup.test.log(Status.PASS, getLocatorText(locator) + " is disabled on the Page");
			return true;
		}

		else

		{
			BaseSetup.test.log(Status.FAIL, locator + " is not disabled on the Page");
			return false;
		}
	}

	
	public boolean isLinkOrIconDisplayed(By locator, String elementName) {
		if (driver.findElements(locator).size() > 0 && driver.findElement(locator).isDisplayed()) {

			BaseSetup.test.log(Status.PASS, getLocatorText(locator) + " " + elementName + " is displayed on the Page");
			return true;

		} else {
			BaseSetup.test.log(Status.FAIL, elementName + " is not displayed on the Page");
			return false;
		}
	}



	public boolean isElementNotDisplayed(By locator) {
		if (driver.findElements(locator).isEmpty()) {
			BaseSetup.test.log(Status.PASS, locator + " : is not displayed on the Page");
			return true;

		} else {
			BaseSetup.test.log(Status.PASS, locator + " : is displayed on the Page");
			return false;
		}
	}



	public void deleteCookies() {
		driver.manage().deleteAllCookies();

	}

	public String getParentWindow() {
		String parent = driver.getWindowHandle();
		return parent;
	}

	public String getObjectlLabel(By locator) {

		String title = null;

		try {
			driver.findElement(locator).isDisplayed();
			title = driver.findElement(locator).getText();
			//logger.info("User gets the test object Label as: " + title);
			// BaseSetup.test.log(Status.PASS, "User gets the test object Label
			// as: " + title);
		}

		catch (Exception e) {
			e.printStackTrace();
			//logger.info("User gets a blank test object Label");
			BaseSetup.test.log(Status.INFO, "User gets a blank test object Label");
		}

		return title;

	}

	public String getObjectlLabel(WebElement element) {

		String sTitle = null;

		try {
			element.isDisplayed();
			sTitle = element.getText();
//			System.out.println(sTitle);
			//logger.info("User gets the test object Label as: " + sTitle);
			// BaseSetup.test.log(Status.PASS, "User gets the test object Label
			// as: " + title);
		}

		catch (Exception e) {
			e.printStackTrace();
			//logger.info("User gets a blank test object Label");
			BaseSetup.test.log(Status.FAIL, "User gets a blank test object Label");
		}

		return sTitle;

	}

	public void verifyObjectLabel(By locator, String expectedObjectLabel) {

		String actualObjectLabel = getObjectlLabel(locator); // return
		getObjectlLabel(locator).contains(expectedObjectLabel);
		sAssert.assertEquals(actualObjectLabel, expectedObjectLabel);
		//logger.info("User verifies the test object Label as: " + expectedObjectLabel);
		BaseSetup.test.log(Status.PASS, "The expected object label: " + expectedObjectLabel
				+ " matches with the actual object label: " + actualObjectLabel);
	}
	
	public void verifyObjectLabel(WebElement element, String expectedObjectLabel) {

		String actualObjectLabel = getObjectlLabel(element); // return
		getObjectlLabel(element).contains(expectedObjectLabel);
		Assert.assertEquals(actualObjectLabel, expectedObjectLabel);
		//logger.info("User verifies the test object Label as: " + expectedObjectLabel);
		BaseSetup.test.log(Status.PASS, "The expected object label: " + expectedObjectLabel
				+ " matches with the actual object label: " + actualObjectLabel);
	}

	
	public void verifyObjectLabelContains(By locator, String expectedValue) {

		hAssert.assertTrue(getObjectlLabel(locator).contains(expectedValue),
				"The label contains the value" + expectedValue);
		//logger.info("User verifies the test object Label contains: " + expectedValue);
		BaseSetup.test.log(Status.PASS, "The expected object label contains: " + expectedValue);
	}
	
	public void verifyObjectLabelContains(WebElement element, String expectedValue) {

		Assert.assertTrue(getObjectlLabel(element).contains(expectedValue),
				"The label contains the value" + expectedValue);
		//logger.info("User verifies the test object Label contains: " + expectedValue);
		BaseSetup.test.log(Status.PASS, "The expected object label contains: " + expectedValue);
	}

	public void verifyObjectLabelNotContains(By locator, String expectedValue) {

		hAssert.assertFalse(getObjectlLabel(locator).contains(expectedValue),
				"The label does not contain the value" + expectedValue);
		//logger.info("User verifies the test object Label does not contain: " + expectedValue);
		BaseSetup.test.log(Status.PASS, "The expected object label does not contain: " + expectedValue);
	}

	public void verifyObjectLabelContains(String expectedValue, String actualValue) {

		sAssert.assertTrue(expectedValue.contains(actualValue), "The label contains the value" + actualValue);
		//logger.info("User verifies the test object Label contains: " + actualValue);
		BaseSetup.test.log(Status.PASS, "The expected object label" + expectedValue + "contains: " + actualValue);
	}

	public void assertObjectLabel(By locator, String expectedObjectLabel) {

		String actualObjectLabel = getObjectlLabel(locator);
		sAssert.assertEquals(actualObjectLabel, expectedObjectLabel);
		//logger.info("User verifies the test object Label as: " + expectedObjectLabel);
		BaseSetup.test.log(Status.PASS, "The expected object label: " + expectedObjectLabel
				+ " matches with the actual object label: " + actualObjectLabel);
	}

	public void assertObjectLabel(String actualObjectLabel, String expectedObjectLabel) {

		// return getObjectlLabel(locator).contains(expectedObjectLabel);
		sAssert.assertEquals(actualObjectLabel, expectedObjectLabel);
		//logger.info("User verifies the test object Label as: " + expectedObjectLabel);
		BaseSetup.test.log(Status.PASS, "The expected object label: " + expectedObjectLabel
				+ " matches with the actual object label: " + actualObjectLabel);
	}

	public void enterTextValue(By locator, String expectedData) {
		try {
			WebElement element = driver.findElement(locator);
			if (verifyElementPresent(locator))
			// element.isDisplayed())
			{
				element.clear();
				element.sendKeys(expectedData);
				//logger.info("User enters " + expectedData + " in the " + element.getText() + " text box");
				BaseSetup.test.log(Status.PASS,
						"User enters " + expectedData + " in the " + element.getText() + " text box");
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.format("No Element Found to enter text" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to enter text" + e);
		}
	}

	public void enterTextValue(By locator, int expectedData) {
		try {
			WebElement element = driver.findElement(locator);
			if (verifyElementPresent(locator))
			// element.isDisplayed())
			{
				element.clear();
				WebElement wb = element;
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("arguments[0].value='" + expectedData + "';", wb);
				// element.sendKeys(expectedData);
				//logger.info("User enters " + expectedData + " in the " + element.getText() + " text box");
				BaseSetup.test.log(Status.PASS,
						"User enters " + expectedData + " in the " + element.getText() + " text box");
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.format("No Element Found to enter text" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to enter text" + e);
		}
	}

	public void pressEnter(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			if (verifyElementPresent(locator))

			{
				element.sendKeys(Keys.RETURN);
				//logger.info("User presses the enter key");
				BaseSetup.test.log(Status.PASS, ("User presses the enter key"));
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.format("No Element Found to press enter" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to press enter" + e);
		}
	}

	public void clearTextBox(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			if (verifyElementPresent(locator))
			// element.isDisplayed())
			{
				element.clear();

				//logger.info("User clears the  " + element.getText() + " text box");
				BaseSetup.test.log(Status.PASS, "User clears the  " + element.getText() + " text box");
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.format("No Element Found to enter text" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to enter text" + e);
		}
	}

	public void click(By locator) {

		for (int iCount = 0; iCount < 3; iCount++) {
			try {
				WebElement element = driver.findElement(locator);
				if (verifyElementPresent(locator)) {
					//logger.info("User clicks on " + element.getText() + " button");
					BaseSetup.test.log(Status.PASS, "User clicks on " + element.getText() + " button");
					element.click();

				}
				break;
			} catch (NoSuchElementException e) {
				e.printStackTrace();
				System.err.format("No Element Found to perform click" + e);
				BaseSetup.test.log(Status.FAIL, "No Element Found to enter click" + e);
			}
			// explicitWaitUntilClickable(driver, locator);
		}

	}

	public static void click(WebElement element) {
		for (int iCount = 0; iCount < 3; iCount++) {
			try {

				if (element.isDisplayed()) {
					//logger.info("User clicks on " + element.getText() + " button");
					BaseSetup.test.log(Status.PASS, "User clicks on " + element.getText() + " button");
					element.click();

				}
				break;

			} catch (NoSuchElementException e) {
				e.printStackTrace();
				System.err.format("No Element Found to perform click" + e);
				BaseSetup.test.log(Status.FAIL, "No Element Found to enter click" + e);
			}
		}
	}
	public static void enterTextValue(WebElement element, int expectedData) 
	{

			try {

				if (element.isDisplayed()) {
					//logger.info("User clicks on " + element.getText() + " button");
					System.out.println(element.getText());
					BaseSetup.test.log(Status.PASS, "User clicks on " + element.getText() + " button");
					
					//element.clear();
					element.sendKeys("expectedData");

				}
				

			} catch (NoSuchElementException e) {
				e.printStackTrace();
				System.err.format("No Element Found to perform click" + e);
				BaseSetup.test.log(Status.FAIL, "No Element Found to enter click" + e);
			}
		
}

	public void selectRadio(By locator) {
		try {
			WebElement element = driver.findElement(locator);
			if (verifyElementPresent(locator)) {
				//logger.info("User clicks on " + element.getText() + " button");
				BaseSetup.test.log(Status.PASS, "User clicks on " + element.getText() + " button");
				element.click();

			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.format("No Element Found to perform click" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to enter click" + e);
		}
	}
	

	

	//select the dropdown using "select by visible text", so pass VisibleText

	public void selectFromDropDownByVisibleText(By locator, String visibleText) {
		try {
			WebElement element = driver.findElement(locator);
			if (element.isDisplayed()) {
				Select selObj = new Select(element);
				selObj.selectByVisibleText(visibleText);
				//logger.info("User selects the visible text as  " + visibleText + "from Dropdown");
				BaseSetup.test.log(Status.PASS, "User selects the visible text as  " + visibleText + "from Dropdown");
			}
		}

		catch (NoSuchElementException e)

		{
			e.printStackTrace();
			System.err.format("No Element Found to perform selection in the dropdown" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to perform selection in the dropdown" + e);
		}

	}

	// select the dropdown using "select by index", so pass IndexValue as '2'

	public void selectFromDropDownByIndex(By locator, int indexValue) {
		try {
			WebElement element = driver.findElement(locator);
			if (element.isDisplayed()) {
				Select selObj = new Select(element);
				selObj.selectByIndex(indexValue);
				//logger.info("User selects the index as  " + indexValue + " from Dropdown");
				BaseSetup.test.log(Status.PASS, "User selects the index as  " + indexValue + " from Dropdown");
			}
			else {
				
				BaseSetup.test.log(Status.FAIL, "Element not displaying");
			}
		}

		catch (NoSuchElementException e)

		{
			e.printStackTrace();
			System.err.format("No Element Found to perform selection" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to perform selection in the dropdown" + e);
		}

	}

	// select the dropdown using "select by value", so pass Value as

	public void selectFromDropDownByValue(By locator, String value) {
		try {
			WebElement element = driver.findElement(locator);
			if (element.isDisplayed()) {
				Select selObj = new Select(element);
				selObj.selectByValue(value);
				System.out.println(element.getText());
				//logger.info("User selects the value as  " + value + "from Dropdown");
				BaseSetup.test.log(Status.PASS, "User selects the value as  " + value + "from Dropdown");
			}
		}

		catch (NoSuchElementException e)

		{
			e.printStackTrace();
			System.err.format("No Element Found to perform selection" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to perform selection in the dropdown" + e);
		}

	}
	public String getAttributeValue(By locator, String attributeName) {
		String attributeValue = null;
		try {
			WebElement element = driver.findElement(locator);
			if (element.isDisplayed()) {
				attributeValue = element.getAttribute(attributeName);
				// System.out.println(value);
				//logger.info("User gets the value as  " + attributeValue + " for the webelement");
				BaseSetup.test.log(Status.PASS, "User gets the value as  " + attributeValue + "for the webelement");
			}
		}

		catch (NoSuchElementException e)

		{
			e.printStackTrace();
			System.err.format("No Element Found to perform selection" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to perform selection in the dropdown" + e);
		}
		return attributeValue;

	}
public void assertAttributeValue(By locator, String attributeName, String expectedAttributeValue) {
		String actualAttributeValue = getAttributeValue(locator, attributeName);
		Assert.assertEquals(actualAttributeValue, expectedAttributeValue);
		//logger.info("the expected value: " + expectedAttributeValue + " matches the actual value: " + actualAttributeValue);
		BaseSetup.test.log(Status.PASS,
				"the expected value: " + expectedAttributeValue + " matches the actual value: " + actualAttributeValue);

	}
	
	public String getCssValue(WebElement element, String sPropertyName) {
		String propertyValue = null;
		try {
			if (element.isDisplayed()) {
				propertyValue = element.getCssValue(sPropertyName);
//				System.out.println(propertyValue);
				//logger.info("User gets the value as  " + propertyValue + "for the webelement");
				BaseSetup.test.log(Status.PASS, "User gets the value as  " + propertyValue + "for the webelement");
			}
		}

		catch (NoSuchElementException e)

		{
			e.printStackTrace();
			System.err.format("No Element Found to perform selection" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to perform selection in the dropdown" + e);
		}
		return propertyValue;

	}

	public boolean getCheckBoxState(By locator) {
		boolean value = false;
		try {
			WebElement element = driver.findElement(locator);
			if (element.isDisplayed()) {
				value = element.isSelected();
				// System.out.println(value);
				//logger.info("User gets the value as  " + value + " from the check box");
				BaseSetup.test.log(Status.PASS, "User gets the value as  " + value + " from the check box");
			}
		}

		catch (NoSuchElementException e)

		{
			e.printStackTrace();
			System.err.format("No Element Found to perform selection" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to perform selection in the dropdown" + e);
		}
		return value;

	}

	public boolean getRadioButtonState(By locator) {
		boolean value = false;
		try {
			WebElement element = driver.findElement(locator);
			if (element.isDisplayed()) {
				value = element.isSelected();
				// System.out.println(value);
				//logger.info("User gets the value as  " + value + " from the radio button");
				BaseSetup.test.log(Status.PASS, "User gets the value as  " + value + " from the radio button");
			}
		}

		catch (NoSuchElementException e)

		{
			e.printStackTrace();
			System.err.format("No Element Found to perform selection" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to perform selection in the dropdown" + e);
		}
		return value;

	}
	public void launchApplication() throws InterruptedException {

		driver.navigate().to(url);
		//logger.info("User navigates to the URL: " + url);
//		BaseSetup.test.log(Status.PASS, "User navigates to the URL: " + url);

		if (isAlertPresent()) {
			acceptAlert();
			Thread.sleep(1000);
		}

	}

	/*public void launchotherLanguages() {
		driver.navigate().to(applicationUrl);
		//logger.info("User navigates to the URL: " + GermanyUrl);
		BaseSetup.test.log(Status.PASS, "User navigates to the URL: " + GermanyUrl);

	}*/

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} // try
		catch (NoAlertPresentException Ex) {
			return false;
		} // catch
	}

	public void verifyStringValue(String expected, String actual) {

		Assert.assertEquals(expected, actual);
		//logger.info("the expected value: " + expected + " matches the actual value: " + actual);
		BaseSetup.test.log(Status.PASS, "the expected value: " + expected + " matches the actual value: " + actual);

	}

	
	public void verifyWebElementStateDiffers(boolean expected, boolean actual) {
		Assert.assertNotSame(expected, actual);
		//logger.info("the expected value: " + expected + " does not match the actual value: " + actual);
		BaseSetup.test.log(Status.PASS,
				"the expected value: " + expected + " does not match matche the actual value: " + actual);

	}

	public String getAlertMessage() {
		String alertText = null;
		boolean isAlertAvailable = isAlertPresent();
		if (isAlertAvailable) {
			alertText = driver.switchTo().alert().getText();
			// System.out.println(alertText);
		}
		return alertText;
	}

	public void verifyAlertMessage(String expectedMessage) {
		Assert.assertEquals(expectedMessage, getAlertMessage());

	}
	

	public void acceptAlert() {
		boolean isAlertAvailable = isAlertPresent();
		if (isAlertAvailable) {
			driver.switchTo().alert().accept();
		}
	}

	public void dissmisAlert() {
		boolean isAlertAvailable = isAlertPresent();
		if (isAlertAvailable) {
			driver.switchTo().alert().dismiss();
		}
	}

	public void switchToChildWindow() {

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			// Here we will compare if parent window is not equal to child
			// window then we will close

			if (!getParentWindow().equals(child_window)) {
				driver.switchTo().window(child_window);

			}
		}
	}

	public String getMainWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}

	public static boolean closeAllOtherWindows(WebDriver driver, String openWindowHandle) {
		Set<String> allWindowHandles = driver.getWindowHandles();
		for (String currentWindowHandle : allWindowHandles) {
			if (!currentWindowHandle.equals(openWindowHandle)) {
				driver.switchTo().window(currentWindowHandle);
				driver.close();
			}
		}

		driver.switchTo().window(openWindowHandle);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
	}

	public void closeChildWindow() {
		driver.close();
	}

	public void switchMainWindow(String wparent) {
		driver.switchTo().window(wparent);
	}

	public boolean verifyObjectWaterMark(By locator, String expectedObjectWaterMark) {

		//logger.info("User verifies the test object Label as: " + expectedObjectWaterMark);
		return getObjectlLabel(locator).contains(expectedObjectWaterMark.toLowerCase());
	}

	
public static List<WebElement> collectAllSimillarElements(WebDriver driver, By locator)

	{

		List<WebElement> elementList = new ArrayList<WebElement>();

		elementList = driver.findElements(locator);
		return elementList;

	}

	public List<WebElement> countAllSimillarElements(WebDriver driver, By locator)

	{
		
		List<WebElement> elementList = new ArrayList<WebElement>();
		
		elementList = driver.findElements(locator);
		for (int i = 0; i < elementList.size(); i++) 
		{
			BaseSetup.test.log(Status.INFO, ": is displayed on the Page\n"+ elementList.get(1));
			//countelements = elementList.size();
		}
		
		return elementList;

	}
	public WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}
	public List<WebElement> getWebElements(By locator) {
		return driver.findElements(locator);
	}
	public void navigateto(String uri) {
		driver.get(uri);
	}

	public void enterTextValue(By username, Keys enter) {
		// TODO Auto-generated method stub
		try {
			WebElement element = driver.findElement(username);
			if (verifyElementPresent(username))
			// element.isDisplayed())
			{
				element.clear();
				element.sendKeys(Keys.ENTER);
				//logger.info("User enters " + expectedData + " in the " + element.getText() + " text box");
				BaseSetup.test.log(Status.PASS,
						"User Press enters in the " + element.getText() + " text box");
			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			System.err.format("No Element Found to enter text" + e);
			BaseSetup.test.log(Status.FAIL, "No Element Found to enter text" + e);
		}
	}
	}
	
	
	

