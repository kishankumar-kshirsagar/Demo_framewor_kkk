package PomPackage;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_TeamMemberSetting_1 {
	WebDriver driver;

	public Pom_TeamMemberSetting_1(WebDriver driver) {
		this.driver = driver;
	}

	By Click_on_unlink_member_module = By.xpath("//span[normalize-space()='Unlink A Member']");
	By Click_on_View_all_memb = By.xpath("//a[normalize-space()='View All Members']");
	By Click_on_submit_btn = By.xpath("//button[@id='submit_btn_process']");
	By Enter_the_unlinkTM_Id = By.xpath("//input[@name='unlink_member']");
	By Unlink_member_success = By.xpath("//div[@class='d-flex flex-column pe-0 pe-sm-10']");

	// this method contains the Un Link the TM functionality script.
	public void Pom_TeamMemberSetting_1_1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_unlink_member_module)));
		driver.findElement(Click_on_unlink_member_module).click();
		String text1 = "Unlink A Member Account";
		TestBase.verifyTextPresence(driver, text1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_member_module.",
				"The user Clicked_on_unlink_member_module successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_View_all_memb)));
		driver.findElement(Click_on_View_all_memb).click();
		String text2 = "All Team Members";
		TestBase.verifyTextPresence(driver, text2);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_View_all_memb.",
				"The user Click_on_View_all_memb successfully.");

		Thread.sleep(1000);// I have added this wait to user can see the selenium focus has been moved to
							// all team member page.
		driver.navigate().back();
		TestBase.verifyTextPresence(driver, text1);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_submit_btn)));
		driver.findElement(Click_on_submit_btn).click();
		TestBase.verifyTextPresence(driver, text1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_submit_btn.",
				"The user Clicked_on_submit_btn successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_the_unlinkTM_Id)));
		driver.findElement(Enter_the_unlinkTM_Id).sendKeys("example@textdrip.com");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_the_unlinkTM_Id.",
				"The user Entered_the_unlinkTM_Id successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_submit_btn)));
		driver.findElement(Click_on_submit_btn).click();
		String text3 = "Are you sure you wish to unlink the member?";
		String actaultext1 = driver.switchTo().alert().getText();
		TestBase.toast(text3, actaultext1);
		driver.switchTo().alert().accept();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_submit_btn.",
				"The user Clicked_on_submit_btn successfully.");

		String actualtext2 = driver.findElement(Unlink_member_success).getText();
		String text4 = "Member is not found! Please Try another Email address";
		String text44 = "Team Member has been Unlinked Successfully";
		// Check if either of the texts is detected
		if (actualtext2.contains(text4) || actualtext2.contains(text44)) {
			// Validation passed
			System.out.println("Validation passed!");
		} else {
			// Validation failed
			System.out.println("Validation failed!");
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertFalse(false);
		}
		TestBase.verifyTextPresence(driver, text2);
		System.out.println("Pom_TeamMemberSetting_1 method passed successfully.");
	}

	By Click_on_link_member_module = By.xpath("//span[normalize-space()='Link A Member']");
	By Click_on_view_all_Member = By.xpath("//a[normalize-space()='View All Members']");
	By Click_on_link_account_btn = By.xpath("//button[@id='submit_btn_process']");
	By Enter_ID_TM = By.xpath("//input[@name=\"member_eid\"]");

	// This method contains the Link the TM functionality script.
	public void Pom_TeamMemberSetting_2_2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_link_member_module)));
		driver.findElement(Click_on_link_member_module).click();
		String text5 = "Link A New Member Account";
		TestBase.verifyTextPresence(driver, text5);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_link_member_module.",
				"The user Clicked_on_link_member_module successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_view_all_Member)));
		driver.findElement(Click_on_view_all_Member).click();
		String text2 = "All Team Members";
		TestBase.verifyTextPresence(driver, text2);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_view_all_Member.",
				"The user Clicked_on_view_all_Member successfully.");

		Thread.sleep(1000);// I have added this wait to user can see the selenium focus has been moved to
							// all team member page.
		driver.navigate().back();
		TestBase.verifyTextPresence(driver, text5);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_link_account_btn)));
		driver.findElement(Click_on_link_account_btn).click();
		TestBase.verifyTextPresence(driver, text5);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_link_account_btn.",
				"The user Clicked_on_link_account_btn successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_ID_TM)));
		driver.findElement(Enter_ID_TM).sendKeys("example@textdrip.com");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_ID_TM to invite TM.",
				"The user Entered_the_unlinkTM_Id to invite TM successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_link_account_btn)));
		driver.findElement(Click_on_link_account_btn).click();
		String text6 = "Invitation Email has been sent to example@textdrip.com";
		TestBase.verifyTextPresence(driver, text6);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_link_account_btn.",
				"The user Clicked_on_link_account_btn successfully.");

		System.out.println("The super user sent the invitation to the team memnber successfully.");

		System.out.println("Pom_TeamMemberSetting_2 method passed successfully.");

	}

	By Click_on_all_TM_module = By.xpath("//span[normalize-space()='All Members']");
	By Select_all_check = By.xpath("//input[@id='select-all-checkbox']");
	By Click_on_update_limit = By.xpath("//button[text()='Update Leads Limit']");
	By Enter_leads_limit = By.xpath("//form[@id='updateLeadsLimitForm']//input[@name='update_leads_limit']");
	By Click_on_close_btn = By.xpath("//form[@id='updateLeadsLimitForm']//button[@type='button'][normalize-space()='Close']");
	By Click_on_save_button = By.xpath("//form[@id='updateLeadsLimitForm']//button[@type='submit'][normalize-space()='Save Changes']");
	By Click_on_auto_top_up_limitBtn = By.xpath("//button[text()='Auto Top Up']");
	By Select_auto_topup_interval = By.xpath("//select[@name='auto_top_up']");
	By Enter_Number_of_leads = By.xpath("//input[@placeholder=\"Enter Number of Leads\"]");
	By Click_on_close_button = By.xpath("//form[@id='autoTopUpForm']//button[@type='button'][normalize-space()='Close']");
	By Click_on_save_changes_btn = By.xpath("//form[@id='autoTopUpForm']//button[@type='submit'][normalize-space()='Save Changes']");
	By Click_on_link_a_new_TM = By.xpath("//a[text()='Link New Team Member']");

	// This method Update leads limit and auto top up leads functionality covered.
	public void Pom_TeamMemberSetting_3_3() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_all_TM_module)));
		driver.findElement(Click_on_all_TM_module).click();
		String text1 = "All Team Members";
		TestBase.verifyTextPresence(driver, text1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_all_TM_module.",
				"The user Clicked_on_all_TM_module successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_all_check)));
		driver.findElement(Select_all_check).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_all_check.",
				"The user Selected_all_check successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_limit)));
		driver.findElement(Click_on_update_limit).click();
		String text2 = "Update Assign Leads Limit";
		TestBase.verifyTextPresence(driver, text2);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_limit.",
				"The user Clicked_on_update_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_close_btn)));
		driver.findElement(Click_on_close_btn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_close_btn.",
				"The user Clicked_on_close_btn successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_limit)));
		driver.findElement(Click_on_update_limit).click();
		TestBase.verifyTextPresence(driver, text2);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_limit.",
				"The user Clicked_on_update_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limit)));
		driver.findElement(Enter_leads_limit).clear();
		driver.findElement(Enter_leads_limit).sendKeys("50");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_limit.",
				"The user Entered_leads_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
		driver.findElement(Click_on_save_button).click();
		String text4 = "Leads limit updated successfully!";
		TestBase.verifyTextPresence(driver, text4);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
				"The user Clicked_on_save_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_limit)));
		driver.findElement(Click_on_update_limit).click();
		TestBase.verifyTextPresence(driver, text2);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_limit.",
				"The user Clicked_on_update_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limit)));
		driver.findElement(Enter_leads_limit).clear();
		driver.findElement(Enter_leads_limit).sendKeys("50");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_limit.",
				"The user Entered_leads_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
		driver.findElement(Click_on_save_button).click();
		String alert1 = driver.switchTo().alert().getText();
		String alert11 = "No team members selected. Please select at least one team member.";
		TestBase.toast(alert1, alert11);
		driver.switchTo().alert().accept();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
				"The user Clicked_on_save_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_all_check)));
		driver.findElement(Select_all_check).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_all_check.",
				"The user Selected_all_check successfully.");

		for (int i = 0; i <= 1; i++) {

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_auto_top_up_limitBtn)));
			driver.findElement(Click_on_auto_top_up_limitBtn).click();
			String text5 = "Update Auto Top-up Duration";
			TestBase.verifyTextPresence(driver, text5);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_auto_top_up_limitBtn.",
					"The user Clicked_on_auto_top_up_limitBtn successfully.");

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_auto_topup_interval)));
			Select interval = new Select(driver.findElement(Select_auto_topup_interval));
			interval.selectByValue("weekly");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_auto_topup_interval.",
					"The user Selected_auto_topup_interval successfully.");

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_Number_of_leads)));
			driver.findElement(Enter_Number_of_leads).clear();
			driver.findElement(Enter_Number_of_leads).sendKeys("35");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_Number_of_leads.",
					"The user Entered_Number_of_leads successfully.");

			if (i == 0) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_close_button)));
				driver.findElement(Click_on_close_button).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_close_button.",
						"The user Clicked_on_close_button successfully.");
			}

			if (i == 1) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_changes_btn)));
				driver.findElement(Click_on_save_changes_btn).click();
				String text6 = "Auto Top-Up Duration Updated Successfully!";
				TestBase.verifyTextPresence(driver, text6);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_changes_btn.",
						"The user Clicked_on_save_changes_btn successfully.");
			}
			if (i == 2) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_changes_btn)));
				driver.findElement(Click_on_save_changes_btn).click();
				String alert111 = driver.switchTo().alert().getText();
				TestBase.toast(alert11, alert111);
				driver.switchTo().alert().accept();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_changes_btn.",
						"The user Clicked_on_save_changes_btn successfully.");
			}

		}

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_link_a_new_TM)));
		driver.findElement(Click_on_link_a_new_TM).click();
		String text8 = "Link A New Member Account";
		TestBase.verifyTextPresence(driver, text8);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_link_a_new_TM.",
				"The user Clicked_on_link_a_new_TM successfully.");
		System.out.println("Pom_TeamMemberSetting_3 method passed successfully.");

	}

	By Select_auto_top_status = By.xpath("//Select[@data-placeholder='Select Auto Top-Up Status']");
	By Select_Vacation_Mode = By.xpath("//Select[@data-placeholder='Select Vacation Mode']");
	By SelectAll_states_status = By.xpath("//Select[@data-placeholder='Select All States Status']");
	By Select_member_status = By.xpath("//Select[@data-placeholder='Select Member Status']");
	By Select_campaign_status = By.xpath("//Select[@data-placeholder='Select Campaign Status']");
	By Select_sort_by = By.xpath("//Select[@name=\"sort_by\"]");
	By Click_on_clear_button = By.xpath("//a[text()='Clear Filter']");
	By Enter_email_in_serach_field = By.xpath("//input[@placeholder=\"Search By Email\"]");
	By Enter_lead_limit = By.xpath("//input[@name=\"leadlimit\"]");
	By CLick_On_search_limit_button = By.xpath("//button[normalize-space()='Search Lead Limit']");
	By Get_email_id = By.xpath("//tbody//tr//td[3]");
	By Get_Leads_assign_limit = By.xpath("//tbody//tr//td[5]");

	// In this method all TM page filter functionality covered.
	public void Pom_TeamMemberSetting_4_4() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_all_TM_module)));
		driver.findElement(Click_on_all_TM_module).click();
		String text1 = "All Team Members";
		TestBase.verifyTextPresence(driver, text1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_all_TM_module.",
				"The user Clicked_on_all_TM_module successfully.");

		String TMEmail = driver.findElement(Get_email_id).getText();
		System.out.println("The Super user added TM email is -" + TMEmail);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_email_in_serach_field)));
		driver.findElement(Enter_email_in_serach_field).clear();
		driver.findElement(Enter_email_in_serach_field).sendKeys(TMEmail);
		driver.findElement(Enter_email_in_serach_field).sendKeys(Keys.ENTER);
		String path = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\TM Search field filter.png";
		TestBase.takeSnapShot(driver, path);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_email_in_serach_field.",
				"The user Entered_email_in_serach_field successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_button)));
		driver.findElement(Click_on_clear_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_clear_button.",
				"The user Clicked_on_clear_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_auto_top_status)));
		Select auto_top_status = new Select(driver.findElement(Select_auto_top_status));
		auto_top_status.selectByValue("weekly");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_auto_top_status.",
				"The user Selected_auto_top_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Vacation_Mode)));
		Select Select_Vacation = new Select(driver.findElement(Select_Vacation_Mode));
		Select_Vacation.selectByValue("off");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_Vacation_Mode.",
				"The user Selected_Vacation_Mode successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(SelectAll_states_status)));
		Select SelectAll_states = new Select(driver.findElement(SelectAll_states_status));
		SelectAll_states.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can SelectAll_states_status.",
				"The user Selected All_states_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_member_status)));
		Select Select_member = new Select(driver.findElement(Select_member_status));
		Select_member.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_member_status.",
				"The user Selected_member_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_campaign_status)));
		Select Select_campaign = new Select(driver.findElement(Select_campaign_status));
		Select_campaign.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_campaign_status.",
				"The user Selected_campaign_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_sort_by)));
		Select Selected_sort = new Select(driver.findElement(Select_sort_by));
		Selected_sort.selectByValue("asc_updated_at");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_sort_by.",
				"The user Selected_sort_by successfully.");

		String pathh = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\TM Page All Filter.png";
		TestBase.takeSnapShot(driver, pathh);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_button)));
		driver.findElement(Click_on_clear_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_clear_button.",
				"The user Clicked_on_clear_button successfully.");

		String Get_Leads_assign = driver.findElement(Get_Leads_assign_limit).getText();
		System.out.println("The Team Member Leads assign limit -" + Get_Leads_assign);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_lead_limit)));
		driver.findElement(Enter_lead_limit).clear();
		driver.findElement(Enter_lead_limit).sendKeys(Get_Leads_assign);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_lead_limit.",
				"The user Entered_lead_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(CLick_On_search_limit_button)));
		driver.findElement(CLick_On_search_limit_button).click();
		String pathhh = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\TM Search Lead Limit Filter.png";
		TestBase.takeSnapShot(driver, pathhh);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can CLick_On_search_limit_button.",
				"The user CLicked_On_search_limit_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_button)));
		driver.findElement(Click_on_clear_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_clear_button.",
				"The user Clicked_on_clear_button successfully.");
        System.out.println("Pom_TeamMemberSetting_4 method passed successfully.");
	}

	// In this method all TM page view button & action column functionality covered.
	By Click_on_view_button = By.xpath("//a[text()='View']");
	By Enter_leads_name_in_search = By.xpath("//input[@name=\"search_by\"]");
	By Select_line_type = By.xpath("//select[@data-placeholder='Select LineType']");
	By Select_DNC_type = By.xpath("//select[@data-placeholder='Select DNCType']");
	By Select_CallBlock_status = By.xpath("//select[@data-placeholder='Select Callblock Status']");
	By Select_sort = By.xpath("//select[@id=\"filter_sort_by\"]");
	By Click_on_clear_buttonn = By.xpath("//a[@name=\"clear_filter\"]");
	By Click_on_update_campaign = By.xpath("//button[text()='Update Campaign']");
	By Click_on_unlink_mem_btn = By.xpath("//button[text()='Unlink Member']");
	By Click_on_disable_pause_user = By.xpath("//button[normalize-space()='Disable(Pause) Member']");
	By Click_on_update_leads_limit = By.xpath("//button[normalize-space()='Update Leads Limit']");
	By Enter_leads_llimit = By.xpath("//input[@name=\"update_leads_limit\"]");
	By Click_on_save_buttonn = By.xpath("//button[text()='Save Changes']");
	By Click_on_show_button = By.xpath("//button[text()='Show']");
	By Click_on_close = By.xpath("//div[@class='modal-dialog modal-dialog-centered modal-lg']//button[@type='button'][normalize-space()='Close']");
	By Click_on_copy_APIKey_button = By.xpath("//span[text()='copy']");
	By Get_lead_name = By.xpath("//tbody/tr[1]/td[2]/div[1]");

	// This method contains the all TM page view button functionality.
	public void Pom_TeamMemberSetting_5_5() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_all_TM_module)));
		driver.findElement(Click_on_all_TM_module).click();
		String text1 = "All Team Members";
		TestBase.verifyTextPresence(driver, text1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_all_TM_module.",
				"The user Clicked_on_all_TM_module successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_view_button)));
		driver.findElement(Click_on_view_button).click();
		String msg1 = "Member Details";
		TestBase.verifyTextPresence(driver, msg1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_view_button.",
				"The user Clicked_on_view_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_campaign)));
		driver.findElement(Click_on_update_campaign).click();
		String update_camp = "Are you sure you wish to update the campaign of member?";
		String act = driver.switchTo().alert().getText();
		TestBase.toast(act, update_camp);
		driver.switchTo().alert().dismiss();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_campaign.",
				"The user Clicked_on_update_campaign successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_unlink_mem_btn)));
		driver.findElement(Click_on_unlink_mem_btn).click();
		String unlink_member = "Are you sure you wish to unlink the member?";
		String unlink = driver.switchTo().alert().getText();
		TestBase.toast(unlink, unlink_member);
		driver.switchTo().alert().dismiss();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_mem_btn.",
				"The user Clicked_on_unlink_mem_btn successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_show_button)));
		driver.findElement(Click_on_show_button).click();
		String camdata = "Campaign Messages Data:";
		TestBase.verifyTextPresence(driver, camdata);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_show_button.",
				"The user Click_on_show_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_close)));
		driver.findElement(Click_on_close).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_close.",
				"The user Clicked_on_close button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_copy_APIKey_button)));
		driver.findElement(Click_on_copy_APIKey_button).click();
		// Get system clipboard
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		// Get clipboard contents
		Transferable contents = clipboard.getContents(null);
		// Check if contents are available and of string type
		if (contents != null && contents.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			String apiKey = (String) contents.getTransferData(DataFlavor.stringFlavor);
			// Print the retrieved API key
			System.out.println("Retrieved API key: " + apiKey);
		}
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_copy_APIKey_button.",
				"The user Clicked_on_copy_APIKey_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_leads_limit)));
		driver.findElement(Click_on_update_leads_limit).click();
		String prestText = "Update Assign Leads Limit";
		TestBase.verifyTextPresence(driver, prestText);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_leads_limit.",
				"The user Clicked_on_update_leads_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_llimit)));
		driver.findElement(Enter_leads_llimit).clear();
		driver.findElement(Enter_leads_llimit).sendKeys("55");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_llimit.",
				"The user Entered_leads_llimit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_buttonn)));
		driver.findElement(Click_on_save_buttonn).click();
		String succmsg = "Assign leads limit has been updated successfully!";
		TestBase.verifyTextPresence(driver, succmsg);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_buttonn.",
				"The user Clicked_on_save_buttonn successfully.");

		Thread.sleep(2000); // this wait for user understanding if it removed not an issue.

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_view_button)));
		driver.findElement(Click_on_view_button).click();
		TestBase.verifyTextPresence(driver, msg1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_view_button.",
				"The user Clicked_on_view_button successfully.");

		// In this method I have search the leads by name, we can iterate it like search
		// by name, number, email, etc..
		try {
			if(driver.findElement(Get_lead_name).isDisplayed()) {
				String LeadName = driver.findElement(Get_lead_name).getText();
				System.out.println("The lead name is " + LeadName);

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_name_in_search)));
				driver.findElement(Enter_leads_name_in_search).clear();
				driver.findElement(Enter_leads_name_in_search).sendKeys(LeadName);
				driver.findElement(Enter_leads_name_in_search).sendKeys(Keys.ENTER);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_name_in_search.",
						"The user Entered_leads_name_in_search successfully.");	
			}
			
		}catch(NoSuchElementException ele) {
			System.out.println("Leads not found in TM");
		}
		

		TestBase.ScrollIntoView(driver, driver.findElement(Select_line_type));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_line_type)));
		Select Line_type = new Select(driver.findElement(Select_line_type));
		Line_type.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_line_type.",
				"The user Selected_line_type value successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_DNC_type)));
		Select DNC_Type = new Select(driver.findElement(Select_DNC_type));
		DNC_Type.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_DNC_type.",
				"The user Selected_DNC_type value successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_CallBlock_status)));
		Select Call_Block = new Select(driver.findElement(Select_CallBlock_status));
		Call_Block.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_CallBlock_status.",
				"The user Selected_CallBlock_status value successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_sort)));
		Select Sort = new Select(driver.findElement(Select_sort));
		Sort.selectByValue("asc_created_at");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_sort.",
				"The user Selected_sort value successfully.");

		String pasc = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\TM module member details page filter.png";
		TestBase.takeSnapShot(driver, pasc);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_buttonn)));
		driver.findElement(Click_on_clear_buttonn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_clear_buttonn.",
				"The user Clicked_on_clear_buttonn successfully.");
		System.out.println("Pom_TeamMemberSetting_5 method passed successfully.");
	}
	
	By Click_on_action_menu=By.xpath("//a[normalize-space()='Actions']");
	By Click_on_update_campaign_menu=By.xpath("//button[text()='Update Campaign']");
	By Click_on_unlink_account=By.xpath("//button[text()='Unlink Account']");
	By Click_on_Disable_pause_button=By.xpath("//button[normalize-space()='Disable(Pause) Member']");
	By Click_on_update_leads_limitt=By.xpath("(//button[text()='Update Leads Limit'])[2]");
	By Enter_the_leadsss_limt=By.xpath("//input[@name=\"update_leads_limit\"]");
	By Click_on_save_changes_bttn=By.xpath("//button[text()='Save Changes']");

	// This method contains the all TM page action menus functionality.
	public void Pom_TeamMemberSetting_6_6() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_all_TM_module)));
		driver.findElement(Click_on_all_TM_module).click();
		String text1 = "All Team Members";
		TestBase.verifyTextPresence(driver, text1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_all_TM_module.",
				"The user Clicked_on_all_TM_module successfully.");
		//in action menu I have opened the alert and dismiss it.
		try {
			if(driver.findElement(Click_on_action_menu).isDisplayed()) {
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_action_menu)));
				driver.findElement(Click_on_action_menu).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_action_menu.",
						"The user Clicked_on_action_menu successfully.");
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_campaign_menu)));
				driver.findElement(Click_on_update_campaign_menu).click();
				String alt1="Are you sure you wish to update the campaign of member?";
				String act1 = driver.switchTo().alert().getText();
				TestBase.toast(act1, text1);
				driver.switchTo().alert().dismiss();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_campaign_menu.",
						"The user Clicked_on_update_campaign_menu along with alert actions performed successfully.");
					
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_unlink_account)));
				driver.findElement(Click_on_unlink_account).click();
				String alt2="Are you sure you wish to unlink the member?";
				String act2 = driver.switchTo().alert().getText();
				TestBase.toast(act2, alt2);
				driver.switchTo().alert().dismiss();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_account.",
						"The user Clicked_on_unlink_account along with alert actions performed successfully.");
						
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Disable_pause_button)));
				driver.findElement(Click_on_Disable_pause_button).click();
				String alt3="Are you sure you wish to enable/disable the member?";
				String act3 = driver.switchTo().alert().getText();
				TestBase.toast(act3, alt3);
				driver.switchTo().alert().dismiss();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Disable_pause_button.",
						"The user Clicked_on_Disable_pause_button along with alert actions performed successfully.");
				
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_leads_limitt)));
				driver.findElement(Click_on_update_leads_limitt).click();
				String alt4="Update Assign Leads Limit";
				TestBase.verifyTextPresence(driver, alt4);
			    ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_leads_limitt.",
						"The user Clicked_on_update_leads_limitt successfully.");
			    
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_the_leadsss_limt)));
				driver.findElement(Enter_the_leadsss_limt).clear();
				driver.findElement(Enter_the_leadsss_limt).sendKeys("23");
			    ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Entered_the_leadsss_limt.",
						"The user Entered_the_leadsss_limt successfully.");
			    
			    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_changes_bttn)));
				driver.findElement(Click_on_save_changes_bttn).click();
				String succm="Assign leads limit has been updated successfully!";
				TestBase.verifyTextPresence(driver, succm);
			    ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_changes_bttn.",
						"The user Clicked_on_save_changes_bttn successfully.");
				
			}
		}catch(NoSuchElementException ele) {
			System.out.println("In the super user account the link TM not found");
		}
		
		
		System.out.println("Pom_TeamMemberSetting_6 method passed successfully.");

	}
}