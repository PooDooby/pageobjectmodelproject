package com.dooby.testCases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dooby.base.Page;
import com.dooby.pages.ZohoAppPage;
import com.dooby.pages.crm.accounts.AccountsPage;
import com.dooby.pages.crm.accounts.CreateAccountPage;
import com.dooby.utilities.TestUtility;

public class CreateAccountTest {

	@Test(dataProviderClass = TestUtility.class, dataProvider = "podu")
	public void createAccountTest(Hashtable<String, String> data) {

		ZohoAppPage zp = new ZohoAppPage();

		zp.goToCRM();

		AccountsPage ap = Page.topmenu.gotoAccounts();

		CreateAccountPage cap = ap.goToCreateAccounts();

		cap.CreateAccount(data.get("accountname"));
		
		Assert.fail("Failing Intentionally to check the screenshot");

	}

}
