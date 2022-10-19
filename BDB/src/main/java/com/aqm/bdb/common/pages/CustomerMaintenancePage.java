package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aqm.bdb.utilities.BasePage;

public class CustomerMaintenancePage extends BasePage {

	private static CustomerMaintenancePage custmaintenance;

	private CustomerMaintenancePage() {



	}

	public static CustomerMaintenancePage getcustmaintenance() {

		if (custmaintenance==null) {

			custmaintenance= new CustomerMaintenancePage();
		}

		return custmaintenance;
	}

	By customerIdTab = By.xpath("//a[@id='div-vertical-menu-tran-conattachChannelCustomer']");
	By attachButton =By.xpath("//button[@id='ums_corpAdmin_CIFsList_attach']");
	//Customer Creation Task
	By actLink = By.xpath("(//a[@name='act'])[1]");
	By hostCustomerIdTextField = By.xpath("//input[@id='ums_corpAdmin_custCreation_customerID']");
	By customerIdSearchButton = By.xpath("//button[@id='searchButton']");
	By customerRadioButton = By.xpath("//input[@id='ums_corpAdmin_custCreation_checkboxRow_hostCustomerListTable1']");
	By customerConfirmButton = By.xpath("//button[@id='ums_corpAdmin_custCreation_save']");
	By popOKButton =By.xpath("//button[@id='ok-button']");
	By resumeButton = By.xpath("//button[@id='ums_corpAdmin_CIFsList_Resume']");
	//Account Selection Task
	By accountSelectionActLink = By.xpath("(//a[@title='Act'])[1]");
	By customerCheckBoxOne =By.xpath("//input[@id='ums_corpAdmin_accountSelectionPage_checkboxRow_listOfAccountsTable1']");
	By customerCheckBoxTwo =By.xpath("//input[@id='ums_corpAdmin_accountSelectionPage_checkboxRow_listOfAccountsTable2']");
	By addPaymentTypeLinkOne =By.xpath("//a[@id='ums_corpAdmin_accountSelectionPage_actionRow_listOfAccountsTable1']");
	By addPaymentTypeLinkTwo =By.xpath("//a[@id='ums_corpAdmin_accountSelectionPage_actionRow_listOfAccountsTable2']");		
	By accountConfirmButton =By.xpath("//button[@id='ums_corpAdmin_accountSelection_confirm']");
	By paymentAddButton =By.xpath("//button[@id='ums_corpAdmin_accountToPaymentTypeMappingPage_add']");
	By selectAllPaymentType =By.xpath("//select[@name='allowedPaymentType']");

	//Parameters Setting Task
	By parametersSettingActLink =By.xpath("(//a[@name='act'])[3]");		
	By customerLimitTextField =By.xpath("//input[@aria-label='Customer Limit']");
	By multiFactorAuthenticationTab = By.xpath("//h2[text()='Multi Factor Authentication']");
	By allowedOption =By.xpath("//option[text()='OTP']");
	By allowedButtonOption =By.xpath("//button[@id='ums_corpAdmin_parametersPage_mfa_multiselect_rightAll']");
	By parameterSubmitButton =By.xpath("//button[@id='ums_corpAdmin_parametersPage_submit']");

	By releaseButton = By.xpath("//button[@id='ums_corpAdmin_custMaintenance_releaseCust']");
	By plusIconButton =By.xpath("//div[@class='newTabOptions']//div[1]");
	By userAdminOption =By.xpath("//li[@title='User Admin']");
	By customerAdministrationIcon =By.xpath("//div[text()=' Customer Administration']");
	By nameTextField =By.xpath("//input[@id='ums_corpAdmin_groupListPage_groupName']");
	By searchButton =By.xpath("//button[@id='searchButton']");

	By grantModulesTab = By.xpath("//a[@title='Grant Modules']");
	By moveRightButton = By.xpath("(//button[@class='LRControl'])[3]");
	By grantConfirmButton = By.xpath("//button[@id='ums_corpAdmin_grantModules_submit_init']");
	By singleMoverightButton =By.xpath("//button[@id='ums_corpAdmin_grantModules_modules_multiselect_rightSelected']");


	By serviceAccessProfileTab =By.xpath("//a[@title='Service Access Profile']");
	By moveToRightButton = By.xpath("(//button[@class='LRControl']//i)[3]");

	By confirmButton =By.xpath("//button[@id='ums_corpAdmin_grantRoles_confirm']");		

	By grantRolesTab =By.xpath("//a[@title='Grant Roles']");
	By logoutButton =By.xpath("//a[@title='Logout']//i[1]");	
	By singleRightMoveGrantButton =By.xpath("//button[@id='ums_corpAdmin_grantRoles_roles_multiselect_rightSelected']");
	By grantRoleSubmitButton =By.xpath("//button[@id='ums_corpAdmin_grantRoles_confirm']");


	public void clickCustIdTab() {
		click(customerIdTab);
	}

	public void clickAttachButton() {
		click(attachButton);
	}

	public void clickOnAct() {
		click(actLink);
	}

	public void EnterHostId(String Cif_no) {
		clearAndSendKeys(hostCustomerIdTextField, Cif_no);

	}

	public void custIdSearch() {
		click(customerIdSearchButton);
	}

	public void clickRadioButton() {
		click(customerRadioButton);
	}

	public void clickCustConfirm() {
		click(customerConfirmButton);
	}

	public void clickOnResume() {
		click(resumeButton);
	}

	public void accountSelectionActLink() {
		click(accountSelectionActLink);
	}

	public void clickAccountConfirm() throws Exception {
		Thread.sleep(5000);
		click(accountConfirmButton);
	}

	public void parameterActLink() {
		click(parametersSettingActLink);
	}

	public void parameterSubmit() {
		click(parameterSubmitButton);
	}

	public void clickRelease() {
		click(releaseButton);
	}

	public void clickGrantMod() {
		click(grantModulesTab);
	}

	public void moveToRight() throws Exception {
		Thread.sleep(3000);
		click(moveRightButton);
	}

	public void grantConfirm() {
		click(grantConfirmButton);
	}

	public void grantRoleTab() {
		click(grantRolesTab);
	}

	public void grantRetailOptions(String op) throws Exception {

		Thread.sleep(10000);
		Actions action = new Actions(driver);
		int optionNo=driver.findElements(By.xpath("//select[@id='ums_corpAdmin_grantRoles_roles_from']//optgroup[@label='"+op+"']/option")).size();
		for(int i=1;i<=optionNo;i++)
		{
			
			WebElement options= driver.findElement(By.xpath("//select[@id='ums_corpAdmin_grantRoles_roles_from']//optgroup[@label='"+op+"']/option["+i+"]"));
			
			if(i==1)
			{
				Thread.sleep(1000);
				options.click();
			}
			else
			{
				if(i==2)
				{
					action.keyUp(Keys.SHIFT);
				}
				Thread.sleep(1000);
				options.click();
			}

			if(optionNo==i)
			{
				action.keyDown(Keys.SHIFT);
			}
		}	

	}

	public void singleMoveRight() {
		click(singleRightMoveGrantButton);
	}
	
	public void grantRoleSubmit() throws Exception {
		click(grantRoleSubmitButton);
		Thread.sleep(2000);
	}



}
