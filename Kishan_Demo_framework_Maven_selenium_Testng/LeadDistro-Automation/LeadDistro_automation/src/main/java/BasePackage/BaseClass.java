package BasePackage;

import com.relevantcodes.extentreports.LogStatus;
import Extentpackage.ExtentManager;
import Extentpackage.ExtentTestManager;
import PomPackage.LoginPOM;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.CaseUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.time.Duration;
import java.time.LocalDate;


import java.util.Date;
import java.util.List;

public class BaseClass extends TestBase {
	
	public WebDriver driver;
    public static WebDriver webDriver;
      
//	// Screenshot code
//	public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {
//		TakesScreenshot scrShot = (TakesScreenshot) driver;
//		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
//		File DestFile = new File(fileWithPath);
//		FileUtils.copyFile(SrcFile, DestFile);
//	}
//
//	// Scroll the page on view
//	public static void ScrollIntoView(WebDriver driver, WebElement element) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
//	}
//
//	// Wait for element to be clickable
//	    public void timewait(WebElement element, WebDriver driver) {
//	        try {
//	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//	            wait.until(ExpectedConditions.elementToBeClickable(element));
//	        } catch (Exception e) {
//	            e.printStackTrace(); // Handle exception properly, maybe log it or rethrow
//	        }
//	    }
//
//	// Toaster verification
//	public void toast(String Actual, String Expected) {
//	     softAssert = new SoftAssert();
//		softAssert.assertEquals(Actual, Expected);
//	}

	public void loginTD() throws IOException, InterruptedException {
		LoginPOM Login = new LoginPOM(webDriver);
		String proPath = System.getProperty("user.dir") + "/src/main/java/BasePackage/BaseClass.properties";
		TestBase testBase = new TestBase();
		String ID = testBase.readProperties(proPath, "id");
		String PASS = testBase.readProperties(proPath, "pass");
		Login.doLogin(ID, PASS);
	}

	@BeforeMethod
	public void beforeMethod(Method method) throws IOException {

		String proPath = System.getProperty("user.dir") + "/src/main/java/BasePackage/BaseClass.properties";
		TestBase testBase = new TestBase();
		String url = testBase.readProperties(proPath, "URL");
		String browser = testBase.readProperties(proPath, "Browser");
		String headlessMode = testBase.readProperties(proPath, "headless");
		if (browser.equalsIgnoreCase("FireFox")) {
			FirefoxOptions fireFoxOptions = new FirefoxOptions();
			// fireFoxOptions.addArguments("start-maximized");
			fireFoxOptions.addArguments("--start-maximized");
			fireFoxOptions.setHeadless(Boolean.parseBoolean(headlessMode));
			WebDriverManager.firefoxdriver().setup();
			webDriver = new FirefoxDriver(fireFoxOptions);

		} else if (browser.equalsIgnoreCase("Chrome")) {

			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			chromeOptions.addArguments("start-maximized");
			chromeOptions.setHeadless(Boolean.parseBoolean(headlessMode));
		//	WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().clearDriverCache().setup();
			webDriver = new ChromeDriver(chromeOptions);
			

		} else if (browser.equalsIgnoreCase("Edge")) {
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("start-maximized");
			edgeOptions.setHeadless(Boolean.parseBoolean(headlessMode));
			WebDriverManager.edgedriver().setup();
			webDriver = new EdgeDriver(edgeOptions);
		}
		webDriver.get(url);
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // applicable to all the elements.
		webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		SetDates();

		ExtentTestManager
				.startTest("Testcase Name: " + method.getName(), method.getAnnotation(Test.class).description())
				.assignAuthor("Automation Team").assignCategory("Scharco Smoke TestCases");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TEST STARTED # " + +method.getAnnotation(Test.class).priority() + " - "
				+ method.getAnnotation(Test.class).description());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

	@AfterMethod
	public void afterMethod(ITestResult result, Method method) throws Exception {
		String fileName;
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		String testSRes;
		Date endDateTime;
		String testDescription;
		String dateEndInString;
		if (result.getStatus() == 2) {
			endDateTime = new Date();
			DateFormat shortDf = DateFormat.getDateTimeInstance(3, 3);
			testDescription = shortDf.format(endDateTime).replace("/", "_");
			testDescription = testDescription.replace(" ", "_");
			testDescription = testDescription.replace(":", "_");
			dateEndInString = "SC_error__" + testDescription;
			fileName = System.getProperty("user.dir") + "\\Reports\\Failure_Screenshots\\" + dateEndInString + ".png";
			TestBase obj=new TestBase();
			obj.takeSnapShot(webDriver, fileName);
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Error Screenshot"
					+ ExtentTestManager.getTest().addScreenCapture("failure_screenshots\\" + dateEndInString + ".png"));
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Failed Test Logs : " + result.getThrowable().getMessage());

			LogEntries entries = webDriver.manage().logs().get(LogType.BROWSER);
			List<LogEntry> logs = entries.getAll();
			for (LogEntry e : logs) {
				ExtentTestManager.getTest().log(LogStatus.WARNING, "Console JS Errors :" + e.getMessage());
			}
			ExtentTestManager.getTest().log(LogStatus.FAIL, "Test Failed");
			testSRes = "FAIL";
		} else if (result.getStatus() == 3) {
			ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
			testSRes = "SKIP";
		} else {
			ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
			testSRes = "PASS";
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TEST COMPLETED # [ " + testSRes + " ] " + method.getAnnotation(Test.class).description());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
		ExtentManager.getReporter().flush();
		Thread.sleep(2000);

	}

	public String generateRandomStringwithdateandtime(String ProgramType) {
		String p = RandomStringUtils.randomAlphabetic(6);
		return ProgramType + p;

	}

	public String generateRandomnumbericvalue(String numerictype) {
		String c = RandomStringUtils.randomNumeric(10);
		return numerictype + c;

	}

	public static String Generatedtagname1;
	public static String currentMonth;
	public static String NextMonth;
	public static int currentYear;
	public static int credits;

	private void SetDates() {
		LocalDate currentdate = LocalDate.now();
		System.out.println("Current date: " + currentdate);

		// Getting the current day
		int currentDay = currentdate.getDayOfMonth();

		System.out.println("Current day: " + currentDay);

		// Getting the current month

		currentMonth = currentdate.getMonth().toString();
		NextMonth = currentdate.getMonth().plus(1).toString();
		currentMonth = CaseUtils.toCamelCase(currentMonth, true);
		NextMonth = CaseUtils.toCamelCase(NextMonth, true);

		// String CurrentMonth=currentMonth.toString().substring(0, 3);

		System.out.println("Current month: " + currentMonth);
		System.out.println("Next month: " + NextMonth);

		// getting the current year

		currentYear = currentdate.getYear();
		if (currentMonth == "December") {
			currentYear = currentYear + 1;
		}

		System.out.println("Current year: " + currentYear);

	}


	@AfterMethod
	public void teardown() {
		if(softAssert !=null) {
			softAssert.assertAll();
		}
		
		webDriver.quit();
		
	}

}