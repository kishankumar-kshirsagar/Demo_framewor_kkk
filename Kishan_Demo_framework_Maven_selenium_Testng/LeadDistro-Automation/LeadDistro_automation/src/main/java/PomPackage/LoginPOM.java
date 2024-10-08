package PomPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.relevantcodes.extentreports.LogStatus;
import BasePackage.BaseClass;
import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;
import static BasePackage.BaseClass.webDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class LoginPOM  {

	WebDriver driver;

	public LoginPOM(WebDriver driver)

	{

		this.driver = driver;
	}

	By Enter_email = By.xpath("//input[@id='id_login']");
	By Enter_password = By.xpath("//input[@id='id_password']");
	By SelectCheckRemember_me = By.xpath("//input[@id='id_remember']");
	By Click_on_signin_btn = By.xpath("//button[@id='kt_sign_in_submit']");

	public void doLogin(String Username, String Password) throws InterruptedException

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_email)));
		driver.findElement(Enter_email).sendKeys(Username);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can enter the email.",
				"THe user entered the email successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_password)));
		driver.findElement(Enter_password).sendKeys(Password);
		ExtentTestManager.getTest().log(LogStatus.PASS, "verify the user can Enter the Password",
				"The user entered thePassword Entered successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(SelectCheckRemember_me)));
		driver.findElement(SelectCheckRemember_me).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user click on the check box remember me. ",
				"The user Check the checkbox sucessfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_signin_btn)));
		driver.findElement(Click_on_signin_btn).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String expected = "Home- LeadDistro Textdrip Project";
		TestBase.toast(pageTitle, expected); // Called the base class method to verify the text or toaster.
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user click on the Click_on_signin_btn. ",
				"The user Click_on_signin_btn sucessfully.");

		System.out.println("The User Login the application successfully.");

	}

}