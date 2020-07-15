package runner;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.cucumber.listener.Reporter;

import BDD_DEMO.BaseExecution.BaseSetup;
import BDD_DEMO.TestBDD.GillatePageObjects;
import Utilities.CaptureScreenShot;
import Utilities.PageUtil;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberFeature;


//	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/main/java/fetaures", //the path of the feature files
			glue={"stepDefinitions"}, //the path of the step definition files
			format= {"pretty",
					"html:target/Reports/",
					"json:target/Reports/cucumber.json",
					"junit:target/Reports/cucumber.xml"}, //to generate different types of reporting
			plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReportwithoutScreenshot.html",
					"json:target/Reports/cucumber.json"},
			monochrome = true, //display the console output in a proper readable format
			strict = true, //it will check if any step is not defined in step definition file
			dryRun = false //to check the mapping is proper between feature file and step def file
		
			)
	 
	public class TestRunner extends BaseSetup {
		private TestNGCucumberRunner testNGCucumberRunner;
		
		ExtentReports reports;
		public static ExtentTest test =null;
		public static String sPathforProperty;
		public ExtentHtmlReporter htmlReporter;
		String reportName;
		
		@BeforeClass
		public void startReport() {
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = new Date();
			List<String> aa = Arrays.asList(dateFormat.format(date).split(" "));
			String name = (aa.get(0) + "(" + aa.get(1) + ")").replace(":", "-");
			//reportFolderName = reportFilePath + "\\" + "Extent-Report-" + aa.get(0);
			reportName =  System.getProperty("user.dir") + "\\Reports\\FinalReport"+name+""+".html";
			htmlReporter = new ExtentHtmlReporter(new File(reportName));		
			htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\Configurations\\extent-config.xml"));
			htmlReporter.config().setChartVisibilityOnOpen(true);

				htmlReporter.setAppendExisting(true);
				reports = new ExtentReports();
				reports.setSystemInfo("Environment", "QA");
				reports.setSystemInfo("Operating System", 	System.getProperty("os.name"));
				reports.setSystemInfo("", "");	
				reports.attachReporter(htmlReporter);
				test=reports.createTest("Gillette Test");
		}
		
		
		 
		 
		 
		 
		 @BeforeTest(alwaysRun = true)
		 public void setUpClass(ITestContext context) {
			 testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
			 
		 }
		
		 @Test(groups="cucumber", description="Run Cucumber feature", dataProvider="features")
		 public void feature(CucumberFeatureWrapper cucumberFeature) {
			 testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
		 }
		 
		@DataProvider
		public Object[][] features()
		{
			return testNGCucumberRunner.provideFeatures();
		}
		
		@AfterClass(alwaysRun=true)
		public void tearDownClass() {
			Reporter.loadXMLConfig(new File("./Configurations/extent-config.xml"));
			//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
			Reporter.setSystemInfo("User Name", "AJ");
			Reporter.setSystemInfo("Application Name", "Test App ");
			Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
			Reporter.setSystemInfo("Environment", "Production");
			Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
			testNGCucumberRunner.finish();
		}
//		ExtentReports reports;
//		public static ExtentTest test = null;
//		public static String sPathforProperty;
//		public ExtentHtmlReporter htmlReporter;
//		String reportName;
//		
//	@BeforeTest
//	public void startReport() {
//		
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date date = new Date();
//		List<String> aa = Arrays.asList(dateFormat.format(date).split(" "));
//		String name = (aa.get(0) + "(" + aa.get(1) + ")").replace(":", "-");
//		//reportFolderName = reportFilePath + "\\" + "Extent-Report-" + aa.get(0);
//		reportName =  System.getProperty("user.dir") + "\\Reports\\"+name+""+".html";
//		htmlReporter = new ExtentHtmlReporter(new File(reportName));		
//		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir") + "\\Configurations\\extent-config.xml"));
//		htmlReporter.config().setChartVisibilityOnOpen(true);
//	
//			htmlReporter.setAppendExisting(true);
//			reports = new ExtentReports();
//			reports.setSystemInfo("Environment", "QA");
//			reports.setSystemInfo("Operating System", 	System.getProperty("os.name"));
//			reports.setSystemInfo("", "");	
//			reports.attachReporter(htmlReporter);
//	}
//	
//	
//	
		
	@AfterMethod
	public void getResult(ITestResult result) throws Exception {
		
		try {
			
			
			if (result.getStatus() == ITestResult.SUCCESS) {
				test.log(Status.PASS, "The Test Case named as : " + result.getName() + " is Passed");
 
			} else if (result.getStatus() == ITestResult.FAILURE) {
				test.log(Status.FAIL, "The Test Case named as : " + result.getName() + " is Failed");
				
				//String filename = result.getMethod().getMethodName();
				String screenshotPath = CaptureScreenShot.captureScreenshot(driver);
				
				test.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
				if (!(driver == null))// if driver closed by manually or api failed then screenshot will not taken.
					test.addScreenCaptureFromPath(screenshotPath);

				
			} else if (result.getStatus() == ITestResult.SKIP) {
				test.log(Status.SKIP, "The Test Case named as : " + result.getName() + " is Skipped");

			}
			
		}
		
		catch (Exception e) 
		{
			// If user close the browser manually then will show the exception and quite the
			// driver
			System.out.println(e);
//			driver.quit();
		
		}
	}
//	
//	
	@AfterTest
	public void endreport() {
		reports.flush();
         driver.quit();
		
	}
	}
	

	

