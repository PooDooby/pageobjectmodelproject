package com.dooby.pages;

import org.openqa.selenium.By;

import com.dooby.base.Page;

public class HomePage extends Page {
	
	public void goToCustomers() {

	}

	public void goToSupport() {
		
		driver.findElement(By.cssSelector("a[class='zh-support']")).click();
	}

	public LoginPage goToLogin() throws InterruptedException {
		
		iClick("loginlink_CSS");
		
		Thread.sleep(3000);
		
		return new LoginPage();
		
	}

	public void goToSignUp() {
		
		driver.findElement(By.cssSelector("a[class='zh-signup']")).click();

	}
	
	public void goToLearnMore() {  
		
		driver.findElement(By.cssSelector("a[class='learn-more']")).click();

	}
	
	
	public void validateFooterLinks() {

	}

}
