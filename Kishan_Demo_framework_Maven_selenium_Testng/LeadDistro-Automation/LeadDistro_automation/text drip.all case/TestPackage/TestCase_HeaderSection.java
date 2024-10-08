package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_HeaderSection extends BaseClass {
	@Test(description = "This test will verify that the user can check the header section of the application.")
	public void Verify_User_Can_Check_the_header_section() throws InterruptedException, IOException {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_HeaderSection_Check Header = new PomPackage.Pom_HeaderSection_Check(webDriver);
		Header.HeaderPom_1();
		Header.HeaderPom_2();
	}
}
