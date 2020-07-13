package BDD_DEMO.BaseExecution;


import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utilities.BrowserUtil;
import Utilities.CaptureScreenShot;


public class BaseSetup {
	public static WebDriver driver;
	ExtentReports extentreps;
    ExtentTest extentTest;
	BrowserUtil browserUtil = new BrowserUtil(driver);
	//private static Logger logger = Logger.getLogger(BaseSetup.class);
	
	public WebDriver getDriver() 
	{
		return driver;
		
	}
	
	
	ExtentReports reports;
	public static ExtentTest test =null;
	public static String sPathforProperty;
	public ExtentHtmlReporter htmlReporter;
	String reportName;
	
@BeforeTest
public void startReport() {
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date date = new Date();
	List<String> aa = Arrays.asList(dateFormat.format(date).split(" "));
	String name = (aa.get(0) + "(" + aa.get(1) + ")").replace(":", "-");
	//reportFolderName = reportFilePath + "\\" + "Extent-Report-" + aa.get(0);
	reportName =  System.getProperty("user.dir") + "\\Reports\\"+name+""+".html";
	htmlReporter = new ExtentHtmlReporter(new File(reportName));		
	htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\Configurations\\extent-config.xml"));
	htmlReporter.config().setChartVisibilityOnOpen(true);

		htmlReporter.setAppendExisting(true);
		reports = new ExtentReports();
		reports.setSystemInfo("Environment", "QA");
		reports.setSystemInfo("Operating System", 	System.getProperty("os.name"));
		reports.setSystemInfo("", "");	
		reports.attachReporter(htmlReporter);
		test=reports.createTest("Reportsss");
}



//@AfterMethod
//public void getResult(ITestResult result) throws Exception {
//	
//	try {
//		if (result.getStatus() == ITestResult.SUCCESS) {
//			test.log(Status.PASS, "The Test Case named as : " + result.getName() + " is Passed");
//
//		} else if (result.getStatus() == ITestResult.FAILURE) {
//			test.log(Status.FAIL, "The Test Case named as : " + result.getName() + " is Failed");
//			test.log(Status.FAIL, "Test Failure : " + result.getThrowable());
//			//String filename = result.getMethod().getMethodName();
//			String screenshotPath = CaptureScreenShot.captureScreenshot(driver, result.getName());
//			if (!(driver == null))// if driver closed by manually or api failed then screenshot will not taken.
//				test.addScreenCaptureFromPath(screenshotPath);
//
//			
//		} else if (result.getStatus() == ITestResult.SKIP) {
//			test.log(Status.SKIP, "The Test Case named as : " + result.getName() + " is Skipped");
//
//		}
//	
//	}
//	
//	catch (Exception e) 
//	{
//		// If user close the browser manually then will show the exception and quite the
//		// driver
//		System.out.println(e);
////		driver.quit();
//	
//	}
//}


@AfterTest
public void endreport() {
	reports.flush();
     driver.quit();
	
}
	
	
	//Setdriver
	private void setDriver(String browserType, String appURL) throws Exception {
		System.out.println(browserType);
		switch (browserType) {
		case "chrome":
			driver = BrowserUtil.initChromeDriver(appURL);
			break;
			
		case "ie":
			driver = BrowserUtil.initIeDriver(appURL);
			break;
			
		case "firefox":
			driver = BrowserUtil.initFirefoxDriver(appURL);
			break;
			
		case "gecko":
			driver = BrowserUtil.initFirefoxGeckoDriver(appURL);
			break;
		
			
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = BrowserUtil.initFirefoxDriver(appURL);
		}

}
//	@Parameters({ "browserType", "appURL"})
	@BeforeSuite()
	public WebDriver initializeTestBaseSetup(String browserType, String appURL )  {

		try {
			if (driver==null) {
			setDriver(browserType, appURL);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			}
	
		} catch (Exception e) {
			//logger.info("Error....." + e.getStackTrace());
		}
		return driver;
	}
	
	//@BeforeMethod
	public void deleteCookies() 
	{
		driver.manage().deleteAllCookies();
	
	}
	
	
	/*@AfterClass
	public void tearDown() throws Exception {


		  driver.quit();
		 
	}*/
}
