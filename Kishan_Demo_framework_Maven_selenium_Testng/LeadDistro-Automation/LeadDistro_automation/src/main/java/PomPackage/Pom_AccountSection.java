package PomPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_AccountSection {
	WebDriver driver;

	public Pom_AccountSection(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElement Locators
	By Click_on_account_section=By.xpath("//span[@class='menu-title'][normalize-space()='Account']");
	By CLick_on_signout_option=By.xpath("//span[normalize-space()='Sign Out']");
	By Click_on_change_password=By.xpath("//span[normalize-space()='Change Password']");
	
    By Click_on_change_password_button=By.xpath("//button[@id='kt_sign_in_submit']");
    By Enter_current_pass=By.xpath("//input[@id='id_oldpassword']");
    By Enter_new_pass=By.xpath("//input[@id='id_password1']");
    By Enter_confirm_pass=By.xpath("//input[@id='id_password2']");
    By Click_on_API_overview=By.xpath("//span[normalize-space()='API Overview']");
    
    By Click_on_pythonlink_1=By.xpath("(//a[@class=\"nav-link\"])[1]");
    By Click_on_pythonlink_2=By.xpath("(//a[text()='PYTHON'])[2]");
    By Click_on_pythonlink_3=By.xpath("(//a[text()='PYTHON'])[3]");
    
    
    By Click_on_curllink_1=By.xpath("(//a[text()='CURL'])[1]");
    By Click_on_curllink_2=By.xpath("(//a[text()='CURL'])[2]");
    By Click_on_curllink_3=By.xpath("(//a[text()='CURL'])[3]");
    
	public void Pom_AccountSection_1() throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_account_section)));
		driver.findElement(Click_on_account_section).click();
		Thread.sleep(1000);//To get user operation performed or not hence adding this wait
		driver.findElement(Click_on_account_section).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_account_section.",
				"The user Clicked_on_account_section successfully.");
		
	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(CLick_on_signout_option)));
		driver.findElement(CLick_on_signout_option).click();
		Thread.sleep(1000);//To get user operation performed or not hence adding this wait
		String text="Are you sure ?";
		TestBase.verifyTextPresence(driver, text);
		driver.navigate().back();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_signout_option.",
				"The user Clicked_on_signout_option successfully.");
		

	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_change_password)));
		driver.findElement(Click_on_change_password).click();
		Thread.sleep(1000);//To get user operation performed or not hence adding this wait
		String changepass="Change Password";
		TestBase.verifyTextPresence(driver, changepass);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_change_password.",
				"The user Click_on_change_password successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_current_pass)));
		driver.findElement(Enter_current_pass).sendKeys("Test@123");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_current_pass.",
				"The user Entered_current_pass successfully.");
		
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_new_pass)));
		driver.findElement(Enter_new_pass).sendKeys("test@123");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_new_pass.",
				"The user Entered_new_pass successfully.");
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_confirm_pass)));
		driver.findElement(Enter_confirm_pass).sendKeys("test@123");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_confirm_pass.",
				"The user Entered_confirm_pass successfully.");
		Thread.sleep(1000);//To get user operation performed or not hence adding this waitsss
		driver.navigate().back();
	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_API_overview)));
		driver.findElement(Click_on_API_overview).click();
		String api="API Overview";
		TestBase.verifyTextPresence(driver, api);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_API_overview.",
				"The user Clicked_on_API_overview successfully.");
		
	
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_pythonlink_1)));
		driver.findElement(Click_on_pythonlink_1).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_pythonlink_1.",
				"The user Clicked_on_pythonlink_1 successfully.");
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)", "");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_pythonlink_2)));
		driver.findElement(Click_on_pythonlink_2).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_pythonlink_2.",
				"The user Clicked_on_pythonlink_2 successfully.");
		
		js.executeScript("window.scrollBy(0,1400)", "");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_pythonlink_3)));
		driver.findElement(Click_on_pythonlink_3).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_pythonlink_3.",
				"The user Clicked_on_pythonlink_3 successfully.");
	
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_curllink_3)));
		driver.findElement(Click_on_curllink_3).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_curllink_3.",
				"The user Clicked_on_curllink_3 successfully.");
		
		js.executeScript("window.scrollBy(0,-1400)", "");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_curllink_2)));
		driver.findElement(Click_on_curllink_2).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_curllink_2.",
				"The user Clicked_on_curllink_2 successfully.");
		
		
		js.executeScript("window.scrollBy(0,-1400)", "");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_curllink_1)));
		driver.findElement(Click_on_curllink_1).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_curllink_1.",
				"The user Clicked_on_curllink_1 successfully.");
		
		
		System.out.println("Pom_AccountSection_1 method passed successfully.");
		
	}

}


















