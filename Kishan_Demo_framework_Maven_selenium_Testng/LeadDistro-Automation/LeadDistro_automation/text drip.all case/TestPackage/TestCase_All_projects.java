package TestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_All_projects extends BaseClass {
	@Test(description = "In this test we are checking all project page functionality.", priority = 1)
	public void Verify_the_Pom_ProjectSetting_AllProjects() throws Exception {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_ProjectSetting_AllProjects All_projects = new PomPackage.Pom_ProjectSetting_AllProjects(webDriver);
		All_projects.Pom_ProjectSetting_AllProjects_1();
	}
}