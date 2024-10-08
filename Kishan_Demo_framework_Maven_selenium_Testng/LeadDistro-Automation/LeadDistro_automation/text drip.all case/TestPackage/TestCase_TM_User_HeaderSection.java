package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_TM_User_HeaderSection extends BaseClass {
	@Test(description = "This test we are checking the Team Member role Header section functionality.")
	public void verify_Pom_TM_User_Header_section_Profile_Dashboard() throws InterruptedException, IOException {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_TM_User_Header_seartion_Profile_Dashboard  TMUser= new PomPackage.Pom_TM_User_Header_seartion_Profile_Dashboard(webDriver);
		TMUser.TM_User_HeaderPom_1();
	}

}
