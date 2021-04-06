package com.dooby.pages.crm.accounts;

import com.dooby.base.Page;

public class AccountsPage extends Page {
	
	
	public CreateAccountPage goToCreateAccounts() {
		
		
		driver.switchTo().frame("crmLoadFrame");
		iClick("createaccountbtn_XPATH");
		
		return new CreateAccountPage();

	}

	public void goToImportAccounts() {

	}

}
