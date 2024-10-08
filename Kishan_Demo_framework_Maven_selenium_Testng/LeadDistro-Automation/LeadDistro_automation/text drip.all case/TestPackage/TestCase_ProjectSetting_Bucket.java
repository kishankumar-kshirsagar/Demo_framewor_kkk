package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_ProjectSetting_Bucket extends BaseClass {
	@Test(description = "In this test we are checking create Bucket add and edit,  functionality.", priority = 1)
	public void Verify_the_user_can_validate_bucket_setting() throws InterruptedException, IOException {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_ProjectSetting_Bucket_1 ProjectSetting_1 = new PomPackage.Pom_ProjectSetting_Bucket_1(webDriver);
		ProjectSetting_1.Pom_ProjectSetting_Bucket_1_1();
		ProjectSetting_1.Pom_ProjectSetting_Bucket_1_2();
		ProjectSetting_1.Pom_ProjectSetting_Bucket_1_3();
	}



	@Test (description = "In this test we are checking update,filter and edit setting of the buckets.", priority = 2)
	public void Verify_Pom_ProjectSetting_Bucket_2() throws Exception {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_ProjectSetting_Bucket_2 act=new PomPackage.Pom_ProjectSetting_Bucket_2(webDriver);
		act.Pom_ProjectSetting_Bucket_2_1();
		act.Pom_ProjectSetting_Bucket_2_2();
		act.Pom_ProjectSetting_Bucket_2_3();
	}

}
