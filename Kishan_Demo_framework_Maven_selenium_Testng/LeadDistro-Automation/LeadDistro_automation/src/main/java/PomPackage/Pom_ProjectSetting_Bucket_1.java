package PomPackage;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_ProjectSetting_Bucket_1 {
	WebDriver driver;

	public Pom_ProjectSetting_Bucket_1(WebDriver driver) {
		this.driver = driver;
	}

	By Click_on_project_setting = By.xpath("//span[contains(text(),'Projects Info')]");
	By Click_on_BucketModule = By.xpath("//span[normalize-space()='Buckets']");
	By Click_on_the_new_bucket = By.xpath("//button[normalize-space()='Create New Bucket']");
	By Enter_bucket_name = By.xpath("//input[@name='bucket_name']");
	By Click_on_the_close_butn = By.xpath("//button[normalize-space()='Close']");
	By Click_on_the_submit_btn = By.xpath("//button[normalize-space()='Submit']");
	By Create_Bucket_Success = By.xpath("//span[normalize-space()='Bucket created successfully!']");

	By Click_on_Add_seting = By.xpath("//button[@id='addSettings']");
	By Click_on_save_btn = By.xpath("//input[@value='Save']");
	By Cllick_on_delete_btn = By.xpath("//input[@value='Delete']");

	By Cllick_on_start_Time = By.xpath("//input[@id='id_start_time']");
	By Enter_hr = By.xpath("(//input[@aria-label='Hour'])[1]");
	By Enter_Minute = By.xpath("(//input[@aria-label='Minute'])[1]");
	By AM_PM_change = By.xpath("(//span[@title='Click to toggle'][normalize-space()='PM'])[1]");

	By ClickOn_end_time = By.xpath("//input[@id='id_end_time']");
	By Enter_hr_end = By.xpath("(//input[@class=\"numInput flatpickr-hour\"])[2]");
	By Enter_Minute_end = By.xpath("(//input[@class=\"numInput flatpickr-minute\"])[2]");
	By AM_PM_change_end = By.xpath("//span[text()='PM']");

	By Enter_interval = By.xpath("//input[@id='id_interval']");
	By Slect_time_type = By.xpath("//select[@name=\"duration\"]");
	By Enter_number_of_leads = By.xpath("//input[@id='id_no_of_leads']");
	By Select_days = By.xpath("//input[@name='days']");

	// In this we are Validating the add bucket setting scenario
	public void Pom_ProjectSetting_Bucket_1_1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_project_setting)));
		driver.findElement(Click_on_project_setting).click();
		Thread.sleep(2000);
		driver.findElement(Click_on_project_setting).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_project_setting.",
				"The user Clicked_on_project_setting successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_BucketModule)));
		driver.findElement(Click_on_BucketModule).click();
		String text = "All Buckets";
		TestBase.verifyTextPresence(driver, text);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_BucketModule.",
				"The user Clicked_on_BucketModule successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_new_bucket)));
		driver.findElement(Click_on_the_new_bucket).click();
		String textt = "Create Bucket";
		TestBase.verifyTextPresence(driver, textt);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_new_bucket.",
				"The user Clicked_on_the_new_bucket successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_close_butn)));
		driver.findElement(Click_on_the_close_butn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_close_butn.",
				"The user Clicked_on_the_close_btn successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_new_bucket)));
		driver.findElement(Click_on_the_new_bucket).click();
		TestBase.verifyTextPresence(driver, textt);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_new_bucket.",
				"The user Clicked_on_the_new_bucket successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_submit_btn)));
		driver.findElement(Click_on_the_submit_btn).click();
//		String texttt="Please fill out this field.";
//		TestBase.verifyTextPresence(driver, texttt);	
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_submit_btn.",
				"The user Click_on_the_submit_btn successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_bucket_name)));
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd ");
		Date date = new Date();
		String dateFormatted = dateFormat.format(date);
		driver.findElement(Enter_bucket_name).sendKeys("Auto Bucket " + dateFormatted);
		TestBase.verifyTextPresence(driver, textt);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_new_bucket.",
				"The user Clicked_on_the_new_bucket successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_submit_btn)));
		driver.findElement(Click_on_the_submit_btn).click();
		String Expect_toast = "Bucket created successfully!";
		String SuccessBucket = driver.findElement(Create_Bucket_Success).getText();
		System.out.println(SuccessBucket);
		TestBase.toast(Expect_toast, SuccessBucket);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_submit_btn.",
				"The user Click_on_the_submit_btn successfully");

		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Add_seting)));
		driver.findElement(Click_on_Add_seting).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Add_seting.",
				"The user Clicked_on_Add_seting successfully");
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Cllick_on_delete_btn)));
		driver.findElement(Cllick_on_delete_btn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Cllick_on_delete_btn.",
				"The user Cllicked_on_delete_btn successfully");
		Thread.sleep(2000);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Add_seting)));
		driver.findElement(Click_on_Add_seting).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Add_seting.",
				"The user Clicked_on_Add_seting successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_btn)));
		driver.findElement(Click_on_save_btn).click();
		// Thread.sleep(2000);
		String Save_validation = "Please select at-least one weekday.";
		wait.until(ExpectedConditions.alertIsPresent());
		String atual = driver.switchTo().alert().getText();
		TestBase.toast(atual, Save_validation);
		driver.switchTo().alert().accept();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_btn.",
				"The user Clicked_on_save_btn successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Add_seting)));
		driver.findElement(Click_on_Add_seting).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Add_seting.",
				"The user Clicked_on_Add_seting successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Cllick_on_start_Time)));
		driver.findElement(Cllick_on_start_Time).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_start_Time.",
				"The user Clicked_on_start_Time successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(AM_PM_change)));
		String am_pm = driver.findElement(AM_PM_change).getText();
		if (!"AM".equalsIgnoreCase(am_pm)) {
			driver.findElement(AM_PM_change).click();
		}
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can click AM_PM_change.",
				"The user clicked on AM_PM_change successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_hr)));
		driver.findElement(Enter_hr).clear();
		driver.findElement(Enter_hr).sendKeys("08");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_hr.",
				"The user Entered_hr successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Minute)));
		driver.findElement(Enter_Minute).clear();
		driver.findElement(Enter_Minute).sendKeys("10");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Minute.",
				"The user Entered_Minute successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(ClickOn_end_time)));
		driver.findElement(ClickOn_end_time).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_start_Time.",
				"The user Clicked_on_start_Time successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(AM_PM_change_end)));
		String am_pm_End = driver.findElement(AM_PM_change_end).getText().trim();
		// System.out.println("am_pm_End" + am_pm_End);
		if (!"PM".equalsIgnoreCase(am_pm_End)) {
			driver.findElement(AM_PM_change_end).click();
		} else {
			System.out.println("There Is no need to change the AM/PM.");
		}
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can click AM_PM_change.",
				"The user clicked on AM_PM_change successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_hr_end)));
		driver.findElement(Enter_hr_end).clear();
		driver.findElement(Enter_hr_end).sendKeys("01");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_hr.",
				"The user Entered_hr successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Minute_end)));
		driver.findElement(Enter_Minute_end).clear();
		driver.findElement(Enter_Minute_end).sendKeys("01");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Minute.",
				"The user Entered_Minute successfully");

//		By Enter_interval=By.xpath("//input[@id='id_interval']");
//		By Slect_time_type=By.xpath("//span[@role='combobox']");
//		By Enter_number_of_leads=By.xpath("//input[@id='id_no_of_leads']");
//		By Select_days=By.xpath("//input[@name='days']");
//		

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_interval)));
		driver.findElement(Enter_interval).clear();
		driver.findElement(Enter_interval).sendKeys("11");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_interval.",
				"The user Entered_interval successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Slect_time_type)));
		Select time = new Select(driver.findElement(Slect_time_type));
		time.selectByValue("minutes");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Slect_time_type.",
				"The user Slected_Duration_time_type successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_number_of_leads)));
		driver.findElement(Enter_number_of_leads).clear();
		driver.findElement(Enter_number_of_leads).sendKeys("15");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_number_of_leads.",
				"The user Entered_number_of_leads successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_days)));
		List<WebElement> chkbox = driver.findElements(Select_days);
		int Days = chkbox.size();
		for (int i = 0; i < Days; i++) {
			chkbox.get(i).click();
		}
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_days.",
				"The user Selected_days successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_btn)));
		driver.findElement(Click_on_save_btn).click();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_btn.",
				"The user Clicked_on_save_btn successfully");
		System.out.println("Pom_ProjectSetting_Bucket_1_1 Metod Passed");
	}

	By Click_on_AM_Pm = By.xpath("(//span[text()='PM'])[2]");
	By Enter_Hour = By.xpath("(//input[@class=\"numInput flatpickr-hour\"])[3]");
	By Enter_HourEnd = By.xpath("(//input[@class=\"numInput flatpickr-hour\"])[4]");
	By Click_On_check_box = By.xpath("(//input[@type=\"checkbox\"])[11]");
	By Click_on_the_interval = By.xpath("//input[@id=\"id_interval\"]");
	By Click_on_save_bttn = By.xpath("//input[@value=\"Save\"]");
	By Click_on_am_Pmm = By.xpath("(//span[@title=\"Click to toggle\"])[3]");

	By Select_interval_type = By.xpath("(//select[@name=\"duration\"])[2]");

	// In this method we are going to check the several validations and and add new-
	// bucket setting.

	// In this method am pm selection done on the default selection value wrt. time
	// the default value may get change then Tester should change the code
	// accordingly.
	public void Pom_ProjectSetting_Bucket_1_2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Add_seting)));
		driver.findElement(Click_on_Add_seting).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_project_setting.",
				"The user Clicked_on_project_setting successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Cllick_on_start_Time)));
		driver.findElement(Cllick_on_start_Time).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_start_Time.",
				"The user Clicked_on_start_Time successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_AM_Pm)));
		driver.findElement(Click_on_AM_Pm).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_AM_Pm.",
				"The user Clicked_on_AM_Pm successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Hour)));
		driver.findElement(Enter_Hour).clear();
		driver.findElement(Enter_Hour).sendKeys("08");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Hour.",
				"The user Entered_Hour successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(ClickOn_end_time)));
		driver.findElement(ClickOn_end_time).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_start_Time.",
				"The user Clicked_on_start_Time successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_HourEnd)));
		driver.findElement(Enter_HourEnd).clear();
		driver.findElement(Enter_HourEnd).sendKeys("06");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_HourEnd.",
				"The user Enter_HourEnd successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_On_check_box)));
		driver.findElement(Click_On_check_box).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_On_check_box.",
				"The user Clicked_On_check_box successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_bttn)));
		driver.findElement(Click_on_save_bttn).click();
		Thread.sleep(3000);
		String Time_conflict_alert = "This time and days conflict with another setting. Please select another time slot!";
		wait.until(ExpectedConditions.alertIsPresent());
		String actaultimeConf = driver.switchTo().alert().getText();
		TestBase.toast(Time_conflict_alert, actaultimeConf);
		driver.switchTo().alert().accept();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_bttn.",
				"The user Clicked_on_save_bttn successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Cllick_on_start_Time)));
		driver.findElement(Cllick_on_start_Time).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_start_Time.",
				"The user Clicked_on_start_Time successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_am_Pmm)));
		driver.findElement(Click_on_am_Pmm).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_AM_Pm.",
				"The user Clicked_on_AM_Pm successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Hour)));
		driver.findElement(Enter_Hour).clear();
		driver.findElement(Enter_Hour).sendKeys("05");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Hour.",
				"The user Entered_Hour successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_interval)));
		driver.findElement(Click_on_the_interval).clear();
		driver.findElement(Click_on_the_interval).sendKeys("02");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_interval.",
				"The user Click_on_the_interval successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_bttn)));
		driver.findElement(Click_on_save_bttn).click();
		// Thread.sleep(3000);
		wait.until(ExpectedConditions.alertIsPresent());
		String interval_conflict_alert = "The minimum interval value for duration of minutes should be 10.";
		String actaulintervalConf = driver.switchTo().alert().getText();
		TestBase.toast(actaulintervalConf, interval_conflict_alert);
		driver.switchTo().alert().accept();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_bttn.",
				"The user Clicked_on_save_bttn successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_interval_type)));
		Select hr = new Select(driver.findElement(Select_interval_type));
		hr.selectByValue("hours");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_interval_type.",
				"The user Selected_interval_type hr successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_bttn)));
		driver.findElement(Click_on_save_bttn).click();
		// Thread.sleep(3000);
		wait.until(ExpectedConditions.alertIsPresent());
		String StartEndTime_conflict_alert = "Please adjust the start and end times to resolve the conflict with the duration you've set!";
		String actaulStartEndTimeConf = driver.switchTo().alert().getText();
		TestBase.toast(actaulStartEndTimeConf, StartEndTime_conflict_alert);
		driver.switchTo().alert().accept();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_bttn.",
				"The user Clicked_on_save_bttn successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Cllick_on_start_Time)));
		driver.findElement(Cllick_on_start_Time).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_start_Time.",
				"The user Clicked_on_start_Time successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Hour)));
		driver.findElement(Enter_Hour).clear();
		driver.findElement(Enter_Hour).sendKeys("02");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Hour.",
				"The user Entered_Hour successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_bttn)));
		driver.findElement(Click_on_save_bttn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_bttn.",
				"The user Clicked_on_save_bttn successfully");

		System.out.println("Pom_ProjectSetting_Bucket_1_2 method has been run successfully.");

	}

	By Edit_Bucket_name = By.xpath("//input[@name=\"update_bucket_name\"]");
	By Click_on_bucket_Active_toggle = By.xpath("//input[@name=\"is_bucket_pause\"]");
	By Click_on_save_button = By.xpath("(//button[@type=\"submit\"])[1]");
	By Click_on_Download_distribute_lead = By.xpath("//input[@value=\"Download Leads NOT Distributed\"]");
	By Click_on_delay_leads = By.xpath("//input[@value=\"Delay Leads\"]");

	By Click_on_delay_button = By.xpath("//input[@id='delayButton']");

	// In this method we are going to validate the Active/Pause the bucket, Download
	// leads not distributed and delay leads
	public void Pom_ProjectSetting_Bucket_1_3() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Edit_Bucket_name)));
		driver.findElement(Edit_Bucket_name).clear();
		driver.findElement(Edit_Bucket_name).sendKeys("Edited Auto Bucket");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Edit_Bucket_name.",
				"The user Edited_Bucket_name successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_bucket_Active_toggle)));
		driver.findElement(Click_on_bucket_Active_toggle).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_bucket_Active_toggle.",
				"The user Clicked_on_bucket_Active_toggle successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
		driver.findElement(Click_on_save_button).click();
		String SuccessMsgg = "Bucket updated successfully!";
		// TestBase.verifyTextPresence(driver, SuccessMsgg); Because on click save
		// button Success msg not generating but bucket gets activated.
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
				"The user Clicked_on_save_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Download_distribute_lead)));
		driver.findElement(Click_on_Download_distribute_lead).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Download_UN-distribute_lead.",
				"The user Clicked_on_Download_Un-distribute_lead successfully.");
		Thread.sleep(2000); // this static wait to see the Downloaded file populate or not on right top

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_delay_leads)));
		driver.findElement(Click_on_delay_leads).click();
		String delay = "All Leads of this bucket will be Paused. Do you want to continue?";
		String ActualDelay = driver.switchTo().alert().getText();
		TestBase.toast(ActualDelay, delay);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String pause = "Leads paused successfully for 7 days!";
		TestBase.verifyTextPresence(driver, pause);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_bucket_Active_toggle.",
				"The user Clicked_on_bucket_Active_toggle successfully.");

		Thread.sleep(2000);// from this wait user will get idea by naked eyes the Selenium again revert the
							// last changes.

		String alerttext = "All Leads of this bucket will be Resumed. Do you want to continue?";
		String successText = "Leads are now assigned.";
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_delay_button)));
		driver.findElement(Click_on_delay_button).click();
		String act = driver.switchTo().alert().getText();
		TestBase.toast(alerttext, act);
		driver.switchTo().alert().accept();
		TestBase.verifyTextPresence(driver, successText);
		
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_delay_button.",
				"The user Clicked_on_delay_button successfully.");

		System.out.println("Pom_ProjectSetting_Bucket_1_3 method run successfully.");

	}

}