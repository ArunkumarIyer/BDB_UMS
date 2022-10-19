package com.aqm.bdb.step_definition;

import com.aqm.bdb.common.pages.AuthorizationMatrix;
import com.aqm.bdb.common.pages.UserLevelLimitPage;

import io.cucumber.java.en.*;

public class UserLimitandAuthorizationMatrix_StepDefinition {



	@Then("Click on user level act link")
	public void click_on_user_level_act_link() {
		UserLevelLimitPage.getuserlevellimit().userLimitActLink();
	}


	@Then("Select Currency DropDown {string}")
	public void select_currency_drop_down(String currency) {


		UserLevelLimitPage.getuserlevellimit().selectCurrency(currency);
	}


	@Then("Select Authorization Type DropDown {string}")
	public void select_authorization_type_drop_down(String auth_type) {
		UserLevelLimitPage.getuserlevellimit().selectAuthType(auth_type);
	}


	@Then("Select Transaction DropDown {string}")
	public void select_transaction_drop_down(String tran) {

		UserLevelLimitPage.getuserlevellimit().selectTransaction(tran);
	}

	@Then("Click on Limit Proceed Button")
	public void click_on_limit_proceed_button() {

		UserLevelLimitPage.getuserlevellimit().clickProceed();
	}

	@Then("Enter value in Upper Limit TextField {string}")
	public void enter_value_in_upper_limit_text_field(String Makerupperlimit) {
		UserLevelLimitPage.getuserlevellimit().makerUpperLimit(Makerupperlimit);
	}


	@Then("Enter value in Upper Limit Textfield {string}")
	public void enter_value_in_upper_limit_textfield(String upperlimit) {
		UserLevelLimitPage.getuserlevellimit().checkerUpperLimit(upperlimit);
	}

	@Then("Select Override Flag DropDown {string}")
	public void select_override_flag_drop_down(String override) {
		UserLevelLimitPage.getuserlevellimit().overrideFlag(override);
	}

	@Then("Enter value in per Day Limit TextField {string}")
	public void enter_value_in_per_day_limit_text_field(String perdaylimit) {
		UserLevelLimitPage.getuserlevellimit().PerDayLimit(perdaylimit);
	}

	@Then("Enter value in Future Transaction Limit TextField {string}")
	public void enter_value_in_future_transaction_limit_text_field(String tranlimit) {
		UserLevelLimitPage.getuserlevellimit().TranLimitField(tranlimit);

	}
	@Then("Click on limit Submit Button")
	public void click_on_limit_submit_button() {
		UserLevelLimitPage.getuserlevellimit().clickSubmit();
	}
	@Then("Enter value in lower Limit Textfield {string}")
	public void enter_value_in_lower_limit_textfield(String lowlimit) {

		UserLevelLimitPage.getuserlevellimit().checkerLowerLimit(lowlimit);
	}

	//Authorization Matrix

	@Then("Click on authorization matrix act link")
	public void click_on_authorization_matrix_act_link() {
		AuthorizationMatrix.getauthmatrix().authActLink();
	}

	@Then("Select value in Transaction dropdown {string}")
	public void select_value_in_transaction_dropdown(String trans) {
		AuthorizationMatrix.getauthmatrix().selectTransaction(trans);
	}

	@Then("Select value from currency dropdown {string}")
	public void select_value_from_currency_dropdown(String currency) {
		AuthorizationMatrix.getauthmatrix().selecturrency(currency);
	}

	@Then("Enter value in Minimum transaction amount Textfield {string}")
	public void enter_value_in_minimum_transaction_amount_textfield(String min_amount) {
		AuthorizationMatrix.getauthmatrix().minAmount(min_amount);
	}

	@Then("Enter value in Maximum transaction amount Textfield {string}")
	public void enter_value_in_maximum_transaction_amount_textfield(String max_amount) {
		AuthorizationMatrix.getauthmatrix().maxAmount(max_amount);
	}

	@Then("Enter value in Approvals TextField {string}")
	public void enter_value_in_approvals_text_field(String app) {
		AuthorizationMatrix.getauthmatrix().Approvals(app);
	}

	@Then("Select value in Repeat Flag DropDown {string}")
	public void select_value_in_repeat_flag_drop_down(String flag) {
		AuthorizationMatrix.getauthmatrix().repeatFlag(flag);
	}

	@Then("Select value level DropDown {string}")
	public void select_value_level_drop_down(String level) throws Exception {
		AuthorizationMatrix.getauthmatrix().Level(level);
	}

	@Then("Click on Authorization Save Button")
	public void click_on_authorization_save_button() {
		AuthorizationMatrix.getauthmatrix().clickonSave();
	}


	@Then("Click on authrization Proceed Button")
	public void click_on_authrization_proceed_button() {
		AuthorizationMatrix.getauthmatrix().clickAuthProceed();
	}







}
