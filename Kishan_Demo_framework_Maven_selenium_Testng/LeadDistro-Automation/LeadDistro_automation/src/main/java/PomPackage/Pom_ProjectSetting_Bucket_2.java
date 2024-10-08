package PomPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_ProjectSetting_Bucket_2 {
	WebDriver driver;

	public Pom_ProjectSetting_Bucket_2(WebDriver driver) {
		this.driver = driver;
	}

	By Click_on_bucket_module = By.xpath("//span[normalize-space()='Buckets']");
	By Enter_Bucket_name = By.xpath("//input[@placeholder=\"Search Bucket By Name\"]");
	By Select_bucket_status = By.xpath("//Select[@data-placeholder=\"Select Status\"]");
	By Select_Bucket_Sort_filter = By.xpath("//Select[@name=\"sort_by\"]");
	By Click_on_the_clear_button = By.xpath("//a[contains(text(),'Clear Filter')]");

	// In this method we are Validating the bucket page filters functionality.
	public void Pom_ProjectSetting_Bucket_2_1() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_bucket_module)));
		driver.findElement(Click_on_bucket_module).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_bucket_module.",
				"The user Click_on_bucket_module successfully");
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Bucket_name)));
		driver.findElement(Enter_Bucket_name).clear();
		driver.findElement(Enter_Bucket_name).sendKeys("Auto Bucket");
		driver.findElement(Enter_Bucket_name).sendKeys(Keys.ENTER);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Bucket_name.",
				"The user Entered_Bucket_name successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_bucket_status)));
		Select status = new Select(driver.findElement(Select_bucket_status));
		status.selectByValue("active");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_bucket_status.",
				"The user Selected_bucket_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Bucket_Sort_filter)));
		Select sort = new Select(driver.findElement(Select_Bucket_Sort_filter));
		sort.selectByValue("desc_updated_at");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_Bucket_Sort_filter.",
				"The user Selected_Bucket_Sort_filter successfully.");
		Thread.sleep(2000);

		TestBase.takeSnapShot(driver,
				"D:\\Lead Distro\\Lead Distro Automation Snaps\\Screenshot After apply Filter.png");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_clear_button)));
		driver.findElement(Click_on_the_clear_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_clear_button.",
				"The user Click_on_the_clear_button successfully.");

		Thread.sleep(2000);
		TestBase.takeSnapShot(driver,
				"D:\\Lead Distro\\Lead Distro Automation Snaps\\Screenshot After clear Filter.png");
		System.out.println("The Pom_ProjectSetting_Bucket_2_1 method has been passed successfully.");

	}

	By Click_on_action_menu = By.xpath("//a[@data-kt-menu-placement=\"bottom-end\"]");
	By Click_on_update_menu = By.xpath("//button[contains(text(),'Update')]");
	By Update_bucket_name = By.xpath("//input[@name=\"update_bucket_name\"]");
	By Click_on_save_btn = By.xpath("//button[text()='Save Changes']");
	By Click_on_discard_btn = By.xpath("//button[text()='Discard']");

	// In this method we are going to verify the Action menu update of the bucket
	// functionality.
	public void Pom_ProjectSetting_Bucket_2_2() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Bucket_name)));
		driver.findElement(Enter_Bucket_name).clear();
		driver.findElement(Enter_Bucket_name).sendKeys("Auto Bucket");
		driver.findElement(Enter_Bucket_name).sendKeys(Keys.ENTER);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Bucket_name.",
				"The user Entered_Bucket_name successfully.");
		try {
			WebElement bucket_Action_btn = driver.findElement(Click_on_action_menu);
			if (bucket_Action_btn.isDisplayed()) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_action_menu)));
				driver.findElement(Click_on_action_menu).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_action_menu.",
						"The user Clicked_on_action_menu successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_menu)));
				driver.findElement(Click_on_update_menu).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_menu.",
						"The user Clicked_on_update_menu successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Update_bucket_name)));
				driver.findElement(Update_bucket_name).clear();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can clear_bucket_name.",
						"The user cleared_bucket_name successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_btn)));
				driver.findElement(Click_on_save_btn).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_btn.",
						"The user Clicked_on_save_btn successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_discard_btn)));
				driver.findElement(Click_on_discard_btn).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_discard_btn.",
						"The user Clicked_on_discard_btn successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_action_menu)));
				driver.findElement(Click_on_action_menu).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_action_menu.",
						"The user Clicked_on_action_menu successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_menu)));
				driver.findElement(Click_on_update_menu).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_menu.",
						"The user Clicked_on_update_menu successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Update_bucket_name)));
				driver.findElement(Update_bucket_name).sendKeys("Updated Auto Bucket");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can clear_bucket_name.",
						"The user cleared_bucket_name successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_btn)));
				driver.findElement(Click_on_save_btn).click();
				String BucketUpdateSuccess = "Bucket updated successfully!";
				TestBase.verifyTextPresence(driver, BucketUpdateSuccess);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_btn.",
						"The user Clicked_on_save_btn successfully.");
			}
		} catch (NoSuchElementException e) {
			System.out.println("The entered text bucket not found hence skipped all the Code.");
		}
		System.out.println("The Pom_ProjectSetting_Bucket_2_2 method has been passed successfully.");
	}

	By Click_on_setting_option = By.xpath("//a[text()='Edit Settings']");
	By Click_on_Setting = By.xpath("//button[contains(text(),'#1')]");
	By Click_on_the_Start_time = By.xpath("//input[@id=\"start_time1\"]");
	By Click_on_AMPm=By.xpath("//span[@class=\"flatpickr-am-pm\"]");
	By Enter_Start_hour = By.xpath("//input[@class=\"numInput flatpickr-hour\"]");
	By Click_on_end_hour = By.xpath("//input[@id=\"end_time1\"]");
	By Selcet_am_end_time = By.xpath("(//span[@class=\"flatpickr-am-pm\"])[2]");
	By Enter_End_hour = By.xpath("(//input[@class=\"numInput flatpickr-hour\"])[2]");
	By Enter_interval = By.xpath("//input[@id=\"interval1\"]");
	By Select_duration = By.xpath("//select[@id=\"duration1\"]");
	By Enter_Leads_number = By.xpath("//input[@name=\"no_of_leads\"]");
	By Un_Select_days = By.xpath("//input[@name=\"days\"]");
	By Click_on_save_button = By.xpath("//button[text()='Save']");

	// In this method we are going to verify the Action menu of the Edit setting.
	public void Pom_ProjectSetting_Bucket_2_3() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Bucket_name)));
		driver.findElement(Enter_Bucket_name).clear();
		driver.findElement(Enter_Bucket_name).sendKeys("Auto Bucket");
		driver.findElement(Enter_Bucket_name).sendKeys(Keys.ENTER);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Bucket_name.",
				"The user Entered_Bucket_name successfully.");

		try {
			WebElement ele = driver.findElement(Click_on_action_menu);

			if (ele.isDisplayed()) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_action_menu)));
				driver.findElement(Click_on_action_menu).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_action_menu.",
						"The user Clicked_on_action_menu successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_setting_option)));
				driver.findElement(Click_on_setting_option).click();
				String settipage = "Update Bucket settings will effect the under processing files.";
				TestBase.verifyTextPresence(driver, settipage);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_setting_option.",
						"The user Clicked_on_setting_option successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Setting)));
				driver.findElement(Click_on_Setting).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Setting.",
						"The user Clicked_on_Setting successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_Start_time)));
				driver.findElement(Click_on_the_Start_time).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_Start_time.",
						"The user Clicked_on_the_Start_time successfully.");
				
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_AMPm)));
				String amm = driver.findElement(Click_on_AMPm).getText();
				if (!"AM".equalsIgnoreCase(amm)) {
					driver.findElement(Click_on_AMPm).click();
				}
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_AMPm.",
						"The user Clicked_on_AMPm successfully.");
						
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Start_hour)));
				driver.findElement(Enter_Start_hour).clear();
				driver.findElement(Enter_Start_hour).sendKeys("09");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Start_hour.",
						"The user Entered_Start_hour successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_end_hour)));
				driver.findElement(Click_on_end_hour).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_end_hour.",
						"The user Click_on_end_hour successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Selcet_am_end_time)));
				String text = driver.findElement(Selcet_am_end_time).getText();
				if (!"PM".equalsIgnoreCase(text)) {
					driver.findElement(Selcet_am_end_time).click();
				}
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Selcet_am_end_time.",
						"The user Selceted_am_end_time successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_End_hour)));
				driver.findElement(Enter_End_hour).clear();
				driver.findElement(Enter_End_hour).sendKeys("08");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_End_hour.",
						"The user Enter_End_hour successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
				driver.findElement(Click_on_save_button).click();
				String Successs = "This time and days conflict with another setting. Please select another time slot!";
				wait.until(ExpectedConditions.alertIsPresent());
				String actualAlertTextttt1 = driver.switchTo().alert().getText();
				TestBase.toast(actualAlertTextttt1, Successs);
				driver.switchTo().alert().accept();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
						"The user Clicked_on_save_button successfully.");
				

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_Start_time)));
				driver.findElement(Click_on_the_Start_time).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_Start_time.",
						"The user Click_on_the_Start_time successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_AMPm)));
				String textt = driver.findElement(Click_on_AMPm).getText();
				if (!"AM".equalsIgnoreCase(textt)) {
					driver.findElement(Click_on_AMPm).click();
				}
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_AMPm.",
						"The user Click_on_AMPm successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Start_hour)));
				driver.findElement(Enter_Start_hour).clear();
				driver.findElement(Enter_Start_hour).sendKeys("10");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Start_hour.",
						"The user Entered_Start_hour successfully.");

				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_end_hour)));
				driver.findElement(Click_on_end_hour).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_end_hour.",
						"The user Click_on_end_hour successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Selcet_am_end_time)));
				if (!"PM".equalsIgnoreCase(text)) {
					driver.findElement(Selcet_am_end_time).click();
				}
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Selcet_am_end_time.",
						"The user Selceted_am_end_time successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_End_hour)));
				driver.findElement(Enter_End_hour).clear();
				driver.findElement(Enter_End_hour).sendKeys("01");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_End_hour.",
						"The user Enter_End_hour successfully.");
				
				
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_interval)));
				driver.findElement(Enter_interval).clear();
				driver.findElement(Enter_interval).sendKeys("01");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_interval.",
						"The user Entered_interval successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_duration)));
				Select duration = new Select(driver.findElement(Select_duration));
				duration.selectByValue("hours");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_duration.",
						"The user Selected_duration successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Leads_number)));
				driver.findElement(Enter_Leads_number).clear();
				driver.findElement(Enter_Leads_number).sendKeys("5999");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Leads_number.",
						"The user Entered_Leads_number successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
				driver.findElement(Click_on_save_button).click();
				String Lead_validation = "Maximum number of leads for interval of 1 hours should be 1800.";
				wait.until(ExpectedConditions.alertIsPresent());
				String actualAlertTextt = driver.switchTo().alert().getText();
				TestBase.toast(actualAlertTextt, Lead_validation);
				driver.switchTo().alert().accept();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
						"The user Clicked_on_save_button successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Leads_number)));
				driver.findElement(Enter_Leads_number).clear();
				driver.findElement(Enter_Leads_number).sendKeys("50");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Leads_number.",
						"The user Entered_Leads_number successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Un_Select_days)));
				List<WebElement> day = driver.findElements(Un_Select_days);
				for (int i = 0; i < 7; i++) {
					day.get(i).click();
				}
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Un_Select_days.",
						"The user Un_Select_days successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
				driver.findElement(Click_on_save_button).click();
				String DaysValidation = "Please select at-least one weekday.";
				wait.until(ExpectedConditions.alertIsPresent());
				String actualAlertTexttt = driver.switchTo().alert().getText();
				TestBase.toast(actualAlertTexttt, DaysValidation);
				driver.switchTo().alert().accept();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
						"The user Clicked_on_save_button successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Un_Select_days)));
				for (int i = 0; i < 7; i++) {
					day.get(i).click();
				}
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Un-Select_days.",
						"The user Un-Selected_days successfully");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
				driver.findElement(Click_on_save_button).click();
				String Success = "Bucket settings updated successfully!";
				wait.until(ExpectedConditions.alertIsPresent());
				String actualAlertTextttt = driver.switchTo().alert().getText();
				TestBase.toast(actualAlertTextttt, Success);
				driver.switchTo().alert().accept();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
						"The user Clicked_on_save_button successfully.");
			}
		} catch (NoSuchElementException e) {
			System.out.println("The entered text bucket not found hence skipped all the Code.");
		}

		System.out.println("The Pom_ProjectSetting_Bucket_2_3 method has been passed successfully.");
	}
}
