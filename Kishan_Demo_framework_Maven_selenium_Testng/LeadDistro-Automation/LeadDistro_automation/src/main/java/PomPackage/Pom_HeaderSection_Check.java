package PomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.BaseClass;
import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_HeaderSection_Check {
	WebDriver driver;
	

	public Pom_HeaderSection_Check(WebDriver driver)

	{

		this.driver = driver;
	}

	By Click_on_the_Logo = By.xpath("//div[@class='h-40px w-240px logo header-white-logo']");
	By Click_on_page_heading = By.xpath("//h3[normalize-space()='Profile Details']");

	By Click_on_editProfile_btn = By.xpath("//a[normalize-space()='Edit Profile']");
	By Enter_name = By.xpath("//input[@placeholder='Enter Your Name']");
	By Enter_Company_name = By.xpath("//input[@placeholder='Enter Your Company Name']");
	By Enter_region = By.xpath("//input[@placeholder='Enter Your Region']");
	By Enter_APIKey = By.xpath("//input[@placeholder='Enter Your LandlineRemover APIKey or Leave it Empty']");
	By Enter_leads_limit = By.xpath("//input[@placeholder='Enter assign leads limit']");
	By Click_on_submit_btn = By.xpath("//button[@id='submit_btn_process']");

	public void HeaderPom_1() throws InterruptedException

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_Logo)));
		driver.findElement(Click_on_the_Logo).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can click on the logo.",
				"The user clicked on logo successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_page_heading)));
		driver.findElement(Click_on_page_heading).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_page_heading.",
				"The user Clicked_on_page_heading successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_editProfile_btn)));
		driver.findElement(Click_on_editProfile_btn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_editProfile_btn.",
				"The user Clicked_on_editProfile_btn successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_name)));
		driver.findElement(Enter_name).clear();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_name.",
				"The user Entered_name successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Company_name)));
		driver.findElement(Enter_Company_name).clear();
		driver.findElement(Enter_Company_name).sendKeys("TExtdrip Pvt Ltd");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Company_name.",
				"The user Entered_Company_name successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_region)));
		driver.findElement(Enter_region).clear();
		driver.findElement(Enter_region).sendKeys("20 Cooper Square, New York, NY 10003, USA");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_region.",
				"The user Entered_region successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_APIKey)));
		driver.findElement(Enter_APIKey).clear();
		driver.findElement(Enter_APIKey).sendKeys("rpRXLDqZ45ALeYXYcDoaaIojYENVWLDsyqlxGnXt");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_APIKey.",
				"The user Entered_APIKey successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limit)));
		driver.findElement(Enter_leads_limit).clear();
		driver.findElement(Enter_leads_limit).sendKeys("100");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_limit.",
				"The user Entered_leads_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_submit_btn)));
		driver.findElement(Click_on_submit_btn).click();
		Thread.sleep(2000);
//		String text = " Please fill out this field. ";
//		BaseClass.verifyTextPresence(driver, text);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_submit_btn.",
				"The user Click_on_submit_btn successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_name)));
		driver.findElement(Enter_name).clear();
		driver.findElement(Enter_name).sendKeys("Johan Smith");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_name.",
				"The user Entered_name successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_submit_btn)));
		driver.findElement(Click_on_submit_btn).click();
		Thread.sleep(2000);
		String Actualresult = "Account Info has been updated Successfully!";
		BaseClass.verifyTextPresence(driver, Actualresult);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_submit_btn.",
				"The user Click_on_submit_btn successfully.");
		
	}

	By Click_on_the_toggle = By.xpath("//span[@class='slider round']");
	By Click_on_the_ProfileIcon = By.xpath("//img[@src='/static/img/usericon.png']");
	By Click_on_the_MyProfile = By.xpath("//a[normalize-space()='My Profile']");
	By Click_on_the_my_projects = By.xpath("//span[normalize-space()='My Projects']");
	By Click_on_the_my_team = By.xpath("//span[normalize-space()='My Team']");
	By Click_on_signout_btn = By.xpath("//a[contains(text(),'Sign Out')]");
	By Click_on_signoutbtn = By.xpath("//span[text()='Sign Out']");
	By Signout_successmsg = By.xpath("//div[@class='toast-body fs-5 bg-white']");

	public void HeaderPom_2() throws InterruptedException

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_toggle)));
		Thread.sleep(2000);
		driver.findElement(Click_on_the_toggle).click();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can click on the toggle.",
				"The user clicked on the toggle successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_ProfileIcon)));
		driver.findElement(Click_on_the_ProfileIcon).click();
		String account_type = "Super User";
		BaseClass.verifyTextPresence(driver, account_type);
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_ProfileIcon.",
				"The user Clicked_on_the_ProfileIcon successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_MyProfile)));
		driver.findElement(Click_on_the_MyProfile).click();
		String Profil_Details = "Profile Details";
		BaseClass.verifyTextPresence(driver, Profil_Details);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_ProfileIcon)));
		driver.findElement(Click_on_the_ProfileIcon).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_MyProfile.",
				"The user Clicked_on_the_MyProfile successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_my_projects)));
		driver.findElement(Click_on_the_my_projects).click();
		String My_projects = "All Projects (Last 12 Months) |";
		BaseClass.verifyTextPresence(driver, My_projects);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_ProfileIcon)));
		driver.findElement(Click_on_the_ProfileIcon).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_my_projects.",
				"The user Clicked_on_the_my_projects successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_my_team)));
		driver.findElement(Click_on_the_my_team).click();
		String My_team = "All Team Members";
		BaseClass.verifyTextPresence(driver, My_team);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_ProfileIcon)));
		driver.findElement(Click_on_the_ProfileIcon).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_my_team.",
				"The user Clicked_on_the_my_team successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_signout_btn)));
		driver.findElement(Click_on_signout_btn).click();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_signout_btn.",
				"The user Clicked_on_signout_btn successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_signoutbtn)));
		driver.findElement(Click_on_signoutbtn).click();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_signoutbtn.",
				"The user Clicked_on_signoutbtn successfully.");
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Signout_successmsg)));
//		String actual = driver.findElement(Signout_successmsg).getText();
//		String Signoutmsg="You have signed out.";
//		TestBase.toast(actual, Signoutmsg);
//		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can get the success toaster.",
//				"The user signout successfully.");
		
	}

}
