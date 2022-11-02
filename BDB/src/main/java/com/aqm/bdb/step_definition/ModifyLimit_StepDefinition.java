package com.aqm.bdb.step_definition;

import com.aqm.bdb.common.pages.ModifyLimitPage;

import io.cucumber.java.en.Then;

public class ModifyLimit_StepDefinition {
	
	@Then("Click on Customer Host ID link")
	public void click_on_customer_host_id_link() {
		ModifyLimitPage.getmodifylimit().clickCustHostID();
	}

	@Then("Click on User level limits tab")
	public void click_on_user_level_limits_tab() {
		ModifyLimitPage.getmodifylimit().clickUserLimitTab();
	}

	@Then("Select User level limits option")
	public void select_user_level_limits_option() {
		ModifyLimitPage.getmodifylimit().clickUserLimitOp();
	}

	@Then("Click on modift link")
	public void click_on_modift_link() {
		ModifyLimitPage.getmodifylimit().clickModifyLink();
	}

	@Then("Update upper limit value {string}")
	public void update_upper_limit_value(String limit) {
		ModifyLimitPage.getmodifylimit().updateUpperLimit(limit);
	}

	@Then("Click on submit button")
	public void click_on_submit_button() {
		ModifyLimitPage.getmodifylimit().limitSubmit();
	}
	
	@Then("Click on delete link")
	public void click_on_delete_link() {
		ModifyLimitPage.getmodifylimit().limitDelete();
	}


}
