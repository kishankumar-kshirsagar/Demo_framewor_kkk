package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_TM_User_Account_Section extends BaseClass {

	@Test(description = "This test we are checking the Team Member user role Account section functionality.")
	public void verify_Pom_TM_User_Account_section() throws Exception {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_TM_User_Account_section TM_User_Account= new PomPackage.Pom_TM_User_Account_section(webDriver);
		TM_User_Account.Pom_TM_User_Account_section_1();
		loginTD();
		TM_User_Account.Pom_TM_User_Account_section_2();
	}

}
