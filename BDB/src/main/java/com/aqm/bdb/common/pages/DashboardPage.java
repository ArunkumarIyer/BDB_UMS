package com.aqm.bdb.common.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

public class DashboardPage extends BasePage {

	
private static DashboardPage dashboard;
	
	private DashboardPage() {
		
		
	}
	
	public static DashboardPage getdashboard() {
		
		if (dashboard==null) {
			
			dashboard= new DashboardPage();
		}
		
		return dashboard;
	}
	
	By Plus= By.xpath("//i[@class='fa fa-plus']");
	
	By User_admin= By.xpath("//a[contains(text(),'User Admin')]");
	
	public void clickPlus() {
		
		click(Plus);

	}
	
	public void clickUserAdmin() {
		
		click(User_admin);

	}

	
}
