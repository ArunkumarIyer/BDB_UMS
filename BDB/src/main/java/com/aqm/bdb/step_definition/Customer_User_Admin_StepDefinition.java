package com.aqm.bdb.step_definition;

import com.aqm.bdb.common.pages.CustomerUserAdminPage;

import io.cucumber.java.en.Then;

public class Customer_User_Admin_StepDefinition {

	@Then("Click on Customer User Administration Icon")
	public void click_on_customer_user_administration_icon() {
		CustomerUserAdminPage.getcustuseradmin().clickCustUserAdmin();
	}

	@Then("Click on Hamburger Icon")
	public void click_on_hamburger_icon() {
		CustomerUserAdminPage.getcustuseradmin().selectHamburgerOption();
	}

	@Then("Select {string} value in User Category DropDown")
	public void select_value_in_user_category_drop_down(String user_catrgory) {
		CustomerUserAdminPage.getcustuseradmin().selectUserCategory(user_catrgory);
	}

	@Then("Enter {string} in login ID TextField")
	public void enter_in_login_id_text_field(String loginid) {
		CustomerUserAdminPage.getcustuseradmin().setLoginID(loginid);
	}

	@Then("Enter {string} in First Name TextField")
	public void enter_in_first_name_text_field(String firstname) {
		CustomerUserAdminPage.getcustuseradmin().setFirstName(firstname);
	}

	@Then("Enter {string} in Last Name TextField")
	public void enter_in_last_name_text_field(String lastname) {
		CustomerUserAdminPage.getcustuseradmin().setLastName(lastname);
	}

	@Then("Select {string} in Country DropDown")
	public void select_in_country_drop_down(String country) {
		CustomerUserAdminPage.getcustuseradmin().selectCountry(country);
	}

	@Then("Select {string} in Phonen Number Country")
	public void select_in_phonen_number_country(String number) {
		CustomerUserAdminPage.getcustuseradmin().selectPhoneNumCountry(number);
	}

	@Then("Enter {string} in Phone Number TextField")
	public void enter_in_phone_number_text_field(String pho_number) {
		CustomerUserAdminPage.getcustuseradmin().setPhoneNum(pho_number);
	}

	@Then("Enter {string} in email ID TextField")
	public void enter_in_email_id_text_field(String emailId) {
		CustomerUserAdminPage.getcustuseradmin().setEmailId(emailId);
	}

	@Then("Click on Customer search Button")
	public void click_on_customer_search_button() {
		CustomerUserAdminPage.getcustuseradmin().clickCustSearch();
	}

	@Then("Enter {string} in Customer Name TextField")
	public void enter_in_customer_name_text_field(String name) {
		CustomerUserAdminPage.getcustuseradmin().custNameField(name);
	}

	@Then("Click on Search Button")
	public void click_on_search_button() {
		CustomerUserAdminPage.getcustuseradmin().clickSearchCust();
	}

	@Then("Click on Proceed Button")
	public void click_on_proceed_button() throws Exception {
		CustomerUserAdminPage.getcustuseradmin().selectCust();
	}

	@Then("Click on Save Button")
	public void click_on_save_button() {
		CustomerUserAdminPage.getcustuseradmin().saveButton();
	}

	@Then("Click on customer Radio Button")
	public void click_on_customer_radio_button() throws Exception {
		CustomerUserAdminPage.getcustuseradmin().custRadioButton();
	}

	// Existing checker search text field
	@Then("Enter {string} in Customer User Management login ID TextField")
	public void enter_in_customer_user_management_login_id_text_field(String name) {
		CustomerUserAdminPage.getcustuseradmin().searchUserID(name);
	}

}
