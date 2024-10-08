package PomPackage;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_TM_User_Leads_info {
	WebDriver driver;

	public Pom_TM_User_Leads_info(WebDriver driver) {
		this.driver = driver;
	}

	By Click_on_menu_arrow = By.xpath("(//span[@class=\"menu-arrow\"])[1]");
	By Click_on_All_leads = By.xpath("//span[text()='All Leads']");
	By Table_heading_all_leads = By.xpath("//thead/tr/th");

	// In this method we are checking the All leads info page functionality.
	public void Pom_TM_User_Leads_info_1() throws Exception

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_menu_arrow)));
		driver.findElement(Click_on_menu_arrow).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_menu_arrow.",
				"The user Clicked_on_menu_arrow successfully.");
		if (driver.findElement(Click_on_All_leads).isDisplayed()) {

			System.out.println("The all leads menu is visible hence no need to click on the dropdown.");

		} else {
			driver.findElement(Click_on_menu_arrow).click();
			System.out.println("The all leads menu is not visible hence no need to click on the dropdown.");
		}

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_All_leads)));
		driver.findElement(Click_on_All_leads).click();
		String all_leads = "All Leads";
		TestBase.verifyTextPresence(driver, all_leads);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_All_leads.",
				"The user Clicked_on_All_leads menu option successfully.");
		String All_Leads_TM_User = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\All_Leads_TM_User.png";
		TestBase.takeSnapShot(driver, All_Leads_TM_User);
		
		
		//Verify the tables heading.
		List<String> expectedHeaders = Arrays.asList("SR.", "LEAD'S NAME", "LEAD'S PHONE", "LINE TYPE", "DNC TYPE",
				"ADDED AT", "ASSIGNED BY");
		List<WebElement> headers = driver.findElements(Table_heading_all_leads);
		TestBase.Verify_the_Table_Headers(expectedHeaders, headers);

		System.out.println("The All Leads Page Table headers validation has been passed.");
		System.out.println("Pom_TM_User_Leads_info_1 the method has been passed successfully.");
	}

	By Click_on_all_super_user = By.xpath("//span[text()='All Super Users']");
	By Click_on_copy_APIKey = By.xpath("//span[text()='copy']");
	By Click_on_action_menu = By.xpath("//a[normalize-space()='Actions']");
	By Click_on_update_leads_limit = By.xpath("//button[text()='Update Leads Limit']");
	By Enter_leads_limit = By.xpath("//input[@name=\"update_leads_limit\"]");
	By Click_on_close_button = By.xpath("//button[@type='button'][normalize-space()='Close']");
	By Click_on_save_changes_btn = By.xpath("//button[@type='submit'][normalize-space()='Save Changes']");
	By Click_on_request_leads_limit = By.xpath("//button[text()='Request Leads Limit']");
	By Click_on_disable_pause_super_user = By.xpath("(//button[@class=\"bg-transparent border-0 menu-link px-3\"])[3]");
	By Get_the_SuperUser_status = By.xpath("//tbody/tr[1]/td[3]/span[1]/b[1]");

	By Get_tables_headings = By.xpath("//thead/tr/th");

	// In this method we are checking the All leads info page functionality.
	public void Pom_TM_User_Leads_info_2() throws Exception

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_all_super_user)));
		driver.findElement(Click_on_all_super_user).click();
		String All_Super_Users = "All Super Users";
		TestBase.verifyTextPresence(driver, All_Super_Users);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_all_super_user.",
				"The user Clicked_on_all_super_user successfully.");

		String All_Super_user_In_TM_role = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\All_Super_user_In_TM_User_role.png";

		TestBase.takeSnapShot(driver, All_Super_user_In_TM_role);

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_copy_APIKey)));
		driver.findElement(Click_on_copy_APIKey).click();
		String copy = "Copied.";
		TestBase.verifyTextPresence(driver, copy);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_copy_APIKey.",
				"The user Clicked_on_copy_APIKey successfully.");

		for (int i = 0; i < 2; i++) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_action_menu)));
			driver.findElement(Click_on_action_menu).click();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_action_menu.",
					"The user Clicked_on_action_menu successfully.");

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_update_leads_limit)));
			driver.findElement(Click_on_update_leads_limit).click();
			String Update_Leads = "Update Assign Leads Limit";
			TestBase.verifyTextPresence(driver, Update_Leads);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_update_leads_limit.",
					"The user Clicked_on_update_leads_limit successfully.");

			if (i == 0) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_close_button)));
				driver.findElement(Click_on_close_button).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_close_button.",
						"The user Clicked_on_close_button successfully.");
			}

			if (i == 1) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limit)));
				driver.findElement(Enter_leads_limit).clear();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_limit.",
						"The user Entered_leads_limit successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_changes_btn)));
				driver.findElement(Click_on_save_changes_btn).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_changes_btn.",
						"The user Clicked_on_save_changes_btn successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_limit)));
				driver.findElement(Enter_leads_limit).clear();
				driver.findElement(Enter_leads_limit).sendKeys("45");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_leads_limit.",
						"The user Entered_leads_limit successfully.");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_save_changes_btn)));
				driver.findElement(Click_on_save_changes_btn).click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_save_changes_btn.",
						"The user Clicked_on_save_changes_btn successfully.");
			}
		}

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_action_menu)));
		driver.findElement(Click_on_action_menu).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_action_menu.",
				"The user Clicked_on_action_menu successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_request_leads_limit)));
		driver.findElement(Click_on_request_leads_limit).click();
		String Request_Leads = "Email sent successful for leads limit to super user";
		TestBase.verifyTextPresence(driver, Request_Leads);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_request_leads_limit.",
				"The user Clicked_on_request_leads_limit successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_action_menu)));
		driver.findElement(Click_on_action_menu).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_action_menu.",
				"The user Clicked_on_action_menu successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_disable_pause_super_user)));
		driver.findElement(Click_on_disable_pause_super_user).click();
		String AlertExp = "Are you sure you wish to enable/disable for superuser?";
		String AlertAct = driver.switchTo().alert().getText();
		TestBase.toast(AlertExp, AlertAct);
		driver.switchTo().alert().accept();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_disable_pause_super_user.",
				"The user Clicked_on_disable_pause_super_user successfully.");
		String SuperUserStatusact = driver.findElement(Get_the_SuperUser_status).getText();
		String SuperUserStatusexp = "Yes";
		TestBase.toast(SuperUserStatusexp, SuperUserStatusact);

		if (SuperUserStatusact.equalsIgnoreCase("Yes")) {
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_action_menu)));
			driver.findElement(Click_on_action_menu).click();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_action_menu.",
					"The user Clicked_on_action_menu successfully.");

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_disable_pause_super_user)));
			driver.findElement(Click_on_disable_pause_super_user).click();
			String AlertExp1 = "Are you sure you wish to enable/disable for superuser?";
			String AlertAct1 = driver.switchTo().alert().getText();
			TestBase.toast(AlertExp1, AlertAct1);
			driver.switchTo().alert().accept();
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_disable_pause_super_user.",
					"The user Clicked_on_disable_pause_super_user successfully.");
		}
		//Verify the tables heading.
		List<String> expectedHeaders = Arrays.asList("SR.", "EMAIL", "DISABLE(PAUSE)", "TEXTDRIP APIKEY", "CAMPAIGN",
				"TOTAL ASSIGN LEADS", "LEADS ASSIGN LIMIT (REMAINING)", "TIMESTAMP", "ACTIONS");
		List<WebElement> headers = driver.findElements(Get_tables_headings);
		TestBase.Verify_the_Table_Headers(expectedHeaders, headers);
		System.out.println("The All Super User Table headers validation has been passed.");
		System.out.println("Pom_TM_User_Leads_info_2 the method has been passed successfully.");
	}
}
