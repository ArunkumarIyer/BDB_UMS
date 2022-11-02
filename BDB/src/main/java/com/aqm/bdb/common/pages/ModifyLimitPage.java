package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

public class ModifyLimitPage extends BasePage {
	
	private static ModifyLimitPage modifylimit;

	private ModifyLimitPage() {

	}

	public static ModifyLimitPage getmodifylimit() {

		if (modifylimit == null) {
			modifylimit = new ModifyLimitPage();
		}
		return modifylimit;
	}
	
	By custhostIDlink = By.xpath("//a[@name='customerId']");
	By userlimittab = By.xpath("(//a[contains(text(),'User Level Limits')])[1]");
	By userlimitoption = By.xpath("(//a[contains(text(),'User Level Limits')])[2]");
	By modifylink = By.xpath("(//a[contains(text(),'Modify')])");
	By upperlimitvalue = By.xpath("//input[@id='limitAndAuthorizations_userLevelLimits_uperLimitRow_userLevelLimitsTable1']");
	By limitsubmit = By.xpath("//button[@id='userLevelLimitSubmit']");
	By limitdelete = By.xpath("//a[contains(text(),'Delete')]");
	
	public void clickCustHostID(){
		click(custhostIDlink);
	}
	
	public void clickUserLimitTab() {
		click(userlimittab);
	}
	
	public void clickUserLimitOp() {
		click(userlimitoption);
	}
	
	public void clickModifyLink() {
		
		click(modifylink);
	}
	
	public void updateUpperLimit(String limit) {
		
		clearAndSendKeys(upperlimitvalue, limit);
	}
	
	public void limitSubmit() {
		click(limitsubmit);
	}
	
	public void limitDelete() {
		click(limitdelete);
	}
	
}
