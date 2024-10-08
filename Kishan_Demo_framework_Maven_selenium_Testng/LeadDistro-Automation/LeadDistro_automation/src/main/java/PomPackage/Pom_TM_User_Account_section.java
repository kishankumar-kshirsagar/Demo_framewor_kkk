package PomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_TM_User_Account_section {
	WebDriver driver;

	public Pom_TM_User_Account_section(WebDriver driver) {
		this.driver = driver;
	}
	
	By Click_on_Account_dropDown=By.xpath("(//span[@class='menu-arrow'])[2]");
	By Click_on_change_Password_menu=By.xpath("//span[text()='Change Password']");
	By Click_on_change_pass_button=By.xpath("//button[@id=\"kt_sign_in_submit\"]");
	By Enter_current_password=By.xpath("//input[@name=\"oldpassword\"]");
	By Enter_new_pass=By.xpath("//input[@placeholder=\"New Password\"]");
	By Enter_new_pass_again=By.xpath("//input[@placeholder=\"New Password (again)\"]");
	By Click_on_sign_out_option=By.xpath("//span[text()='Sign Out']");
	By Click_on_confirm_button=By.xpath("//button[@id=\"kt_sign_in_submit\"]");
	//In this method we are checking the account section functionality.
	public void Pom_TM_User_Account_section_1() throws InterruptedException

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Account_dropDown)));
		driver.findElement(Click_on_Account_dropDown).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Account_dropDown.",
				"The user Clicked_on_Account_dropDown successfully.");
		
		if(driver.findElement(Click_on_change_Password_menu).isDisplayed()) {
			System.out.println("The Account section drop down menu are visible.");
			
		}
		else {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Account_dropDown)));
			driver.findElement(Click_on_Account_dropDown).click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_change_Password_menu)));
		driver.findElement(Click_on_change_Password_menu).click();
		String change_pass="Change Password";
		TestBase.verifyTextPresence(driver, change_pass);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_change_Password.",
				"The user Clicked_on_change_Password successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_change_pass_button)));
		driver.findElement(Click_on_change_pass_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_change_Password btn.",
				"The user Clicked_on_change_Password btn successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_current_password)));
		driver.findElement(Enter_current_password).sendKeys("Qa@12345");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_current_password.",
				"The user Entered_current_password successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_new_pass)));
		driver.findElement(Enter_new_pass).sendKeys("Qa@12345");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_new_pass.",
				"The user Entered_new_pass successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_new_pass_again)));
		driver.findElement(Enter_new_pass_again).sendKeys("Qa@12345");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_new_pass_again.",
				"The user Entered_new_pass_again successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_change_pass_button)));
		driver.findElement(Click_on_change_pass_button).click();
        String change="Password successfully changed.";
        TestBase.verifyTextPresence(driver, change);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_change_Password btn.",
				"The user Clicked_on_change_Password btn successfully.");	
		System.out.println("Pom_TM_User_Account_section_1 method hass been passed.");
}
	
	public void Pom_TM_User_Account_section_2() throws InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Account_dropDown)));
		driver.findElement(Click_on_Account_dropDown).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Account_dropDown.",
				"The user Clicked_on_Account_dropDown successfully.");
		
		if(driver.findElement(Click_on_change_Password_menu).isDisplayed()) {
			System.out.println("The Account section drop down menu are visible.");
			
		}
		else {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Account_dropDown)));
			driver.findElement(Click_on_Account_dropDown).click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_sign_out_option)));
		driver.findElement(Click_on_sign_out_option).click();
		String signout="Are you sure ?";
		TestBase.verifyTextPresence(driver, signout);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_sign_out_option.",
				"The user Clicked_on_sign_out_optionn_change_Password successfully.");
	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_confirm_button)));
		driver.findElement(Click_on_confirm_button).click();
		String succ="You have signed out.";
		TestBase.verifyTextPresence(driver, succ);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_confirm_button btn.",
				"The user Clicked_on_confirm_button btn successfully.");
		System.out.println("Pom_TM_User_Account_section_2 method has been passed.");
	}
}


















