package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

public class UserLevelLimitPage extends BasePage {
	
	private static UserLevelLimitPage userlevellimit;

	private UserLevelLimitPage() {


	}

	public static UserLevelLimitPage getuserlevellimit() {

		if (userlevellimit==null) {

			userlevellimit= new UserLevelLimitPage();
		}

		return userlevellimit;
	}
	
	By Userlevellimitlink = By.xpath("//a[@id='ums_corpAdmin_customerOnboardingStatus_hyperlinkRow_customerOnboardingStatusTable4']");
	By currency= By.xpath("//select[@id='limitAndAuthorizations_currency']");
	By transaction= By.xpath("//select[@id='limitAndAuthorizations_transactionType']");
	By auth_type= By.xpath("//select[@id='limitAndAuthorizations_authorisationType']");
	By proceed=By.xpath("//button[@id='searchButton']");
	
	By upperLimitTextField =By.xpath("//input[@id='limitAndAuthorizations_userLevelLimits_uperLimitRow_userLevelLimitsTable1']");
	By overrideFlagDropDown =By.xpath("(//select[@name='overrideFlag'])[1]");
	By perDayLimitTextField =By.xpath("(//input[@name='parDayLimit'])[1]");
	By limitSubmitButton =By.xpath("//button[@id='corporateUserLevelLimitSubmit']");
	By futureTransactionLimitTextField =By.xpath("(//input[@name='futureTransactionLimit'])[1]");
	By submit=By.xpath("(//button[contains(text(),'Submit')])[2]");
	
	By lowerLimitTextfield =By.xpath("(//input[@name='lowerLimit'])[1]");
	By upperLimitTextfield =By.xpath("(//input[@name='uperLimit'])[1]");
	By perDayLimitTextfield =By.xpath("(//input[@name='parDayLimit'])[1]");
	By futureTransactionLimitTextField2 =By.xpath("(//input[@name='futureTransactionLimit'])[1]");
	
	public void userLimitActLink() {
		click(Userlevellimitlink);
	}
	
	public void selectCurrency(String currency_type) {
		selectValueFromList(currency, currency_type);
	}
	
	public void selectTransaction(String tran) {
		selectValueFromList(transaction, tran);
	}
	
	public void selectAuthType(String auth) {
		selectValueFromList(auth_type, auth);
	}
	
	public void clickProceed() {
		click(proceed);
	}
	
	public void makerUpperLimit(String Makerupperlimit) {
		clearAndSendKeys(upperLimitTextField, Makerupperlimit);
	}
	
	public void overrideFlag(String override) {
		selectValueFromList(overrideFlagDropDown, override);
	}
	
	public void PerDayLimit(String perdaylimit) {
		clearAndSendKeys(perDayLimitTextField, perdaylimit);
	}
	
	public void TranLimitField(String tranlimit) {
		clearAndSendKeys(futureTransactionLimitTextField, tranlimit);
	}
	
	public void clickSubmit() {
		moveToElementDown(submit);
		click(submit);
	}
	
	public void checkerLowerLimit(String lowlimit) {
		clearAndSendKeys(lowerLimitTextfield, lowlimit);
	}
	
	public void checkerUpperLimit(String upperlimit) {
		clearAndSendKeys(upperLimitTextfield, upperlimit);
	}
	
	
	
}
