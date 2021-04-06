package com.dooby.pages;

import org.openqa.selenium.By;


import com.dooby.base.Page;
import com.dooby.pages.crm.CRMHomePage;

public class ZohoAppPage  extends Page{
	
	
	public CRMHomePage goToCRM() {
		
		
		iClick("crmLink_XPATH");
		
		return new CRMHomePage();
		
	}

	public void goToDesk() {
		
		driver.findElement(By.xpath("//div[contains(text(),'Desk')]")).click();
		
	}

	public void goToCliq() {
		
		driver.findElement(By.xpath("//div[contains(text(),'Cliq')]")).click();
		
	}

}
