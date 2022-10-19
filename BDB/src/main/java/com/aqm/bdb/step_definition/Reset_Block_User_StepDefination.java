package com.aqm.bdb.step_definition;

import com.aqm.bdb.common.pages.Reset_Block_User_Page;

import io.cucumber.java.en.Then;

public class Reset_Block_User_StepDefination {

	@Then("Click on {string}  Login ID Link")
	public void click_on_login_id_link(String string) throws InterruptedException {
		Reset_Block_User_Page.getResetBlockUser().clickUserLink();
	}

	@Then("Click on Reset Password Tab")
	public void click_on_reset_password_tab() {
		Reset_Block_User_Page.getResetBlockUser().clickResetPasswordTab();
	}

	@Then("Enter {string} in Remark")
	public void enter_in_remark(String remark) {
		Reset_Block_User_Page.getResetBlockUser().enterRemark(remark);
	}

	@Then("Click on Confirm Button")
	public void click_on_confirm_button() {
		Reset_Block_User_Page.getResetBlockUser().clickConfirmButton();
	}

	@Then("Enter {string} in Other Details")
	public void enter_in_other_details(String remark) {
		Reset_Block_User_Page.getResetBlockUser().enterOtherDetails(remark);
	}

	@Then("Select {string} in Customer User Management")
	public void select_in_customer_user_management(String user_catrgory) {
		Reset_Block_User_Page.getResetBlockUser().selectUser(user_catrgory);
	}

	@Then("Click on Block User")
	public void click_on_block_user() {
		Reset_Block_User_Page.getResetBlockUser().clickBlockUserTab();
	}

	@Then("Click on {string} Login ID Link in Customer User Management")
	public void click_on_login_id_link_in_customer_user_management(String string) {
		Reset_Block_User_Page.getResetBlockUser().clickUserIDLink();
	}

}
