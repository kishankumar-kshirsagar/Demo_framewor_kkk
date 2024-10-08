package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import BasePackage.BaseClass;

public class TestCase_AccountSection extends BaseClass {
	@Test(description = "This test will verify that the user can check the account sectting of the application.")
	public void verify_Pom_AccountSection_1() throws InterruptedException, IOException {
		loginTD();
		Thread.sleep(2000);
		PomPackage.Pom_AccountSection account = new PomPackage.Pom_AccountSection(webDriver);
	    account.Pom_AccountSection_1();
	}
}
