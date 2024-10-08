package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_TeamMemberSetting extends BaseClass {

	@Test(description="This test will verify the All TM page, link a member page, unlink a member page functionality.", priority=1)
	public void Verify_Pom_TeamMemberSetting_1() throws Exception {

		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_TeamMemberSetting_1 teamMember=new PomPackage.Pom_TeamMemberSetting_1(webDriver);
		teamMember.Pom_TeamMemberSetting_1_1();
		teamMember.Pom_TeamMemberSetting_2_2();
		teamMember.Pom_TeamMemberSetting_3_3();
		teamMember.Pom_TeamMemberSetting_4_4();
		teamMember.Pom_TeamMemberSetting_5_5();
		teamMember.Pom_TeamMemberSetting_6_6();
	}
	@Test(description="This test will verify that Tm with o limit page functionality.", priority=2)
	public void Verify_Pom_TeamMemberSetting_2() throws Exception {

		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_TeamMemberSetting_2 teamMember=new PomPackage.Pom_TeamMemberSetting_2(webDriver);
		teamMember.Pom_TeamMemberSetting_2_1();
     	teamMember.Pom_TeamMemberSetting_2_2();
		teamMember.Pom_TeamMemberSetting_2_3();
	}

}
