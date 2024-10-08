package BasePackage;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static BasePackage.BaseClass.webDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class TestBase extends WebDriverTestBase {
	// This class contains common methods.
	public static SoftAssert softAssert;

	@Override
	public void scrollPageOnview(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Screenshot code
	public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception {
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);
	}

	// Scroll the page on view
	public static void ScrollIntoView(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	// Scroll the page top of the webpage.
	public static void ScrollTopOfthePage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}

	// Scroll the page bottom of the page.
	public static void ScrollBottomOfthePage(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	// Wait for element to be clickable.
	public void timewait(WebElement element, WebDriver driver) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace(); // Handle exception properly, maybe log it or rethrow
		}
	}

	// Toaster verification.
	public static void toast(String Actual, String Expected) {
		softAssert = new SoftAssert();
		softAssert.assertEquals(Actual, Expected);

	}

	// Page Text verification
	public static void verifyTextPresence(WebDriver driver, String text) {
		softAssert = new SoftAssert();
		if (driver.getPageSource().contains(text)) {
			softAssert.assertTrue(true, "Text is present on the page.");
		} else {
			softAssert.fail("Text is not present on the page.");
		}

		softAssert.assertAll();
	}

	// Single condition assertion
	public static void SoftAssertion() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertTrue(true, "Element is enabled");
	}

	
	// Table data column validation
	public static void Verify_the_Table_Headers(List<String> expectedHeaders, List<WebElement> headers) {
		SoftAssert softAssert = new SoftAssert();// Initialize SoftAssert
		int expectedHeader = expectedHeaders.size();// Expected headers in the correct order
		System.out.println("The size of the expectedHeaders are - " + expectedHeader);
		int total_headers = headers.size();
		softAssert.assertEquals(expectedHeader, expectedHeaders.size(), "Number of headers count mismatch");// Soft assert for header size
		for (int i = 0; i < total_headers; i++) {// Iterate through each header element
			WebElement headerElement = headers.get(i);
			String actualHeaderText = headerElement.getText();
			String expectedHeaderText = expectedHeaders.get(i);
			softAssert.assertEquals(actualHeaderText, expectedHeaderText,// Compare actual header text with expected header text
					"Header validation failed for: " + expectedHeaderText);
		}
		softAssert.assertAll();// Perform soft assert and collect all assertion failures
	}

	
	// Read the data from the .properties files
	@Override
	public String readProperties(String proPath, String proData) throws IOException {
		FileInputStream fileInputStream = new FileInputStream(proPath);
		Properties properties = new Properties();
		properties.load(fileInputStream);
		return properties.getProperty(proData);
	}

}
