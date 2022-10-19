package com.aqm.bdb.step_definition;

import com.aqm.bdb.common.pages.CustomerAdministrationPage;
import com.aqm.bdb.common.pages.CustomerMaintenancePage;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Then;

public class Customer_Administration_StepDefinition {


	@Then("Click on Customer Administration")
	public void click_on_customer_administration() {
		CustomerAdministrationPage.getcustadmin().clickCustomerAdminTab();
	}


	@Then("Click on Hamburger icon")
	public void click_on_hamburger_icon() {
		CustomerAdministrationPage.getcustadmin().clickHamburgericon();
	}

	@Then("Click on Customer Creation option")
	public void click_on_customer_creation_option() {
		CustomerAdministrationPage.getcustadmin().clickCustCreationOp();
	}

	@Then("Fill customer basic details {string} {string} {string}")
	public void fill_customer_basic_details(String cust_name, String description, String cust_type) {

		CustomerAdministrationPage.getcustadmin().fillBasicDetails(cust_name, description, cust_type);
	}

	@Then("Click on Create button")
	public void click_on_create_button() {
		CustomerAdministrationPage.getcustadmin().clickCreate();
	}

	@Then("Handle the pop-up box")
	public void handle_the_pop_up_box() {
		
		CustomerAdministrationPage.getcustadmin().okPopUp();
	}

	@Then("landing page will appear")
	public void landing_page_will_appear() {

	}

	@Then("Enter customer name {string}")
	public void enter_customer_name(String cust_name) {

		CustomerAdministrationPage.getcustadmin().custName(cust_name);

	}

	@Then("click on search button")
	public void click_on_search_button() {

		CustomerAdministrationPage.getcustadmin().clickSearch();
	}

	@Then("click on customer link {string}")
	public void click_on_customer_link(String cust_name) {

		CustomerAdministrationPage.getcustadmin().clickNameLink(cust_name);
	}

	@Then("Customer maintance page will appear")
	public void customer_maintance_page_will_appear() {

	}

	@Then("Click on Customer Id Tab")
	public void click_on_customer_id_tab() {

		CustomerMaintenancePage.getcustmaintenance().clickCustIdTab();
	}

	@Then("Click on Attach Button")
	public void click_on_attach_button() {
		CustomerMaintenancePage.getcustmaintenance().clickAttachButton();
	}

	@Then("Click on Customer Host ID Act Link")
	public void click_on_customer_host_id_act_link() {
		CustomerMaintenancePage.getcustmaintenance().clickOnAct();
	}

	@Then("Enter CIF number {string} in Host Customer Id TextField")
	public void enter_cif_number_in_host_customer_id_text_field(String Cif_no) {

		CustomerMaintenancePage.getcustmaintenance().EnterHostId(Cif_no);
	}


	@Then("Click on CustomerId Search Button")
	public void click_on_customer_id_search_button() {
		CustomerMaintenancePage.getcustmaintenance().custIdSearch();
	}

	@Then("Click on Customer Radio Button")
	public void click_on_customer_radio_button(){
		CustomerMaintenancePage.getcustmaintenance().clickRadioButton();
	}

	@Then("Click on Customer Confirm Button")
	public void click_on_customer_confirm_button() {
		CustomerMaintenancePage.getcustmaintenance().clickCustConfirm();
	}

	@Then("click on Resume button")
	public void click_on_resume_button() {
		CustomerMaintenancePage.getcustmaintenance().clickOnResume();
	}

	@Then("click on Account Selection Act Link")
	public void click_on_account_selection_act_link() {
		CustomerMaintenancePage.getcustmaintenance().accountSelectionActLink();
	}
	@Then("Click on Account Confirm Button")
	public void click_on_account_confirm_button() throws Exception {
		CustomerMaintenancePage.getcustmaintenance().clickAccountConfirm();
	}

	@Then("Click on Parameters Setting Act Link")
	public void click_on_parameters_setting_act_link() {
		CustomerMaintenancePage.getcustmaintenance().parameterActLink();
	}
	@Then("Click on Parameter Submit Button")
	public void click_on_parameter_submit_button() {
		CustomerMaintenancePage.getcustmaintenance().parameterSubmit();
	}
	@Then("click on Release Button")
	public void click_on_release_button() {
		CustomerMaintenancePage.getcustmaintenance().clickRelease();
	}
	@Then("Click on Grant Modules Tab")
	public void click_on_grant_modules_tab() {
		CustomerMaintenancePage.getcustmaintenance().clickGrantMod();
	}
	@Then("Click on Digital option")
	public void click_on_digital_option() {

	}
	@Then("Click on Move Right Button")
	public void click_on_move_right_button() throws Exception {
		CustomerMaintenancePage.getcustmaintenance().moveToRight();
	}
	@Then("Click on Grant Confirm Button")
	public void click_on_grant_confirm_button() {

		CustomerMaintenancePage.getcustmaintenance().grantConfirm();

	}
	@Then("Click on Grant Roles Tab")
	public void click_on_grant_roles_tab() {

		CustomerMaintenancePage.getcustmaintenance().grantRoleTab();

	}

	@Then("select USER option {string} and added to right side")
	public void select_user_option_and_added_to_right_side(String op) throws Exception {
		CustomerMaintenancePage.getcustmaintenance().grantRetailOptions(op);
	}

	@Then("Click on single move right button")
	public void click_on_single_move_right_button() {
		CustomerMaintenancePage.getcustmaintenance().singleMoveRight();
	}


	@Then("Click on Grant Role Button")
	public void click_on_grant_role_button() throws Exception {

		CustomerMaintenancePage.getcustmaintenance().grantRoleSubmit();

	}

	@Then("Select Multi User Required CheckBox")
	public void select_multi_user_required_check_box() {
		CustomerAdministrationPage.getcustadmin().multiUserCheckBox();
	}
}
