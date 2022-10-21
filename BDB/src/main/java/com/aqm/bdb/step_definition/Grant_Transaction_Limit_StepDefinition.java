package com.aqm.bdb.step_definition;

import com.aqm.bdb.common.pages.GrantTransactionLimit;

import io.cucumber.java.en.Then;

public class Grant_Transaction_Limit_StepDefinition {
	
	@Then("Click on Transaction Limit Tab")
	public void click_on_transaction_limit_tab() {
		GrantTransactionLimit.gettranlimit().clickLimitTab();
	}

	@Then("Select value from Customer Reference {string} DropDown")
	public void select_value_from_customer_reference_drop_down(String custref) {
		GrantTransactionLimit.gettranlimit().selectCustRef(custref);
	}

	@Then("Select value from Transaction Type DropDown {string}")
	public void select_value_from_transaction_type_drop_down(String tran) {
		GrantTransactionLimit.gettranlimit().selectTran(tran);
	}

	@Then("Select value from Currency DropDown {string}")
	public void select_value_from_currency_drop_down(String currency) {
		GrantTransactionLimit.gettranlimit().selectCurrencyf(currency);
	}

	@Then("Select value from Authorisation Type DropDown {string}")
	public void select_value_from_authorisation_type_drop_down(String auth) {
		GrantTransactionLimit.gettranlimit().selectAuthType(auth);
	}

	@Then("Click on transaction limit Proceed Button")
	public void click_on_transaction_limit_proceed_button() {
		GrantTransactionLimit.gettranlimit().clickLimitProceed();
	}
	
	@Then("Click on transaction limit Submit Button")
	public void click_on_transaction_limit_submit_button() {
		GrantTransactionLimit.gettranlimit().clickSubmit();
	}


}
