package com.aqm.bdb.common.pages;

import org.openqa.selenium.By;

import com.aqm.bdb.utilities.BasePage;

public class Reset_Block_User_Page extends BasePage {

	private static Reset_Block_User_Page reset_Block_User_Page;

	private Reset_Block_User_Page() {

	}

	public static Reset_Block_User_Page getResetBlockUser() {

		if (reset_Block_User_Page == null) {
			reset_Block_User_Page = new Reset_Block_User_Page();
		}
		return reset_Block_User_Page;
	}

	By loginIDTextfield = By.xpath("//input[@id='ums_userManagement_loginId']");
	By resetPasswordTab = By.xpath("//a[@id='div-vertical-menu-tran-conmenu8']");
	By remarkTextArea = By.xpath("//textarea[@id='ums_usermanagement_resetPasswordPage_remarks']");
	By confirmButton = By.xpath("//button[@id='ums_usermanagement_resetPasswordPage_Confirm']");
	By blockUserTab = By.xpath("//a[contains(text(),'Block User')]");
	By selectUserCategory = By.xpath("//select[@id='ums_userManagement_userCategory']");
	By userIDLink = By.xpath("//a[@id='ums_userListSearchPage_loginIdtblRow_userListSearchTable1']");
	By otherRemark = By.xpath("//textarea[@id='ums_userManagement_blockUserPage_remarks']");
	By blockConfirm = By.xpath("//button[@id='ums_btn_userManagement_blockUserPage_basicDetails']");
	
	public void clickUserLink() throws InterruptedException {
		Thread.sleep(10000);
		click(loginIDTextfield);
	}

	public void clickResetPasswordTab() {
		click(resetPasswordTab);
	}
	
	public void enterRemark(String remark) {
		clearAndSendKeys(remarkTextArea, remark);
	}
	
	public void clickConfirmButton() {
		click(confirmButton);
	}
	
	public void clickBlockUserTab() {
		click(blockUserTab);
	}
	
	public void enterOtherDetails(String remark) {
		clearAndSendKeys(otherRemark, remark);
	}
	
	public void selectUser(String user_catrgory) {
		selectValueFromList(selectUserCategory, user_catrgory);
	}
	
	public void clickUserIDLink() throws Exception {
		Thread.sleep(5000);
		click(userIDLink);
	}
	
	public void clickBlockUserConfirmButton() {
		click(blockConfirm);
	}
	
}
