package com.dooby.base;

import org.openqa.selenium.WebDriver;

import com.dooby.pages.crm.accounts.AccountsPage;

public class TopMenu {

	WebDriver driver;

	public TopMenu(WebDriver driver) {

		this.driver = driver;
	}

	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountsPage gotoAccounts() {

		Page.iClick("accountsTab_XPATH");

		return new AccountsPage();

	}

	public void gotoDeals() {

	}

	public void gotoActivities() {

	}

	public void gotoReports() {

	}

	public void gotoAnalytics() {

	}

	public void gotoProducts() {

	}

	public void gotoQuotes() {

	}

	public void gotoSignOut() {

	}

}
