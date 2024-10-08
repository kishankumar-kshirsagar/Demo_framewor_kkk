package TestPackage;

import java.io.IOException;

import org.testng.annotations.Test;
import BasePackage.BaseClass;
import BasePackage.TestBase;
import PomPackage.LoginPOM;

public class Login_testCase extends BaseClass {

	@Test(description = "This test will verify that User can able to login into the Application")
	
	public void Verify_User_Can_Able_To_Login() throws InterruptedException, IOException {
		
		loginTD();
		Thread.sleep(5000);

	}

}
