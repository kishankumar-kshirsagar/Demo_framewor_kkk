package PomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_TM_User_Header_seartion_Profile_Dashboard {
	WebDriver driver;

	public Pom_TM_User_Header_seartion_Profile_Dashboard(WebDriver driver)

	{

		this.driver = driver;
	}

	By Click_on_the_Logo = By.xpath("//div[@class='h-40px w-240px logo header-white-logo']");
	By Click_on_editProfile_btn = By.xpath("//a[normalize-space()='Edit Profile']");
	By Enter_name = By.xpath("//input[@placeholder='Enter Your Name']");
    By Click_on_save_profile_btn=By.xpath("//span[text()='Update Profile']");
    By Select_vacation_mode=By.xpath("//input[@id='vacation_mode']");
    By Select_all_allowed_states=By.xpath("//input[@id='all_states']");
    By Select_states=By.xpath("//select[@id='state_list']");
    By Succ=By.xpath("//span[text()=' Account Info has been updated Successfully! ']");
    
    By Click_on_Dashboard_btn=By.xpath("//span[text()='Dashboard (Home)']");
    By Click_on_copy_btn=By.xpath("//span[text()='copy']");
    By Click_on_change_theme_toggle_link=By.xpath("//span[@class=\"slider round\"]");
    By Click_on_Profile_icon=By.xpath("//div[@data-kt-menu-attach='parent']");
    By Click_on_my_profile_option=By.xpath("//a[text()='My Profile']");
    By Click_on_signout_option=By.xpath("//a[text()='Sign Out']");
    By Click_on_signout_confirm_btn=By.xpath("//button[@id=\"kt_sign_in_submit\"]");
    // In this method we are verifying the TM user role Header section like, Edit profile, profile icon menu and Theme change functionality.
	public void TM_User_HeaderPom_1() throws InterruptedException

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_Logo)));
		driver.findElement(Click_on_the_Logo).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can click on the logo.",
				"The user clicked on logo successfully.");
		
		String profile="Profile Details";
		TestBase.verifyTextPresence(driver, profile);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_editProfile_btn)));
		driver.findElement(Click_on_editProfile_btn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_editProfile_btn.",
				"The user Clicked_on_editProfile_btn successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_name)));
		driver.findElement(Enter_name).clear();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_name.",
				"The user Entered_name successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_profile_btn)));
		driver.findElement(Click_on_save_profile_btn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_profile_btn.",
				"The user Clicked_on_save_profile_btn successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_name)));
		driver.findElement(Enter_name).clear();
		driver.findElement(Enter_name).sendKeys("Edited Kishan");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_name.",
				"The user Entered_name successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_vacation_mode)));
		if(driver.findElement(Select_vacation_mode).isSelected()	) {
		driver.findElement(Select_vacation_mode).click();
		}
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can UnSelect_vacation_mode.",
				"The user UnSelected_vacation_mode successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_all_allowed_states)));
		if(driver.findElement(Select_all_allowed_states).isSelected()	) {
		driver.findElement(Select_all_allowed_states).click();
		}
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_all_allowed_states.",
				"The user Selected_all_allowed_states successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_states)));
		Select state=new Select(driver.findElement(Select_states));
		state.deselectAll();
		state.selectByValue("ny_new york");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_states.",
				"The user Selected_states successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_profile_btn)));
		driver.findElement(Click_on_save_profile_btn).click();
		String act = driver.findElement(Succ).getText();
		String exp="Account Info has been updated Successfully!";
		TestBase.toast(act, exp);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_profile_btn.",
				"The user Clicked_on_save_profile_btn successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Dashboard_btn)));
		driver.findElement(Click_on_Dashboard_btn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Dashboard_btn.",
				"The user Clicked_on_Dashboard_btn successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_copy_btn)));
		driver.findElement(Click_on_copy_btn).click();
		String copied="Copied.";
		TestBase.verifyTextPresence(driver, copied);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_copy_btn.",
				"The user Clicked_on_copy_btn successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_change_theme_toggle_link)));
		driver.findElement(Click_on_change_theme_toggle_link).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_change_theme_toggle_link.",
				"The user Clicked_on_change_theme_toggle_link successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Profile_icon)));
		driver.findElement(Click_on_Profile_icon).click();
		String TMM="Team Member";
		TestBase.verifyTextPresence(driver, TMM);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Profile_icon.",
				"The user Clicked_on_Profile_icon successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_my_profile_option)));
		driver.findElement(Click_on_my_profile_option).click();
		String Profile_Details="Profile Details";
		TestBase.verifyTextPresence(driver, Profile_Details);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_my_profile_option.",
				"The user Clicked_on_my_profile_option successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Profile_icon)));
		driver.findElement(Click_on_Profile_icon).click();
		TestBase.verifyTextPresence(driver, TMM);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Profile_icon.",
				"The user Clicked_on_Profile_icon successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_signout_option)));
		driver.findElement(Click_on_signout_option).click();
		String Confirm_sign_out="Are you sure ?";
		TestBase.verifyTextPresence(driver, Confirm_sign_out);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_signout_option.",
				"The user Clicked_on_signout_option successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_signout_confirm_btn)));
		driver.findElement(Click_on_signout_confirm_btn).click();
		String Sucess_sign_out="Sign In to LeadDistro";
		TestBase.verifyTextPresence(driver, Sucess_sign_out);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_signout_confirm_btn.",
				"The user Click_on_signout_confirm_btn successfully.");
		
		System.out.println("TM_User_HeaderPom_1 method has been passed successfully.");
	}

}
