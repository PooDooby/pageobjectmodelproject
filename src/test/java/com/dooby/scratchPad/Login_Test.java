package com.dooby.scratchPad;

import com.dooby.base.Page;
import com.dooby.pages.HomePage;
import com.dooby.pages.LoginPage;
import com.dooby.pages.ZohoAppPage;
import com.dooby.pages.crm.accounts.AccountsPage;
import com.dooby.pages.crm.accounts.CreateAccountPage;

public class Login_Test {

	public static void main(String[] args) throws InterruptedException {

		HomePage hpage = new HomePage();

		LoginPage login = hpage.goToLogin();

		ZohoAppPage zp = login.doLogin("skshitiz_gupta@yahoo.com", "dFwcF959");

		zp.goToCRM();

		AccountsPage ap = Page.topmenu.gotoAccounts();

		CreateAccountPage cap = ap.goToCreateAccounts();

		cap.CreateAccount("Pooja");

		Thread.sleep(5000);
		
		Page.driver.quit();
	}

}
