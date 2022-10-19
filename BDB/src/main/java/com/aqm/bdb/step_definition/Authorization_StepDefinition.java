package com.aqm.bdb.step_definition;

import com.aqm.bdb.common.pages.AuthorizationPage;
import com.aqm.bdb.common.pages.CustomerAdministrationPage;

import io.cucumber.java.en.*;

public class Authorization_StepDefinition {


	@Then("click on Pool radio button and enter remark {string}")
	public void click_on_pool_radio_button_and_enter_remark(String remark) {
		AuthorizationPage.getauth().clickAuthPoolRadioButton();
		AuthorizationPage.getauth().sendPoolRemark(remark);
	}


	@Then("click on submit button")
	public void click_on_submit_button() {
		AuthorizationPage.getauth().authPoolSubmit();

	}

	@Then("fetch the reference number")
	public void fetch_the_reference_number() {
		AuthorizationPage.getauth().transactionRefernceNumber();
	}

	@Then("click on Authorization queue icon")
	public void click_on_authorization_queue_icon() {
		AuthorizationPage.getauth().authQueueIcon();
	}

	@Then("Click on pool queue button")
	public void click_on_pool_queue_button() {
		AuthorizationPage.getauth().poolQueueLink();
	}
	@Then("enter the reference number and click on search button")
	public void enter_the_reference_number_and_click_on_search_button() throws Exception {
		AuthorizationPage.getauth().searchRef();

	}
	@Then("click on reference number link")
	public void click_on_reference_number_link() {
		AuthorizationPage.getauth().clickTransactionlink();
	}

	@Then("click on approve radio button and enter remark {string}")
	public void click_on_approve_radio_button_and_enter_remark(String remark) {
		AuthorizationPage.getauth().approveAuth(remark);
	}
	
	@Then("fetch pop-up box text click on ok button")
	public void fetch_pop_up_box_text_click_on_ok_button() {
		CustomerAdministrationPage.getcustadmin().okPopUp();
	}







}
