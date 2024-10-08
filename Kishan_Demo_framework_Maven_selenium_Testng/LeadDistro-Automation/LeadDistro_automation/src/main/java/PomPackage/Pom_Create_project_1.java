package PomPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import BasePackage.TestBase;
import Extentpackage.ExtentTestManager;

public class Pom_Create_project_1 {
	WebDriver driver;

	public Pom_Create_project_1(WebDriver driver) {
		this.driver = driver;
	}

	By Click_on_Create_project = By.xpath("//span[contains(text(),'Create Project')]");
	By Click_on_view_project = By.xpath("//a[text()='View All Projects']");
	By Click_on_Create_project_button = By.xpath("(//span[contains(text(),'Create Project')])[2]");
	By Enter_project_title = By.xpath("//input[contains(@name,'project_name')]");
	By Enter_project_description = By.xpath("//textarea[contains(@name,'project_description')]");
	By Select_Leads_file = By.xpath("//input[@id='file_upload']");
	By Select_Team_memeber = By.xpath("//select[@name=\"members_list\"]");
	By Click_do_not_distribute_leads_toggle = By.xpath("//input[@name=\"do_not_distribute\"]");
	By Enter_tag_title = By.xpath("//span[@class=\"tagify__input\"]");
	By Select_bucket = By.xpath("//span[text()='Select Bucket']");
	By Enter_bucket_name = By.xpath("//input[@class=\"select2-search__field\"]");
	By CLick_on_DNC_line_type_toggle = By.xpath("//input[@id=\"allow_llr_site\"]");
	By CLick_on_Landline_block_toggle = By.xpath("//input[@name=\"dnc_check\"]");
	By click_on_finish_btn = By.xpath("//span[text()='Finish the Process']");
	By Get_success_text = By.xpath("//span[contains(text(),'File has been Added & Tasks will be Distributed in')]");

	// In this method create project we are verifying.
	public void Pom_Create_project_1_1() throws InterruptedException, AWTException {

		SoftAssert softAssertt = new SoftAssert();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Create_project)));
		driver.findElement(Click_on_Create_project).click();
		String CreateNewProject = "Create New Project";
		TestBase.verifyTextPresence(driver, CreateNewProject);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Create_project.",
				"The user Clicked_on_Create_project successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_view_project)));
		driver.findElement(Click_on_view_project).click();
		String All_project = "All Projects (Last 12 Months)";
		TestBase.verifyTextPresence(driver, All_project);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_view_project.",
				"The user Clicked_on_view_project successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Create_project)));
		driver.findElement(Click_on_Create_project).click();
		TestBase.verifyTextPresence(driver, CreateNewProject);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Create_project.",
				"The user Clicked_on_Create_project successfully");

		TestBase.ScrollIntoView(driver, driver.findElement(Click_on_Create_project_button));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Create_project_button)));
		driver.findElement(Click_on_Create_project_button).click();
		if (driver.getPageSource().contains("Create New Project")) {
			TestBase.ScrollTopOfthePage(driver);
		} else {
			System.out.println("The Validation for require fields are not worked.");
		}
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Create_project_button.",
				"The user Clicked_on_Create_project_button successfully");

		for (int i = 0; i <= 2; i++) {

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_project_title)));
			driver.findElement(Enter_project_title).sendKeys("Auto Project " + i);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_project_title.",
					"The user Entered_project_title successfully");

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_project_description)));
			driver.findElement(Enter_project_description).sendKeys(
					"Hello, In this project I'm Attaching csv of 100 leads to send the Campaign to each of them.");
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_project_description.",
					"The user Entered_project_description successfully");
			
			//Upload CSV
			if (i == 0) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Leads_file)));
				driver.findElement(Select_Leads_file).sendKeys("D:\\Contacts file\\Daily check file.csv");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_Leads_file.",
						"The user Selected_Leads_file successfully");
			} else if (i == 1) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Leads_file)));
				driver.findElement(Select_Leads_file).sendKeys("D:\\Contacts file\\6 contact.csv");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_Leads_file.",
						"The user Selected_Leads_file successfully");
			} else if(i==2) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Leads_file)));
				driver.findElement(Select_Leads_file).sendKeys("D:\\Contacts file\\6 contact for Dev.csv");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_Leads_file.",
						"The user Selected_Leads_file successfully");
			}
			
			//Select Team Member
			if (i == 0 || i == 2) {
				TestBase.ScrollIntoView(driver, driver.findElement(Select_Team_memeber));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Team_memeber)));
				Select TM = new Select(driver.findElement(Select_Team_memeber));
				List<WebElement> options = TM.getOptions();
				for (WebElement option : options)
					option.click();
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_Team_memeber.",
						"The user Selected_Team_memeber successfully");
			} else if (i == 1) {
				TestBase.ScrollIntoView(driver, driver.findElement(Select_Team_memeber));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Team_memeber)));
				Select TM = new Select(driver.findElement(Select_Team_memeber));
				TM.selectByIndex(0);
			}
			
			//Do Not Distribute toggle
			if (i == 2) {
				TestBase.ScrollIntoView(driver, driver.findElement(Click_do_not_distribute_leads_toggle));
				wait.until(ExpectedConditions
						.elementToBeClickable(driver.findElement(Click_do_not_distribute_leads_toggle)));
				driver.findElement(Click_do_not_distribute_leads_toggle).click();
				ExtentTestManager.getTest().log(LogStatus.PASS,
						"Verify the user can Click_do_not_distribute_leads_toggle.",
						"The user Clicked_do_not_distribute_leads_toggle successfully");
			}
			// Tag title
			if (i == 0 || i == 1) {
				TestBase.ScrollIntoView(driver, driver.findElement(Enter_tag_title));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_tag_title)));
				driver.findElement(Enter_tag_title).sendKeys("LD Auto Tag " + i);
				driver.findElement(Enter_tag_title).sendKeys(Keys.ENTER);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_tag_title.",
						"The user Entered_tag_title successfully");
			}

			if(i==2) {
			if (!driver.findElement(Enter_tag_title).isDisplayed()) {
			    // If the element is not displayed, pass the test
			    // No need for any assertion in this case
				System.out.println("The Enter tag title element not displayed.");
			} else {
			    // If the element is displayed, fail the test execution by assertion
			    softAssertt.fail("The Tag title input is enabled when the Do Not Distribute toggle is on");
			}

			softAssertt.assertAll();
			}
			// Select Bucket
			if (i == 0) {
				TestBase.ScrollIntoView(driver, driver.findElement(Select_bucket));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_bucket)));
				driver.findElement(Select_bucket).click();
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_bucket_name)));
				driver.findElement(Enter_bucket_name).sendKeys("Auto Bucket");
				driver.findElement(Enter_bucket_name).sendKeys(Keys.ENTER);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_Team_memeber.",
						"The user Selected_Team_memeber successfully");
			}

			else if (i == 1) {
				System.out.println("For this iteration bucket not selected.");
			}

			else if (i == 2) {
				if (!driver.findElement(Select_bucket).isDisplayed()) {
				    // If the element is not displayed, pass the test
				    // No need for any assertion in this case
					System.out.println("The select bucket element not displayed.");
				} else {
				    // If the element is displayed, fail the test execution by assertion
				    softAssertt.fail("The select bucket input is enabled when the Do Not Distribute toggle is on");
				}

				softAssertt.assertAll();
				
			}
			Thread.sleep(2000);

			// DNC line type toggle
			TestBase.ScrollIntoView(driver, driver.findElement(CLick_on_DNC_line_type_toggle));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(CLick_on_DNC_line_type_toggle)));
			WebElement ele = driver.findElement(CLick_on_DNC_line_type_toggle);
			if (ele.isSelected() && (i == 0)) {
				System.out.println("The Toggle is already selected hence there is no need to click.");
			}
			if (ele.isSelected() && (i == 1)) {
				System.out.println("The Toggle is already selected hence Unselecting the toggle.");
				ele.click();
			}
			if (ele.isSelected() && (i == 2)) {
				System.out.println("The Toggle is already selected hence there is no need to click.");
			}
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can CLick_on_DNC_line_type_toggle.",
					"The user CLicked_on_DNC_line_type_toggle successfully");

			
			// DNC LLR Block contact toggle
			if( i==0||i==1) {
			TestBase.ScrollIntoView(driver, driver.findElement(CLick_on_Landline_block_toggle));
			WebElement elle = driver.findElement(CLick_on_Landline_block_toggle);
			if (ele.isSelected()) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(CLick_on_Landline_block_toggle)));
				elle.click();
			}
			}
			else if (i == 2) {
				if (!driver.findElement(CLick_on_Landline_block_toggle).isDisplayed()) {
				    // If the element is not displayed, pass the test
				    // No need for any assertion in this case
					System.out.println("The select block landline toggle element not displayed.");
				} else {
				    // If the element is displayed, fail the test execution by assertion
				    softAssertt.fail("The landline block input is enabled when the Do Not Distribute toggle is on");
				}

				softAssertt.assertAll();
				
			}
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can CLick_on_Landline_block_toggle.",
					"The user CLicked_on_Landline_block_toggle successfully");

			TestBase.ScrollIntoView(driver, driver.findElement(Click_on_Create_project_button));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Create_project_button)));
			driver.findElement(Click_on_Create_project_button).click();
			String columnselect = "Select Relevant Columns to Process";
			TestBase.verifyTextPresence(driver, columnselect);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Create_project_button.",
					"The user Clicked_on_Create_project_button successfully");

			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(click_on_finish_btn)));
			driver.findElement(click_on_finish_btn).click();
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Get_success_text)));
			String acttext = driver.findElement(Get_success_text).getText();
			String Exptext = "File has been Added & Tasks will be Distributed in Your Team Members.";
			TestBase.toast(acttext, Exptext);
			ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can click_on_finish_btn.",
					"The user clicked_on_finish_btn successfully");
			if (i == 0 || i == 1) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Create_project)));
				driver.findElement(Click_on_Create_project).click();
				String CreateNewProjec = "Create New Project";
				TestBase.verifyTextPresence(driver, CreateNewProjec);
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_Create_project.",
						"The user Clicked_on_Create_project successfully");
				System.out.println("Iteration "+ i +" has been Passed.");
			}
		}
	}

}
