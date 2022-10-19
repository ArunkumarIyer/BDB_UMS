package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

public class AuthorizationMatrix extends BasePage{
	
private static AuthorizationMatrix authmatrix;
	
	private AuthorizationMatrix() {
		
		
		
	}
	
	public static AuthorizationMatrix getauthmatrix() {
		
		if (authmatrix==null) {
			
			authmatrix= new AuthorizationMatrix();
		}
		
		return authmatrix;
	}
	
	
	By transactionDropDown =By.xpath("//select[@id='ums_la_viewAuthMatrixPage_transactionCorp']");
	By minimumTxnamountTextField =By.xpath("//input[@name='minTxnAmount']");
	By maximumTxnAmountTextField =By.xpath("//input[contains(@class,'form-control format')]");
	By proceedButton =By.xpath("//button[contains(text(),'Proceed')]");
	
	By approvalsTextField =By.xpath("(//input[@name='approvals'])[1]");
	By repeatFlagDropDown =By.xpath("(//select[@name='repeatFlag'])[1]");
	By levelDropDown =By.xpath("(//select[@name='capabilityLevel1'])[1]");

	By authorizationSaveButton =By.xpath("//button[@id='setAuthMatrixOnboardingSave']");
	By transactionNameLink =By.xpath("//a[@name='transactionName']");
	By addNewSlabOption =By.xpath("(//a[@id='mainContainermenu1'])[1]");
	By currencyDropDown =By.xpath("//select[@id='ums_la_setAuthMatrixPage_currency']");
	By authorizationMatrixLink =By.xpath("//a[@id='ums_corpAdmin_customerOnboardingStatus_hyperlinkRow_customerOnboardingStatusTable5']");
	By resumeButton =By.xpath("//button[@id='ums_corpAdmin_CIFsList_Resume']");
	By releaseButton =By.xpath("//button[@id='ums_corpAdmin_custMaintenance_releaseCust']");
	By saveButton=By.id("setAuthMatrixOnboardingSave");
	
	public void authActLink() {
		click(authorizationMatrixLink);
	}
	
	public void selectTransaction(String trans) {
		selectValueFromList(transactionDropDown,trans);
	}
	
	public void clickAuthProceed() {
		moveToElementDown(proceedButton);
		click(proceedButton);
	}
	
	public void selecturrency(String currency) {
		selectValueFromList(currencyDropDown, currency);
	}
	
	public void minAmount(String min_amount) {
		clearAndSendKeys(minimumTxnamountTextField, min_amount);
	}
	
	public void maxAmount(String max_amount) {
		clearAndSendKeys(maximumTxnAmountTextField, max_amount);
	}
	
	public void Approvals(String app) {
		clearAndSendKeys(approvalsTextField, app);
	}
	
	public void repeatFlag(String flag) {
		selectValueFromList(repeatFlagDropDown, flag);
	}
	
	public void Level(String level) throws Exception {
		Thread.sleep(3000);
		click(levelDropDown);
		By opt=By.xpath("//option[@title='"+level+"']");
		click(opt);
		
	}
	
	public void clickonSave() {
		click(saveButton);
	}
	
	
}
