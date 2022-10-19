package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

public class AuthorizationPage extends BasePage {

	private static AuthorizationPage auth;
	private static String ReferenceNo = null;

	public static String getReferenceNo() {
		return ReferenceNo;
	}
	private AuthorizationPage() {



	}

	public static AuthorizationPage getauth() {

		if (auth==null) {

			auth= new AuthorizationPage();
		}

		return auth;
	}


	By assignToRadioButton =By.xpath("(//input[@id='auth_txn_v_assignTo'])[1]");
	By authorizationSubmit =By.xpath("//button[@id='auth_cd_c_submit']");
	By remarkTextArea = By.xpath("//textarea[@id='auth_txn_v_makerRemarks']");
	
	By authorisationQueueIcon =By.xpath("//div[text()=' Authorization Queues']");
	By poolQueueLink = By.xpath("//a[@title='Pool Queue']");
	By searchTextField =By.xpath("//input[@id='quickSearch']");
	By searchButton =By.xpath("//div[@id='div-inlineSearch']//button[@id='searchButton' and @type='submit']");
	By transactionIdLink =By.xpath("//a[@id='transactionIdRow_authQueueFromPoolTable1']");
	By approveRadioButton =By.xpath("(//input[@id='auth_txn_v_authorizerAction'])[1]");
	By submitButton =By.xpath("//button[@id='auth_cd_c_submit']");
	By remaeksTextfield =By.xpath("(//textarea[@id='auth_txn_v_remarks'])[2]");

	public void clickAuthPoolRadioButton() {
		click(assignToRadioButton);
	}

	public void sendPoolRemark(String remark) {
		clearAndSendKeys(remarkTextArea, remark);
	}

	public void authPoolSubmit() {
		click(authorizationSubmit);

	}
	public void transactionRefernceNumber() {

		ReferenceNo=fetchValueFromTextFieldsByReferenceNumber(By.xpath("//button[contains(text(),'OK')]//preceding::li[1]"), "Reference Number");

	}
	
	public void authQueueIcon() {
		driver.switchTo().frame("frame-1-4");
		click(authorisationQueueIcon);
	}
	
	public void poolQueueLink() {
		click(poolQueueLink);
	}
	
	public void searchRef() throws Exception {
		clearAndSendKeys(searchTextField, getReferenceNo());
		click(searchButton);
		Thread.sleep(10000);
	}
	
	public void clickTransactionlink() {
		click(transactionIdLink);
	}
	
	public void approveAuth(String remark) {
		click(approveRadioButton);
		clearAndSendKeys(remaeksTextfield, remark);
		click(submitButton);
		
	}
	
	
	
	


}
