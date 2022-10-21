package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

public class GrantTransactionLimit extends BasePage {
	
private static GrantTransactionLimit granttran;
	
	private GrantTransactionLimit() {
		
		
		
	}
	
	public static GrantTransactionLimit gettranlimit() {
		
		if (granttran==null) {
			
			granttran= new GrantTransactionLimit();
		}
		
		return granttran;
	}
	
	By tranlimittab= By.xpath("//a[contains(text(),'Transaction Limits')]");
	By custRef= By.xpath("//select[@name='customer']");
	By tran= By.xpath("//select[@name='transactionType']");
	By currency= By.xpath("//select[@name='currency']");
	By authtype= By.xpath("//select[@name='authorisationType']");
	By procced=By.xpath("//button[contains(text(),'Proceed')]");
	By submit=By.xpath("(//button[contains(text(),'Submit')])[1]");
	
	public void clickLimitTab() {
		click(tranlimittab);
	}
	
	public void selectCustRef(String custref) {
		selectValueFromList(custRef,custref);
	}
	
	public void selectTran(String trans) {
		selectValueFromList(tran,trans);
	}
	
	public void selectCurrencyf(String curr) {
		selectValueFromList(currency,curr);
	}
	
	public void selectAuthType(String auth_type) {
		selectValueFromList(authtype,auth_type);
	}
	
	public void clickLimitProceed() {
		click(procced);
	}
	public void clickSubmit() {
		click(submit);
	}

}
