package com.dooby.pages;
import com.dooby.base.Page;

public class LoginPage extends Page{
	

	public ZohoAppPage doLogin(String userName, String passWord) throws InterruptedException {
		
		iType("email_CSS", userName);
		
		iClick("signbtn_XPATH");
		
		Thread.sleep(3000);
		
		iType("password_CSS", passWord);
	
		Thread.sleep(3000);
		
		iClick("signbtn_XPATH");
		
		return new ZohoAppPage();
		
	}
	
	public void goToSalesnMarketing() {}

	public void gotoFinance() {}

}
