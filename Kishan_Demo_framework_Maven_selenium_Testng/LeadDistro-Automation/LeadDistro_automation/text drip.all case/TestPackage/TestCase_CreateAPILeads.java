package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_CreateAPILeads extends BaseClass {
	@Test(description = "This test will verify that the user can create the leads from API", priority=1)
	
	public void Verify_Pom_ProjectSetting_CreateAPILeads() throws InterruptedException, IOException {
		PomPackage.Pom_ProjectSetting_CreateAPILeads APILeads = new PomPackage.Pom_ProjectSetting_CreateAPILeads(webDriver);
		APILeads.Pom_createAPILeads_1();
		
	}
	
	@Test(description = "This test will verify that the user can apply filter to the API leads Page",priority=2)
	
	public void Verify_Pom_ProjectSetting_ALL_API_Leads() throws Exception {
		loginTD();
		PomPackage.Pom_ProjectSetting_ALL_API_Leads APILeadsPage = new PomPackage.Pom_ProjectSetting_ALL_API_Leads(webDriver);
		APILeadsPage.Pom_ProjectSetting_ALL_API_Leads_1();
		APILeadsPage.Pom_ProjectSetting_ALL_API_Leads_2();
	}
	
	
	
	
}
