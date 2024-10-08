package TestPackage;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_Create_project extends BaseClass {
	@Test(description = "In this test we are checking create project functionality.", priority = 1)
	public void Verify_Pom_Create_project_1() throws InterruptedException, IOException, AWTException {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_Create_project_1 CreateProject = new PomPackage.Pom_Create_project_1(webDriver);
		CreateProject.Pom_Create_project_1_1();
	}
}
