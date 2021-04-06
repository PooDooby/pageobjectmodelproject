package com.dooby.testCases;

import org.testng.annotations.AfterSuite;

import com.dooby.base.Page;



public class BaseTest  {
	
	@AfterSuite
	public void  tearDown() {
		
		Page.driver.quit();
	}

}
