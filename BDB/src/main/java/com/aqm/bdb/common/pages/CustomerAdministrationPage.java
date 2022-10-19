package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

public class CustomerAdministrationPage extends BasePage {
	
private static CustomerAdministrationPage custAdmin;
	
	private CustomerAdministrationPage() {
		
		
		
	}
	
	public static CustomerAdministrationPage getcustadmin() {
		
		if (custAdmin==null) {
			
			custAdmin= new CustomerAdministrationPage();
		}
		
		return custAdmin;
	}
	
	
	By customerAdmin_tab= By.xpath("//div[contains(text(),' Customer Administration')]");
	By hamburgericon =By.xpath("//i[@class='fa fa-navicon']");
	By customerCreationDropdown= By.xpath("//a[@id='mainContainermenu1']");
	By customerNameTextField= By.xpath("//input[@id='ums_corporateAdministration_groupCreationPage_groupName']");
	By descriptionTextArea =By.xpath("//textarea[@id='ums_corporateAdministration_groupCreationPage_descriptor']");
	By customerTypeDropdown= By.xpath("//select[@id='ums_corporateAdministration_groupCreationPage_customerType']");
	By multiUserRequiredCheckBox= By.xpath("//input[@id='ums_corporateAdministration_groupCreationPage_multiUserRequired']");
	By createButton= By.xpath("//button[@id='ums_corporateAdministration_groupCreationPage_create']");
	By popUpOKButton =By.xpath("//button[text()='OK']");
	By nameTextField= By.xpath("//input[@id='ums_corpAdmin_groupListPage_groupName']");
	By searchButton= By.xpath("//button[@id='searchButton']");
	
	
	
	public void clickCustomerAdminTab() {
		driver.switchTo().frame("frame-1-4");
		click(customerAdmin_tab);
	}
	
	public void clickHamburgericon() {
		click(hamburgericon);
	}
	
	public void clickCustCreationOp() {
		click(customerCreationDropdown);
	}
	
	public void fillBasicDetails(String name,String description,String cust_type) {
		
		clearAndSendKeys(customerNameTextField, name);
		clearAndSendKeys(descriptionTextArea, description);
		selectValueFromList(customerTypeDropdown, cust_type);
	}
	
	public void multiUserCheckBox() {
		click(multiUserRequiredCheckBox);
	}
	
	public void clickCreate() {
		click(createButton);
	}
	
	public void okPopUp() {
		
		fetchTextFromApplication(By.xpath("//button[contains(text(),'OK')]//preceding::li[1]"), "Popup Status: ");
		click(popUpOKButton);
	}
	
	public void custName(String name) {
		clearAndSendKeys(nameTextField, name);
	}
	
	public void clickSearch() {
		click(searchButton);
	}
	
	public void clickNameLink(String name) {
		By namelink= By.xpath("//a[@title='"+name+"']");
		click(namelink);
	}
	
	
	
	
}
