package PomPackage;

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

public class Pom_ProjectSetting_AllProjects {
	WebDriver driver;

	public Pom_ProjectSetting_AllProjects(WebDriver driver) {
		this.driver = driver;
	}

	By click_on_All_project_Module = By.xpath("//span[text()='All Projects']");
	By Click_on_the_create_Project = By.xpath("//a[normalize-space()='Create New Project']");
	By Enter_search_data = By
			.xpath("//input[contains(@placeholder,'Search By CsvFile Name or Project Name Or Description')]");
	By Select_status = By.xpath("//select[@data-placeholder=\"Select Status\"]");
	By Select_bucket = By.xpath("//select[@data-placeholder=\"Select Bucket\"]");
	By Sort_by = By.xpath("//select[@id='filter_sort_by']");
	By Click_on_clear_filter = By.xpath("//a[normalize-space()='Clear Filter']");
	By Click_on_RedistributeButton = By.xpath("//input[@value=\"Re-Distribute\"]");
	By Click_on_Terminate_button = By.xpath("//input[@value=\"Terminate\"]");
	By CLick_on_view_button = By.xpath("//a[text()='View']");

	By Select_Status_of_leads = By.xpath("//select[@data-placeholder=\"Select Status\"]");
	By Select_line_type = By.xpath("//select[@data-placeholder=\"Select LineType\"]");
	By Select_DNC_type = By.xpath("//select[@data-placeholder=\"Select DNCType\"]");
	By Select_call_block_status = By.xpath("//select[@data-placeholder=\"Select Callblock Status\"]");
	By Select_contact_status = By.xpath("//select[@data-placeholder=\"Select Contact Status\"]");
	By Select_Sort_filter = By.xpath("//select[@id=\"filter_sort_by\"]");
	By Click_on_clear_btnn = By.xpath("//a[text()='Clear Filter']");
	By Enter_the_leads_name = By.xpath("//input[@type=\"text\"]");
	By Click_on_download_link = By.xpath("//a[text()='Download']");

	// In this we are Validating the All Project page functionality, like page
	// filter.
	public void Pom_ProjectSetting_AllProjects_1() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(click_on_All_project_Module)));
		driver.findElement(click_on_All_project_Module).click();
		String Expected = "All Projects (Last 12 Months) |";
		TestBase.verifyTextPresence(driver, Expected);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can click_on_All_project_Module.",
				"The user clicked_on_All_project_Module successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_create_Project)));
		driver.findElement(Click_on_the_create_Project).click();
		String Expectedd = "Create New Project";
		TestBase.verifyTextPresence(driver, Expectedd);
		driver.navigate().back();
		TestBase.verifyTextPresence(driver, Expected);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_create_Project.",
				"The user Clicked_on_the_create_Project btn successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_status)));
		Select project_stataus = new Select(driver.findElement(Select_status));
		project_stataus.selectByValue("assigned");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Selected_status.",
				"The user Selected_status successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_bucket)));
		Select project_bucket = new Select(driver.findElement(Select_bucket));
		project_bucket.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_bucket.",
				"The user Selected_bucket successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Sort_by)));
		Select project_sort = new Select(driver.findElement(Sort_by));
		project_sort.selectByValue("asc_updated_at");
		Thread.sleep(2000);
		String filepath = "D:\\Lead Distro\\Lead Distro Automation Snaps\\AllProject filterapply.png";
		TestBase.takeSnapShot(driver, filepath);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Sort_by filter.",
				"The user Selected_bucket successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_filter)));
		driver.findElement(Click_on_clear_filter).click();
		Thread.sleep(2000);
		String filepathh = "D:\\Lead Distro\\Lead Distro Automation Snaps\\AllProject filterclear.png";
		TestBase.takeSnapShot(driver, filepathh);
		System.out.println("All project page filter functionality tested passed.");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_clear_filter filter.",
				"The user Clicked_on_clear_filter successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_search_data)));
		driver.findElement(Enter_search_data).clear();
		driver.findElement(Enter_search_data).sendKeys("Auto project");
		driver.findElement(Enter_search_data).sendKeys(Keys.ENTER);
		if (driver.getPageSource().contains("No Projects Found! ")) {
			System.out.println("The search data not found.");
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_filter)));
			driver.findElement(Click_on_clear_filter).click();
		} else {
			System.out.println("The project found with enter search field.");
		}
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Enter_search_data.",
				"The user Entered_search_data successfully.");

		try {
			if (driver.findElement(Click_on_RedistributeButton).isDisplayed()) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_RedistributeButton)));
				driver.findElement(Click_on_RedistributeButton).click();
				System.out.println("Project leads redistribute successfully.");
			}
		} catch (NoSuchElementException ex) {
			System.out.println("The redistribute button not visible on the page.");
		}

		try {
			if (driver.findElement(Click_on_Terminate_button).isDisplayed()) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_Terminate_button)));
				driver.findElement(Click_on_Terminate_button).click();
				String alert = driver.switchTo().alert().getText();
				TestBase.toast(alert, "Are you sure you want to terminate the project?");
				driver.switchTo().alert().accept();
				System.out.println("Project leads terminate successfully.");

			}
		} catch (NoSuchElementException ex) {
			System.out.println("The Terminate button not visible on the page.");
		}
		;

		try {
			if (driver.findElement(CLick_on_view_button).isDisplayed()) {
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(CLick_on_view_button)));
				driver.findElement(CLick_on_view_button).click();
				String text = "Lead File Details |";
				TestBase.verifyTextPresence(driver, text);

				TestBase.ScrollIntoView(driver, driver.findElement(Select_Status_of_leads));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Status_of_leads)));
				Select status_of_leads = new Select(driver.findElement(Select_Status_of_leads));
				status_of_leads.selectByValue("all");

				TestBase.ScrollIntoView(driver, driver.findElement(Select_line_type));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_line_type)));
				Select Select_line = new Select(driver.findElement(Select_line_type));
				Select_line.selectByValue("invalid");

				TestBase.ScrollIntoView(driver, driver.findElement(Select_DNC_type));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_DNC_type)));
				Select Select_DNC = new Select(driver.findElement(Select_DNC_type));
				Select_DNC.selectByValue("all");

				TestBase.ScrollIntoView(driver, driver.findElement(Select_call_block_status));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_call_block_status)));
				Select Select_call_block = new Select(driver.findElement(Select_call_block_status));
				Select_call_block.selectByValue("all");

				TestBase.ScrollIntoView(driver, driver.findElement(Select_contact_status));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_contact_status)));
				Select Select_contactStatus = new Select(driver.findElement(Select_contact_status));
				Select_contactStatus.selectByValue("all");

				TestBase.ScrollIntoView(driver, driver.findElement(Select_Sort_filter));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Sort_filter)));
				Select Sort_filter = new Select(driver.findElement(Select_Sort_filter));
				Sort_filter.selectByValue("desc_created_at");

				Thread.sleep(2000);
				String filebefore = "D:\\Lead Distro\\Lead Distro Automation Snaps\\Lead file filter before.png";
				TestBase.takeSnapShot(driver, filebefore);
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_btnn)));
				driver.findElement(Click_on_clear_btnn).click();

				Thread.sleep(2000);
				String fileafter = "D:\\Lead Distro\\Lead Distro Automation Snaps\\Lead file filter after.png";
				TestBase.takeSnapShot(driver, fileafter);

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_the_leads_name)));
				driver.findElement(Enter_the_leads_name).clear();
				driver.findElement(Enter_the_leads_name).sendKeys("I'm sending dummy text.");
				driver.findElement(Enter_the_leads_name).sendKeys(Keys.ENTER);
				String s = "No Leads Found!";
				TestBase.verifyTextPresence(driver, s);

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_clear_btnn)));
				driver.findElement(Click_on_clear_btnn).click();
				System.out.println(
			    "The view button visible hence the user naviage to the lead file details page and applied filter to leads successfully.");
			}
		} catch (NoSuchElementException ex) {
			System.out.println("The view button not visible on the page.");
		}

		TestBase.ScrollTopOfthePage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_download_link)));
		driver.findElement(Click_on_download_link).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_download_link filter.",
				"The user Clicked_on_download_link successfully.");
		Thread.sleep(2000);

	}
}