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

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_TeamMemberSetting_2 {
	WebDriver driver;

	public Pom_TeamMemberSetting_2(WebDriver driver) {
		this.driver = driver;
	}

	By click_on_Team_member_with_zero_limit_module = By.xpath("//span[normalize-space()='Team Members with 0 Limit']");
	By Click_on_all_TM_Module = By.xpath("//span[text()='All Members']");
	By Select_TM_on_click_check = By.xpath("(//input[@type=\"checkbox\"])[3]");
	By Click_on_update_leads_limit = By.xpath("//button[text()='Update Leads Limit']");
	By Enter_leads_limit = By.xpath("//form[@id='updateLeadsLimitForm']//input[@name='update_leads_limit']");
	By Click_on_save_button = By.xpath("//form[@id='updateLeadsLimitForm']//button[@type='submit'][normalize-space()='Save Changes']");
	By Click_on_link_a_new_TM = By.xpath("//a[text()='Link New Team Member']");
	By Click_on_master_reset_button = By.xpath("//button[text()='Master Reset']");
	By Click_on_close_button = By.xpath("//form[@action='/dashboard/member/master-reset']//button[@type='button'][normalize-space()='Close']");
	By get_campaign_details = By.xpath("//tbody/tr/td[2]");
	By enter_mail_in_search_field = By.xpath("//input[@placeholder=\"Search By Email\"]");
	By ClickOn_clear_button = By.xpath("//a[text()='Clear Filter']");
	By Select_auto_top_up_status = By.xpath("//select[@data-placeholder='Select Auto Top-Up Status']");
	By Select_vacation_mode = By.xpath("//select[@data-placeholder='Select Vacation Mode']");
	By Select_all_states_status = By.xpath("//select[@data-placeholder='Select All States Status']");
	By Select_memeber_status = By.xpath("//select[@data-placeholder='Select Member Status']");
	By Select_campaign_status = By.xpath("//select[@data-placeholder='Select Campaign Status']");
	By Select_sort_filter = By.xpath("//select[@id=\"filter_sort_by\"]");

	// This method contains the Team member with 0 limit page buttons and filter
	// script.
	public void Pom_TeamMemberSetting_2_1() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(click_on_Team_member_with_zero_limit_module)));
		driver.findElement(click_on_Team_member_with_zero_limit_module).click();
		String text1 = "Team Members with 0 Limit";
		TestBase.verifyTextPresence(driver, text1);
		String TM_not_found = "No Team Members Found!";
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_member_module.",
				"The user Clicked_on_unlink_member_module successfully.");
		try {
			if (driver.getPageSource().contains(TM_not_found)) {
				System.out.println("TM not found with zero limit");
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_all_TM_Module)));
				driver.findElement(Click_on_all_TM_Module).click();
				String text2 = "All Team Members";
				TestBase.verifyTextPresence(driver, text2);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_all_TM_Module.",
						"The user Clicked_on_all_TM_Module successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_TM_on_click_check)));
				driver.findElement(Select_TM_on_click_check).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_TM.",
						"The user Selected_TM_on_successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_leads_limit)));
				driver.findElement(Click_on_update_leads_limit).click();
				String text3 = "Update Assign Leads Limit";
				TestBase.verifyTextPresence(driver, text3);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_leads_limit btn.",
						"The user Click_on_update_leads_limit button successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limit)));
				driver.findElement(Enter_leads_limit).clear();
				driver.findElement(Enter_leads_limit).sendKeys("0");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_limit in text area.",
						"The user Enter_leads_limit in text area successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
				driver.findElement(Click_on_save_button).click();
				String text4 = "Leads limit updated successfully!";
				TestBase.verifyTextPresence(driver, text4);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
						"The user Clicked_on_save_button successfully.");
				
				wait.until(ExpectedConditions
						.elementToBeClickable(driver.findElement(click_on_Team_member_with_zero_limit_module)));
				driver.findElement(click_on_Team_member_with_zero_limit_module).click();
				TestBase.verifyTextPresence(driver, text1);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_member_module.",
						"The user Clicked_on_unlink_member_module successfully.");
			}
		} catch (NoSuchElementException ele) {
			System.out.println("Team memebr already exist with 0 limit.");

		}

	

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_link_a_new_TM)));
		driver.findElement(Click_on_link_a_new_TM).click();
		String text5 = "Link A New Member Account";
		TestBase.verifyTextPresence(driver, text5);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_link_a_new_TM.",
				"The user Clicked_on_link_a_new_TM successfully.");
		driver.navigate().back();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_master_reset_button)));
		driver.findElement(Click_on_master_reset_button).click();
		String text6 = "Master Reset all the Team Member's Limit";
		TestBase.verifyTextPresence(driver, text6);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_master_reset_button.",
				"The user Clicked_on_master_reset_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_close_button)));
		driver.findElement(Click_on_close_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_close_button.",
				"The user Clicked_on_close_button successfully.");
		
		String TMEmail = driver.findElement(get_campaign_details).getText();
		System.out.println("The Super user added TM email is -" + TMEmail);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(enter_mail_in_search_field)));
		driver.findElement(enter_mail_in_search_field).clear();
		driver.findElement(enter_mail_in_search_field).sendKeys(TMEmail);
		driver.findElement(enter_mail_in_search_field).sendKeys(Keys.ENTER);
		String path = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\TM  with 0 limit Search field filter.png";
		TestBase.takeSnapShot(driver, path);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_email_in_serach_field.",
				"The user Entered_email_in_serach_field successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(ClickOn_clear_button)));
		driver.findElement(ClickOn_clear_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_clear_button.",
				"The user Clicked_on_clear_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_auto_top_up_status)));
		Select Auto_top_up_status = new Select(driver.findElement(Select_auto_top_up_status));
		Auto_top_up_status.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_auto_top_up_status.",
				"The user  Selected_auto_top_up_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_vacation_mode)));
		Select vacation_mode = new Select(driver.findElement(Select_vacation_mode));
		vacation_mode.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_vacation_mode.",
				"The user  Selected_vacation_mode successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_all_states_status)));
		Select All_states = new Select(driver.findElement(Select_all_states_status));
		All_states.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_all_states_status.",
				"The user  Selected_all_states_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_memeber_status)));
		Select member_states = new Select(driver.findElement(Select_memeber_status));
		member_states.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_memeber_status.",
				"The user  Selected_memeber_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_campaign_status)));
		Select Select_campaign = new Select(driver.findElement(Select_campaign_status));
		Select_campaign.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_campaign_status.",
				"The user Selected_campaign_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_sort_filter)));
		Select Selected_sort = new Select(driver.findElement(Select_sort_filter));
		Selected_sort.selectByValue("asc_updated_at");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_sort_by.",
				"The user Selected_sort_by successfully.");

		String pathh = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\TM with 0 limit Page All Filter.png";
		TestBase.takeSnapShot(driver, pathh);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(ClickOn_clear_button)));
		driver.findElement(ClickOn_clear_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_clear_button.",
				"The user Clicked_on_clear_button successfully.");
		System.out.println("Pom_TeamMemberSetting_2_1 method passed successfully.");
	}

	By Click_on_TM_action_option_menu_button = By.xpath("//a[normalize-space()='Actions']");
	By Click_on_update_campaign_option = By.xpath("//button[text()='Update Campaign']");
	By Click_on_unlink_account_option = By.xpath("//button[text()='Unlink Account']");
	By CLick_on_Update_leads_limit_option = By.xpath("//button[text()='Update Leads Limit']");
	By Click_on_disable_pause_leads_limit_option = By.xpath("//button[normalize-space()='Disable(Pause) Member']");
	By Enter_leads_limitt = By.xpath("(//input[@name=\"update_leads_limit\"])[1]");
	By Click_on_save_buttonn = By.xpath("//button[text()='Save Changes']");

	// This method contains the unlink team member with 0 limit page action menu
	// script.
	public void Pom_TeamMemberSetting_2_2() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(click_on_Team_member_with_zero_limit_module)));
		driver.findElement(click_on_Team_member_with_zero_limit_module).click();
		String text1 = "Team Members with 0 Limit";
		TestBase.verifyTextPresence(driver, text1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_member_module.",
				"The user Clicked_on_unlink_member_module successfully.");
		try {
			if (driver.getPageSource().contains("No Team Members Found!")) {
				System.out.println("TM not found with zero limit");
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_all_TM_Module)));
				driver.findElement(Click_on_all_TM_Module).click();
				String text2 = "All Team Members";
				TestBase.verifyTextPresence(driver, text2);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_all_TM_Module.",
						"The user Clicked_on_all_TM_Module successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_TM_on_click_check)));
				driver.findElement(Select_TM_on_click_check).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_TM.",
						"The user Selected_TM_on_successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_leads_limit)));
				driver.findElement(Click_on_update_leads_limit).click();
				String text3 = "Update Assign Leads Limit";
				TestBase.verifyTextPresence(driver, text3);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_leads_limit btn.",
						"The user Click_on_update_leads_limit button successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limit)));
				driver.findElement(Enter_leads_limit).clear();
				driver.findElement(Enter_leads_limit).sendKeys("0");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_limit in text area.",
						"The user Enter_leads_limit in text area successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
				driver.findElement(Click_on_save_button).click();
				String text4 = "Leads limit updated successfully!";
				TestBase.verifyTextPresence(driver, text4);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
						"The user Clicked_on_save_button successfully.");
			}
		} catch (NoSuchElementException ele) {

		}

		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(click_on_Team_member_with_zero_limit_module)));
		driver.findElement(click_on_Team_member_with_zero_limit_module).click();
		TestBase.verifyTextPresence(driver, text1);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_member_module.",
				"The user Clicked_on_unlink_member_module successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_TM_action_option_menu_button)));
		driver.findElement(Click_on_TM_action_option_menu_button).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_TM_action_option_menu_button.",
				"The user Clicked_on_TM_action_option_menu_button successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_campaign_option)));
		driver.findElement(Click_on_update_campaign_option).click();
		String alt1 = "Are you sure you wish to update the campaign of member?";
		String act1 = driver.switchTo().alert().getText();
		TestBase.toast(act1, alt1);
		driver.switchTo().alert().dismiss();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_campaign_menu.",
				"The user Clicked_on_update_campaign_menu along with alert actions performed successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_unlink_account_option)));
		driver.findElement(Click_on_unlink_account_option).click();
		String alt2 = "Are you sure you wish to unlink the member?";
		String act2 = driver.switchTo().alert().getText();
		TestBase.toast(act2, alt2);
		driver.switchTo().alert().dismiss();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_account.",
				"The user Clicked_on_unlink_account along with alert actions performed successfully.");

		wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_disable_pause_leads_limit_option)));
		driver.findElement(Click_on_disable_pause_leads_limit_option).click();
		String alt3 = "Are you sure you wish to enable/disable the member?";
		String act3 = driver.switchTo().alert().getText();
		TestBase.toast(act3, alt3);
		driver.switchTo().alert().dismiss();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Disable_pause_button.",
				"The user Clicked_on_Disable_pause_button along with alert actions performed successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(CLick_on_Update_leads_limit_option)));
		driver.findElement(CLick_on_Update_leads_limit_option).click();
		String alt4 = "Update Assign Leads Limit";
		TestBase.verifyTextPresence(driver, alt4);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_leads_limitt.",
				"The user Clicked_on_update_leads_limitt successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limitt)));
		driver.findElement(Enter_leads_limitt).clear();
		driver.findElement(Enter_leads_limitt).sendKeys("23");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Entered_the_leadsss_limt.",
				"The user Entered_the_leadsss_limt successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_buttonn)));
		driver.findElement(Click_on_save_buttonn).click();
		String succm = "Assign leads limit has been updated successfully!";
		TestBase.verifyTextPresence(driver, succm);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_changes_bttn.",
				"The user Clicked_on_save_changes_bttn successfully.");
		System.out.println("Pom_TeamMemberSetting_2_2 method has been passed.");

	}

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
	By Click_on_update_leads_limitt = By.xpath("//button[normalize-space()='Update Leads Limit']");
	By Click_on_show_button = By.xpath("//button[text()='Show']");
	By Click_on_close = By.xpath("(//button[text()='Close'])[2]");
	By Click_on_copy_APIKey_button = By.xpath("//span[text()='copy']");
	By Get_lead_name = By.xpath("//tbody/tr[1]/td[2]/div[1]");
	
	By Enter_leads_limi_view=By.xpath("//input[@name='update_leads_limit']");
By Click_save_view=By.xpath("//button[normalize-space()='Save Changes']");
	// This method contains the unlink team member with 0 limit page TM view menu
	// script.
	public void Pom_TeamMemberSetting_2_3() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions
				.elementToBeClickable(driver.findElement(click_on_Team_member_with_zero_limit_module)));
		driver.findElement(click_on_Team_member_with_zero_limit_module).click();
		String text1 = "Team Members with 0 Limit";
		TestBase.verifyTextPresence(driver, text1);
		String TM_not_found = "No Team Members Found!";
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_unlink_member_module.",
				"The user Clicked_on_unlink_member_module successfully.");

		try {
			if (driver.getPageSource().contains("No Team Members Found!")) {
				System.out.println("TM not found with zero limit");
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_all_TM_Module)));
				driver.findElement(Click_on_all_TM_Module).click();
				String text2 = "All Team Members";
				TestBase.verifyTextPresence(driver, text2);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_all_TM_Module.",
						"The user Clicked_on_all_TM_Module successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_TM_on_click_check)));
				driver.findElement(Select_TM_on_click_check).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_TM.",
						"The user Selected_TM_on_successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_leads_limit)));
				driver.findElement(Click_on_update_leads_limit).click();
				String text3 = "Update Assign Leads Limit";
				TestBase.verifyTextPresence(driver, text3);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_leads_limit btn.",
						"The user Click_on_update_leads_limit button successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limit)));
				driver.findElement(Enter_leads_limit).clear();
				driver.findElement(Enter_leads_limit).sendKeys("0");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_limit in text area.",
						"The user Enter_leads_limit in text area successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_button)));
				driver.findElement(Click_on_save_button).click();
				String text4 = "Leads limit updated successfully!";
				TestBase.verifyTextPresence(driver, text4);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_button.",
						"The user Clicked_on_save_button successfully.");
			}
		} catch (NoSuchElementException ele) {

		}

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

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_leads_limitt)));
		driver.findElement(Click_on_update_leads_limitt).click();
		String prestText = "Update Assign Leads Limit";
		TestBase.verifyTextPresence(driver, prestText);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_leads_limit.",
				"The user Clicked_on_update_leads_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limi_view)));
		driver.findElement(Enter_leads_limi_view).clear();
		driver.findElement(Enter_leads_limi_view).sendKeys("55");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_llimit.",
				"The user Entered_leads_llimit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_save_view)));
		driver.findElement(Click_save_view).click();
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
			if (driver.findElement(Get_lead_name).isDisplayed()) {
				String LeadName = driver.findElement(Get_lead_name).getText();
				System.out.println("The lead name is " + LeadName);

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_name_in_search)));
				driver.findElement(Enter_leads_name_in_search).clear();
				driver.findElement(Enter_leads_name_in_search).sendKeys(LeadName);
				driver.findElement(Enter_leads_name_in_search).sendKeys(Keys.ENTER);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_name_in_search.",
						"The user Entered_leads_name_in_search successfully.");
			}

		} catch (NoSuchElementException ele) {
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

		String pasc = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\TM module member with 0 limit details page filter.png";
		TestBase.takeSnapShot(driver, pasc);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_buttonn)));
		driver.findElement(Click_on_clear_buttonn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_clear_buttonn.",
				"The user Clicked_on_clear_buttonn successfully.");
		System.out.println("Pom_TeamMemberSetting_2_3 method passed successfully.");

	}
}