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

public class Pom_ProjectSetting_ALL_API_Leads {
	WebDriver driver;

	public Pom_ProjectSetting_ALL_API_Leads(WebDriver driver) {
		this.driver = driver;
	}

	By Click_on_the_All_API_Leads = By.xpath("//span[text()='All API Leads']");
	By Enter_leads_data_inSearch = By.xpath("//input[@name=\"search_by\"]");
	By Select_status = By.xpath("//select[@name='status_by']");
	By Select_Line_type = By.xpath("//select[@name='by_linetype']");
	By Select_DNC_type = By.xpath("//select[@name='by_dnctype']");
	By Select_CallBlockStatus = By.xpath("//select[@name='by_callblock']");
	By Contact_status = By.xpath("//select[@name='by_contactstatus']");
	By Filter_sort = By.xpath("//select[@id='filter_sort_by']");
	By Clear_filter = By.xpath("//a[normalize-space()='Clear Filter']");
	By Export_skipped_leads = By.xpath("//a[normalize-space()='Export Skipped Leads']");
	By Click_on_the_view_button = By.xpath("(//a[@href='#'][normalize-space()='View'])[1]");

	public void Pom_ProjectSetting_ALL_API_Leads_1() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_All_API_Leads)));
		driver.findElement(Click_on_the_All_API_Leads).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_All_API_Leads.",
				"The user Clicked_on_the_All_API_LeadsClick_on_the_All_API_Leads successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Enter_leads_data_inSearch)));
		driver.findElement(Enter_leads_data_inSearch).clear();
		driver.findElement(Enter_leads_data_inSearch).sendKeys("Ld Api Leads");
		driver.findElement(Enter_leads_data_inSearch).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String fileWithPath = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\All API Page apply filter 1.png";
		TestBase.takeSnapShot(driver, fileWithPath);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_All_API_Leads.",
				"The user Clicked_on_the_All_API_LeadsClick_on_the_All_API_Leads successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Clear_filter)));
		driver.findElement(Clear_filter).click();
		Thread.sleep(2000);
		String fileWithPat = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\All API Page clear filter 2.png";
		TestBase.takeSnapShot(driver, fileWithPat);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Clear_filter.",
				"The user Cleared the_filter successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_status)));
		Select leadStatus = new Select(driver.findElement(Select_status));
		leadStatus.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_status.",
				"The user Selected_status from the dropdown successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_Line_type)));
		Select LineType = new Select(driver.findElement(Select_Line_type));
		LineType.selectByValue("all");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can select LineType.",
				"The user selected LineType from the dropdown successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_DNC_type)));
		Select DNCType = new Select(driver.findElement(Select_DNC_type));
		DNCType.selectByValue("clean");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_DNC_type.",
				"The user selected DNC_type from the dropdown successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_CallBlockStatus)));
		Select CallBlock = new Select(driver.findElement(Select_CallBlockStatus));
		CallBlock.selectByValue("false");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_CallBlockStatus.",
				"The user Selected_CallBlockStatus from the dropdown successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Contact_status)));
		Select ContactStatus = new Select(driver.findElement(Contact_status));
		ContactStatus.selectByValue("true");
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can select ContactStatus.",
				"The user selected ContactStatus from the dropdown successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Filter_sort)));
		Select SortFilter = new Select(driver.findElement(Filter_sort));
		SortFilter.selectByValue("desc_created_at");
		Thread.sleep(2000);
		String fileWithPathh = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\All API Page all filter 3.png";
		TestBase.takeSnapShot(driver, fileWithPathh);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can select Filter_sort.",
				"The user selected Filter_sort from the dropdown successfully.");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Clear_filter)));
		driver.findElement(Clear_filter).click();
		Thread.sleep(2000);
		String fileWithPathhh = "D:\\LeadDistro-Automation\\LeadDistro_automation\\Screen_shot\\All API Page cleared all filters 4.png";
		TestBase.takeSnapShot(driver, fileWithPathhh);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Clear_filter.",
				"The user Cleared the_filter successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Export_skipped_leads)));
		driver.findElement(Export_skipped_leads).click();
		Thread.sleep(2000);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Export_skipped_leads.",
				"The user Exported_skipped_leads from the dropdown successfully.");
		System.out.println("Pom_ProjectSetting_ALL_API_Leads_1 Passed Successfully.");
	}

	By Click_on_pagination = By.xpath("//a[normalize-space()='Last']");
	By Click_on_close_btn = By.xpath("//button[normalize-space()='Close']");

	public void Pom_ProjectSetting_ALL_API_Leads_2() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		try {
			if (driver.findElement(Click_on_pagination).isDisplayed()) {
				TestBase.ScrollIntoView(driver, driver.findElement(Click_on_pagination));
				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_pagination)));
				driver.findElement(Click_on_pagination).click();

				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_pagination.",
						"The user Clicked_on_pagination successfully");

				wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Select_status)));
				Select leadStatus = new Select(driver.findElement(Select_status));
				leadStatus.selectByValue("all");
				ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Select_status.",
						"The user Selected_status from the dropdown successfully");
			}
		} catch (NoSuchElementException ele) {
			System.out.println("The API leads not in large number to activate the pagination.");
		}

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_the_view_button)));
		driver.findElement(Click_on_the_view_button).click();
		String popuptext = "Lead Details";
		Thread.sleep(2000);
		//TestBase.verifyTextPresence(driver, popuptext);
		
		TestBase.ScrollBottomOfthePage(driver);
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_the_view_button.",
				"The user Clicked_on_the_view_button from the dropdown successfully");

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Click_on_close_btn)));
		driver.findElement(Click_on_close_btn).click();
		ExtentTestManager.getTest().log(LogStatus.PASS, "Verify the user can Click_on_close_btn.",
				"The user Clicked_on_close_btn successfully");

		System.out.println("Pom_ProjectSetting_ALL_API_Leads_2 Passed Successfully.");

	}
}
