package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

import io.cucumber.java.en.Then;

public class CustomerUserAdminPage extends BasePage{
	
private static CustomerUserAdminPage custuseradmin;
	
	private CustomerUserAdminPage() {
		
		
		
	}
	
	public static CustomerUserAdminPage getcustuseradmin() {
		
		if (custuseradmin==null) {
			
			custuseradmin= new CustomerUserAdminPage();
		}
		
		return custuseradmin;
	}
	
	
	By customerUserAdministrationIcon =By.xpath("//div[text()=' Customer User Administration']");
	By hamburgerIcon =By.xpath("//i[@class='fa fa-navicon']");
	By hamburgerOption =By.xpath("//a[@title='Create User']");		
	By userCategoryDropDown =By.xpath("//select[@id='ums_userManagement_createUser_userCategory']");
	By loginIDTextField = By.xpath("//input[@id='LoginId']");
	By firstNameTextField =By.xpath("//input[@id='firstName']");
	By lastNameTextField =By.xpath("//input[@id='lastName']");
	By countryDropDown = By.xpath("//select[@id='ums_userCreation_country']");
	By phonenNumberCountry =By.xpath("//select[@id='phonenNumberCountry']");
	By phoneNumberTextField =By.xpath("//input[@id='WORK_PHONE']");
	By emailIDextField =By.xpath("//input[@id='EMAIL']");
	By customersearchButton = By.xpath("//span[@id='span-createUser_groupSearch']");
	By customerNameTextField =By.xpath("//input[@id='ums_groupSearchPage_groupName']");
	By searchButton =By.xpath("//button[@id='searchButton']");
	By customerRadioButton =By.xpath("//input[@name='select']");
	By proceedButton =By.xpath("//button[@id='ums_groupSearchPage_proceed']");
	By saveButton =By.xpath("//button[@id='ums_userManagement_createUserPage_basicDetails']");
	By searchUserID =By.xpath("//input[@id='ums_userManagement_loginId']");
	By userCategoryDrop =By.xpath("//select[@name='userCategory']");	
	
	public void clickCustUserAdmin() {
		driver.switchTo().frame("frame-1-4");
		click(customerUserAdministrationIcon);
		
	}
	
	public void selectHamburgerOption() {
		click(hamburgerIcon);
		click(hamburgerOption);
	}
	
	public void selectUserCategory(String user_catrgory) {
		selectValueFromList(userCategoryDropDown, user_catrgory);
	}
	
	public void setLoginID(String loginid) {
		clearAndSendKeys(loginIDTextField, loginid);
	}
	
	public void setFirstName(String firstname) {
		clearAndSendKeys(firstNameTextField, firstname);
	}
	
	public void setLastName(String lastname) {
		clearAndSendKeys(lastNameTextField, lastname);
	}
	
	public void selectCountry(String country) {
		selectValueFromList(countryDropDown, country);
	}
	
	public void selectPhoneNumCountry(String number) {
		selectValueFromList(phonenNumberCountry, number);
	}
	
	public void setPhoneNum(String phonenum) {
		clearAndSendKeys(phoneNumberTextField, phonenum);
	}
	
	public void setEmailId(String emailId) {
		clearAndSendKeys(emailIDextField, emailId);
	}
	
	public void clickCustSearch() {
		click(customersearchButton);
	}
	
	public void custNameField(String name) {
		clearAndSendKeys(customerNameTextField, name);
	}
	
	public void clickSearchCust() {
		
		click(searchButton);
	}
	
	public void selectCust() {
		click(proceedButton);
	}
	
	public void saveButton() {
		moveToElementDown(saveButton);
		click(saveButton);
	}
	
	public void custRadioButton() throws Exception {
		Thread.sleep(2000);
		click(customerRadioButton);
	}
	
	public void searchUserID(String name) {
		clearAndSendKeys(searchUserID, name);
	}
	
	public void selectUserCategorydrop(String user_catrgory) {
        selectValueFromList(userCategoryDrop, user_catrgory);
    }
	
}
