package com.dooby.pages.crm.accounts;




import com.dooby.base.Page;

public class CreateAccountPage extends Page{
	
	public void CreateAccount(String accountName) {
		
		//driver.switchTo().alert().dismiss();
		
		
		Page.iType("createAccountname_CSS", accountName);
		
		
	}



}
