package com.dooby.testCases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dooby.pages.HomePage;
import com.dooby.pages.LoginPage;
import com.dooby.pages.ZohoAppPage;
import com.dooby.utilities.TestUtility;

public class LoginTest extends BaseTest {
	
	@Test(dataProviderClass = TestUtility.class, dataProvider = "podu")
	public void loginTest(Hashtable<String , String> data) throws InterruptedException {
		
		HomePage hpage = new HomePage();

		LoginPage login = hpage.goToLogin();

		ZohoAppPage zp = login.doLogin(data.get("username"), data.get("password"));
		
		Assert.fail("Failing Intentionally to check the screenshot");
		
	}
	
	

}
