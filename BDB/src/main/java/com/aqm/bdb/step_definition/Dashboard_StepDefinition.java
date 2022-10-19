package com.aqm.bdb.step_definition;

import com.aqm.bdb.common.pages.DashboardPage;

import io.cucumber.java.en.*;

public class Dashboard_StepDefinition {
	
	@Then("Click on plus")
	public void click_on_plus() {
		
		DashboardPage.getdashboard().clickPlus();
	    
	}
	
	
	@Then("Click on User Admin")
	public void click_on_user_admin() {
		
		DashboardPage.getdashboard().clickUserAdmin();
	   
	}

}
