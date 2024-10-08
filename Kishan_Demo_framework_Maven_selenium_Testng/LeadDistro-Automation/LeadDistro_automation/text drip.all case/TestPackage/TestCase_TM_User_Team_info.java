package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_TM_User_Team_info extends BaseClass {

	@Test(description = "This test we are checking the Team Member User role Team info functionality.")
	public void verify_Pom_TM_User_Team_info() throws Exception {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_TM_User_Leads_info  TM_User_Leads= new PomPackage.Pom_TM_User_Leads_info(webDriver);
		TM_User_Leads.Pom_TM_User_Leads_info_1();
		TM_User_Leads.Pom_TM_User_Leads_info_2();
	}

}


